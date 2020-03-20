package PatternSizeSimSG.hipe.engine.actor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import static akka.pattern.Patterns.ask;

import hipe.engine.util.IncUtil;
import hipe.engine.message.NewInput;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.input.InputContainer;
import hipe.engine.message.input.ObjectAdded;
import hipe.engine.message.input.ObjectDeleted;
import hipe.engine.message.input.ReferenceAdded;
import hipe.engine.message.input.ReferenceDeleted;		
import hipe.engine.message.input.AttributeChanged;

import hipe.generic.actor.junction.util.HiPEConfig;

public class DispatchActor extends AbstractActor {
	
	private int counter = 0;
	public long time = 0;
				
	private Map<String, ActorRef> name2actor;
	
	private Map<Object, Consumer<Object>> type2addConsumer = new HashMap<>();
	private Map<Object, Consumer<Notification>> feature2setConsumer = new HashMap<>();
	private Map<Object, Consumer<Notification>> feature2addEdgeConsumer = new HashMap<>();
	private Map<Object, Consumer<Notification>> feature2removeEdgeConsumer = new HashMap<>();
	
	private IncUtil util = IncUtil.getUtil();
	
	public DispatchActor(Map<String, ActorRef> name2actor) {
		this.name2actor = name2actor;
		
		initializeAdd();
		initializeSet();
		initializeAddEdge();
		initializeRemoveEdge();
	}
	
	private void initializeAdd() {
		type2addConsumer.put(Params6Model.Params6ModelPackage.eINSTANCE.getV(), obj -> {
			Params6Model.V _v = (Params6Model.V) obj;
			util.newMessage();
			name2actor.get("V_object").tell(new ObjectAdded<Params6Model.V>(_v), getSelf());
		});
		type2addConsumer.put(Params6Model.Params6ModelPackage.eINSTANCE.getY(), obj -> {
			Params6Model.Y _y = (Params6Model.Y) obj;
			util.newMessage();
			name2actor.get("Y_object").tell(new ObjectAdded<Params6Model.Y>(_y), getSelf());
		});
		type2addConsumer.put(reactionContainer.ReactionContainerPackage.eINSTANCE.getContainer(), obj -> {
			reactionContainer.Container _container = (reactionContainer.Container) obj;
		});
		type2addConsumer.put(Params6Model.Params6ModelPackage.eINSTANCE.getW(), obj -> {
			Params6Model.W _w = (Params6Model.W) obj;
			util.newMessage();
			name2actor.get("W_object").tell(new ObjectAdded<Params6Model.W>(_w), getSelf());
		});
		type2addConsumer.put(reactionContainer.ReactionContainerPackage.eINSTANCE.getState(), obj -> {
			reactionContainer.State _state = (reactionContainer.State) obj;
		});
		type2addConsumer.put(reactionContainer.ReactionContainerPackage.eINSTANCE.getAgent(), obj -> {
			reactionContainer.Agent _agent = (reactionContainer.Agent) obj;
		});
		type2addConsumer.put(Params6Model.Params6ModelPackage.eINSTANCE.getX(), obj -> {
			Params6Model.X _x = (Params6Model.X) obj;
			util.newMessage();
			name2actor.get("X_object").tell(new ObjectAdded<Params6Model.X>(_x), getSelf());
		});
		type2addConsumer.put(Params6Model.Params6ModelPackage.eINSTANCE.getZ(), obj -> {
			Params6Model.Z _z = (Params6Model.Z) obj;
			util.newMessage();
			name2actor.get("Z_object").tell(new ObjectAdded<Params6Model.Z>(_z), getSelf());
		});
		type2addConsumer.put(Params6Model.Params6ModelPackage.eINSTANCE.getU(), obj -> {
			Params6Model.U _u = (Params6Model.U) obj;
			util.newMessage();
			name2actor.get("U_object").tell(new ObjectAdded<Params6Model.U>(_u), getSelf());
		});
	}
	
