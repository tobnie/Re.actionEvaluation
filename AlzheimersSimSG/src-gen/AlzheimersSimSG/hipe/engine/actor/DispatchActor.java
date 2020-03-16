package AlzheimersSimSG.hipe.engine.actor;

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
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getAMP(), obj -> {
			AlzheimerModel.AMP _amp = (AlzheimerModel.AMP) obj;
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getUB4_s(), obj -> {
			AlzheimerModel.UB4_s _ub4_s = (AlzheimerModel.UB4_s) obj;
			util.newMessage();
			name2actor.get("UB4_s_object").tell(new ObjectAdded<AlzheimerModel.UB4_s>(_ub4_s), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getUB1_s(), obj -> {
			AlzheimerModel.UB1_s _ub1_s = (AlzheimerModel.UB1_s) obj;
			util.newMessage();
			name2actor.get("UB1_s_object_SP0").tell(new ObjectAdded<AlzheimerModel.UB1_s>(_ub1_s), getSelf());
			util.newMessage();
			name2actor.get("UB1_s_object_SP1").tell(new ObjectAdded<AlzheimerModel.UB1_s>(_ub1_s), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP2_s(), obj -> {
			AlzheimerModel.P2_s _p2_s = (AlzheimerModel.P2_s) obj;
			util.newMessage();
			name2actor.get("P2_s_object").tell(new ObjectAdded<AlzheimerModel.P2_s>(_p2_s), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMdm2DUB(), obj -> {
			AlzheimerModel.Mdm2DUB _mdm2dub = (AlzheimerModel.Mdm2DUB) obj;
			util.newMessage();
			name2actor.get("Mdm2DUB_object_SP0").tell(new ObjectAdded<AlzheimerModel.Mdm2DUB>(_mdm2dub), getSelf());
			util.newMessage();
			name2actor.get("Mdm2DUB_object_SP1").tell(new ObjectAdded<AlzheimerModel.Mdm2DUB>(_mdm2dub), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getIR(), obj -> {
			AlzheimerModel.IR _ir = (AlzheimerModel.IR) obj;
			util.newMessage();
			name2actor.get("IR_object").tell(new ObjectAdded<AlzheimerModel.IR>(_ir), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getATMA(), obj -> {
			AlzheimerModel.ATMA _atma = (AlzheimerModel.ATMA) obj;
			util.newMessage();
			name2actor.get("ATMA_object").tell(new ObjectAdded<AlzheimerModel.ATMA>(_atma), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getUB2_s(), obj -> {
			AlzheimerModel.UB2_s _ub2_s = (AlzheimerModel.UB2_s) obj;
			util.newMessage();
			name2actor.get("UB2_s_object_SP0").tell(new ObjectAdded<AlzheimerModel.UB2_s>(_ub2_s), getSelf());
			util.newMessage();
			name2actor.get("UB2_s_object_SP1").tell(new ObjectAdded<AlzheimerModel.UB2_s>(_ub2_s), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getAggTau(), obj -> {
			AlzheimerModel.AggTau _aggtau = (AlzheimerModel.AggTau) obj;
			util.newMessage();
			name2actor.get("AggTau_object_SP0").tell(new ObjectAdded<AlzheimerModel.AggTau>(_aggtau), getSelf());
			util.newMessage();
			name2actor.get("AggTau_object_SP1").tell(new ObjectAdded<AlzheimerModel.AggTau>(_aggtau), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getNFT(), obj -> {
			AlzheimerModel.NFT _nft = (AlzheimerModel.NFT) obj;
			util.newMessage();
			name2actor.get("NFT_object").tell(new ObjectAdded<AlzheimerModel.NFT>(_nft), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getUNB_s(), obj -> {
			AlzheimerModel.UNB_s _unb_s = (AlzheimerModel.UNB_s) obj;
			util.newMessage();
			name2actor.get("UNB_s_object_SP0").tell(new ObjectAdded<AlzheimerModel.UNB_s>(_unb_s), getSelf());
			util.newMessage();
			name2actor.get("UNB_s_object_SP1").tell(new ObjectAdded<AlzheimerModel.UNB_s>(_unb_s), getSelf());
			util.newMessage();
			name2actor.get("UNB_s_object_SP2").tell(new ObjectAdded<AlzheimerModel.UNB_s>(_unb_s), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getAggAbeta(), obj -> {
			AlzheimerModel.AggAbeta _aggabeta = (AlzheimerModel.AggAbeta) obj;
			util.newMessage();
			name2actor.get("AggAbeta_object_SP0").tell(new ObjectAdded<AlzheimerModel.AggAbeta>(_aggabeta), getSelf());
			util.newMessage();
			name2actor.get("AggAbeta_object_SP1").tell(new ObjectAdded<AlzheimerModel.AggAbeta>(_aggabeta), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getUB3_s(), obj -> {
			AlzheimerModel.UB3_s _ub3_s = (AlzheimerModel.UB3_s) obj;
			util.newMessage();
			name2actor.get("UB3_s_object_SP0").tell(new ObjectAdded<AlzheimerModel.UB3_s>(_ub3_s), getSelf());
			util.newMessage();
			name2actor.get("UB3_s_object_SP1").tell(new ObjectAdded<AlzheimerModel.UB3_s>(_ub3_s), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getUBI_s(), obj -> {
			AlzheimerModel.UBI_s _ubi_s = (AlzheimerModel.UBI_s) obj;
			util.newMessage();
			name2actor.get("UBI_s_object").tell(new ObjectAdded<AlzheimerModel.UBI_s>(_ubi_s), getSelf());
		});
		type2addConsumer.put(reactionContainer.ReactionContainerPackage.eINSTANCE.getState(), obj -> {
			reactionContainer.State _state = (reactionContainer.State) obj;
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getGSK3b(), obj -> {
			AlzheimerModel.GSK3b _gsk3b = (AlzheimerModel.GSK3b) obj;
			util.newMessage();
			name2actor.get("GSK3b_object_SP0").tell(new ObjectAdded<AlzheimerModel.GSK3b>(_gsk3b), getSelf());
			util.newMessage();
			name2actor.get("GSK3b_object_SP1").tell(new ObjectAdded<AlzheimerModel.GSK3b>(_gsk3b), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53(), obj -> {
			AlzheimerModel.P53 _p53 = (AlzheimerModel.P53) obj;
			util.newMessage();
			name2actor.get("P53_object_SP0").tell(new ObjectAdded<AlzheimerModel.P53>(_p53), getSelf());
			util.newMessage();
			name2actor.get("P53_object_SP1").tell(new ObjectAdded<AlzheimerModel.P53>(_p53), getSelf());
			util.newMessage();
			name2actor.get("P53_object_SP2").tell(new ObjectAdded<AlzheimerModel.P53>(_p53), getSelf());
		});
		type2addConsumer.put(reactionContainer.ReactionContainerPackage.eINSTANCE.getContainer(), obj -> {
			reactionContainer.Container _container = (reactionContainer.Container) obj;
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMT(), obj -> {
			AlzheimerModel.MT _mt = (AlzheimerModel.MT) obj;
			util.newMessage();
			name2actor.get("MT_object").tell(new ObjectAdded<AlzheimerModel.MT>(_mt), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getATP(), obj -> {
			AlzheimerModel.ATP _atp = (AlzheimerModel.ATP) obj;
			util.newMessage();
			name2actor.get("ATP_object").tell(new ObjectAdded<AlzheimerModel.ATP>(_atp), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getE1(), obj -> {
			AlzheimerModel.E1 _e1 = (AlzheimerModel.E1) obj;
			util.newMessage();
			name2actor.get("E1_object").tell(new ObjectAdded<AlzheimerModel.E1>(_e1), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getAbeta(), obj -> {
			AlzheimerModel.Abeta _abeta = (AlzheimerModel.Abeta) obj;
			util.newMessage();
			name2actor.get("Abeta_object_SP0").tell(new ObjectAdded<AlzheimerModel.Abeta>(_abeta), getSelf());
			util.newMessage();
			name2actor.get("Abeta_object_SP1").tell(new ObjectAdded<AlzheimerModel.Abeta>(_abeta), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getProteasome(), obj -> {
			AlzheimerModel.Proteasome _proteasome = (AlzheimerModel.Proteasome) obj;
			util.newMessage();
			name2actor.get("Proteasome_object_SP0").tell(new ObjectAdded<AlzheimerModel.Proteasome>(_proteasome), getSelf());
			util.newMessage();
			name2actor.get("Proteasome_object_SP1").tell(new ObjectAdded<AlzheimerModel.Proteasome>(_proteasome), getSelf());
			util.newMessage();
			name2actor.get("Proteasome_object_SP2").tell(new ObjectAdded<AlzheimerModel.Proteasome>(_proteasome), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP_s(), obj -> {
			AlzheimerModel.P_s _p_s = (AlzheimerModel.P_s) obj;
			util.newMessage();
			name2actor.get("P_s_object_SP0").tell(new ObjectAdded<AlzheimerModel.P_s>(_p_s), getSelf());
			util.newMessage();
			name2actor.get("P_s_object_SP1").tell(new ObjectAdded<AlzheimerModel.P_s>(_p_s), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getPPT(), obj -> {
			AlzheimerModel.PPT _ppt = (AlzheimerModel.PPT) obj;
			util.newMessage();
			name2actor.get("PPT_object").tell(new ObjectAdded<AlzheimerModel.PPT>(_ppt), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getTau(), obj -> {
			AlzheimerModel.Tau _tau = (AlzheimerModel.Tau) obj;
			util.newMessage();
			name2actor.get("Tau_object_SP0").tell(new ObjectAdded<AlzheimerModel.Tau>(_tau), getSelf());
			util.newMessage();
			name2actor.get("Tau_object_SP1").tell(new ObjectAdded<AlzheimerModel.Tau>(_tau), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getE2(), obj -> {
			AlzheimerModel.E2 _e2 = (AlzheimerModel.E2) obj;
			util.newMessage();
			name2actor.get("E2_object").tell(new ObjectAdded<AlzheimerModel.E2>(_e2), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP1_s(), obj -> {
			AlzheimerModel.P1_s _p1_s = (AlzheimerModel.P1_s) obj;
			util.newMessage();
			name2actor.get("P1_s_object").tell(new ObjectAdded<AlzheimerModel.P1_s>(_p1_s), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getAbetaPlaque(), obj -> {
			AlzheimerModel.AbetaPlaque _abetaplaque = (AlzheimerModel.AbetaPlaque) obj;
			util.newMessage();
			name2actor.get("AbetaPlaque_object").tell(new ObjectAdded<AlzheimerModel.AbetaPlaque>(_abetaplaque), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getROS(), obj -> {
			AlzheimerModel.ROS _ros = (AlzheimerModel.ROS) obj;
			util.newMessage();
			name2actor.get("ROS_object").tell(new ObjectAdded<AlzheimerModel.ROS>(_ros), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53DUB(), obj -> {
			AlzheimerModel.P53DUB _p53dub = (AlzheimerModel.P53DUB) obj;
			util.newMessage();
			name2actor.get("P53DUB_object_SP0").tell(new ObjectAdded<AlzheimerModel.P53DUB>(_p53dub), getSelf());
			util.newMessage();
			name2actor.get("P53DUB_object_SP1").tell(new ObjectAdded<AlzheimerModel.P53DUB>(_p53dub), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getUb(), obj -> {
			AlzheimerModel.Ub _ub = (AlzheimerModel.Ub) obj;
			util.newMessage();
			name2actor.get("Ub_object").tell(new ObjectAdded<AlzheimerModel.Ub>(_ub), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getU_s(), obj -> {
			AlzheimerModel.U_s _u_s = (AlzheimerModel.U_s) obj;
			util.newMessage();
			name2actor.get("U_s_object_SP0").tell(new ObjectAdded<AlzheimerModel.U_s>(_u_s), getSelf());
			util.newMessage();
			name2actor.get("U_s_object_SP1").tell(new ObjectAdded<AlzheimerModel.U_s>(_u_s), getSelf());
			util.newMessage();
			name2actor.get("U_s_object_SP2").tell(new ObjectAdded<AlzheimerModel.U_s>(_u_s), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getBasalROS(), obj -> {
			AlzheimerModel.BasalROS _basalros = (AlzheimerModel.BasalROS) obj;
			util.newMessage();
			name2actor.get("BasalROS_object").tell(new ObjectAdded<AlzheimerModel.BasalROS>(_basalros), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getATMI(), obj -> {
			AlzheimerModel.ATMI _atmi = (AlzheimerModel.ATMI) obj;
			util.newMessage();
			name2actor.get("ATMI_object").tell(new ObjectAdded<AlzheimerModel.ATMI>(_atmi), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMdm2(), obj -> {
			AlzheimerModel.Mdm2 _mdm2 = (AlzheimerModel.Mdm2) obj;
			util.newMessage();
			name2actor.get("Mdm2_object_SP0").tell(new ObjectAdded<AlzheimerModel.Mdm2>(_mdm2), getSelf());
			util.newMessage();
			name2actor.get("Mdm2_object_SP1").tell(new ObjectAdded<AlzheimerModel.Mdm2>(_mdm2), getSelf());
			util.newMessage();
			name2actor.get("Mdm2_object_SP2").tell(new ObjectAdded<AlzheimerModel.Mdm2>(_mdm2), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53mRNA(), obj -> {
			AlzheimerModel.P53mRNA _p53mrna = (AlzheimerModel.P53mRNA) obj;
			util.newMessage();
			name2actor.get("P53mRNA_object").tell(new ObjectAdded<AlzheimerModel.P53mRNA>(_p53mrna), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getADP(), obj -> {
			AlzheimerModel.ADP _adp = (AlzheimerModel.ADP) obj;
		});
		type2addConsumer.put(reactionContainer.ReactionContainerPackage.eINSTANCE.getAgent(), obj -> {
			reactionContainer.Agent _agent = (reactionContainer.Agent) obj;
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMdm2mRNA(), obj -> {
			AlzheimerModel.Mdm2mRNA _mdm2mrna = (AlzheimerModel.Mdm2mRNA) obj;
			util.newMessage();
			name2actor.get("Mdm2mRNA_object").tell(new ObjectAdded<AlzheimerModel.Mdm2mRNA>(_mdm2mrna), getSelf());
		});
		type2addConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getDamDNA(), obj -> {
			AlzheimerModel.DamDNA _damdna = (AlzheimerModel.DamDNA) obj;
			util.newMessage();
			name2actor.get("DamDNA_object").tell(new ObjectAdded<AlzheimerModel.DamDNA>(_damdna), getSelf());
		});
	}
	
	private void initializeSet() {
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getProteasome_Proteasome_x_Tau_phos(), notification -> {
			util.newMessage();
			name2actor.get("Proteasome_Proteasome_x_Tau_phos_0_reference").tell(new ReferenceAdded<AlzheimerModel.Proteasome, AlzheimerModel.Tau>((AlzheimerModel.Proteasome) notification.getNotifier(), (AlzheimerModel.Tau) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getProteasome_Proteasome_x_AggTau_y(), notification -> {
			util.newMessage();
			name2actor.get("Proteasome_Proteasome_x_AggTau_y_0_reference").tell(new ReferenceAdded<AlzheimerModel.Proteasome, AlzheimerModel.AggTau>((AlzheimerModel.Proteasome) notification.getNotifier(), (AlzheimerModel.AggTau) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getProteasome_Proteasome_x_AggAbeta_y(), notification -> {
			util.newMessage();
			name2actor.get("Proteasome_Proteasome_x_AggAbeta_y_0_reference").tell(new ReferenceAdded<AlzheimerModel.Proteasome, AlzheimerModel.AggAbeta>((AlzheimerModel.Proteasome) notification.getNotifier(), (AlzheimerModel.AggAbeta) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getProteasome_Proteasome_x_Mdm2_ubi(), notification -> {
			util.newMessage();
			name2actor.get("Proteasome_Proteasome_x_Mdm2_ubi_0_reference").tell(new ReferenceAdded<AlzheimerModel.Proteasome, AlzheimerModel.Mdm2>((AlzheimerModel.Proteasome) notification.getNotifier(), (AlzheimerModel.Mdm2) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMT_MT_l_Tau_phos(), notification -> {
			util.newMessage();
			name2actor.get("MT_MT_l_Tau_phos_0_reference").tell(new ReferenceAdded<AlzheimerModel.MT, AlzheimerModel.Tau>((AlzheimerModel.MT) notification.getNotifier(), (AlzheimerModel.Tau) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53_P53_b_Mdm2_z(), notification -> {
			util.newMessage();
			name2actor.get("P53_P53_b_Mdm2_z_0_reference").tell(new ReferenceAdded<AlzheimerModel.P53, AlzheimerModel.Mdm2>((AlzheimerModel.P53) notification.getNotifier(), (AlzheimerModel.Mdm2) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53_P53_b_GSK3b_x(), notification -> {
			util.newMessage();
			name2actor.get("P53_P53_b_GSK3b_x_0_reference").tell(new ReferenceAdded<AlzheimerModel.P53, AlzheimerModel.GSK3b>((AlzheimerModel.P53) notification.getNotifier(), (AlzheimerModel.GSK3b) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53_P53_b_Proteasome_x(), notification -> {
			util.newMessage();
			name2actor.get("P53_P53_b_Proteasome_x_0_reference").tell(new ReferenceAdded<AlzheimerModel.P53, AlzheimerModel.Proteasome>((AlzheimerModel.P53) notification.getNotifier(), (AlzheimerModel.Proteasome) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMdm2_Mdm2_z_u(), notification -> {
			util.newMessage();
			name2actor.get("Mdm2_Mdm2_z_u_0_reference").tell(new ReferenceAdded<AlzheimerModel.Mdm2, AlzheimerModel.U_s>((AlzheimerModel.Mdm2) notification.getNotifier(), (AlzheimerModel.U_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53_P53_b_ub4(), notification -> {
			util.newMessage();
			name2actor.get("P53_P53_b_ub4_0_reference").tell(new ReferenceAdded<AlzheimerModel.P53, AlzheimerModel.UB4_s>((AlzheimerModel.P53) notification.getNotifier(), (AlzheimerModel.UB4_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getTau_Tau_phos_u(), notification -> {
			util.newMessage();
			name2actor.get("Tau_Tau_phos_u_0_reference").tell(new ReferenceAdded<AlzheimerModel.Tau, AlzheimerModel.U_s>((AlzheimerModel.Tau) notification.getNotifier(), (AlzheimerModel.U_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getTau_Tau_phos_p1(), notification -> {
			util.newMessage();
			name2actor.get("Tau_Tau_phos_p1_0_reference").tell(new ReferenceAdded<AlzheimerModel.Tau, AlzheimerModel.P1_s>((AlzheimerModel.Tau) notification.getNotifier(), (AlzheimerModel.P1_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getTau_Tau_phos_p2(), notification -> {
			util.newMessage();
			name2actor.get("Tau_Tau_phos_p2_0_reference").tell(new ReferenceAdded<AlzheimerModel.Tau, AlzheimerModel.P2_s>((AlzheimerModel.Tau) notification.getNotifier(), (AlzheimerModel.P2_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53_P53_b_u(), notification -> {
			util.newMessage();
			name2actor.get("P53_P53_b_u_0_reference").tell(new ReferenceAdded<AlzheimerModel.P53, AlzheimerModel.U_s>((AlzheimerModel.P53) notification.getNotifier(), (AlzheimerModel.U_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getE1_E1_x_unb(), notification -> {
			util.newMessage();
			name2actor.get("E1_E1_x_unb_0_reference").tell(new ReferenceAdded<AlzheimerModel.E1, AlzheimerModel.UNB_s>((AlzheimerModel.E1) notification.getNotifier(), (AlzheimerModel.UNB_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getE2_E2_x_unb(), notification -> {
			util.newMessage();
			name2actor.get("E2_E2_x_unb_0_reference").tell(new ReferenceAdded<AlzheimerModel.E2, AlzheimerModel.UNB_s>((AlzheimerModel.E2) notification.getNotifier(), (AlzheimerModel.UNB_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getE2_E2_x_ubi(), notification -> {
			util.newMessage();
			name2actor.get("E2_E2_x_ubi_0_reference").tell(new ReferenceAdded<AlzheimerModel.E2, AlzheimerModel.UBI_s>((AlzheimerModel.E2) notification.getNotifier(), (AlzheimerModel.UBI_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53_P53_b_ub1(), notification -> {
			util.newMessage();
			name2actor.get("P53_P53_b_ub1_0_reference").tell(new ReferenceAdded<AlzheimerModel.P53, AlzheimerModel.UB1_s>((AlzheimerModel.P53) notification.getNotifier(), (AlzheimerModel.UB1_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53_P53_b_ub2(), notification -> {
			util.newMessage();
			name2actor.get("P53_P53_b_ub2_0_reference").tell(new ReferenceAdded<AlzheimerModel.P53, AlzheimerModel.UB2_s>((AlzheimerModel.P53) notification.getNotifier(), (AlzheimerModel.UB2_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53_P53_b_ub3(), notification -> {
			util.newMessage();
			name2actor.get("P53_P53_b_ub3_0_reference").tell(new ReferenceAdded<AlzheimerModel.P53, AlzheimerModel.UB3_s>((AlzheimerModel.P53) notification.getNotifier(), (AlzheimerModel.UB3_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMdm2_Mdm2_z_p(), notification -> {
			util.newMessage();
			name2actor.get("Mdm2_Mdm2_z_p_0_reference").tell(new ReferenceAdded<AlzheimerModel.Mdm2, AlzheimerModel.P_s>((AlzheimerModel.Mdm2) notification.getNotifier(), (AlzheimerModel.P_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMdm2_Mdm2_ubi_unb(), notification -> {
			util.newMessage();
			name2actor.get("Mdm2_Mdm2_ubi_unb_0_reference").tell(new ReferenceAdded<AlzheimerModel.Mdm2, AlzheimerModel.UNB_s>((AlzheimerModel.Mdm2) notification.getNotifier(), (AlzheimerModel.UNB_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMdm2_Mdm2_ubi_ub1(), notification -> {
			util.newMessage();
			name2actor.get("Mdm2_Mdm2_ubi_ub1_0_reference").tell(new ReferenceAdded<AlzheimerModel.Mdm2, AlzheimerModel.UB1_s>((AlzheimerModel.Mdm2) notification.getNotifier(), (AlzheimerModel.UB1_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMdm2_Mdm2_ubi_ub2(), notification -> {
			util.newMessage();
			name2actor.get("Mdm2_Mdm2_ubi_ub2_0_reference").tell(new ReferenceAdded<AlzheimerModel.Mdm2, AlzheimerModel.UB2_s>((AlzheimerModel.Mdm2) notification.getNotifier(), (AlzheimerModel.UB2_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMdm2_Mdm2_ubi_ub3(), notification -> {
			util.newMessage();
			name2actor.get("Mdm2_Mdm2_ubi_ub3_0_reference").tell(new ReferenceAdded<AlzheimerModel.Mdm2, AlzheimerModel.UB3_s>((AlzheimerModel.Mdm2) notification.getNotifier(), (AlzheimerModel.UB3_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMdm2_Mdm2_ubi_ub4(), notification -> {
			util.newMessage();
			name2actor.get("Mdm2_Mdm2_ubi_ub4_0_reference").tell(new ReferenceAdded<AlzheimerModel.Mdm2, AlzheimerModel.UB4_s>((AlzheimerModel.Mdm2) notification.getNotifier(), (AlzheimerModel.UB4_s) notification.getNewValue()), getSelf());
		});
		feature2addEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53_P53_b_p(), notification -> {
			util.newMessage();
			name2actor.get("P53_P53_b_p_0_reference").tell(new ReferenceAdded<AlzheimerModel.P53, AlzheimerModel.P_s>((AlzheimerModel.P53) notification.getNotifier(), (AlzheimerModel.P_s) notification.getNewValue()), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getProteasome_Proteasome_x_Tau_phos(), notification -> {
			util.newMessage();
			name2actor.get("Proteasome_Proteasome_x_Tau_phos_0_reference").tell(new ReferenceDeleted<AlzheimerModel.Proteasome, AlzheimerModel.Tau>((AlzheimerModel.Proteasome) notification.getNotifier(), (AlzheimerModel.Tau) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getProteasome_Proteasome_x_AggTau_y(), notification -> {
			util.newMessage();
			name2actor.get("Proteasome_Proteasome_x_AggTau_y_0_reference").tell(new ReferenceDeleted<AlzheimerModel.Proteasome, AlzheimerModel.AggTau>((AlzheimerModel.Proteasome) notification.getNotifier(), (AlzheimerModel.AggTau) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getProteasome_Proteasome_x_AggAbeta_y(), notification -> {
			util.newMessage();
			name2actor.get("Proteasome_Proteasome_x_AggAbeta_y_0_reference").tell(new ReferenceDeleted<AlzheimerModel.Proteasome, AlzheimerModel.AggAbeta>((AlzheimerModel.Proteasome) notification.getNotifier(), (AlzheimerModel.AggAbeta) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getProteasome_Proteasome_x_Mdm2_ubi(), notification -> {
			util.newMessage();
			name2actor.get("Proteasome_Proteasome_x_Mdm2_ubi_0_reference").tell(new ReferenceDeleted<AlzheimerModel.Proteasome, AlzheimerModel.Mdm2>((AlzheimerModel.Proteasome) notification.getNotifier(), (AlzheimerModel.Mdm2) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMT_MT_l_Tau_phos(), notification -> {
			util.newMessage();
			name2actor.get("MT_MT_l_Tau_phos_0_reference").tell(new ReferenceDeleted<AlzheimerModel.MT, AlzheimerModel.Tau>((AlzheimerModel.MT) notification.getNotifier(), (AlzheimerModel.Tau) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53_P53_b_Mdm2_z(), notification -> {
			util.newMessage();
			name2actor.get("P53_P53_b_Mdm2_z_0_reference").tell(new ReferenceDeleted<AlzheimerModel.P53, AlzheimerModel.Mdm2>((AlzheimerModel.P53) notification.getNotifier(), (AlzheimerModel.Mdm2) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53_P53_b_GSK3b_x(), notification -> {
			util.newMessage();
			name2actor.get("P53_P53_b_GSK3b_x_0_reference").tell(new ReferenceDeleted<AlzheimerModel.P53, AlzheimerModel.GSK3b>((AlzheimerModel.P53) notification.getNotifier(), (AlzheimerModel.GSK3b) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53_P53_b_Proteasome_x(), notification -> {
			util.newMessage();
			name2actor.get("P53_P53_b_Proteasome_x_0_reference").tell(new ReferenceDeleted<AlzheimerModel.P53, AlzheimerModel.Proteasome>((AlzheimerModel.P53) notification.getNotifier(), (AlzheimerModel.Proteasome) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMdm2_Mdm2_z_u(), notification -> {
			util.newMessage();
			name2actor.get("Mdm2_Mdm2_z_u_0_reference").tell(new ReferenceDeleted<AlzheimerModel.Mdm2, AlzheimerModel.U_s>((AlzheimerModel.Mdm2) notification.getNotifier(), (AlzheimerModel.U_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53_P53_b_ub4(), notification -> {
			util.newMessage();
			name2actor.get("P53_P53_b_ub4_0_reference").tell(new ReferenceDeleted<AlzheimerModel.P53, AlzheimerModel.UB4_s>((AlzheimerModel.P53) notification.getNotifier(), (AlzheimerModel.UB4_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getTau_Tau_phos_u(), notification -> {
			util.newMessage();
			name2actor.get("Tau_Tau_phos_u_0_reference").tell(new ReferenceDeleted<AlzheimerModel.Tau, AlzheimerModel.U_s>((AlzheimerModel.Tau) notification.getNotifier(), (AlzheimerModel.U_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getTau_Tau_phos_p1(), notification -> {
			util.newMessage();
			name2actor.get("Tau_Tau_phos_p1_0_reference").tell(new ReferenceDeleted<AlzheimerModel.Tau, AlzheimerModel.P1_s>((AlzheimerModel.Tau) notification.getNotifier(), (AlzheimerModel.P1_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getTau_Tau_phos_p2(), notification -> {
			util.newMessage();
			name2actor.get("Tau_Tau_phos_p2_0_reference").tell(new ReferenceDeleted<AlzheimerModel.Tau, AlzheimerModel.P2_s>((AlzheimerModel.Tau) notification.getNotifier(), (AlzheimerModel.P2_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53_P53_b_u(), notification -> {
			util.newMessage();
			name2actor.get("P53_P53_b_u_0_reference").tell(new ReferenceDeleted<AlzheimerModel.P53, AlzheimerModel.U_s>((AlzheimerModel.P53) notification.getNotifier(), (AlzheimerModel.U_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getE1_E1_x_unb(), notification -> {
			util.newMessage();
			name2actor.get("E1_E1_x_unb_0_reference").tell(new ReferenceDeleted<AlzheimerModel.E1, AlzheimerModel.UNB_s>((AlzheimerModel.E1) notification.getNotifier(), (AlzheimerModel.UNB_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getE2_E2_x_unb(), notification -> {
			util.newMessage();
			name2actor.get("E2_E2_x_unb_0_reference").tell(new ReferenceDeleted<AlzheimerModel.E2, AlzheimerModel.UNB_s>((AlzheimerModel.E2) notification.getNotifier(), (AlzheimerModel.UNB_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getE2_E2_x_ubi(), notification -> {
			util.newMessage();
			name2actor.get("E2_E2_x_ubi_0_reference").tell(new ReferenceDeleted<AlzheimerModel.E2, AlzheimerModel.UBI_s>((AlzheimerModel.E2) notification.getNotifier(), (AlzheimerModel.UBI_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53_P53_b_ub1(), notification -> {
			util.newMessage();
			name2actor.get("P53_P53_b_ub1_0_reference").tell(new ReferenceDeleted<AlzheimerModel.P53, AlzheimerModel.UB1_s>((AlzheimerModel.P53) notification.getNotifier(), (AlzheimerModel.UB1_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53_P53_b_ub2(), notification -> {
			util.newMessage();
			name2actor.get("P53_P53_b_ub2_0_reference").tell(new ReferenceDeleted<AlzheimerModel.P53, AlzheimerModel.UB2_s>((AlzheimerModel.P53) notification.getNotifier(), (AlzheimerModel.UB2_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53_P53_b_ub3(), notification -> {
			util.newMessage();
			name2actor.get("P53_P53_b_ub3_0_reference").tell(new ReferenceDeleted<AlzheimerModel.P53, AlzheimerModel.UB3_s>((AlzheimerModel.P53) notification.getNotifier(), (AlzheimerModel.UB3_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMdm2_Mdm2_z_p(), notification -> {
			util.newMessage();
			name2actor.get("Mdm2_Mdm2_z_p_0_reference").tell(new ReferenceDeleted<AlzheimerModel.Mdm2, AlzheimerModel.P_s>((AlzheimerModel.Mdm2) notification.getNotifier(), (AlzheimerModel.P_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMdm2_Mdm2_ubi_unb(), notification -> {
			util.newMessage();
			name2actor.get("Mdm2_Mdm2_ubi_unb_0_reference").tell(new ReferenceDeleted<AlzheimerModel.Mdm2, AlzheimerModel.UNB_s>((AlzheimerModel.Mdm2) notification.getNotifier(), (AlzheimerModel.UNB_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMdm2_Mdm2_ubi_ub1(), notification -> {
			util.newMessage();
			name2actor.get("Mdm2_Mdm2_ubi_ub1_0_reference").tell(new ReferenceDeleted<AlzheimerModel.Mdm2, AlzheimerModel.UB1_s>((AlzheimerModel.Mdm2) notification.getNotifier(), (AlzheimerModel.UB1_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMdm2_Mdm2_ubi_ub2(), notification -> {
			util.newMessage();
			name2actor.get("Mdm2_Mdm2_ubi_ub2_0_reference").tell(new ReferenceDeleted<AlzheimerModel.Mdm2, AlzheimerModel.UB2_s>((AlzheimerModel.Mdm2) notification.getNotifier(), (AlzheimerModel.UB2_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMdm2_Mdm2_ubi_ub3(), notification -> {
			util.newMessage();
			name2actor.get("Mdm2_Mdm2_ubi_ub3_0_reference").tell(new ReferenceDeleted<AlzheimerModel.Mdm2, AlzheimerModel.UB3_s>((AlzheimerModel.Mdm2) notification.getNotifier(), (AlzheimerModel.UB3_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getMdm2_Mdm2_ubi_ub4(), notification -> {
			util.newMessage();
			name2actor.get("Mdm2_Mdm2_ubi_ub4_0_reference").tell(new ReferenceDeleted<AlzheimerModel.Mdm2, AlzheimerModel.UB4_s>((AlzheimerModel.Mdm2) notification.getNotifier(), (AlzheimerModel.UB4_s) notification.getOldValue()), getSelf());
		});
		feature2removeEdgeConsumer.put(AlzheimerModel.AlzheimerModelPackage.eINSTANCE.getP53_P53_b_p(), notification -> {
			util.newMessage();
			name2actor.get("P53_P53_b_p_0_reference").tell(new ReferenceDeleted<AlzheimerModel.P53, AlzheimerModel.P_s>((AlzheimerModel.P53) notification.getNotifier(), (AlzheimerModel.P_s) notification.getOldValue()), getSelf());
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
		if (node instanceof AlzheimerModel.MT) {
			util.newMessage();
			name2actor.get("MT_object").tell(new ObjectDeleted<AlzheimerModel.MT>((AlzheimerModel.MT) node), getSelf());
		}
		if (node instanceof AlzheimerModel.UB4_s) {
			util.newMessage();
			name2actor.get("UB4_s_object").tell(new ObjectDeleted<AlzheimerModel.UB4_s>((AlzheimerModel.UB4_s) node), getSelf());
		}
		if (node instanceof AlzheimerModel.P1_s) {
			util.newMessage();
			name2actor.get("P1_s_object").tell(new ObjectDeleted<AlzheimerModel.P1_s>((AlzheimerModel.P1_s) node), getSelf());
		}
		if (node instanceof AlzheimerModel.P2_s) {
			util.newMessage();
			name2actor.get("P2_s_object").tell(new ObjectDeleted<AlzheimerModel.P2_s>((AlzheimerModel.P2_s) node), getSelf());
		}
		if (node instanceof AlzheimerModel.PPT) {
			util.newMessage();
			name2actor.get("PPT_object").tell(new ObjectDeleted<AlzheimerModel.PPT>((AlzheimerModel.PPT) node), getSelf());
		}
		if (node instanceof AlzheimerModel.NFT) {
			util.newMessage();
			name2actor.get("NFT_object").tell(new ObjectDeleted<AlzheimerModel.NFT>((AlzheimerModel.NFT) node), getSelf());
		}
		if (node instanceof AlzheimerModel.AbetaPlaque) {
			util.newMessage();
			name2actor.get("AbetaPlaque_object").tell(new ObjectDeleted<AlzheimerModel.AbetaPlaque>((AlzheimerModel.AbetaPlaque) node), getSelf());
		}
		if (node instanceof AlzheimerModel.P53mRNA) {
			util.newMessage();
			name2actor.get("P53mRNA_object").tell(new ObjectDeleted<AlzheimerModel.P53mRNA>((AlzheimerModel.P53mRNA) node), getSelf());
		}
		if (node instanceof AlzheimerModel.Ub) {
			util.newMessage();
			name2actor.get("Ub_object").tell(new ObjectDeleted<AlzheimerModel.Ub>((AlzheimerModel.Ub) node), getSelf());
		}
		if (node instanceof AlzheimerModel.UBI_s) {
			util.newMessage();
			name2actor.get("UBI_s_object").tell(new ObjectDeleted<AlzheimerModel.UBI_s>((AlzheimerModel.UBI_s) node), getSelf());
		}
		if (node instanceof AlzheimerModel.ATP) {
			util.newMessage();
			name2actor.get("ATP_object").tell(new ObjectDeleted<AlzheimerModel.ATP>((AlzheimerModel.ATP) node), getSelf());
		}
		if (node instanceof AlzheimerModel.E1) {
			util.newMessage();
			name2actor.get("E1_object").tell(new ObjectDeleted<AlzheimerModel.E1>((AlzheimerModel.E1) node), getSelf());
		}
		if (node instanceof AlzheimerModel.E2) {
			util.newMessage();
			name2actor.get("E2_object").tell(new ObjectDeleted<AlzheimerModel.E2>((AlzheimerModel.E2) node), getSelf());
		}
		if (node instanceof AlzheimerModel.Mdm2mRNA) {
			util.newMessage();
			name2actor.get("Mdm2mRNA_object").tell(new ObjectDeleted<AlzheimerModel.Mdm2mRNA>((AlzheimerModel.Mdm2mRNA) node), getSelf());
		}
		if (node instanceof AlzheimerModel.DamDNA) {
			util.newMessage();
			name2actor.get("DamDNA_object").tell(new ObjectDeleted<AlzheimerModel.DamDNA>((AlzheimerModel.DamDNA) node), getSelf());
		}
		if (node instanceof AlzheimerModel.ATMI) {
			util.newMessage();
			name2actor.get("ATMI_object").tell(new ObjectDeleted<AlzheimerModel.ATMI>((AlzheimerModel.ATMI) node), getSelf());
		}
		if (node instanceof AlzheimerModel.ATMA) {
			util.newMessage();
			name2actor.get("ATMA_object").tell(new ObjectDeleted<AlzheimerModel.ATMA>((AlzheimerModel.ATMA) node), getSelf());
		}
		if (node instanceof AlzheimerModel.IR) {
			util.newMessage();
			name2actor.get("IR_object").tell(new ObjectDeleted<AlzheimerModel.IR>((AlzheimerModel.IR) node), getSelf());
		}
		if (node instanceof AlzheimerModel.ROS) {
			util.newMessage();
			name2actor.get("ROS_object").tell(new ObjectDeleted<AlzheimerModel.ROS>((AlzheimerModel.ROS) node), getSelf());
		}
		if (node instanceof AlzheimerModel.BasalROS) {
			util.newMessage();
			name2actor.get("BasalROS_object").tell(new ObjectDeleted<AlzheimerModel.BasalROS>((AlzheimerModel.BasalROS) node), getSelf());
		}
		if (node instanceof AlzheimerModel.Proteasome) {
			util.newMessage();
			name2actor.get("Proteasome_object_SP0").tell(new ObjectDeleted<AlzheimerModel.Proteasome>((AlzheimerModel.Proteasome) node), getSelf());
		}
		if (node instanceof AlzheimerModel.Proteasome) {
			util.newMessage();
			name2actor.get("Proteasome_object_SP1").tell(new ObjectDeleted<AlzheimerModel.Proteasome>((AlzheimerModel.Proteasome) node), getSelf());
		}
		if (node instanceof AlzheimerModel.Proteasome) {
			util.newMessage();
			name2actor.get("Proteasome_object_SP2").tell(new ObjectDeleted<AlzheimerModel.Proteasome>((AlzheimerModel.Proteasome) node), getSelf());
		}
		if (node instanceof AlzheimerModel.Tau) {
			util.newMessage();
			name2actor.get("Tau_object_SP0").tell(new ObjectDeleted<AlzheimerModel.Tau>((AlzheimerModel.Tau) node), getSelf());
		}
		if (node instanceof AlzheimerModel.Tau) {
			util.newMessage();
			name2actor.get("Tau_object_SP1").tell(new ObjectDeleted<AlzheimerModel.Tau>((AlzheimerModel.Tau) node), getSelf());
		}
		if (node instanceof AlzheimerModel.AggTau) {
			util.newMessage();
			name2actor.get("AggTau_object_SP0").tell(new ObjectDeleted<AlzheimerModel.AggTau>((AlzheimerModel.AggTau) node), getSelf());
		}
		if (node instanceof AlzheimerModel.AggTau) {
			util.newMessage();
			name2actor.get("AggTau_object_SP1").tell(new ObjectDeleted<AlzheimerModel.AggTau>((AlzheimerModel.AggTau) node), getSelf());
		}
		if (node instanceof AlzheimerModel.AggAbeta) {
			util.newMessage();
			name2actor.get("AggAbeta_object_SP0").tell(new ObjectDeleted<AlzheimerModel.AggAbeta>((AlzheimerModel.AggAbeta) node), getSelf());
		}
		if (node instanceof AlzheimerModel.AggAbeta) {
			util.newMessage();
			name2actor.get("AggAbeta_object_SP1").tell(new ObjectDeleted<AlzheimerModel.AggAbeta>((AlzheimerModel.AggAbeta) node), getSelf());
		}
		if (node instanceof AlzheimerModel.Mdm2) {
			util.newMessage();
			name2actor.get("Mdm2_object_SP0").tell(new ObjectDeleted<AlzheimerModel.Mdm2>((AlzheimerModel.Mdm2) node), getSelf());
		}
		if (node instanceof AlzheimerModel.Mdm2) {
			util.newMessage();
			name2actor.get("Mdm2_object_SP1").tell(new ObjectDeleted<AlzheimerModel.Mdm2>((AlzheimerModel.Mdm2) node), getSelf());
		}
		if (node instanceof AlzheimerModel.Mdm2) {
			util.newMessage();
			name2actor.get("Mdm2_object_SP2").tell(new ObjectDeleted<AlzheimerModel.Mdm2>((AlzheimerModel.Mdm2) node), getSelf());
		}
		if (node instanceof AlzheimerModel.P53) {
			util.newMessage();
			name2actor.get("P53_object_SP0").tell(new ObjectDeleted<AlzheimerModel.P53>((AlzheimerModel.P53) node), getSelf());
		}
		if (node instanceof AlzheimerModel.P53) {
			util.newMessage();
			name2actor.get("P53_object_SP1").tell(new ObjectDeleted<AlzheimerModel.P53>((AlzheimerModel.P53) node), getSelf());
		}
		if (node instanceof AlzheimerModel.P53) {
			util.newMessage();
			name2actor.get("P53_object_SP2").tell(new ObjectDeleted<AlzheimerModel.P53>((AlzheimerModel.P53) node), getSelf());
		}
		if (node instanceof AlzheimerModel.GSK3b) {
			util.newMessage();
			name2actor.get("GSK3b_object_SP0").tell(new ObjectDeleted<AlzheimerModel.GSK3b>((AlzheimerModel.GSK3b) node), getSelf());
		}
		if (node instanceof AlzheimerModel.GSK3b) {
			util.newMessage();
			name2actor.get("GSK3b_object_SP1").tell(new ObjectDeleted<AlzheimerModel.GSK3b>((AlzheimerModel.GSK3b) node), getSelf());
		}
		if (node instanceof AlzheimerModel.P_s) {
			util.newMessage();
			name2actor.get("P_s_object_SP0").tell(new ObjectDeleted<AlzheimerModel.P_s>((AlzheimerModel.P_s) node), getSelf());
		}
		if (node instanceof AlzheimerModel.P_s) {
			util.newMessage();
			name2actor.get("P_s_object_SP1").tell(new ObjectDeleted<AlzheimerModel.P_s>((AlzheimerModel.P_s) node), getSelf());
		}
		if (node instanceof AlzheimerModel.U_s) {
			util.newMessage();
			name2actor.get("U_s_object_SP0").tell(new ObjectDeleted<AlzheimerModel.U_s>((AlzheimerModel.U_s) node), getSelf());
		}
		if (node instanceof AlzheimerModel.U_s) {
			util.newMessage();
			name2actor.get("U_s_object_SP1").tell(new ObjectDeleted<AlzheimerModel.U_s>((AlzheimerModel.U_s) node), getSelf());
		}
		if (node instanceof AlzheimerModel.U_s) {
			util.newMessage();
			name2actor.get("U_s_object_SP2").tell(new ObjectDeleted<AlzheimerModel.U_s>((AlzheimerModel.U_s) node), getSelf());
		}
		if (node instanceof AlzheimerModel.Abeta) {
			util.newMessage();
			name2actor.get("Abeta_object_SP0").tell(new ObjectDeleted<AlzheimerModel.Abeta>((AlzheimerModel.Abeta) node), getSelf());
		}
		if (node instanceof AlzheimerModel.Abeta) {
			util.newMessage();
			name2actor.get("Abeta_object_SP1").tell(new ObjectDeleted<AlzheimerModel.Abeta>((AlzheimerModel.Abeta) node), getSelf());
		}
		if (node instanceof AlzheimerModel.UNB_s) {
			util.newMessage();
			name2actor.get("UNB_s_object_SP0").tell(new ObjectDeleted<AlzheimerModel.UNB_s>((AlzheimerModel.UNB_s) node), getSelf());
		}
		if (node instanceof AlzheimerModel.UNB_s) {
			util.newMessage();
			name2actor.get("UNB_s_object_SP1").tell(new ObjectDeleted<AlzheimerModel.UNB_s>((AlzheimerModel.UNB_s) node), getSelf());
		}
		if (node instanceof AlzheimerModel.UNB_s) {
			util.newMessage();
			name2actor.get("UNB_s_object_SP2").tell(new ObjectDeleted<AlzheimerModel.UNB_s>((AlzheimerModel.UNB_s) node), getSelf());
		}
		if (node instanceof AlzheimerModel.UB2_s) {
			util.newMessage();
			name2actor.get("UB2_s_object_SP0").tell(new ObjectDeleted<AlzheimerModel.UB2_s>((AlzheimerModel.UB2_s) node), getSelf());
		}
		if (node instanceof AlzheimerModel.UB2_s) {
			util.newMessage();
			name2actor.get("UB2_s_object_SP1").tell(new ObjectDeleted<AlzheimerModel.UB2_s>((AlzheimerModel.UB2_s) node), getSelf());
		}
		if (node instanceof AlzheimerModel.UB1_s) {
			util.newMessage();
			name2actor.get("UB1_s_object_SP0").tell(new ObjectDeleted<AlzheimerModel.UB1_s>((AlzheimerModel.UB1_s) node), getSelf());
		}
		if (node instanceof AlzheimerModel.UB1_s) {
			util.newMessage();
			name2actor.get("UB1_s_object_SP1").tell(new ObjectDeleted<AlzheimerModel.UB1_s>((AlzheimerModel.UB1_s) node), getSelf());
		}
		if (node instanceof AlzheimerModel.UB3_s) {
			util.newMessage();
			name2actor.get("UB3_s_object_SP0").tell(new ObjectDeleted<AlzheimerModel.UB3_s>((AlzheimerModel.UB3_s) node), getSelf());
		}
		if (node instanceof AlzheimerModel.UB3_s) {
			util.newMessage();
			name2actor.get("UB3_s_object_SP1").tell(new ObjectDeleted<AlzheimerModel.UB3_s>((AlzheimerModel.UB3_s) node), getSelf());
		}
		if (node instanceof AlzheimerModel.P53DUB) {
			util.newMessage();
			name2actor.get("P53DUB_object_SP0").tell(new ObjectDeleted<AlzheimerModel.P53DUB>((AlzheimerModel.P53DUB) node), getSelf());
		}
		if (node instanceof AlzheimerModel.P53DUB) {
			util.newMessage();
			name2actor.get("P53DUB_object_SP1").tell(new ObjectDeleted<AlzheimerModel.P53DUB>((AlzheimerModel.P53DUB) node), getSelf());
		}
		if (node instanceof AlzheimerModel.Mdm2DUB) {
			util.newMessage();
			name2actor.get("Mdm2DUB_object_SP0").tell(new ObjectDeleted<AlzheimerModel.Mdm2DUB>((AlzheimerModel.Mdm2DUB) node), getSelf());
		}
		if (node instanceof AlzheimerModel.Mdm2DUB) {
			util.newMessage();
			name2actor.get("Mdm2DUB_object_SP1").tell(new ObjectDeleted<AlzheimerModel.Mdm2DUB>((AlzheimerModel.Mdm2DUB) node), getSelf());
		}
	}
}

