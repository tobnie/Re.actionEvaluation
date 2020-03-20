/**
 */
package Params6Model.impl;

import Params6Model.Params6ModelPackage;
import Params6Model.W;
import Params6Model.X;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>W</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Params6Model.impl.WImpl#getW_a_X_a <em>WaXa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WImpl extends AgentImpl implements W {
	/**
	 * The cached value of the '{@link #getW_a_X_a() <em>WaXa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW_a_X_a()
	 * @generated
	 * @ordered
	 */
	protected X w_a_X_a;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Params6ModelPackage.Literals.W;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public X getW_a_X_a() {
		if (w_a_X_a != null && w_a_X_a.eIsProxy()) {
			InternalEObject oldW_a_X_a = (InternalEObject) w_a_X_a;
			w_a_X_a = (X) eResolveProxy(oldW_a_X_a);
			if (w_a_X_a != oldW_a_X_a) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Params6ModelPackage.W__WAXA, oldW_a_X_a,
							w_a_X_a));
			}
		}
		return w_a_X_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X basicGetW_a_X_a() {
		return w_a_X_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setW_a_X_a(X newW_a_X_a) {
		X oldW_a_X_a = w_a_X_a;
		w_a_X_a = newW_a_X_a;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Params6ModelPackage.W__WAXA, oldW_a_X_a, w_a_X_a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Params6ModelPackage.W__WAXA:
			if (resolve)
				return getW_a_X_a();
			return basicGetW_a_X_a();
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
		case Params6ModelPackage.W__WAXA:
			setW_a_X_a((X) newValue);
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
		case Params6ModelPackage.W__WAXA:
			setW_a_X_a((X) null);
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
		case Params6ModelPackage.W__WAXA:
			return w_a_X_a != null;
		}
		return super.eIsSet(featureID);
	}

} //WImpl
