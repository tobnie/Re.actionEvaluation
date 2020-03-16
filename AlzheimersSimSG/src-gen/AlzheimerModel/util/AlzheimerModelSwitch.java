/**
 */
package AlzheimerModel.util;

import AlzheimerModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import reactionContainer.Agent;
import reactionContainer.State;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see AlzheimerModel.AlzheimerModelPackage
 * @generated
 */
public class AlzheimerModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AlzheimerModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlzheimerModelSwitch() {
		if (modelPackage == null) {
			modelPackage = AlzheimerModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case AlzheimerModelPackage.P53: {
			P53 p53 = (P53) theEObject;
			T result = caseP53(p53);
			if (result == null)
				result = caseAgent(p53);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.MDM2M_RNA: {
			Mdm2mRNA mdm2mRNA = (Mdm2mRNA) theEObject;
			T result = caseMdm2mRNA(mdm2mRNA);
			if (result == null)
				result = caseAgent(mdm2mRNA);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.PROTEASOME: {
			Proteasome proteasome = (Proteasome) theEObject;
			T result = caseProteasome(proteasome);
			if (result == null)
				result = caseAgent(proteasome);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.P53DUB: {
			P53DUB p53DUB = (P53DUB) theEObject;
			T result = caseP53DUB(p53DUB);
			if (result == null)
				result = caseAgent(p53DUB);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.AMP: {
			AMP amp = (AMP) theEObject;
			T result = caseAMP(amp);
			if (result == null)
				result = caseAgent(amp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.MT: {
			MT mt = (MT) theEObject;
			T result = caseMT(mt);
			if (result == null)
				result = caseAgent(mt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.TAU: {
			Tau tau = (Tau) theEObject;
			T result = caseTau(tau);
			if (result == null)
				result = caseAgent(tau);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.MDM2: {
			Mdm2 mdm2 = (Mdm2) theEObject;
			T result = caseMdm2(mdm2);
			if (result == null)
				result = caseAgent(mdm2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.UB: {
			Ub ub = (Ub) theEObject;
			T result = caseUb(ub);
			if (result == null)
				result = caseAgent(ub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.E2: {
			E2 e2 = (E2) theEObject;
			T result = caseE2(e2);
			if (result == null)
				result = caseAgent(e2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.BASAL_ROS: {
			BasalROS basalROS = (BasalROS) theEObject;
			T result = caseBasalROS(basalROS);
			if (result == null)
				result = caseAgent(basalROS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.MDM2_DUB: {
			Mdm2DUB mdm2DUB = (Mdm2DUB) theEObject;
			T result = caseMdm2DUB(mdm2DUB);
			if (result == null)
				result = caseAgent(mdm2DUB);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.P5_3M_RNA: {
			P53mRNA p53mRNA = (P53mRNA) theEObject;
			T result = caseP53mRNA(p53mRNA);
			if (result == null)
				result = caseAgent(p53mRNA);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.ATMI: {
			ATMI atmi = (ATMI) theEObject;
			T result = caseATMI(atmi);
			if (result == null)
				result = caseAgent(atmi);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.ATP: {
			ATP atp = (ATP) theEObject;
			T result = caseATP(atp);
			if (result == null)
				result = caseAgent(atp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.E1: {
			E1 e1 = (E1) theEObject;
			T result = caseE1(e1);
			if (result == null)
				result = caseAgent(e1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.GSK_3B: {
			GSK3b gsk3b = (GSK3b) theEObject;
			T result = caseGSK3b(gsk3b);
			if (result == null)
				result = caseAgent(gsk3b);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.ADP: {
			ADP adp = (ADP) theEObject;
			T result = caseADP(adp);
			if (result == null)
				result = caseAgent(adp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.PPT: {
			PPT ppt = (PPT) theEObject;
			T result = casePPT(ppt);
			if (result == null)
				result = caseAgent(ppt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.AGG_TAU: {
			AggTau aggTau = (AggTau) theEObject;
			T result = caseAggTau(aggTau);
			if (result == null)
				result = caseAgent(aggTau);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.NFT: {
			NFT nft = (NFT) theEObject;
			T result = caseNFT(nft);
			if (result == null)
				result = caseAgent(nft);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.ABETA: {
			Abeta abeta = (Abeta) theEObject;
			T result = caseAbeta(abeta);
			if (result == null)
				result = caseAgent(abeta);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.AGG_ABETA: {
			AggAbeta aggAbeta = (AggAbeta) theEObject;
			T result = caseAggAbeta(aggAbeta);
			if (result == null)
				result = caseAgent(aggAbeta);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.ABETA_PLAQUE: {
			AbetaPlaque abetaPlaque = (AbetaPlaque) theEObject;
			T result = caseAbetaPlaque(abetaPlaque);
			if (result == null)
				result = caseAgent(abetaPlaque);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.DAM_DNA: {
			DamDNA damDNA = (DamDNA) theEObject;
			T result = caseDamDNA(damDNA);
			if (result == null)
				result = caseAgent(damDNA);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.ATMA: {
			ATMA atma = (ATMA) theEObject;
			T result = caseATMA(atma);
			if (result == null)
				result = caseAgent(atma);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.IR: {
			IR ir = (IR) theEObject;
			T result = caseIR(ir);
			if (result == null)
				result = caseAgent(ir);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.ROS: {
			ROS ros = (ROS) theEObject;
			T result = caseROS(ros);
			if (result == null)
				result = caseAgent(ros);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.US: {
			U_s u_s = (U_s) theEObject;
			T result = caseU_s(u_s);
			if (result == null)
				result = caseState(u_s);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.UB4_S: {
			UB4_s ub4_s = (UB4_s) theEObject;
			T result = caseUB4_s(ub4_s);
			if (result == null)
				result = caseState(ub4_s);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.UB2_S: {
			UB2_s ub2_s = (UB2_s) theEObject;
			T result = caseUB2_s(ub2_s);
			if (result == null)
				result = caseState(ub2_s);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.UB1_S: {
			UB1_s ub1_s = (UB1_s) theEObject;
			T result = caseUB1_s(ub1_s);
			if (result == null)
				result = caseState(ub1_s);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.UB3_S: {
			UB3_s ub3_s = (UB3_s) theEObject;
			T result = caseUB3_s(ub3_s);
			if (result == null)
				result = caseState(ub3_s);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.PS: {
			P_s p_s = (P_s) theEObject;
			T result = caseP_s(p_s);
			if (result == null)
				result = caseState(p_s);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.P1_S: {
			P1_s p1_s = (P1_s) theEObject;
			T result = caseP1_s(p1_s);
			if (result == null)
				result = caseState(p1_s);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.P2_S: {
			P2_s p2_s = (P2_s) theEObject;
			T result = caseP2_s(p2_s);
			if (result == null)
				result = caseState(p2_s);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.UNB_S: {
			UNB_s unB_s = (UNB_s) theEObject;
			T result = caseUNB_s(unB_s);
			if (result == null)
				result = caseState(unB_s);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AlzheimerModelPackage.UBI_S: {
			UBI_s ubI_s = (UBI_s) theEObject;
			T result = caseUBI_s(ubI_s);
			if (result == null)
				result = caseState(ubI_s);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>P53</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>P53</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseP53(P53 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mdm2m RNA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mdm2m RNA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMdm2mRNA(Mdm2mRNA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proteasome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proteasome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProteasome(Proteasome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>P53DUB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>P53DUB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseP53DUB(P53DUB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AMP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AMP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAMP(AMP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMT(MT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTau(Tau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mdm2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mdm2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMdm2(Mdm2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUb(Ub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>E2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>E2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseE2(E2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basal ROS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basal ROS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasalROS(BasalROS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mdm2 DUB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mdm2 DUB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMdm2DUB(Mdm2DUB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>P5 3m RNA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>P5 3m RNA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseP53mRNA(P53mRNA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATMI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATMI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATMI(ATMI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATP(ATP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>E1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>E1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseE1(E1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSK 3b</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSK 3b</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSK3b(GSK3b object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADP(ADP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PPT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PPT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePPT(PPT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agg Tau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agg Tau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggTau(AggTau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFT(NFT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abeta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abeta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbeta(Abeta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agg Abeta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agg Abeta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggAbeta(AggAbeta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abeta Plaque</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abeta Plaque</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbetaPlaque(AbetaPlaque object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dam DNA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dam DNA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDamDNA(DamDNA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATMA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATMA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATMA(ATMA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIR(IR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROS(ROS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Us</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Us</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseU_s(U_s object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UB4 s</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UB4 s</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUB4_s(UB4_s object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UB2 s</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UB2 s</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUB2_s(UB2_s object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UB1 s</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UB1 s</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUB1_s(UB1_s object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UB3 s</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UB3 s</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUB3_s(UB3_s object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseP_s(P_s object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>P1 s</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>P1 s</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseP1_s(P1_s object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>P2 s</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>P2 s</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseP2_s(P2_s object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UNB s</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UNB s</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUNB_s(UNB_s object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UBI s</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UBI s</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUBI_s(UBI_s object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgent(Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AlzheimerModelSwitch
