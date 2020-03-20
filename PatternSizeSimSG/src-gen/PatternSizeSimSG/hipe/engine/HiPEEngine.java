package PatternSizeSimSG.hipe.engine;

import org.eclipse.emf.common.notify.Notification;


import java.lang.Thread;
import java.time.Duration;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import static akka.pattern.Patterns.ask;

import PatternSizeSimSG.hipe.engine.actor.NotificationActor;
import PatternSizeSimSG.hipe.engine.actor.DispatchActor;

import hipe.engine.IHiPEEngine;
import hipe.engine.message.InitActor;
import hipe.engine.message.InitGenActor;
import hipe.engine.message.InitGenReferenceActor;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.NotificationMessage;
import hipe.engine.message.ExtractData;
import hipe.engine.message.production.ProductionResult;

import hipe.engine.util.IncUtil;
import hipe.engine.util.ProductionUtil;
import hipe.generic.actor.GenericObjectActor;
import hipe.generic.actor.GenericReferenceActor;
import hipe.generic.actor.GenericProductionActor;
import hipe.generic.actor.junction.*;

import hipe.network.*;

public class HiPEEngine implements IHiPEEngine{

	private final ActorSystem system = ActorSystem.create("HiPE-Engine");
	private ActorRef dispatcher;
	private ActorRef notificationActor;

	private Map<String, NetworkNode> name2node = new HashMap<>();
	
	private Map<String, ActorRef> name2actor = new ConcurrentHashMap<>();
	private Map<String, InitGenReferenceActor<?,?>> name2initRefGen = new ConcurrentHashMap<>();
	private Map<String, Class<?>> classes = new ConcurrentHashMap<>();
	private Map<String, String> productionNodes2pattern = new ConcurrentHashMap<>();
	private boolean dirty = false;
	private HiPENetwork network;
	
	private IncUtil iUtil = IncUtil.getUtil();
	private ProductionUtil pUtil = ProductionUtil.getUtil();
	
	private Thread thread;
	
	public HiPEEngine(HiPENetwork network) {
		thread = Thread.currentThread();
		iUtil.registerWakeUpCall(this::wakeUp);
		
		this.network = network;
	}
	
	public boolean wakeUp() {
		thread.interrupt();
		return true;
	}
	
