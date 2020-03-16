package AlzheimersSimSG.api;

import AlzheimersSimSG.api.rules.AbetaAgg1Rule;
import AlzheimersSimSG.api.rules.AbetaAgg2Rule;
import AlzheimersSimSG.api.rules.AbetaDegradationRule;
import AlzheimersSimSG.api.rules.AbetaPlaque1Rule;
import AlzheimersSimSG.api.rules.AbetaPlaque2Rule;
import AlzheimersSimSG.api.rules.AbetaProductionRule;
import AlzheimersSimSG.api.rules.AbetaROSProductionRule;
import AlzheimersSimSG.api.rules.ATMActivationRule;
import AlzheimersSimSG.api.rules.ATMInactivationRule;
import AlzheimersSimSG.api.rules.BasalROSDamageRule;
import AlzheimersSimSG.api.rules.DNARepairRule;
import AlzheimersSimSG.api.rules.E1UbRule;
import AlzheimersSimSG.api.rules.E2UbRule;
import AlzheimersSimSG.api.rules.GSK3b_p53BwdRule;
import AlzheimersSimSG.api.rules.GSK3b_p53Rule;
import AlzheimersSimSG.api.rules.IRDamageRule;
import AlzheimersSimSG.api.rules.Mdm2DegradationRule;
import AlzheimersSimSG.api.rules.Mdm2DePhosphoRule;
import AlzheimersSimSG.api.rules.Mdm2deubiquinationRule;
import AlzheimersSimSG.api.rules.Mdm2GSK3Phospho1Rule;
import AlzheimersSimSG.api.rules.Mdm2GSK3Phospho2_3Rule;
import AlzheimersSimSG.api.rules.Mdm2mRNADegradationRule;
import AlzheimersSimSG.api.rules.Mdm2mRNASynthesisRule;
import AlzheimersSimSG.api.rules.Mdm2PhosphoRule;
import AlzheimersSimSG.api.rules.Mdm2polyDeubiquination1Rule;
import AlzheimersSimSG.api.rules.Mdm2polyDeubiquination2Rule;
import AlzheimersSimSG.api.rules.Mdm2polyDeubiquination3Rule;
import AlzheimersSimSG.api.rules.Mdm2PolyUbiquination1Rule;
import AlzheimersSimSG.api.rules.Mdm2PolyUbiquination2Rule;
import AlzheimersSimSG.api.rules.Mdm2PolyUbiquination3Rule;
import AlzheimersSimSG.api.rules.Mdm2ProteasomeBindRule;
import AlzheimersSimSG.api.rules.Mdm2SynthesisRule;
import AlzheimersSimSG.api.rules.Mdm2UbiquinationRule;
import AlzheimersSimSG.api.rules.MT_l_Tau_phosBoundSrcRule;
import AlzheimersSimSG.api.rules.MT_l_Tau_phosBoundTrgRule;
import AlzheimersSimSG.api.rules.Obs_obs_abetaPlaqueRule;
import AlzheimersSimSG.api.rules.Obs_obs_damDNARule;
import AlzheimersSimSG.api.rules.Obs_obs_mdm2DUBRule;
import AlzheimersSimSG.api.rules.Obs_obs_mdm2mRNARule;
import AlzheimersSimSG.api.rules.Obs_obs_mdm2Rule;
import AlzheimersSimSG.api.rules.Obs_obs_p53DUBRule;
import AlzheimersSimSG.api.rules.Obs_obs_p53gskRule;
import AlzheimersSimSG.api.rules.Obs_obs_p53mRNARule;
import AlzheimersSimSG.api.rules.Obs_obs_p53Rule;
import AlzheimersSimSG.api.rules.Obs_obs_tauTangleRule;
import AlzheimersSimSG.api.rules.P53_b_GSK3b_xBoundSrcRule;
import AlzheimersSimSG.api.rules.P53_b_GSK3b_xBoundTrgRule;
import AlzheimersSimSG.api.rules.P53_b_Mdm2_zBoundSrcRule;
import AlzheimersSimSG.api.rules.P53_b_Mdm2_zBoundTrgRule;
import AlzheimersSimSG.api.rules.P53_b_Proteasome_xBoundSrcRule;
import AlzheimersSimSG.api.rules.P53_b_Proteasome_xBoundTrgRule;
import AlzheimersSimSG.api.rules.P53_Mdm2BwdRule;
import AlzheimersSimSG.api.rules.P53_Mdm2Rule;
import AlzheimersSimSG.api.rules.P53DegradationRule;
import AlzheimersSimSG.api.rules.P53DePhosphoRule;
import AlzheimersSimSG.api.rules.P53DeUbiquitinationRule;
import AlzheimersSimSG.api.rules.P53mRNADegradationRule;
import AlzheimersSimSG.api.rules.P53mRNASynthesisRule;
import AlzheimersSimSG.api.rules.P53PhosphoRule;
import AlzheimersSimSG.api.rules.P53PolyDeUbiquitination2Rule;
import AlzheimersSimSG.api.rules.P53PolyDeUbiquitination3Rule;
import AlzheimersSimSG.api.rules.P53PolyDeUbiquitination4Rule;
import AlzheimersSimSG.api.rules.P53PolyUbiquitination1Rule;
import AlzheimersSimSG.api.rules.P53PolyUbiquitination2Rule;
import AlzheimersSimSG.api.rules.P53PolyUbiquitination3Rule;
import AlzheimersSimSG.api.rules.P53ProteasomeBindingRule;
import AlzheimersSimSG.api.rules.P53SynthesisRule;
import AlzheimersSimSG.api.rules.P53TranscriptionRule;
import AlzheimersSimSG.api.rules.P53UbiquitinationRule;
import AlzheimersSimSG.api.rules.Proteasome_TauRule;
import AlzheimersSimSG.api.rules.Proteasome_x_AggAbeta_yBoundSrcRule;
import AlzheimersSimSG.api.rules.Proteasome_x_AggAbeta_yBoundTrgRule;
import AlzheimersSimSG.api.rules.Proteasome_x_AggTau_yBoundSrcRule;
import AlzheimersSimSG.api.rules.Proteasome_x_AggTau_yBoundTrgRule;
import AlzheimersSimSG.api.rules.Proteasome_x_Mdm2_ubiBoundSrcRule;
import AlzheimersSimSG.api.rules.Proteasome_x_Mdm2_ubiBoundTrgRule;
import AlzheimersSimSG.api.rules.Proteasome_x_Tau_phosBoundSrcRule;
import AlzheimersSimSG.api.rules.Proteasome_x_Tau_phosBoundTrgRule;
import AlzheimersSimSG.api.rules.ProteasomeInhibitionAggAbetaRule;
import AlzheimersSimSG.api.rules.ProteasomeInhibitionAggTauRule;
import AlzheimersSimSG.api.rules.ROSDamageRule;
import AlzheimersSimSG.api.rules.TangleForm1Rule;
import AlzheimersSimSG.api.rules.TangleForm2Rule;
import AlzheimersSimSG.api.rules.TauAgg1Rule;
import AlzheimersSimSG.api.rules.TauAgg2Rule;
import AlzheimersSimSG.api.rules.TauDegradationRule;
import AlzheimersSimSG.api.rules.TauDephosphorylationRule;
import AlzheimersSimSG.api.rules.TauMTBwdRule;
import AlzheimersSimSG.api.rules.TauMTRule;
import AlzheimersSimSG.api.rules.TauP1Agg1Rule;
import AlzheimersSimSG.api.rules.TauP1Agg2Rule;
import AlzheimersSimSG.api.rules.TauP2Agg1Rule;
import AlzheimersSimSG.api.rules.TauP2Agg2Rule;
import AlzheimersSimSG.api.rules.TauPhosphorylation1_3Rule;
import AlzheimersSimSG.api.rules.TauPhosphorylation2_4Rule;
import AlzheimersSimSG.api.rules.TauPhosphorylation5Rule;
import AlzheimersSimSG.api.rules.TauPhosphorylation6Rule;
import AlzheimersSimSG.api.rules.TauSynthesisRule;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationAPI;

/**
 * The AlzheimersSimSGAPI with 99 rules.
 */
public class AlzheimersSimSGAPI extends GraphTransformationAPI {
	public static String patternPath = "AlzheimersSimSG/src-gen/AlzheimersSimSG/api/ibex-patterns.xmi";

	/**
	 * Creates a new AlzheimersSimSGAPI.
	 *
	 * @param engine
	 *            the engine to use for queries and transformations
	 * @param model
	 *            the resource set containing the model file
	 * @param workspacePath
	 *            the path to the workspace which is concatenated with the project
	 *            relative path to the patterns
	 */
	public AlzheimersSimSGAPI(final IContextPatternInterpreter engine, final ResourceSet model, final String workspacePath) {
		super(engine, model);
		URI uri = URI.createFileURI(workspacePath + patternPath);
		interpreter.loadPatternSet(uri);
	}

	/**
	 * Creates a new AlzheimersSimSGAPI.
	 *
	 * @param engine
	 *            the engine to use for queries and transformations
	 * @param model
	 *            the resource set containing the model file
	 * @param defaultResource
	 *            the default resource
	 * @param workspacePath
	 *            the path to the workspace which is concatenated with the project
	 *            relative path to the patterns
	 */
	public AlzheimersSimSGAPI(final IContextPatternInterpreter engine, final ResourceSet model, final Resource defaultResource,
			final String workspacePath) {
		super(engine, model, defaultResource);
		URI uri = URI.createFileURI(workspacePath + patternPath);
		interpreter.loadPatternSet(uri);
	}

	/**
	 * Creates a new instance of the rule <code>Proteasome_x_Tau_phosBoundSrc()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Proteasome_x_Tau_phosBoundSrcRule Proteasome_x_Tau_phosBoundSrc() {
		return new Proteasome_x_Tau_phosBoundSrcRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Proteasome_x_Tau_phosBoundTrg()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Proteasome_x_Tau_phosBoundTrgRule Proteasome_x_Tau_phosBoundTrg() {
		return new Proteasome_x_Tau_phosBoundTrgRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Proteasome_x_AggTau_yBoundSrc()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Proteasome_x_AggTau_yBoundSrcRule Proteasome_x_AggTau_yBoundSrc() {
		return new Proteasome_x_AggTau_yBoundSrcRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Proteasome_x_AggTau_yBoundTrg()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Proteasome_x_AggTau_yBoundTrgRule Proteasome_x_AggTau_yBoundTrg() {
		return new Proteasome_x_AggTau_yBoundTrgRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Proteasome_x_AggAbeta_yBoundSrc()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Proteasome_x_AggAbeta_yBoundSrcRule Proteasome_x_AggAbeta_yBoundSrc() {
		return new Proteasome_x_AggAbeta_yBoundSrcRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Proteasome_x_AggAbeta_yBoundTrg()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Proteasome_x_AggAbeta_yBoundTrgRule Proteasome_x_AggAbeta_yBoundTrg() {
		return new Proteasome_x_AggAbeta_yBoundTrgRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Proteasome_x_Mdm2_ubiBoundSrc()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Proteasome_x_Mdm2_ubiBoundSrcRule Proteasome_x_Mdm2_ubiBoundSrc() {
		return new Proteasome_x_Mdm2_ubiBoundSrcRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Proteasome_x_Mdm2_ubiBoundTrg()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Proteasome_x_Mdm2_ubiBoundTrgRule Proteasome_x_Mdm2_ubiBoundTrg() {
		return new Proteasome_x_Mdm2_ubiBoundTrgRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>MT_l_Tau_phosBoundSrc()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public MT_l_Tau_phosBoundSrcRule MT_l_Tau_phosBoundSrc() {
		return new MT_l_Tau_phosBoundSrcRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>MT_l_Tau_phosBoundTrg()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public MT_l_Tau_phosBoundTrgRule MT_l_Tau_phosBoundTrg() {
		return new MT_l_Tau_phosBoundTrgRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53_b_Mdm2_zBoundSrc()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53_b_Mdm2_zBoundSrcRule P53_b_Mdm2_zBoundSrc() {
		return new P53_b_Mdm2_zBoundSrcRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53_b_Mdm2_zBoundTrg()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53_b_Mdm2_zBoundTrgRule P53_b_Mdm2_zBoundTrg() {
		return new P53_b_Mdm2_zBoundTrgRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53_b_GSK3b_xBoundSrc()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53_b_GSK3b_xBoundSrcRule P53_b_GSK3b_xBoundSrc() {
		return new P53_b_GSK3b_xBoundSrcRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53_b_GSK3b_xBoundTrg()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53_b_GSK3b_xBoundTrgRule P53_b_GSK3b_xBoundTrg() {
		return new P53_b_GSK3b_xBoundTrgRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53_b_Proteasome_xBoundSrc()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53_b_Proteasome_xBoundSrcRule P53_b_Proteasome_xBoundSrc() {
		return new P53_b_Proteasome_xBoundSrcRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53_b_Proteasome_xBoundTrg()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53_b_Proteasome_xBoundTrgRule P53_b_Proteasome_xBoundTrg() {
		return new P53_b_Proteasome_xBoundTrgRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>GSK3b_p53()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public GSK3b_p53Rule GSK3b_p53() {
		return new GSK3b_p53Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>GSK3b_p53Bwd()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public GSK3b_p53BwdRule GSK3b_p53Bwd() {
		return new GSK3b_p53BwdRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Mdm2mRNASynthesis()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Mdm2mRNASynthesisRule Mdm2mRNASynthesis() {
		return new Mdm2mRNASynthesisRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Mdm2GSK3Phospho1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Mdm2GSK3Phospho1Rule Mdm2GSK3Phospho1() {
		return new Mdm2GSK3Phospho1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Mdm2GSK3Phospho2_3()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Mdm2GSK3Phospho2_3Rule Mdm2GSK3Phospho2_3() {
		return new Mdm2GSK3Phospho2_3Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>TauSynthesis()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public TauSynthesisRule TauSynthesis() {
		return new TauSynthesisRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Proteasome_Tau()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Proteasome_TauRule Proteasome_Tau() {
		return new Proteasome_TauRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>TauDegradation()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public TauDegradationRule TauDegradation() {
		return new TauDegradationRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>TauMT()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public TauMTRule TauMT() {
		return new TauMTRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>TauMTBwd()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public TauMTBwdRule TauMTBwd() {
		return new TauMTBwdRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>TauPhosphorylation1_3()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public TauPhosphorylation1_3Rule TauPhosphorylation1_3() {
		return new TauPhosphorylation1_3Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>TauPhosphorylation2_4()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public TauPhosphorylation2_4Rule TauPhosphorylation2_4() {
		return new TauPhosphorylation2_4Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>TauPhosphorylation5()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public TauPhosphorylation5Rule TauPhosphorylation5() {
		return new TauPhosphorylation5Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>TauPhosphorylation6()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public TauPhosphorylation6Rule TauPhosphorylation6() {
		return new TauPhosphorylation6Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>TauDephosphorylation()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public TauDephosphorylationRule TauDephosphorylation() {
		return new TauDephosphorylationRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>TauAgg1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public TauAgg1Rule TauAgg1() {
		return new TauAgg1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>TauAgg2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public TauAgg2Rule TauAgg2() {
		return new TauAgg2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>TauP1Agg1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public TauP1Agg1Rule TauP1Agg1() {
		return new TauP1Agg1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>TauP1Agg2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public TauP1Agg2Rule TauP1Agg2() {
		return new TauP1Agg2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>TauP2Agg1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public TauP2Agg1Rule TauP2Agg1() {
		return new TauP2Agg1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>TauP2Agg2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public TauP2Agg2Rule TauP2Agg2() {
		return new TauP2Agg2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>tangleForm1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public TangleForm1Rule tangleForm1() {
		return new TangleForm1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>tangleForm2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public TangleForm2Rule tangleForm2() {
		return new TangleForm2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>ProteasomeInhibitionAggTau()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ProteasomeInhibitionAggTauRule ProteasomeInhibitionAggTau() {
		return new ProteasomeInhibitionAggTauRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>AbetaProduction()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public AbetaProductionRule AbetaProduction() {
		return new AbetaProductionRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>AbetaDegradation()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public AbetaDegradationRule AbetaDegradation() {
		return new AbetaDegradationRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>AbetaAgg1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public AbetaAgg1Rule AbetaAgg1() {
		return new AbetaAgg1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>AbetaAgg2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public AbetaAgg2Rule AbetaAgg2() {
		return new AbetaAgg2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>AbetaPlaque1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public AbetaPlaque1Rule AbetaPlaque1() {
		return new AbetaPlaque1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>AbetaPlaque2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public AbetaPlaque2Rule AbetaPlaque2() {
		return new AbetaPlaque2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>ProteasomeInhibitionAggAbeta()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ProteasomeInhibitionAggAbetaRule ProteasomeInhibitionAggAbeta() {
		return new ProteasomeInhibitionAggAbetaRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53Transcription()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53TranscriptionRule P53Transcription() {
		return new P53TranscriptionRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>AbetaROSProduction()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public AbetaROSProductionRule AbetaROSProduction() {
		return new AbetaROSProductionRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53Synthesis()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53SynthesisRule P53Synthesis() {
		return new P53SynthesisRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53_Mdm2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53_Mdm2Rule P53_Mdm2() {
		return new P53_Mdm2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53_Mdm2Bwd()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53_Mdm2BwdRule P53_Mdm2Bwd() {
		return new P53_Mdm2BwdRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>E1Ub()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public E1UbRule E1Ub() {
		return new E1UbRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>E2Ub()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public E2UbRule E2Ub() {
		return new E2UbRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53Ubiquitination()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53UbiquitinationRule P53Ubiquitination() {
		return new P53UbiquitinationRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53PolyUbiquitination1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53PolyUbiquitination1Rule P53PolyUbiquitination1() {
		return new P53PolyUbiquitination1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53PolyUbiquitination2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53PolyUbiquitination2Rule P53PolyUbiquitination2() {
		return new P53PolyUbiquitination2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53PolyUbiquitination3()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53PolyUbiquitination3Rule P53PolyUbiquitination3() {
		return new P53PolyUbiquitination3Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53DeUbiquitination()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53DeUbiquitinationRule P53DeUbiquitination() {
		return new P53DeUbiquitinationRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53PolyDeUbiquitination2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53PolyDeUbiquitination2Rule P53PolyDeUbiquitination2() {
		return new P53PolyDeUbiquitination2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53PolyDeUbiquitination3()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53PolyDeUbiquitination3Rule P53PolyDeUbiquitination3() {
		return new P53PolyDeUbiquitination3Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53PolyDeUbiquitination4()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53PolyDeUbiquitination4Rule P53PolyDeUbiquitination4() {
		return new P53PolyDeUbiquitination4Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53ProteasomeBinding()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53ProteasomeBindingRule P53ProteasomeBinding() {
		return new P53ProteasomeBindingRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53Degradation()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53DegradationRule P53Degradation() {
		return new P53DegradationRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>mdm2mRNASynthesis()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Mdm2mRNASynthesisRule mdm2mRNASynthesis() {
		return new Mdm2mRNASynthesisRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>mdm2mRNADegradation()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Mdm2mRNADegradationRule mdm2mRNADegradation() {
		return new Mdm2mRNADegradationRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Mdm2Synthesis()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Mdm2SynthesisRule Mdm2Synthesis() {
		return new Mdm2SynthesisRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>mdm2Ubiquination()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Mdm2UbiquinationRule mdm2Ubiquination() {
		return new Mdm2UbiquinationRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>mdm2PolyUbiquination1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Mdm2PolyUbiquination1Rule mdm2PolyUbiquination1() {
		return new Mdm2PolyUbiquination1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>mdm2PolyUbiquination2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Mdm2PolyUbiquination2Rule mdm2PolyUbiquination2() {
		return new Mdm2PolyUbiquination2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>mdm2PolyUbiquination3()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Mdm2PolyUbiquination3Rule mdm2PolyUbiquination3() {
		return new Mdm2PolyUbiquination3Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>mdm2deubiquination()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Mdm2deubiquinationRule mdm2deubiquination() {
		return new Mdm2deubiquinationRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>mdm2polyDeubiquination1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Mdm2polyDeubiquination1Rule mdm2polyDeubiquination1() {
		return new Mdm2polyDeubiquination1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>mdm2polyDeubiquination2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Mdm2polyDeubiquination2Rule mdm2polyDeubiquination2() {
		return new Mdm2polyDeubiquination2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>mdm2polyDeubiquination3()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Mdm2polyDeubiquination3Rule mdm2polyDeubiquination3() {
		return new Mdm2polyDeubiquination3Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Mdm2ProteasomeBind()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Mdm2ProteasomeBindRule Mdm2ProteasomeBind() {
		return new Mdm2ProteasomeBindRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Mdm2Degradation()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Mdm2DegradationRule Mdm2Degradation() {
		return new Mdm2DegradationRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>ATMActivation()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ATMActivationRule ATMActivation() {
		return new ATMActivationRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>ATMInactivation()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ATMInactivationRule ATMInactivation() {
		return new ATMInactivationRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53Phospho()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53PhosphoRule P53Phospho() {
		return new P53PhosphoRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>P53DePhospho()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53DePhosphoRule P53DePhospho() {
		return new P53DePhosphoRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Mdm2Phospho()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Mdm2PhosphoRule Mdm2Phospho() {
		return new Mdm2PhosphoRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Mdm2DePhospho()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Mdm2DePhosphoRule Mdm2DePhospho() {
		return new Mdm2DePhosphoRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>p53mRNASynthesis()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53mRNASynthesisRule p53mRNASynthesis() {
		return new P53mRNASynthesisRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>p53mRNADegradation()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public P53mRNADegradationRule p53mRNADegradation() {
		return new P53mRNADegradationRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>IRDamage()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public IRDamageRule IRDamage() {
		return new IRDamageRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>DNARepair()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public DNARepairRule DNARepair() {
		return new DNARepairRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>ROSDamage()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ROSDamageRule ROSDamage() {
		return new ROSDamageRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>BasalROSDamage()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public BasalROSDamageRule BasalROSDamage() {
		return new BasalROSDamageRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>obs_obs_mdm2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Obs_obs_mdm2Rule obs_obs_mdm2() {
		return new Obs_obs_mdm2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>obs_obs_mdm2mRNA()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Obs_obs_mdm2mRNARule obs_obs_mdm2mRNA() {
		return new Obs_obs_mdm2mRNARule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>obs_obs_mdm2DUB()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Obs_obs_mdm2DUBRule obs_obs_mdm2DUB() {
		return new Obs_obs_mdm2DUBRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>obs_obs_p53()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Obs_obs_p53Rule obs_obs_p53() {
		return new Obs_obs_p53Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>obs_obs_p53mRNA()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Obs_obs_p53mRNARule obs_obs_p53mRNA() {
		return new Obs_obs_p53mRNARule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>obs_obs_p53DUB()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Obs_obs_p53DUBRule obs_obs_p53DUB() {
		return new Obs_obs_p53DUBRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>obs_obs_p53gsk()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Obs_obs_p53gskRule obs_obs_p53gsk() {
		return new Obs_obs_p53gskRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>obs_obs_damDNA()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Obs_obs_damDNARule obs_obs_damDNA() {
		return new Obs_obs_damDNARule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>obs_obs_tauTangle()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Obs_obs_tauTangleRule obs_obs_tauTangle() {
		return new Obs_obs_tauTangleRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>obs_obs_abetaPlaque()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Obs_obs_abetaPlaqueRule obs_obs_abetaPlaque() {
		return new Obs_obs_abetaPlaqueRule(this, interpreter);
	}
}
