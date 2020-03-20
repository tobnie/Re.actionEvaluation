/**
 */
package Params6Model.impl;

import Params6Model.Params6ModelPackage;
import Params6Model.Y;
import Params6Model.Z;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Y</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Params6Model.impl.YImpl#getY_a_Z_a <em>YaZa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YImpl extends AgentImpl implements Y {
	/**
	 * The cached value of the '{@link #getY_a_Z_a() <em>YaZa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY_a_Z_a()
	 * @generated
	 * @ordered
	 */
	protected Z y_a_Z_a;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Params6ModelPackage.Literals.Y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Z getY_a_Z_a() {
		if (y_a_Z_a != null && y_a_Z_a.eIsProxy()) {
			InternalEObject oldY_a_Z_a = (InternalEObject) y_a_Z_a;
			y_a_Z_a = (Z) eResolveProxy(oldY_a_Z_a);
			if (y_a_Z_a != oldY_a_Z_a) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Params6ModelPackage.Y__YAZA, oldY_a_Z_a,
							y_a_Z_a));
			}
		}
		return y_a_Z_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Z basicGetY_a_Z_a() {
		return y_a_Z_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY_a_Z_a(Z newY_a_Z_a) {
		Z oldY_a_Z_a = y_a_Z_a;
		y_a_Z_a = newY_a_Z_a;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Params6ModelPackage.Y__YAZA, oldY_a_Z_a, y_a_Z_a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Params6ModelPackage.Y__YAZA:
			if (resolve)
				return getY_a_Z_a();
			return basicGetY_a_Z_a();
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
		case Params6ModelPackage.Y__YAZA:
			setY_a_Z_a((Z) newValue);
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
		case Params6ModelPackage.Y__YAZA:
			setY_a_Z_a((Z) null);
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
		case Params6ModelPackage.Y__YAZA:
			return y_a_Z_a != null;
		}
		return super.eIsSet(featureID);
	}

} //YImpl
