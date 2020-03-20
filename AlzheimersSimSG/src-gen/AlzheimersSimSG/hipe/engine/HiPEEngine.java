package AlzheimersSimSG.hipe.engine;

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

import AlzheimersSimSG.hipe.engine.actor.NotificationActor;
import AlzheimersSimSG.hipe.engine.actor.DispatchActor;
import AlzheimersSimSG.hipe.engine.actor.junction.Mdm2GSK3Phospho2_3_71_junction;
import AlzheimersSimSG.hipe.engine.actor.junction.TauAgg1_150_junction;
import AlzheimersSimSG.hipe.engine.actor.junction.TauP1Agg1_160_junction;
import AlzheimersSimSG.hipe.engine.actor.junction.TauP2Agg1_170_junction;
import AlzheimersSimSG.hipe.engine.actor.junction.tangleForm1_180_junction;
import AlzheimersSimSG.hipe.engine.actor.junction.AbetaAgg1_193_junction;
import AlzheimersSimSG.hipe.engine.actor.junction.AbetaPlaque1_199_junction;

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
		classes.put("Proteasome_x_Tau_phosBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("Proteasome_x_Tau_phosBoundSrc_production", "Proteasome_x_Tau_phosBoundSrc");
		classes.put("Proteasome_x_Tau_phosBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("Proteasome_x_Tau_phosBoundTrg_production", "Proteasome_x_Tau_phosBoundTrg");
		classes.put("Proteasome_x_AggTau_yBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("Proteasome_x_AggTau_yBoundSrc_production", "Proteasome_x_AggTau_yBoundSrc");
		classes.put("Proteasome_x_AggTau_yBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("Proteasome_x_AggTau_yBoundTrg_production", "Proteasome_x_AggTau_yBoundTrg");
		classes.put("Proteasome_x_AggAbeta_yBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("Proteasome_x_AggAbeta_yBoundSrc_production", "Proteasome_x_AggAbeta_yBoundSrc");
		classes.put("Proteasome_x_AggAbeta_yBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("Proteasome_x_AggAbeta_yBoundTrg_production", "Proteasome_x_AggAbeta_yBoundTrg");
		classes.put("Proteasome_x_Mdm2_ubiBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("Proteasome_x_Mdm2_ubiBoundSrc_production", "Proteasome_x_Mdm2_ubiBoundSrc");
		classes.put("Proteasome_x_Mdm2_ubiBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("Proteasome_x_Mdm2_ubiBoundTrg_production", "Proteasome_x_Mdm2_ubiBoundTrg");
		classes.put("MT_l_Tau_phosBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("MT_l_Tau_phosBoundSrc_production", "MT_l_Tau_phosBoundSrc");
		classes.put("MT_l_Tau_phosBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("MT_l_Tau_phosBoundTrg_production", "MT_l_Tau_phosBoundTrg");
		classes.put("P53_b_Mdm2_zBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53_b_Mdm2_zBoundSrc_production", "P53_b_Mdm2_zBoundSrc");
		classes.put("P53_b_Mdm2_zBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53_b_Mdm2_zBoundTrg_production", "P53_b_Mdm2_zBoundTrg");
		classes.put("P53_b_GSK3b_xBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53_b_GSK3b_xBoundSrc_production", "P53_b_GSK3b_xBoundSrc");
		classes.put("P53_b_GSK3b_xBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53_b_GSK3b_xBoundTrg_production", "P53_b_GSK3b_xBoundTrg");
		classes.put("P53_b_Proteasome_xBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53_b_Proteasome_xBoundSrc_production", "P53_b_Proteasome_xBoundSrc");
		classes.put("P53_b_Proteasome_xBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53_b_Proteasome_xBoundTrg_production", "P53_b_Proteasome_xBoundTrg");
		classes.put("GSK3b_p53_production", GenericProductionActor.class);
		productionNodes2pattern.put("GSK3b_p53_production", "GSK3b_p53");
		classes.put("GSK3b_p53Bwd_production", GenericProductionActor.class);
		productionNodes2pattern.put("GSK3b_p53Bwd_production", "GSK3b_p53Bwd");
		classes.put("Mdm2mRNASynthesis_production", GenericProductionActor.class);
		productionNodes2pattern.put("Mdm2mRNASynthesis_production", "Mdm2mRNASynthesis");
		classes.put("Mdm2GSK3Phospho1_production", GenericProductionActor.class);
		productionNodes2pattern.put("Mdm2GSK3Phospho1_production", "Mdm2GSK3Phospho1");
		classes.put("Mdm2GSK3Phospho2_3_production", GenericProductionActor.class);
		productionNodes2pattern.put("Mdm2GSK3Phospho2_3_production", "Mdm2GSK3Phospho2_3");
		classes.put("TauSynthesis_production", GenericProductionActor.class);
		productionNodes2pattern.put("TauSynthesis_production", "TauSynthesis");
		classes.put("Proteasome_Tau_production", GenericProductionActor.class);
		productionNodes2pattern.put("Proteasome_Tau_production", "Proteasome_Tau");
		classes.put("TauDegradation_production", GenericProductionActor.class);
		productionNodes2pattern.put("TauDegradation_production", "TauDegradation");
		classes.put("TauMT_production", GenericProductionActor.class);
		productionNodes2pattern.put("TauMT_production", "TauMT");
		classes.put("TauMTBwd_production", GenericProductionActor.class);
		productionNodes2pattern.put("TauMTBwd_production", "TauMTBwd");
		classes.put("TauPhosphorylation1_3_production", GenericProductionActor.class);
		productionNodes2pattern.put("TauPhosphorylation1_3_production", "TauPhosphorylation1_3");
		classes.put("TauPhosphorylation2_4_production", GenericProductionActor.class);
		productionNodes2pattern.put("TauPhosphorylation2_4_production", "TauPhosphorylation2_4");
		classes.put("TauPhosphorylation5_production", GenericProductionActor.class);
		productionNodes2pattern.put("TauPhosphorylation5_production", "TauPhosphorylation5");
		classes.put("TauPhosphorylation6_production", GenericProductionActor.class);
		productionNodes2pattern.put("TauPhosphorylation6_production", "TauPhosphorylation6");
		classes.put("TauDephosphorylation_production", GenericProductionActor.class);
		productionNodes2pattern.put("TauDephosphorylation_production", "TauDephosphorylation");
		classes.put("TauAgg1_production", GenericProductionActor.class);
		productionNodes2pattern.put("TauAgg1_production", "TauAgg1");
		classes.put("TauAgg2_production", GenericProductionActor.class);
		productionNodes2pattern.put("TauAgg2_production", "TauAgg2");
		classes.put("TauP1Agg1_production", GenericProductionActor.class);
		productionNodes2pattern.put("TauP1Agg1_production", "TauP1Agg1");
		classes.put("TauP1Agg2_production", GenericProductionActor.class);
		productionNodes2pattern.put("TauP1Agg2_production", "TauP1Agg2");
		classes.put("TauP2Agg1_production", GenericProductionActor.class);
		productionNodes2pattern.put("TauP2Agg1_production", "TauP2Agg1");
		classes.put("TauP2Agg2_production", GenericProductionActor.class);
		productionNodes2pattern.put("TauP2Agg2_production", "TauP2Agg2");
		classes.put("tangleForm1_production", GenericProductionActor.class);
		productionNodes2pattern.put("tangleForm1_production", "tangleForm1");
		classes.put("tangleForm2_production", GenericProductionActor.class);
		productionNodes2pattern.put("tangleForm2_production", "tangleForm2");
		classes.put("ProteasomeInhibitionAggTau_production", GenericProductionActor.class);
		productionNodes2pattern.put("ProteasomeInhibitionAggTau_production", "ProteasomeInhibitionAggTau");
		classes.put("AbetaProduction_production", GenericProductionActor.class);
		productionNodes2pattern.put("AbetaProduction_production", "AbetaProduction");
		classes.put("AbetaDegradation_production", GenericProductionActor.class);
		productionNodes2pattern.put("AbetaDegradation_production", "AbetaDegradation");
		classes.put("AbetaAgg1_production", GenericProductionActor.class);
		productionNodes2pattern.put("AbetaAgg1_production", "AbetaAgg1");
		classes.put("AbetaAgg2_production", GenericProductionActor.class);
		productionNodes2pattern.put("AbetaAgg2_production", "AbetaAgg2");
		classes.put("AbetaPlaque1_production", GenericProductionActor.class);
		productionNodes2pattern.put("AbetaPlaque1_production", "AbetaPlaque1");
		classes.put("AbetaPlaque2_production", GenericProductionActor.class);
		productionNodes2pattern.put("AbetaPlaque2_production", "AbetaPlaque2");
		classes.put("ProteasomeInhibitionAggAbeta_production", GenericProductionActor.class);
		productionNodes2pattern.put("ProteasomeInhibitionAggAbeta_production", "ProteasomeInhibitionAggAbeta");
		classes.put("P53Transcription_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53Transcription_production", "P53Transcription");
		classes.put("AbetaROSProduction_production", GenericProductionActor.class);
		productionNodes2pattern.put("AbetaROSProduction_production", "AbetaROSProduction");
		classes.put("P53Synthesis_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53Synthesis_production", "P53Synthesis");
		classes.put("P53_Mdm2_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53_Mdm2_production", "P53_Mdm2");
		classes.put("P53_Mdm2Bwd_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53_Mdm2Bwd_production", "P53_Mdm2Bwd");
		classes.put("E1Ub_production", GenericProductionActor.class);
		productionNodes2pattern.put("E1Ub_production", "E1Ub");
		classes.put("E2Ub_production", GenericProductionActor.class);
		productionNodes2pattern.put("E2Ub_production", "E2Ub");
		classes.put("P53Ubiquitination_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53Ubiquitination_production", "P53Ubiquitination");
		classes.put("P53PolyUbiquitination1_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53PolyUbiquitination1_production", "P53PolyUbiquitination1");
		classes.put("P53PolyUbiquitination2_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53PolyUbiquitination2_production", "P53PolyUbiquitination2");
		classes.put("P53PolyUbiquitination3_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53PolyUbiquitination3_production", "P53PolyUbiquitination3");
		classes.put("P53DeUbiquitination_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53DeUbiquitination_production", "P53DeUbiquitination");
		classes.put("P53PolyDeUbiquitination2_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53PolyDeUbiquitination2_production", "P53PolyDeUbiquitination2");
		classes.put("P53PolyDeUbiquitination3_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53PolyDeUbiquitination3_production", "P53PolyDeUbiquitination3");
		classes.put("P53PolyDeUbiquitination4_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53PolyDeUbiquitination4_production", "P53PolyDeUbiquitination4");
		classes.put("P53ProteasomeBinding_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53ProteasomeBinding_production", "P53ProteasomeBinding");
		classes.put("P53Degradation_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53Degradation_production", "P53Degradation");
		classes.put("mdm2mRNASynthesis_production", GenericProductionActor.class);
		productionNodes2pattern.put("mdm2mRNASynthesis_production", "mdm2mRNASynthesis");
		classes.put("mdm2mRNADegradation_production", GenericProductionActor.class);
		productionNodes2pattern.put("mdm2mRNADegradation_production", "mdm2mRNADegradation");
		classes.put("Mdm2Synthesis_production", GenericProductionActor.class);
		productionNodes2pattern.put("Mdm2Synthesis_production", "Mdm2Synthesis");
		classes.put("mdm2Ubiquination_production", GenericProductionActor.class);
		productionNodes2pattern.put("mdm2Ubiquination_production", "mdm2Ubiquination");
		classes.put("mdm2PolyUbiquination1_production", GenericProductionActor.class);
		productionNodes2pattern.put("mdm2PolyUbiquination1_production", "mdm2PolyUbiquination1");
		classes.put("mdm2PolyUbiquination2_production", GenericProductionActor.class);
		productionNodes2pattern.put("mdm2PolyUbiquination2_production", "mdm2PolyUbiquination2");
		classes.put("mdm2PolyUbiquination3_production", GenericProductionActor.class);
		productionNodes2pattern.put("mdm2PolyUbiquination3_production", "mdm2PolyUbiquination3");
		classes.put("mdm2deubiquination_production", GenericProductionActor.class);
		productionNodes2pattern.put("mdm2deubiquination_production", "mdm2deubiquination");
		classes.put("mdm2polyDeubiquination1_production", GenericProductionActor.class);
		productionNodes2pattern.put("mdm2polyDeubiquination1_production", "mdm2polyDeubiquination1");
		classes.put("mdm2polyDeubiquination2_production", GenericProductionActor.class);
		productionNodes2pattern.put("mdm2polyDeubiquination2_production", "mdm2polyDeubiquination2");
		classes.put("mdm2polyDeubiquination3_production", GenericProductionActor.class);
		productionNodes2pattern.put("mdm2polyDeubiquination3_production", "mdm2polyDeubiquination3");
		classes.put("Mdm2ProteasomeBind_production", GenericProductionActor.class);
		productionNodes2pattern.put("Mdm2ProteasomeBind_production", "Mdm2ProteasomeBind");
		classes.put("Mdm2Degradation_production", GenericProductionActor.class);
		productionNodes2pattern.put("Mdm2Degradation_production", "Mdm2Degradation");
		classes.put("ATMActivation_production", GenericProductionActor.class);
		productionNodes2pattern.put("ATMActivation_production", "ATMActivation");
		classes.put("ATMInactivation_production", GenericProductionActor.class);
		productionNodes2pattern.put("ATMInactivation_production", "ATMInactivation");
		classes.put("P53Phospho_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53Phospho_production", "P53Phospho");
		classes.put("P53DePhospho_production", GenericProductionActor.class);
		productionNodes2pattern.put("P53DePhospho_production", "P53DePhospho");
		classes.put("Mdm2Phospho_production", GenericProductionActor.class);
		productionNodes2pattern.put("Mdm2Phospho_production", "Mdm2Phospho");
		classes.put("Mdm2DePhospho_production", GenericProductionActor.class);
		productionNodes2pattern.put("Mdm2DePhospho_production", "Mdm2DePhospho");
		classes.put("p53mRNASynthesis_production", GenericProductionActor.class);
		productionNodes2pattern.put("p53mRNASynthesis_production", "p53mRNASynthesis");
		classes.put("p53mRNADegradation_production", GenericProductionActor.class);
		productionNodes2pattern.put("p53mRNADegradation_production", "p53mRNADegradation");
		classes.put("IRDamage_production", GenericProductionActor.class);
		productionNodes2pattern.put("IRDamage_production", "IRDamage");
		classes.put("DNARepair_production", GenericProductionActor.class);
		productionNodes2pattern.put("DNARepair_production", "DNARepair");
		classes.put("ROSDamage_production", GenericProductionActor.class);
		productionNodes2pattern.put("ROSDamage_production", "ROSDamage");
		classes.put("BasalROSDamage_production", GenericProductionActor.class);
		productionNodes2pattern.put("BasalROSDamage_production", "BasalROSDamage");
		classes.put("obs_obs_mdm2_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_obs_mdm2_production", "obs_obs_mdm2");
		classes.put("obs_obs_mdm2mRNA_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_obs_mdm2mRNA_production", "obs_obs_mdm2mRNA");
		classes.put("obs_obs_mdm2DUB_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_obs_mdm2DUB_production", "obs_obs_mdm2DUB");
		classes.put("obs_obs_p53_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_obs_p53_production", "obs_obs_p53");
		classes.put("obs_obs_p53mRNA_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_obs_p53mRNA_production", "obs_obs_p53mRNA");
		classes.put("obs_obs_p53DUB_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_obs_p53DUB_production", "obs_obs_p53DUB");
		classes.put("obs_obs_p53gsk_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_obs_p53gsk_production", "obs_obs_p53gsk");
		classes.put("obs_obs_damDNA_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_obs_damDNA_production", "obs_obs_damDNA");
		classes.put("obs_obs_tauTangle_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_obs_tauTangle_production", "obs_obs_tauTangle");
		classes.put("obs_obs_abetaPlaque_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_obs_abetaPlaque_production", "obs_obs_abetaPlaque");
		
	}
	
	public void createJunctionNodes() {
		classes.put("GSK3b_p53_49_junction", GenericJunctionActor.class);
		classes.put("GSK3b_p53_520_nacjunction", GenericNACJunctionActor.class);
		classes.put("GSK3b_p53_521_nacjunction", GenericNACJunctionActor.class);
		classes.put("GSK3b_p53_522_nacjunction", GenericNACJunctionActor.class);
		classes.put("Mdm2GSK3Phospho1_59_junction", GenericJunctionActor.class);
		classes.put("Mdm2GSK3Phospho1_64_junction", GenericJunctionActor.class);
		classes.put("Mdm2GSK3Phospho1_60_junction", GenericJunctionActor.class);
		classes.put("Mdm2GSK3Phospho1_58_junction", GenericJunctionActor.class);
		classes.put("Mdm2GSK3Phospho2_3_72_junction", GenericJunctionActor.class);
		classes.put("Mdm2GSK3Phospho2_3_77_junction", GenericJunctionActor.class);
		classes.put("Mdm2GSK3Phospho2_3_73_junction", GenericJunctionActor.class);
		classes.put("Mdm2GSK3Phospho2_3_71_junction", Mdm2GSK3Phospho2_3_71_junction.class);
		classes.put("TauSynthesis_86_junction", GenericJunctionActor.class);
		classes.put("Proteasome_Tau_89_junction", GenericJunctionActor.class);
		classes.put("TauDegradation_94_junction", GenericJunctionActor.class);
		classes.put("TauMT_100_junction", GenericJunctionActor.class);
		classes.put("TauMT_523_nacjunction", GenericNACJunctionActor.class);
		classes.put("TauMTBwd_105_junction", GenericJunctionActor.class);
		classes.put("TauPhosphorylation1_3_113_junction", GenericJunctionActor.class);
		classes.put("TauPhosphorylation1_3_111_junction", GenericJunctionActor.class);
		classes.put("TauPhosphorylation2_4_122_junction", GenericJunctionActor.class);
		classes.put("TauPhosphorylation2_4_120_junction", GenericJunctionActor.class);
		classes.put("TauPhosphorylation5_130_junction", GenericJunctionActor.class);
		classes.put("TauPhosphorylation5_129_junction", GenericJunctionActor.class);
		classes.put("TauPhosphorylation6_137_junction", GenericJunctionActor.class);
		classes.put("TauPhosphorylation6_136_junction", GenericJunctionActor.class);
		classes.put("TauDephosphorylation_144_junction", GenericJunctionActor.class);
		classes.put("TauDephosphorylation_143_junction", GenericJunctionActor.class);
		classes.put("TauAgg1_150_junction", TauAgg1_150_junction.class);
		classes.put("TauAgg2_155_junction", GenericJunctionActor.class);
		classes.put("TauP1Agg1_160_junction", TauP1Agg1_160_junction.class);
		classes.put("TauP1Agg2_165_junction", GenericJunctionActor.class);
		classes.put("TauP2Agg1_170_junction", TauP2Agg1_170_junction.class);
		classes.put("TauP2Agg2_175_junction", GenericJunctionActor.class);
		classes.put("tangleForm1_180_junction", tangleForm1_180_junction.class);
		classes.put("tangleForm2_183_junction", GenericJunctionActor.class);
		classes.put("ProteasomeInhibitionAggTau_186_junction", GenericJunctionActor.class);
		classes.put("AbetaAgg1_193_junction", AbetaAgg1_193_junction.class);
		classes.put("AbetaAgg2_196_junction", GenericJunctionActor.class);
		classes.put("AbetaPlaque1_199_junction", AbetaPlaque1_199_junction.class);
		classes.put("AbetaPlaque2_202_junction", GenericJunctionActor.class);
		classes.put("ProteasomeInhibitionAggAbeta_205_junction", GenericJunctionActor.class);
		classes.put("P53Synthesis_210_junction", GenericJunctionActor.class);
		classes.put("P53_Mdm2_213_junction", GenericJunctionActor.class);
		classes.put("P53_Mdm2_524_nacjunction", GenericNACJunctionActor.class);
		classes.put("P53_Mdm2_525_nacjunction", GenericNACJunctionActor.class);
		classes.put("P53_Mdm2_526_nacjunction", GenericNACJunctionActor.class);
		classes.put("P53_Mdm2Bwd_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("E1Ub_230_junction", GenericJunctionActor.class);
		classes.put("E1Ub_227_junction", GenericJunctionActor.class);
		classes.put("E1Ub_226_junction", GenericJunctionActor.class);
		classes.put("E2Ub_236_junction", GenericJunctionActor.class);
		classes.put("E2Ub_237_junction", GenericJunctionActor.class);
		classes.put("E2Ub_235_junction", GenericJunctionActor.class);
		classes.put("P53Ubiquitination_248_junction", GenericJunctionActor.class);
		classes.put("P53Ubiquitination_246_junction", GenericJunctionActor.class);
		classes.put("P53Ubiquitination_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("P53Ubiquitination_245_junction", GenericJunctionActor.class);
		classes.put("P53PolyUbiquitination1_263_junction", GenericJunctionActor.class);
		classes.put("P53PolyUbiquitination1_261_junction", GenericJunctionActor.class);
		classes.put("P53PolyUbiquitination1_266_junction", GenericJunctionActor.class);
		classes.put("P53PolyUbiquitination1_262_junction", GenericJunctionActor.class);
		classes.put("P53PolyUbiquitination1_260_junction", GenericJunctionActor.class);
		classes.put("P53PolyUbiquitination2_280_junction", GenericJunctionActor.class);
		classes.put("P53PolyUbiquitination2_278_junction", GenericJunctionActor.class);
		classes.put("P53PolyUbiquitination2_283_junction", GenericJunctionActor.class);
		classes.put("P53PolyUbiquitination2_279_junction", GenericJunctionActor.class);
		classes.put("P53PolyUbiquitination2_277_junction", GenericJunctionActor.class);
		classes.put("P53PolyUbiquitination3_297_junction", GenericJunctionActor.class);
		classes.put("P53PolyUbiquitination3_295_junction", GenericJunctionActor.class);
		classes.put("P53PolyUbiquitination3_300_junction", GenericJunctionActor.class);
		classes.put("P53PolyUbiquitination3_296_junction", GenericJunctionActor.class);
		classes.put("P53PolyUbiquitination3_294_junction", GenericJunctionActor.class);
		classes.put("P53DeUbiquitination_315_junction", GenericJunctionActor.class);
		classes.put("P53DeUbiquitination_313_junction", GenericJunctionActor.class);
		classes.put("P53DeUbiquitination_311_junction", GenericJunctionActor.class);
		classes.put("P53PolyDeUbiquitination2_323_junction", GenericJunctionActor.class);
		classes.put("P53PolyDeUbiquitination2_328_junction", GenericJunctionActor.class);
		classes.put("P53PolyDeUbiquitination2_324_junction", GenericJunctionActor.class);
		classes.put("P53PolyDeUbiquitination2_322_junction", GenericJunctionActor.class);
		classes.put("P53PolyDeUbiquitination3_336_junction", GenericJunctionActor.class);
		classes.put("P53PolyDeUbiquitination3_341_junction", GenericJunctionActor.class);
		classes.put("P53PolyDeUbiquitination3_337_junction", GenericJunctionActor.class);
		classes.put("P53PolyDeUbiquitination3_335_junction", GenericJunctionActor.class);
		classes.put("P53PolyDeUbiquitination4_349_junction", GenericJunctionActor.class);
		classes.put("P53PolyDeUbiquitination4_354_junction", GenericJunctionActor.class);
		classes.put("P53PolyDeUbiquitination4_350_junction", GenericJunctionActor.class);
		classes.put("P53PolyDeUbiquitination4_348_junction", GenericJunctionActor.class);
		classes.put("P53ProteasomeBinding_362_junction", GenericJunctionActor.class);
		classes.put("P53ProteasomeBinding_367_junction", GenericJunctionActor.class);
		classes.put("P53ProteasomeBinding_363_junction", GenericJunctionActor.class);
		classes.put("P53ProteasomeBinding_361_junction", GenericJunctionActor.class);
		classes.put("P53Degradation_376_junction", GenericJunctionActor.class);
		classes.put("P53Degradation_374_junction", GenericJunctionActor.class);
		classes.put("mdm2mRNASynthesis_527_nacjunction", GenericNACJunctionActor.class);
		classes.put("mdm2mRNASynthesis_528_nacjunction", GenericNACJunctionActor.class);
		classes.put("mdm2mRNASynthesis_529_nacjunction", GenericNACJunctionActor.class);
		classes.put("Mdm2Synthesis_388_junction", GenericJunctionActor.class);
		classes.put("Mdm2Synthesis_386_junction", GenericJunctionActor.class);
		createJunctionNodes_1();
			}	
		
			private void createJunctionNodes_1() {
		classes.put("mdm2Ubiquination_393_junction", GenericJunctionActor.class);
		classes.put("mdm2Ubiquination_391_junction", GenericJunctionActor.class);
		classes.put("mdm2PolyUbiquination1_405_junction", GenericJunctionActor.class);
		classes.put("mdm2PolyUbiquination1_402_junction", GenericJunctionActor.class);
		classes.put("mdm2PolyUbiquination1_400_junction", GenericJunctionActor.class);
		classes.put("mdm2PolyUbiquination2_416_junction", GenericJunctionActor.class);
		classes.put("mdm2PolyUbiquination2_413_junction", GenericJunctionActor.class);
		classes.put("mdm2PolyUbiquination2_411_junction", GenericJunctionActor.class);
		classes.put("mdm2PolyUbiquination3_427_junction", GenericJunctionActor.class);
		classes.put("mdm2PolyUbiquination3_424_junction", GenericJunctionActor.class);
		classes.put("mdm2PolyUbiquination3_422_junction", GenericJunctionActor.class);
		classes.put("mdm2deubiquination_434_junction", GenericJunctionActor.class);
		classes.put("mdm2deubiquination_433_junction", GenericJunctionActor.class);
		classes.put("mdm2polyDeubiquination1_441_junction", GenericJunctionActor.class);
		classes.put("mdm2polyDeubiquination1_440_junction", GenericJunctionActor.class);
		classes.put("mdm2polyDeubiquination2_448_junction", GenericJunctionActor.class);
		classes.put("mdm2polyDeubiquination2_447_junction", GenericJunctionActor.class);
		classes.put("mdm2polyDeubiquination3_455_junction", GenericJunctionActor.class);
		classes.put("mdm2polyDeubiquination3_454_junction", GenericJunctionActor.class);
		classes.put("Mdm2ProteasomeBind_461_junction", GenericJunctionActor.class);
		classes.put("Mdm2Degradation_468_junction", GenericJunctionActor.class);
		classes.put("Mdm2Degradation_466_junction", GenericJunctionActor.class);
		classes.put("ATMActivation_474_junction", GenericJunctionActor.class);
		classes.put("P53Phospho_479_junction", GenericJunctionActor.class);
		classes.put("P53Phospho_478_junction", GenericJunctionActor.class);
		classes.put("P53Phospho_530_nacjunction", GenericNACJunctionActor.class);
		classes.put("P53Phospho_531_nacjunction", GenericNACJunctionActor.class);
		classes.put("P53Phospho_532_nacjunction", GenericNACJunctionActor.class);
		classes.put("P53DePhospho_485_junction", GenericJunctionActor.class);
		classes.put("P53DePhospho_533_nacjunction", GenericNACJunctionActor.class);
		classes.put("P53DePhospho_534_nacjunction", GenericNACJunctionActor.class);
		classes.put("P53DePhospho_535_nacjunction", GenericNACJunctionActor.class);
		classes.put("Mdm2Phospho_491_junction", GenericJunctionActor.class);
		classes.put("Mdm2Phospho_490_junction", GenericJunctionActor.class);
		classes.put("Mdm2DePhospho_497_junction", GenericJunctionActor.class);
	}
	
	public void createReferenceNodes() {
		classes.put("Proteasome_Proteasome_x_Tau_phos_0_reference",Proteasome_Proteasome_x_Tau_phos_0_reference.class);
		classes.put("Proteasome_Proteasome_x_AggTau_y_0_reference",Proteasome_Proteasome_x_AggTau_y_0_reference.class);
		classes.put("Proteasome_Proteasome_x_AggAbeta_y_0_reference",Proteasome_Proteasome_x_AggAbeta_y_0_reference.class);
		classes.put("Proteasome_Proteasome_x_Mdm2_ubi_0_reference",Proteasome_Proteasome_x_Mdm2_ubi_0_reference.class);
		classes.put("MT_MT_l_Tau_phos_0_reference",MT_MT_l_Tau_phos_0_reference.class);
		classes.put("P53_P53_b_Mdm2_z_0_reference",P53_P53_b_Mdm2_z_0_reference.class);
		classes.put("P53_P53_b_GSK3b_x_0_reference",P53_P53_b_GSK3b_x_0_reference.class);
		classes.put("P53_P53_b_Proteasome_x_0_reference",P53_P53_b_Proteasome_x_0_reference.class);
		classes.put("Mdm2_Mdm2_z_u_0_reference",Mdm2_Mdm2_z_u_0_reference.class);
		classes.put("P53_P53_b_ub4_0_reference",P53_P53_b_ub4_0_reference.class);
		classes.put("Tau_Tau_phos_u_0_reference",Tau_Tau_phos_u_0_reference.class);
		classes.put("Tau_Tau_phos_p1_0_reference",Tau_Tau_phos_p1_0_reference.class);
		classes.put("Tau_Tau_phos_p2_0_reference",Tau_Tau_phos_p2_0_reference.class);
		classes.put("P53_P53_b_u_0_reference",P53_P53_b_u_0_reference.class);
		classes.put("E1_E1_x_unb_0_reference",E1_E1_x_unb_0_reference.class);
		classes.put("E2_E2_x_unb_0_reference",E2_E2_x_unb_0_reference.class);
		classes.put("E2_E2_x_ubi_0_reference",E2_E2_x_ubi_0_reference.class);
		classes.put("P53_P53_b_ub1_0_reference",P53_P53_b_ub1_0_reference.class);
		classes.put("P53_P53_b_ub2_0_reference",P53_P53_b_ub2_0_reference.class);
		classes.put("P53_P53_b_ub3_0_reference",P53_P53_b_ub3_0_reference.class);
		classes.put("Mdm2_Mdm2_z_p_0_reference",Mdm2_Mdm2_z_p_0_reference.class);
		classes.put("Mdm2_Mdm2_ubi_unb_0_reference",Mdm2_Mdm2_ubi_unb_0_reference.class);
		classes.put("Mdm2_Mdm2_ubi_ub1_0_reference",Mdm2_Mdm2_ubi_ub1_0_reference.class);
		classes.put("Mdm2_Mdm2_ubi_ub2_0_reference",Mdm2_Mdm2_ubi_ub2_0_reference.class);
		classes.put("Mdm2_Mdm2_ubi_ub3_0_reference",Mdm2_Mdm2_ubi_ub3_0_reference.class);
		classes.put("Mdm2_Mdm2_ubi_ub4_0_reference",Mdm2_Mdm2_ubi_ub4_0_reference.class);
		classes.put("P53_P53_b_p_0_reference",P53_P53_b_p_0_reference.class);
		
	}
	
	public void createObjectNodes() {
		classes.put("MT_object",MT_object.class);
		classes.put("UB4_s_object",UB4_s_object.class);
		classes.put("Container_object",Container_object.class);
		classes.put("P1_s_object",P1_s_object.class);
		classes.put("P2_s_object",P2_s_object.class);
		classes.put("PPT_object",PPT_object.class);
		classes.put("NFT_object",NFT_object.class);
		classes.put("AbetaPlaque_object",AbetaPlaque_object.class);
		classes.put("P53mRNA_object",P53mRNA_object.class);
		classes.put("UBI_s_object",UBI_s_object.class);
		classes.put("Ub_object",Ub_object.class);
		classes.put("ATP_object",ATP_object.class);
		classes.put("E1_object",E1_object.class);
		classes.put("E2_object",E2_object.class);
		classes.put("Mdm2mRNA_object",Mdm2mRNA_object.class);
		classes.put("ATMI_object",ATMI_object.class);
		classes.put("DamDNA_object",DamDNA_object.class);
		classes.put("ATMA_object",ATMA_object.class);
		classes.put("IR_object",IR_object.class);
		classes.put("ROS_object",ROS_object.class);
		classes.put("BasalROS_object",BasalROS_object.class);
		classes.put("Proteasome_object_SP0",Proteasome_object_SP0.class);
		classes.put("Proteasome_object_SP1",Proteasome_object_SP1.class);
		classes.put("Proteasome_object_SP2",Proteasome_object_SP2.class);
		classes.put("Tau_object_SP0",Tau_object_SP0.class);
		classes.put("Tau_object_SP1",Tau_object_SP1.class);
		classes.put("AggTau_object_SP0",AggTau_object_SP0.class);
		classes.put("AggTau_object_SP1",AggTau_object_SP1.class);
		classes.put("AggAbeta_object_SP0",AggAbeta_object_SP0.class);
		classes.put("AggAbeta_object_SP1",AggAbeta_object_SP1.class);
		classes.put("Mdm2_object_SP0",Mdm2_object_SP0.class);
		classes.put("Mdm2_object_SP1",Mdm2_object_SP1.class);
		classes.put("Mdm2_object_SP2",Mdm2_object_SP2.class);
		classes.put("P53_object_SP0",P53_object_SP0.class);
		classes.put("P53_object_SP1",P53_object_SP1.class);
		classes.put("P53_object_SP2",P53_object_SP2.class);
		classes.put("GSK3b_object_SP0",GSK3b_object_SP0.class);
		classes.put("GSK3b_object_SP1",GSK3b_object_SP1.class);
		classes.put("P_s_object_SP0",P_s_object_SP0.class);
		classes.put("P_s_object_SP1",P_s_object_SP1.class);
		classes.put("U_s_object_SP0",U_s_object_SP0.class);
		classes.put("U_s_object_SP1",U_s_object_SP1.class);
		classes.put("U_s_object_SP2",U_s_object_SP2.class);
		classes.put("Abeta_object_SP0",Abeta_object_SP0.class);
		classes.put("Abeta_object_SP1",Abeta_object_SP1.class);
		classes.put("UNB_s_object_SP0",UNB_s_object_SP0.class);
		classes.put("UNB_s_object_SP1",UNB_s_object_SP1.class);
		classes.put("UNB_s_object_SP2",UNB_s_object_SP2.class);
		classes.put("UB2_s_object_SP0",UB2_s_object_SP0.class);
		classes.put("UB2_s_object_SP1",UB2_s_object_SP1.class);
		classes.put("UB1_s_object_SP0",UB1_s_object_SP0.class);
		classes.put("UB1_s_object_SP1",UB1_s_object_SP1.class);
		classes.put("UB3_s_object_SP0",UB3_s_object_SP0.class);
		classes.put("UB3_s_object_SP1",UB3_s_object_SP1.class);
		classes.put("P53DUB_object_SP0",P53DUB_object_SP0.class);
		classes.put("P53DUB_object_SP1",P53DUB_object_SP1.class);
		classes.put("Mdm2DUB_object_SP0",Mdm2DUB_object_SP0.class);
		classes.put("Mdm2DUB_object_SP1",Mdm2DUB_object_SP1.class);
		
	}
	
	public void initializeReferenceNodes() {
		name2initRefGen.put("Proteasome_Proteasome_x_Tau_phos_0_reference", new InitGenReferenceActor<AlzheimerModel.Proteasome,AlzheimerModel.Tau>(name2actor, name2node.get("Proteasome_Proteasome_x_Tau_phos_0_reference"), (o) -> o instanceof AlzheimerModel.Proteasome, (o) -> o.getProteasome_x_Tau_phos(), null, false));
		name2initRefGen.put("Proteasome_Proteasome_x_AggTau_y_0_reference", new InitGenReferenceActor<AlzheimerModel.Proteasome,AlzheimerModel.AggTau>(name2actor, name2node.get("Proteasome_Proteasome_x_AggTau_y_0_reference"), (o) -> o instanceof AlzheimerModel.Proteasome, (o) -> o.getProteasome_x_AggTau_y(), null, false));
		name2initRefGen.put("Proteasome_Proteasome_x_AggAbeta_y_0_reference", new InitGenReferenceActor<AlzheimerModel.Proteasome,AlzheimerModel.AggAbeta>(name2actor, name2node.get("Proteasome_Proteasome_x_AggAbeta_y_0_reference"), (o) -> o instanceof AlzheimerModel.Proteasome, (o) -> o.getProteasome_x_AggAbeta_y(), null, false));
		name2initRefGen.put("Proteasome_Proteasome_x_Mdm2_ubi_0_reference", new InitGenReferenceActor<AlzheimerModel.Proteasome,AlzheimerModel.Mdm2>(name2actor, name2node.get("Proteasome_Proteasome_x_Mdm2_ubi_0_reference"), (o) -> o instanceof AlzheimerModel.Proteasome, (o) -> o.getProteasome_x_Mdm2_ubi(), null, false));
		name2initRefGen.put("MT_MT_l_Tau_phos_0_reference", new InitGenReferenceActor<AlzheimerModel.MT,AlzheimerModel.Tau>(name2actor, name2node.get("MT_MT_l_Tau_phos_0_reference"), (o) -> o instanceof AlzheimerModel.MT, (o) -> o.getMT_l_Tau_phos(), null, false));
		name2initRefGen.put("P53_P53_b_Mdm2_z_0_reference", new InitGenReferenceActor<AlzheimerModel.P53,AlzheimerModel.Mdm2>(name2actor, name2node.get("P53_P53_b_Mdm2_z_0_reference"), (o) -> o instanceof AlzheimerModel.P53, (o) -> o.getP53_b_Mdm2_z(), null, false));
		name2initRefGen.put("P53_P53_b_GSK3b_x_0_reference", new InitGenReferenceActor<AlzheimerModel.P53,AlzheimerModel.GSK3b>(name2actor, name2node.get("P53_P53_b_GSK3b_x_0_reference"), (o) -> o instanceof AlzheimerModel.P53, (o) -> o.getP53_b_GSK3b_x(), null, false));
		name2initRefGen.put("P53_P53_b_Proteasome_x_0_reference", new InitGenReferenceActor<AlzheimerModel.P53,AlzheimerModel.Proteasome>(name2actor, name2node.get("P53_P53_b_Proteasome_x_0_reference"), (o) -> o instanceof AlzheimerModel.P53, (o) -> o.getP53_b_Proteasome_x(), null, false));
		name2initRefGen.put("Mdm2_Mdm2_z_u_0_reference", new InitGenReferenceActor<AlzheimerModel.Mdm2,AlzheimerModel.U_s>(name2actor, name2node.get("Mdm2_Mdm2_z_u_0_reference"), (o) -> o instanceof AlzheimerModel.Mdm2, (o) -> o.getMdm2_z_u(), null, false));
		name2initRefGen.put("P53_P53_b_ub4_0_reference", new InitGenReferenceActor<AlzheimerModel.P53,AlzheimerModel.UB4_s>(name2actor, name2node.get("P53_P53_b_ub4_0_reference"), (o) -> o instanceof AlzheimerModel.P53, (o) -> o.getP53_b_ub4(), null, false));
		name2initRefGen.put("Tau_Tau_phos_u_0_reference", new InitGenReferenceActor<AlzheimerModel.Tau,AlzheimerModel.U_s>(name2actor, name2node.get("Tau_Tau_phos_u_0_reference"), (o) -> o instanceof AlzheimerModel.Tau, (o) -> o.getTau_phos_u(), null, false));
		name2initRefGen.put("Tau_Tau_phos_p1_0_reference", new InitGenReferenceActor<AlzheimerModel.Tau,AlzheimerModel.P1_s>(name2actor, name2node.get("Tau_Tau_phos_p1_0_reference"), (o) -> o instanceof AlzheimerModel.Tau, (o) -> o.getTau_phos_p1(), null, false));
		name2initRefGen.put("Tau_Tau_phos_p2_0_reference", new InitGenReferenceActor<AlzheimerModel.Tau,AlzheimerModel.P2_s>(name2actor, name2node.get("Tau_Tau_phos_p2_0_reference"), (o) -> o instanceof AlzheimerModel.Tau, (o) -> o.getTau_phos_p2(), null, false));
		name2initRefGen.put("P53_P53_b_u_0_reference", new InitGenReferenceActor<AlzheimerModel.P53,AlzheimerModel.U_s>(name2actor, name2node.get("P53_P53_b_u_0_reference"), (o) -> o instanceof AlzheimerModel.P53, (o) -> o.getP53_b_u(), null, false));
		name2initRefGen.put("E1_E1_x_unb_0_reference", new InitGenReferenceActor<AlzheimerModel.E1,AlzheimerModel.UNB_s>(name2actor, name2node.get("E1_E1_x_unb_0_reference"), (o) -> o instanceof AlzheimerModel.E1, (o) -> o.getE1_x_unb(), null, false));
		name2initRefGen.put("E2_E2_x_unb_0_reference", new InitGenReferenceActor<AlzheimerModel.E2,AlzheimerModel.UNB_s>(name2actor, name2node.get("E2_E2_x_unb_0_reference"), (o) -> o instanceof AlzheimerModel.E2, (o) -> o.getE2_x_unb(), null, false));
		name2initRefGen.put("E2_E2_x_ubi_0_reference", new InitGenReferenceActor<AlzheimerModel.E2,AlzheimerModel.UBI_s>(name2actor, name2node.get("E2_E2_x_ubi_0_reference"), (o) -> o instanceof AlzheimerModel.E2, (o) -> o.getE2_x_ubi(), null, false));
		name2initRefGen.put("P53_P53_b_ub1_0_reference", new InitGenReferenceActor<AlzheimerModel.P53,AlzheimerModel.UB1_s>(name2actor, name2node.get("P53_P53_b_ub1_0_reference"), (o) -> o instanceof AlzheimerModel.P53, (o) -> o.getP53_b_ub1(), null, false));
		name2initRefGen.put("P53_P53_b_ub2_0_reference", new InitGenReferenceActor<AlzheimerModel.P53,AlzheimerModel.UB2_s>(name2actor, name2node.get("P53_P53_b_ub2_0_reference"), (o) -> o instanceof AlzheimerModel.P53, (o) -> o.getP53_b_ub2(), null, false));
		name2initRefGen.put("P53_P53_b_ub3_0_reference", new InitGenReferenceActor<AlzheimerModel.P53,AlzheimerModel.UB3_s>(name2actor, name2node.get("P53_P53_b_ub3_0_reference"), (o) -> o instanceof AlzheimerModel.P53, (o) -> o.getP53_b_ub3(), null, false));
		name2initRefGen.put("Mdm2_Mdm2_z_p_0_reference", new InitGenReferenceActor<AlzheimerModel.Mdm2,AlzheimerModel.P_s>(name2actor, name2node.get("Mdm2_Mdm2_z_p_0_reference"), (o) -> o instanceof AlzheimerModel.Mdm2, (o) -> o.getMdm2_z_p(), null, false));
		name2initRefGen.put("Mdm2_Mdm2_ubi_unb_0_reference", new InitGenReferenceActor<AlzheimerModel.Mdm2,AlzheimerModel.UNB_s>(name2actor, name2node.get("Mdm2_Mdm2_ubi_unb_0_reference"), (o) -> o instanceof AlzheimerModel.Mdm2, (o) -> o.getMdm2_ubi_unb(), null, false));
		name2initRefGen.put("Mdm2_Mdm2_ubi_ub1_0_reference", new InitGenReferenceActor<AlzheimerModel.Mdm2,AlzheimerModel.UB1_s>(name2actor, name2node.get("Mdm2_Mdm2_ubi_ub1_0_reference"), (o) -> o instanceof AlzheimerModel.Mdm2, (o) -> o.getMdm2_ubi_ub1(), null, false));
		name2initRefGen.put("Mdm2_Mdm2_ubi_ub2_0_reference", new InitGenReferenceActor<AlzheimerModel.Mdm2,AlzheimerModel.UB2_s>(name2actor, name2node.get("Mdm2_Mdm2_ubi_ub2_0_reference"), (o) -> o instanceof AlzheimerModel.Mdm2, (o) -> o.getMdm2_ubi_ub2(), null, false));
		name2initRefGen.put("Mdm2_Mdm2_ubi_ub3_0_reference", new InitGenReferenceActor<AlzheimerModel.Mdm2,AlzheimerModel.UB3_s>(name2actor, name2node.get("Mdm2_Mdm2_ubi_ub3_0_reference"), (o) -> o instanceof AlzheimerModel.Mdm2, (o) -> o.getMdm2_ubi_ub3(), null, false));
		name2initRefGen.put("Mdm2_Mdm2_ubi_ub4_0_reference", new InitGenReferenceActor<AlzheimerModel.Mdm2,AlzheimerModel.UB4_s>(name2actor, name2node.get("Mdm2_Mdm2_ubi_ub4_0_reference"), (o) -> o instanceof AlzheimerModel.Mdm2, (o) -> o.getMdm2_ubi_ub4(), null, false));
		name2initRefGen.put("P53_P53_b_p_0_reference", new InitGenReferenceActor<AlzheimerModel.P53,AlzheimerModel.P_s>(name2actor, name2node.get("P53_P53_b_p_0_reference"), (o) -> o instanceof AlzheimerModel.P53, (o) -> o.getP53_b_p(), null, false));
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

class MT_object extends GenericObjectActor<AlzheimerModel.MT> { }
class UB4_s_object extends GenericObjectActor<AlzheimerModel.UB4_s> { }
class Container_object extends GenericObjectActor<reactionContainer.Container> { }
class P1_s_object extends GenericObjectActor<AlzheimerModel.P1_s> { }
class P2_s_object extends GenericObjectActor<AlzheimerModel.P2_s> { }
class PPT_object extends GenericObjectActor<AlzheimerModel.PPT> { }
class NFT_object extends GenericObjectActor<AlzheimerModel.NFT> { }
class AbetaPlaque_object extends GenericObjectActor<AlzheimerModel.AbetaPlaque> { }
class P53mRNA_object extends GenericObjectActor<AlzheimerModel.P53mRNA> { }
class UBI_s_object extends GenericObjectActor<AlzheimerModel.UBI_s> { }
class Ub_object extends GenericObjectActor<AlzheimerModel.Ub> { }
class ATP_object extends GenericObjectActor<AlzheimerModel.ATP> { }
class E1_object extends GenericObjectActor<AlzheimerModel.E1> { }
class E2_object extends GenericObjectActor<AlzheimerModel.E2> { }
class Mdm2mRNA_object extends GenericObjectActor<AlzheimerModel.Mdm2mRNA> { }
class ATMI_object extends GenericObjectActor<AlzheimerModel.ATMI> { }
class DamDNA_object extends GenericObjectActor<AlzheimerModel.DamDNA> { }
class ATMA_object extends GenericObjectActor<AlzheimerModel.ATMA> { }
class IR_object extends GenericObjectActor<AlzheimerModel.IR> { }
class ROS_object extends GenericObjectActor<AlzheimerModel.ROS> { }
class BasalROS_object extends GenericObjectActor<AlzheimerModel.BasalROS> { }
class Proteasome_object_SP0 extends GenericObjectActor<AlzheimerModel.Proteasome> { }
class Proteasome_object_SP1 extends GenericObjectActor<AlzheimerModel.Proteasome> { }
class Proteasome_object_SP2 extends GenericObjectActor<AlzheimerModel.Proteasome> { }
class Tau_object_SP0 extends GenericObjectActor<AlzheimerModel.Tau> { }
class Tau_object_SP1 extends GenericObjectActor<AlzheimerModel.Tau> { }
class AggTau_object_SP0 extends GenericObjectActor<AlzheimerModel.AggTau> { }
class AggTau_object_SP1 extends GenericObjectActor<AlzheimerModel.AggTau> { }
class AggAbeta_object_SP0 extends GenericObjectActor<AlzheimerModel.AggAbeta> { }
class AggAbeta_object_SP1 extends GenericObjectActor<AlzheimerModel.AggAbeta> { }
class Mdm2_object_SP0 extends GenericObjectActor<AlzheimerModel.Mdm2> { }
class Mdm2_object_SP1 extends GenericObjectActor<AlzheimerModel.Mdm2> { }
class Mdm2_object_SP2 extends GenericObjectActor<AlzheimerModel.Mdm2> { }
class P53_object_SP0 extends GenericObjectActor<AlzheimerModel.P53> { }
class P53_object_SP1 extends GenericObjectActor<AlzheimerModel.P53> { }
class P53_object_SP2 extends GenericObjectActor<AlzheimerModel.P53> { }
class GSK3b_object_SP0 extends GenericObjectActor<AlzheimerModel.GSK3b> { }
class GSK3b_object_SP1 extends GenericObjectActor<AlzheimerModel.GSK3b> { }
class P_s_object_SP0 extends GenericObjectActor<AlzheimerModel.P_s> { }
class P_s_object_SP1 extends GenericObjectActor<AlzheimerModel.P_s> { }
class U_s_object_SP0 extends GenericObjectActor<AlzheimerModel.U_s> { }
class U_s_object_SP1 extends GenericObjectActor<AlzheimerModel.U_s> { }
class U_s_object_SP2 extends GenericObjectActor<AlzheimerModel.U_s> { }
class Abeta_object_SP0 extends GenericObjectActor<AlzheimerModel.Abeta> { }
class Abeta_object_SP1 extends GenericObjectActor<AlzheimerModel.Abeta> { }
class UNB_s_object_SP0 extends GenericObjectActor<AlzheimerModel.UNB_s> { }
class UNB_s_object_SP1 extends GenericObjectActor<AlzheimerModel.UNB_s> { }
class UNB_s_object_SP2 extends GenericObjectActor<AlzheimerModel.UNB_s> { }
class UB2_s_object_SP0 extends GenericObjectActor<AlzheimerModel.UB2_s> { }
class UB2_s_object_SP1 extends GenericObjectActor<AlzheimerModel.UB2_s> { }
class UB1_s_object_SP0 extends GenericObjectActor<AlzheimerModel.UB1_s> { }
class UB1_s_object_SP1 extends GenericObjectActor<AlzheimerModel.UB1_s> { }
class UB3_s_object_SP0 extends GenericObjectActor<AlzheimerModel.UB3_s> { }
class UB3_s_object_SP1 extends GenericObjectActor<AlzheimerModel.UB3_s> { }
class P53DUB_object_SP0 extends GenericObjectActor<AlzheimerModel.P53DUB> { }
class P53DUB_object_SP1 extends GenericObjectActor<AlzheimerModel.P53DUB> { }
class Mdm2DUB_object_SP0 extends GenericObjectActor<AlzheimerModel.Mdm2DUB> { }
class Mdm2DUB_object_SP1 extends GenericObjectActor<AlzheimerModel.Mdm2DUB> { }

class Proteasome_Proteasome_x_Tau_phos_0_reference extends GenericReferenceActor<AlzheimerModel.Proteasome, AlzheimerModel.Tau> { }
class Proteasome_Proteasome_x_AggTau_y_0_reference extends GenericReferenceActor<AlzheimerModel.Proteasome, AlzheimerModel.AggTau> { }
class Proteasome_Proteasome_x_AggAbeta_y_0_reference extends GenericReferenceActor<AlzheimerModel.Proteasome, AlzheimerModel.AggAbeta> { }
class Proteasome_Proteasome_x_Mdm2_ubi_0_reference extends GenericReferenceActor<AlzheimerModel.Proteasome, AlzheimerModel.Mdm2> { }
class MT_MT_l_Tau_phos_0_reference extends GenericReferenceActor<AlzheimerModel.MT, AlzheimerModel.Tau> { }
class P53_P53_b_Mdm2_z_0_reference extends GenericReferenceActor<AlzheimerModel.P53, AlzheimerModel.Mdm2> { }
class P53_P53_b_GSK3b_x_0_reference extends GenericReferenceActor<AlzheimerModel.P53, AlzheimerModel.GSK3b> { }
class P53_P53_b_Proteasome_x_0_reference extends GenericReferenceActor<AlzheimerModel.P53, AlzheimerModel.Proteasome> { }
class Mdm2_Mdm2_z_u_0_reference extends GenericReferenceActor<AlzheimerModel.Mdm2, AlzheimerModel.U_s> { }
class P53_P53_b_ub4_0_reference extends GenericReferenceActor<AlzheimerModel.P53, AlzheimerModel.UB4_s> { }
class Tau_Tau_phos_u_0_reference extends GenericReferenceActor<AlzheimerModel.Tau, AlzheimerModel.U_s> { }
class Tau_Tau_phos_p1_0_reference extends GenericReferenceActor<AlzheimerModel.Tau, AlzheimerModel.P1_s> { }
class Tau_Tau_phos_p2_0_reference extends GenericReferenceActor<AlzheimerModel.Tau, AlzheimerModel.P2_s> { }
class P53_P53_b_u_0_reference extends GenericReferenceActor<AlzheimerModel.P53, AlzheimerModel.U_s> { }
class E1_E1_x_unb_0_reference extends GenericReferenceActor<AlzheimerModel.E1, AlzheimerModel.UNB_s> { }
class E2_E2_x_unb_0_reference extends GenericReferenceActor<AlzheimerModel.E2, AlzheimerModel.UNB_s> { }
class E2_E2_x_ubi_0_reference extends GenericReferenceActor<AlzheimerModel.E2, AlzheimerModel.UBI_s> { }
class P53_P53_b_ub1_0_reference extends GenericReferenceActor<AlzheimerModel.P53, AlzheimerModel.UB1_s> { }
class P53_P53_b_ub2_0_reference extends GenericReferenceActor<AlzheimerModel.P53, AlzheimerModel.UB2_s> { }
class P53_P53_b_ub3_0_reference extends GenericReferenceActor<AlzheimerModel.P53, AlzheimerModel.UB3_s> { }
class Mdm2_Mdm2_z_p_0_reference extends GenericReferenceActor<AlzheimerModel.Mdm2, AlzheimerModel.P_s> { }
class Mdm2_Mdm2_ubi_unb_0_reference extends GenericReferenceActor<AlzheimerModel.Mdm2, AlzheimerModel.UNB_s> { }
class Mdm2_Mdm2_ubi_ub1_0_reference extends GenericReferenceActor<AlzheimerModel.Mdm2, AlzheimerModel.UB1_s> { }
class Mdm2_Mdm2_ubi_ub2_0_reference extends GenericReferenceActor<AlzheimerModel.Mdm2, AlzheimerModel.UB2_s> { }
class Mdm2_Mdm2_ubi_ub3_0_reference extends GenericReferenceActor<AlzheimerModel.Mdm2, AlzheimerModel.UB3_s> { }
class Mdm2_Mdm2_ubi_ub4_0_reference extends GenericReferenceActor<AlzheimerModel.Mdm2, AlzheimerModel.UB4_s> { }
class P53_P53_b_p_0_reference extends GenericReferenceActor<AlzheimerModel.P53, AlzheimerModel.P_s> { }