	private void initializeSet() {
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(Params6Model.Params6ModelPackage.eINSTANCE.getU_U_a_V_a(), notification -> {
			util.newMessage();
			name2actor.get("U_U_a_V_a_0_reference").tell(new ReferenceAdded<Params6Model.U, Params6Model.V>((Params6Model.U) notification.getNotifier(), (Params6Model.V) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(Params6Model.Params6ModelPackage.eINSTANCE.getW_W_a_X_a(), notification -> {
			util.newMessage();
			name2actor.get("W_W_a_X_a_0_reference").tell(new ReferenceAdded<Params6Model.W, Params6Model.X>((Params6Model.W) notification.getNotifier(), (Params6Model.X) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(Params6Model.Params6ModelPackage.eINSTANCE.getY_Y_a_Z_a(), notification -> {
			util.newMessage();
			name2actor.get("Y_Y_a_Z_a_0_reference").tell(new ReferenceAdded<Params6Model.Y, Params6Model.Z>((Params6Model.Y) notification.getNotifier(), (Params6Model.Z) notification.getNewValue()), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(Params6Model.Params6ModelPackage.eINSTANCE.getU_U_a_V_a(), notification -> {
			util.newMessage();
			name2actor.get("U_U_a_V_a_0_reference").tell(new ReferenceDeleted<Params6Model.U, Params6Model.V>((Params6Model.U) notification.getNotifier(), (Params6Model.V) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(Params6Model.Params6ModelPackage.eINSTANCE.getW_W_a_X_a(), notification -> {
			util.newMessage();
			name2actor.get("W_W_a_X_a_0_reference").tell(new ReferenceDeleted<Params6Model.W, Params6Model.X>((Params6Model.W) notification.getNotifier(), (Params6Model.X) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(Params6Model.Params6ModelPackage.eINSTANCE.getY_Y_a_Z_a(), notification -> {
			util.newMessage();
			name2actor.get("Y_Y_a_Z_a_0_reference").tell(new ReferenceDeleted<Params6Model.Y, Params6Model.Z>((Params6Model.Y) notification.getNotifier(), (Params6Model.Z) notification.getOldValue()), getSelf());
		});
	}

	@Override
	public void preStart() throws Exception {
		super.preStart();
	}

	@Override
	public void postStop() throws Exception {
		if(HiPEConfig.loggingActivated) {
			DecimalFormat df = new DecimalFormat("0.#####");
	        df.setMaximumFractionDigits(5);
			System.err.println("DispatchNode" + ";"  + counter + ";" + df.format((double) time / (double) (1000 * 1000 * 1000)));
		}
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder() //
				.match(Notification.class, this::handleNotification) //
				.match(NoMoreInput.class, this::sendFinished) //
				.build();
	}

	private void sendFinished(NoMoreInput m) {
		util.allMessagesInserted();
	}
	
	private void handleNotification(Notification notification) {
		long tic = System.nanoTime();
		counter++;
		
		switch (notification.getEventType()) {
		case Notification.ADD:
			handleAdd(notification);
			break;
		case Notification.REMOVE:
			handleRemove(notification);
			break;
		case Notification.REMOVING_ADAPTER:
			handleRemoveAdapter(notification);
			break;	
		case Notification.SET:
			handleSet(notification);
			break;
		}
		time += System.nanoTime() - tic;
	}

	private void handleAdd(Notification notification) {
		handleAddedNode(notification.getNewValue());
		handleAddedEdge(notification);
	}

	private void handleAddedNode(Object node) {
		if(node == null) 
			return;
			
		EObject obj = (EObject) node;
		if(type2addConsumer.containsKey(obj.eClass())) {
			type2addConsumer.get(obj.eClass()).accept(node);
		}
	}
	
	private void handleSet(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2setConsumer.containsKey(feature)) {
			feature2setConsumer.get(feature).accept(notification);
		}
	}

	private void handleAddedEdge(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2addEdgeConsumer.containsKey(feature)) {
			feature2addEdgeConsumer.get(feature).accept(notification);
		}
	}

	private void handleRemove(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2removeEdgeConsumer.containsKey(feature)) {
			feature2removeEdgeConsumer.get(feature).accept(notification);
		}
	}
	
	private void handleRemoveAdapter(Notification notification) {
		Object node = notification.getNotifier();
		if (node instanceof Params6Model.U) {
			util.newMessage();
			name2actor.get("U_object").tell(new ObjectDeleted<Params6Model.U>((Params6Model.U) node), getSelf());
		}
		if (node instanceof Params6Model.V) {
			util.newMessage();
			name2actor.get("V_object").tell(new ObjectDeleted<Params6Model.V>((Params6Model.V) node), getSelf());
		}
		if (node instanceof Params6Model.W) {
			util.newMessage();
			name2actor.get("W_object").tell(new ObjectDeleted<Params6Model.W>((Params6Model.W) node), getSelf());
		}
		if (node instanceof Params6Model.X) {
			util.newMessage();
			name2actor.get("X_object").tell(new ObjectDeleted<Params6Model.X>((Params6Model.X) node), getSelf());
		}
		if (node instanceof Params6Model.Y) {
			util.newMessage();
			name2actor.get("Y_object").tell(new ObjectDeleted<Params6Model.Y>((Params6Model.Y) node), getSelf());
		}
		if (node instanceof Params6Model.Z) {
			util.newMessage();
			name2actor.get("Z_object").tell(new ObjectDeleted<Params6Model.Z>((Params6Model.Z) node), getSelf());
		}
	}
}

