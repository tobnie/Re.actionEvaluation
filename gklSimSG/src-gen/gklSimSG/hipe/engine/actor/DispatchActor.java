package gklSimSG.hipe.engine.actor;

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
		type2addConsumer.put(reactionContainer.ReactionContainerPackage.eINSTANCE.getContainer(), obj -> {
			reactionContainer.Container _container = (reactionContainer.Container) obj;
		});
		type2addConsumer.put(reactionContainer.ReactionContainerPackage.eINSTANCE.getState(), obj -> {
			reactionContainer.State _state = (reactionContainer.State) obj;
		});
		type2addConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getT(), obj -> {
			GKL1600Model.T _t = (GKL1600Model.T) obj;
			util.newMessage();
			name2actor.get("T_object_SP0").tell(new ObjectAdded<GKL1600Model.T>(_t), getSelf());
			util.newMessage();
			name2actor.get("T_object_SP1").tell(new ObjectAdded<GKL1600Model.T>(_t), getSelf());
			util.newMessage();
			name2actor.get("T_object_SP2").tell(new ObjectAdded<GKL1600Model.T>(_t), getSelf());
		});
		type2addConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getK(), obj -> {
			GKL1600Model.K _k = (GKL1600Model.K) obj;
			util.newMessage();
			name2actor.get("K_object").tell(new ObjectAdded<GKL1600Model.K>(_k), getSelf());
		});
		type2addConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getP(), obj -> {
			GKL1600Model.P _p = (GKL1600Model.P) obj;
			util.newMessage();
			name2actor.get("P_object").tell(new ObjectAdded<GKL1600Model.P>(_p), getSelf());
		});
		type2addConsumer.put(reactionContainer.ReactionContainerPackage.eINSTANCE.getAgent(), obj -> {
			reactionContainer.Agent _agent = (reactionContainer.Agent) obj;
		});
		type2addConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getU_s(), obj -> {
			GKL1600Model.U_s _u_s = (GKL1600Model.U_s) obj;
			util.newMessage();
			name2actor.get("U_s_object").tell(new ObjectAdded<GKL1600Model.U_s>(_u_s), getSelf());
		});
		type2addConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getP_s(), obj -> {
			GKL1600Model.P_s _p_s = (GKL1600Model.P_s) obj;
			util.newMessage();
			name2actor.get("P_s_object").tell(new ObjectAdded<GKL1600Model.P_s>(_p_s), getSelf());
		});
	}
	
	private void initializeSet() {
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getP_P_a_T_x(), notification -> {
			util.newMessage();
			name2actor.get("P_P_a_T_x_0_reference").tell(new ReferenceAdded<GKL1600Model.P, GKL1600Model.T>((GKL1600Model.P) notification.getNotifier(), (GKL1600Model.T) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getP_P_a_T_y(), notification -> {
			util.newMessage();
			name2actor.get("P_P_a_T_y_0_reference").tell(new ReferenceAdded<GKL1600Model.P, GKL1600Model.T>((GKL1600Model.P) notification.getNotifier(), (GKL1600Model.T) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getT_T_x_K_a(), notification -> {
			util.newMessage();
			name2actor.get("T_T_x_K_a_0_reference").tell(new ReferenceAdded<GKL1600Model.T, GKL1600Model.K>((GKL1600Model.T) notification.getNotifier(), (GKL1600Model.K) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getT_T_y_K_a(), notification -> {
			util.newMessage();
			name2actor.get("T_T_y_K_a_0_reference").tell(new ReferenceAdded<GKL1600Model.T, GKL1600Model.K>((GKL1600Model.T) notification.getNotifier(), (GKL1600Model.K) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getT_T_x_u(), notification -> {
			util.newMessage();
			name2actor.get("T_T_x_u_0_reference").tell(new ReferenceAdded<GKL1600Model.T, GKL1600Model.U_s>((GKL1600Model.T) notification.getNotifier(), (GKL1600Model.U_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getT_T_y_u(), notification -> {
			util.newMessage();
			name2actor.get("T_T_y_u_0_reference").tell(new ReferenceAdded<GKL1600Model.T, GKL1600Model.U_s>((GKL1600Model.T) notification.getNotifier(), (GKL1600Model.U_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getT_T_x_p(), notification -> {
			util.newMessage();
			name2actor.get("T_T_x_p_0_reference").tell(new ReferenceAdded<GKL1600Model.T, GKL1600Model.P_s>((GKL1600Model.T) notification.getNotifier(), (GKL1600Model.P_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getT_T_y_p(), notification -> {
			util.newMessage();
			name2actor.get("T_T_y_p_0_reference").tell(new ReferenceAdded<GKL1600Model.T, GKL1600Model.P_s>((GKL1600Model.T) notification.getNotifier(), (GKL1600Model.P_s) notification.getNewValue()), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getP_P_a_T_x(), notification -> {
			util.newMessage();
			name2actor.get("P_P_a_T_x_0_reference").tell(new ReferenceDeleted<GKL1600Model.P, GKL1600Model.T>((GKL1600Model.P) notification.getNotifier(), (GKL1600Model.T) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getP_P_a_T_y(), notification -> {
			util.newMessage();
			name2actor.get("P_P_a_T_y_0_reference").tell(new ReferenceDeleted<GKL1600Model.P, GKL1600Model.T>((GKL1600Model.P) notification.getNotifier(), (GKL1600Model.T) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getT_T_x_K_a(), notification -> {
			util.newMessage();
			name2actor.get("T_T_x_K_a_0_reference").tell(new ReferenceDeleted<GKL1600Model.T, GKL1600Model.K>((GKL1600Model.T) notification.getNotifier(), (GKL1600Model.K) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getT_T_y_K_a(), notification -> {
			util.newMessage();
			name2actor.get("T_T_y_K_a_0_reference").tell(new ReferenceDeleted<GKL1600Model.T, GKL1600Model.K>((GKL1600Model.T) notification.getNotifier(), (GKL1600Model.K) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getT_T_x_u(), notification -> {
			util.newMessage();
			name2actor.get("T_T_x_u_0_reference").tell(new ReferenceDeleted<GKL1600Model.T, GKL1600Model.U_s>((GKL1600Model.T) notification.getNotifier(), (GKL1600Model.U_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getT_T_y_u(), notification -> {
			util.newMessage();
			name2actor.get("T_T_y_u_0_reference").tell(new ReferenceDeleted<GKL1600Model.T, GKL1600Model.U_s>((GKL1600Model.T) notification.getNotifier(), (GKL1600Model.U_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getT_T_x_p(), notification -> {
			util.newMessage();
			name2actor.get("T_T_x_p_0_reference").tell(new ReferenceDeleted<GKL1600Model.T, GKL1600Model.P_s>((GKL1600Model.T) notification.getNotifier(), (GKL1600Model.P_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(GKL1600Model.GKL1600ModelPackage.eINSTANCE.getT_T_y_p(), notification -> {
			util.newMessage();
			name2actor.get("T_T_y_p_0_reference").tell(new ReferenceDeleted<GKL1600Model.T, GKL1600Model.P_s>((GKL1600Model.T) notification.getNotifier(), (GKL1600Model.P_s) notification.getOldValue()), getSelf());
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
		if (node instanceof GKL1600Model.P) {
			util.newMessage();
			name2actor.get("P_object").tell(new ObjectDeleted<GKL1600Model.P>((GKL1600Model.P) node), getSelf());
		}
		if (node instanceof GKL1600Model.K) {
			util.newMessage();
			name2actor.get("K_object").tell(new ObjectDeleted<GKL1600Model.K>((GKL1600Model.K) node), getSelf());
		}
		if (node instanceof GKL1600Model.P_s) {
			util.newMessage();
			name2actor.get("P_s_object").tell(new ObjectDeleted<GKL1600Model.P_s>((GKL1600Model.P_s) node), getSelf());
		}
		if (node instanceof GKL1600Model.U_s) {
			util.newMessage();
			name2actor.get("U_s_object").tell(new ObjectDeleted<GKL1600Model.U_s>((GKL1600Model.U_s) node), getSelf());
		}
		if (node instanceof GKL1600Model.T) {
			util.newMessage();
			name2actor.get("T_object_SP0").tell(new ObjectDeleted<GKL1600Model.T>((GKL1600Model.T) node), getSelf());
		}
		if (node instanceof GKL1600Model.T) {
			util.newMessage();
			name2actor.get("T_object_SP1").tell(new ObjectDeleted<GKL1600Model.T>((GKL1600Model.T) node), getSelf());
		}
		if (node instanceof GKL1600Model.T) {
			util.newMessage();
			name2actor.get("T_object_SP2").tell(new ObjectDeleted<GKL1600Model.T>((GKL1600Model.T) node), getSelf());
		}
	}
}