	public void initialize() throws InterruptedException {
		network.getNetworknode().stream().forEach(n -> name2node.put(n.getName(), n));
		
		createProductionNodes();
		createJunctionNodes();
		createReferenceNodes();
		createObjectNodes();

		initializeReferenceNodes();

		classes.keySet().parallelStream().forEach(name -> {
			name2actor.put(name, system.actorOf(Props.create(classes.get(name))));			
		});
		
		dispatcher = system.actorOf(
				Props.create(DispatchActor.class, () -> new DispatchActor(name2actor)),
				"DispatchActor");
		
		notificationActor = system.actorOf(Props.create(NotificationActor.class, () -> new NotificationActor(dispatcher)), "NotificationActor");
		
		name2actor.values().forEach(actor -> actor.tell(new InitActor(name2actor), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof ObjectNode).forEach(n -> name2actor.get(n.getName()).tell(new InitGenActor(name2actor, n), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof ReferenceNode).forEach(n -> name2actor.get(n.getName()).tell(name2initRefGen.get(n.getName()), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof AbstractJunctionNode).forEach(n -> name2actor.get(n.getName()).tell(new InitGenActor(name2actor, n), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof ProductionNode).forEach(n -> name2actor.get(n.getName()).tell(new InitGenActor(name2actor, n), notificationActor));
		}
	
	public void createProductionNodes() {
		classes.put("U_a_V_aBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("U_a_V_aBoundSrc_production", "U_a_V_aBoundSrc");
		classes.put("U_a_V_aBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("U_a_V_aBoundTrg_production", "U_a_V_aBoundTrg");
		classes.put("W_a_X_aBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("W_a_X_aBoundSrc_production", "W_a_X_aBoundSrc");
		classes.put("W_a_X_aBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("W_a_X_aBoundTrg_production", "W_a_X_aBoundTrg");
		classes.put("Y_a_Z_aBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("Y_a_Z_aBoundSrc_production", "Y_a_Z_aBoundSrc");
		classes.put("Y_a_Z_aBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("Y_a_Z_aBoundTrg_production", "Y_a_Z_aBoundTrg");
		classes.put("osc_production", GenericProductionActor.class);
		productionNodes2pattern.put("osc_production", "osc");
		classes.put("oscBwd_production", GenericProductionActor.class);
		productionNodes2pattern.put("oscBwd_production", "oscBwd");
		
	}
	
	public void createJunctionNodes() {
		classes.put("osc_20_junction", GenericJunctionActor.class);
		classes.put("osc_24_junction", GenericJunctionActor.class);
		classes.put("osc_25_junction", GenericJunctionActor.class);
		classes.put("osc_21_junction", GenericJunctionActor.class);
		classes.put("osc_19_junction", GenericJunctionActor.class);
		classes.put("osc_41_nacjunction", GenericNACJunctionActor.class);
		classes.put("osc_42_nacjunction", GenericNACJunctionActor.class);
		classes.put("osc_43_nacjunction", GenericNACJunctionActor.class);
		classes.put("osc_44_nacjunction", GenericNACJunctionActor.class);
		classes.put("osc_45_nacjunction", GenericNACJunctionActor.class);
		classes.put("osc_46_nacjunction", GenericNACJunctionActor.class);
		classes.put("oscBwd_32_junction", GenericJunctionActor.class);
		classes.put("oscBwd_30_junction", GenericJunctionActor.class);
	}
	
	public void createReferenceNodes() {
		classes.put("U_U_a_V_a_0_reference",U_U_a_V_a_0_reference.class);
		classes.put("W_W_a_X_a_0_reference",W_W_a_X_a_0_reference.class);
		classes.put("Y_Y_a_Z_a_0_reference",Y_Y_a_Z_a_0_reference.class);
		
	}
	
	public void createObjectNodes() {
		classes.put("U_object",U_object.class);
		classes.put("V_object",V_object.class);
		classes.put("W_object",W_object.class);
		classes.put("X_object",X_object.class);
		classes.put("Y_object",Y_object.class);
		classes.put("Z_object",Z_object.class);
		
	}
	
	public void initializeReferenceNodes() {
		name2initRefGen.put("U_U_a_V_a_0_reference", new InitGenReferenceActor<Params6Model.U,Params6Model.V>(name2actor, name2node.get("U_U_a_V_a_0_reference"), (o) -> o instanceof Params6Model.U, (o) -> o.getU_a_V_a(), null, false));
		name2initRefGen.put("W_W_a_X_a_0_reference", new InitGenReferenceActor<Params6Model.W,Params6Model.X>(name2actor, name2node.get("W_W_a_X_a_0_reference"), (o) -> o instanceof Params6Model.W, (o) -> o.getW_a_X_a(), null, false));
		name2initRefGen.put("Y_Y_a_Z_a_0_reference", new InitGenReferenceActor<Params6Model.Y,Params6Model.Z>(name2actor, name2node.get("Y_Y_a_Z_a_0_reference"), (o) -> o instanceof Params6Model.Y, (o) -> o.getY_a_Z_a(), null, false));
	}
	
	/**
	 * delegate notifications to dispatcher actor
	 * @param notification
	 */			
	public void handleNotification(Notification notification) {
		try {
			dirty = true;
			ask(notificationActor, new NotificationMessage(notification), Duration.ofHours(24)).toCompletableFuture().get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}			
	}
	
	public Map<String, ProductionResult> extractData() throws InterruptedException {
		if(!dirty) {
			return java.util.Collections.synchronizedMap(new HashMap<>());
		}	
		dirty = false;
		
		iUtil.clean();
		pUtil.clean();
			
		notificationActor.tell(new NoMoreInput(), notificationActor);
		
		try {
			Thread.sleep(100000000);
		} catch(Exception e) {
		}
		
		return pUtil.getProductionResults();
	}
	
	public void terminate() {
		system.terminate();	
	}
	
}

class U_object extends GenericObjectActor<Params6Model.U> { }
class V_object extends GenericObjectActor<Params6Model.V> { }
class W_object extends GenericObjectActor<Params6Model.W> { }
class X_object extends GenericObjectActor<Params6Model.X> { }
class Y_object extends GenericObjectActor<Params6Model.Y> { }
class Z_object extends GenericObjectActor<Params6Model.Z> { }

class U_U_a_V_a_0_reference extends GenericReferenceActor<Params6Model.U, Params6Model.V> { }
class W_W_a_X_a_0_reference extends GenericReferenceActor<Params6Model.W, Params6Model.X> { }
class Y_Y_a_Z_a_0_reference extends GenericReferenceActor<Params6Model.Y, Params6Model.Z> { }

