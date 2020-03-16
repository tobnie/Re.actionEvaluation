/**
 */
package AlzheimerModel.impl;

import AlzheimerModel.AlzheimerModelPackage;
import AlzheimerModel.P1_s;
import AlzheimerModel.P2_s;
import AlzheimerModel.Tau;
import AlzheimerModel.U_s;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tau</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AlzheimerModel.impl.TauImpl#getTau_phos_u <em>Tau phos u</em>}</li>
 *   <li>{@link AlzheimerModel.impl.TauImpl#getTau_phos_p1 <em>Tau phos p1</em>}</li>
 *   <li>{@link AlzheimerModel.impl.TauImpl#getTau_phos_p2 <em>Tau phos p2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TauImpl extends AgentImpl implements Tau {
	/**
	 * The cached value of the '{@link #getTau_phos_u() <em>Tau phos u</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTau_phos_u()
	 * @generated
	 * @ordered
	 */
	protected U_s tau_phos_u;

	/**
	 * The cached value of the '{@link #getTau_phos_p1() <em>Tau phos p1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTau_phos_p1()
	 * @generated
	 * @ordered
	 */
	protected P1_s tau_phos_p1;

	/**
	 * The cached value of the '{@link #getTau_phos_p2() <em>Tau phos p2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTau_phos_p2()
	 * @generated
	 * @ordered
	 */
	protected P2_s tau_phos_p2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TauImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlzheimerModelPackage.Literals.TAU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public U_s getTau_phos_u() {
		if (tau_phos_u != null && tau_phos_u.eIsProxy()) {
			InternalEObject oldTau_phos_u = (InternalEObject) tau_phos_u;
			tau_phos_u = (U_s) eResolveProxy(oldTau_phos_u);
			if (tau_phos_u != oldTau_phos_u) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.TAU__TAU_PHOS_U,
							oldTau_phos_u, tau_phos_u));
			}
		}
		return tau_phos_u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public U_s basicGetTau_phos_u() {
		return tau_phos_u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTau_phos_u(U_s newTau_phos_u) {
		U_s oldTau_phos_u = tau_phos_u;
		tau_phos_u = newTau_phos_u;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.TAU__TAU_PHOS_U, oldTau_phos_u,
					tau_phos_u));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P1_s getTau_phos_p1() {
		if (tau_phos_p1 != null && tau_phos_p1.eIsProxy()) {
			InternalEObject oldTau_phos_p1 = (InternalEObject) tau_phos_p1;
			tau_phos_p1 = (P1_s) eResolveProxy(oldTau_phos_p1);
			if (tau_phos_p1 != oldTau_phos_p1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.TAU__TAU_PHOS_P1,
							oldTau_phos_p1, tau_phos_p1));
			}
		}
		return tau_phos_p1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P1_s basicGetTau_phos_p1() {
		return tau_phos_p1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTau_phos_p1(P1_s newTau_phos_p1) {
		P1_s oldTau_phos_p1 = tau_phos_p1;
		tau_phos_p1 = newTau_phos_p1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.TAU__TAU_PHOS_P1,
					oldTau_phos_p1, tau_phos_p1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P2_s getTau_phos_p2() {
		if (tau_phos_p2 != null && tau_phos_p2.eIsProxy()) {
			InternalEObject oldTau_phos_p2 = (InternalEObject) tau_phos_p2;
			tau_phos_p2 = (P2_s) eResolveProxy(oldTau_phos_p2);
			if (tau_phos_p2 != oldTau_phos_p2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.TAU__TAU_PHOS_P2,
							oldTau_phos_p2, tau_phos_p2));
			}
		}
		return tau_phos_p2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P2_s basicGetTau_phos_p2() {
		return tau_phos_p2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTau_phos_p2(P2_s newTau_phos_p2) {
		P2_s oldTau_phos_p2 = tau_phos_p2;
		tau_phos_p2 = newTau_phos_p2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.TAU__TAU_PHOS_P2,
					oldTau_phos_p2, tau_phos_p2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AlzheimerModelPackage.TAU__TAU_PHOS_U:
			if (resolve)
				return getTau_phos_u();
			return basicGetTau_phos_u();
		case AlzheimerModelPackage.TAU__TAU_PHOS_P1:
			if (resolve)
				return getTau_phos_p1();
			return basicGetTau_phos_p1();
		case AlzheimerModelPackage.TAU__TAU_PHOS_P2:
			if (resolve)
				return getTau_phos_p2();
			return basicGetTau_phos_p2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AlzheimerModelPackage.TAU__TAU_PHOS_U:
			setTau_phos_u((U_s) newValue);
			return;
		case AlzheimerModelPackage.TAU__TAU_PHOS_P1:
			setTau_phos_p1((P1_s) newValue);
			return;
		case AlzheimerModelPackage.TAU__TAU_PHOS_P2:
			setTau_phos_p2((P2_s) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AlzheimerModelPackage.TAU__TAU_PHOS_U:
			setTau_phos_u((U_s) null);
			return;
		case AlzheimerModelPackage.TAU__TAU_PHOS_P1:
			setTau_phos_p1((P1_s) null);
			return;
		case AlzheimerModelPackage.TAU__TAU_PHOS_P2:
			setTau_phos_p2((P2_s) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AlzheimerModelPackage.TAU__TAU_PHOS_U:
			return tau_phos_u != null;
		case AlzheimerModelPackage.TAU__TAU_PHOS_P1:
			return tau_phos_p1 != null;
		case AlzheimerModelPackage.TAU__TAU_PHOS_P2:
			return tau_phos_p2 != null;
		}
		return super.eIsSet(featureID);
	}

} //TauImpl
