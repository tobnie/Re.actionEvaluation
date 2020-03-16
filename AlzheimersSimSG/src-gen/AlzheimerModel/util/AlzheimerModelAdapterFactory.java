/**
 */
package AlzheimerModel.util;

import AlzheimerModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import reactionContainer.Agent;
import reactionContainer.State;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see AlzheimerModel.AlzheimerModelPackage
 * @generated
 */
public class AlzheimerModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AlzheimerModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlzheimerModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AlzheimerModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlzheimerModelSwitch<Adapter> modelSwitch = new AlzheimerModelSwitch<Adapter>() {
		@Override
		public Adapter caseP53(P53 object) {
			return createP53Adapter();
		}

		@Override
		public Adapter caseMdm2mRNA(Mdm2mRNA object) {
			return createMdm2mRNAAdapter();
		}

		@Override
		public Adapter caseProteasome(Proteasome object) {
			return createProteasomeAdapter();
		}

		@Override
		public Adapter caseP53DUB(P53DUB object) {
			return createP53DUBAdapter();
		}

		@Override
		public Adapter caseAMP(AMP object) {
			return createAMPAdapter();
		}

		@Override
		public Adapter caseMT(MT object) {
			return createMTAdapter();
		}

		@Override
		public Adapter caseTau(Tau object) {
			return createTauAdapter();
		}

		@Override
		public Adapter caseMdm2(Mdm2 object) {
			return createMdm2Adapter();
		}

		@Override
		public Adapter caseUb(Ub object) {
			return createUbAdapter();
		}

		@Override
		public Adapter caseE2(E2 object) {
			return createE2Adapter();
		}

		@Override
		public Adapter caseBasalROS(BasalROS object) {
			return createBasalROSAdapter();
		}

		@Override
		public Adapter caseMdm2DUB(Mdm2DUB object) {
			return createMdm2DUBAdapter();
		}

		@Override
		public Adapter caseP53mRNA(P53mRNA object) {
			return createP53mRNAAdapter();
		}

		@Override
		public Adapter caseATMI(ATMI object) {
			return createATMIAdapter();
		}

		@Override
		public Adapter caseATP(ATP object) {
			return createATPAdapter();
		}

		@Override
		public Adapter caseE1(E1 object) {
			return createE1Adapter();
		}

		@Override
		public Adapter caseGSK3b(GSK3b object) {
			return createGSK3bAdapter();
		}

		@Override
		public Adapter caseADP(ADP object) {
			return createADPAdapter();
		}

		@Override
		public Adapter casePPT(PPT object) {
			return createPPTAdapter();
		}

		@Override
		public Adapter caseAggTau(AggTau object) {
			return createAggTauAdapter();
		}

		@Override
		public Adapter caseNFT(NFT object) {
			return createNFTAdapter();
		}

		@Override
		public Adapter caseAbeta(Abeta object) {
			return createAbetaAdapter();
		}

		@Override
		public Adapter caseAggAbeta(AggAbeta object) {
			return createAggAbetaAdapter();
		}

		@Override
		public Adapter caseAbetaPlaque(AbetaPlaque object) {
			return createAbetaPlaqueAdapter();
		}

		@Override
		public Adapter caseDamDNA(DamDNA object) {
			return createDamDNAAdapter();
		}

		@Override
		public Adapter caseATMA(ATMA object) {
			return createATMAAdapter();
		}

		@Override
		public Adapter caseIR(IR object) {
			return createIRAdapter();
		}

		@Override
		public Adapter caseROS(ROS object) {
			return createROSAdapter();
		}

		@Override
		public Adapter caseU_s(U_s object) {
			return createU_sAdapter();
		}

		@Override
		public Adapter caseUB4_s(UB4_s object) {
			return createUB4_sAdapter();
		}

		@Override
		public Adapter caseUB2_s(UB2_s object) {
			return createUB2_sAdapter();
		}

		@Override
		public Adapter caseUB1_s(UB1_s object) {
			return createUB1_sAdapter();
		}

		@Override
		public Adapter caseUB3_s(UB3_s object) {
			return createUB3_sAdapter();
		}

		@Override
		public Adapter caseP_s(P_s object) {
			return createP_sAdapter();
		}

		@Override
		public Adapter caseP1_s(P1_s object) {
			return createP1_sAdapter();
		}

		@Override
		public Adapter caseP2_s(P2_s object) {
			return createP2_sAdapter();
		}

		@Override
		public Adapter caseUNB_s(UNB_s object) {
			return createUNB_sAdapter();
		}

		@Override
		public Adapter caseUBI_s(UBI_s object) {
			return createUBI_sAdapter();
		}

		@Override
		public Adapter caseAgent(Agent object) {
			return createAgentAdapter();
		}

		@Override
		public Adapter caseState(State object) {
			return createStateAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.P53 <em>P53</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.P53
	 * @generated
	 */
	public Adapter createP53Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.Mdm2mRNA <em>Mdm2m RNA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.Mdm2mRNA
	 * @generated
	 */
	public Adapter createMdm2mRNAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.Proteasome <em>Proteasome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.Proteasome
	 * @generated
	 */
	public Adapter createProteasomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.P53DUB <em>P53DUB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.P53DUB
	 * @generated
	 */
	public Adapter createP53DUBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.AMP <em>AMP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.AMP
	 * @generated
	 */
	public Adapter createAMPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.MT <em>MT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.MT
	 * @generated
	 */
	public Adapter createMTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.Tau <em>Tau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.Tau
	 * @generated
	 */
	public Adapter createTauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.Mdm2 <em>Mdm2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.Mdm2
	 * @generated
	 */
	public Adapter createMdm2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.Ub <em>Ub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.Ub
	 * @generated
	 */
	public Adapter createUbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.E2 <em>E2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.E2
	 * @generated
	 */
	public Adapter createE2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.BasalROS <em>Basal ROS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.BasalROS
	 * @generated
	 */
	public Adapter createBasalROSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.Mdm2DUB <em>Mdm2 DUB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.Mdm2DUB
	 * @generated
	 */
	public Adapter createMdm2DUBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.P53mRNA <em>P5 3m RNA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.P53mRNA
	 * @generated
	 */
	public Adapter createP53mRNAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.ATMI <em>ATMI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.ATMI
	 * @generated
	 */
	public Adapter createATMIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.ATP <em>ATP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.ATP
	 * @generated
	 */
	public Adapter createATPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.E1 <em>E1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.E1
	 * @generated
	 */
	public Adapter createE1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.GSK3b <em>GSK 3b</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.GSK3b
	 * @generated
	 */
	public Adapter createGSK3bAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.ADP <em>ADP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.ADP
	 * @generated
	 */
	public Adapter createADPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.PPT <em>PPT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.PPT
	 * @generated
	 */
	public Adapter createPPTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.AggTau <em>Agg Tau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.AggTau
	 * @generated
	 */
	public Adapter createAggTauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.NFT <em>NFT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.NFT
	 * @generated
	 */
	public Adapter createNFTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.Abeta <em>Abeta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.Abeta
	 * @generated
	 */
	public Adapter createAbetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.AggAbeta <em>Agg Abeta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.AggAbeta
	 * @generated
	 */
	public Adapter createAggAbetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.AbetaPlaque <em>Abeta Plaque</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.AbetaPlaque
	 * @generated
	 */
	public Adapter createAbetaPlaqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.DamDNA <em>Dam DNA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.DamDNA
	 * @generated
	 */
	public Adapter createDamDNAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.ATMA <em>ATMA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.ATMA
	 * @generated
	 */
	public Adapter createATMAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.IR <em>IR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.IR
	 * @generated
	 */
	public Adapter createIRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.ROS <em>ROS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.ROS
	 * @generated
	 */
	public Adapter createROSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.U_s <em>Us</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.U_s
	 * @generated
	 */
	public Adapter createU_sAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.UB4_s <em>UB4 s</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.UB4_s
	 * @generated
	 */
	public Adapter createUB4_sAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.UB2_s <em>UB2 s</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.UB2_s
	 * @generated
	 */
	public Adapter createUB2_sAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.UB1_s <em>UB1 s</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.UB1_s
	 * @generated
	 */
	public Adapter createUB1_sAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.UB3_s <em>UB3 s</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.UB3_s
	 * @generated
	 */
	public Adapter createUB3_sAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.P_s <em>Ps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.P_s
	 * @generated
	 */
	public Adapter createP_sAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.P1_s <em>P1 s</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.P1_s
	 * @generated
	 */
	public Adapter createP1_sAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.P2_s <em>P2 s</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.P2_s
	 * @generated
	 */
	public Adapter createP2_sAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.UNB_s <em>UNB s</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.UNB_s
	 * @generated
	 */
	public Adapter createUNB_sAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AlzheimerModel.UBI_s <em>UBI s</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AlzheimerModel.UBI_s
	 * @generated
	 */
	public Adapter createUBI_sAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link reactionContainer.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see reactionContainer.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link reactionContainer.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see reactionContainer.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AlzheimerModelAdapterFactory
