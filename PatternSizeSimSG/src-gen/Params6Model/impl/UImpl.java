/**
 */
package Params6Model.impl;

import Params6Model.Params6ModelPackage;
import Params6Model.U;
import Params6Model.V;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>U</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Params6Model.impl.UImpl#getU_a_V_a <em>UaVa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UImpl extends AgentImpl implements U {
	/**
	 * The cached value of the '{@link #getU_a_V_a() <em>UaVa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getU_a_V_a()
	 * @generated
	 * @ordered
	 */
	protected V u_a_V_a;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Params6ModelPackage.Literals.U;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V getU_a_V_a() {
		if (u_a_V_a != null && u_a_V_a.eIsProxy()) {
			InternalEObject oldU_a_V_a = (InternalEObject) u_a_V_a;
			u_a_V_a = (V) eResolveProxy(oldU_a_V_a);
			if (u_a_V_a != oldU_a_V_a) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Params6ModelPackage.U__UAVA, oldU_a_V_a,
							u_a_V_a));
			}
		}
		return u_a_V_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V basicGetU_a_V_a() {
		return u_a_V_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setU_a_V_a(V newU_a_V_a) {
		V oldU_a_V_a = u_a_V_a;
		u_a_V_a = newU_a_V_a;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Params6ModelPackage.U__UAVA, oldU_a_V_a, u_a_V_a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Params6ModelPackage.U__UAVA:
			if (resolve)
				return getU_a_V_a();
			return basicGetU_a_V_a();
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
		case Params6ModelPackage.U__UAVA:
			setU_a_V_a((V) newValue);
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
		case Params6ModelPackage.U__UAVA:
			setU_a_V_a((V) null);
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
		case Params6ModelPackage.U__UAVA:
			return u_a_V_a != null;
		}
		return super.eIsSet(featureID);
	}

} //UImpl
