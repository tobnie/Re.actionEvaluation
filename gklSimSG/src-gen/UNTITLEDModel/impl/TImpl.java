/**
 */
package UNTITLEDModel.impl;

import UNTITLEDModel.K;
import UNTITLEDModel.P_s;
import UNTITLEDModel.T;
import UNTITLEDModel.UNTITLEDModelPackage;
import UNTITLEDModel.U_s;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UNTITLEDModel.impl.TImpl#getT_x_K_a <em>TxKa</em>}</li>
 *   <li>{@link UNTITLEDModel.impl.TImpl#getT_x_u <em>Txu</em>}</li>
 *   <li>{@link UNTITLEDModel.impl.TImpl#getT_x_p <em>Txp</em>}</li>
 *   <li>{@link UNTITLEDModel.impl.TImpl#getT_y_K_a <em>TyKa</em>}</li>
 *   <li>{@link UNTITLEDModel.impl.TImpl#getT_y_u <em>Tyu</em>}</li>
 *   <li>{@link UNTITLEDModel.impl.TImpl#getT_y_p <em>Typ</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TImpl extends AgentImpl implements T {
	/**
	 * The cached value of the '{@link #getT_x_K_a() <em>TxKa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_x_K_a()
	 * @generated
	 * @ordered
	 */
	protected K t_x_K_a;

	/**
	 * The cached value of the '{@link #getT_x_u() <em>Txu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_x_u()
	 * @generated
	 * @ordered
	 */
	protected U_s t_x_u;

	/**
	 * The cached value of the '{@link #getT_x_p() <em>Txp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_x_p()
	 * @generated
	 * @ordered
	 */
	protected P_s t_x_p;

	/**
	 * The cached value of the '{@link #getT_y_K_a() <em>TyKa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_y_K_a()
	 * @generated
	 * @ordered
	 */
	protected K t_y_K_a;

	/**
	 * The cached value of the '{@link #getT_y_u() <em>Tyu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_y_u()
	 * @generated
	 * @ordered
	 */
	protected U_s t_y_u;

	/**
	 * The cached value of the '{@link #getT_y_p() <em>Typ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_y_p()
	 * @generated
	 * @ordered
	 */
	protected P_s t_y_p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UNTITLEDModelPackage.Literals.T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public K getT_x_K_a() {
		if (t_x_K_a != null && t_x_K_a.eIsProxy()) {
			InternalEObject oldT_x_K_a = (InternalEObject) t_x_K_a;
			t_x_K_a = (K) eResolveProxy(oldT_x_K_a);
			if (t_x_K_a != oldT_x_K_a) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UNTITLEDModelPackage.T__TXKA, oldT_x_K_a,
							t_x_K_a));
			}
		}
		return t_x_K_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public K basicGetT_x_K_a() {
		return t_x_K_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setT_x_K_a(K newT_x_K_a) {
		K oldT_x_K_a = t_x_K_a;
		t_x_K_a = newT_x_K_a;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UNTITLEDModelPackage.T__TXKA, oldT_x_K_a, t_x_K_a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public U_s getT_x_u() {
		if (t_x_u != null && t_x_u.eIsProxy()) {
			InternalEObject oldT_x_u = (InternalEObject) t_x_u;
			t_x_u = (U_s) eResolveProxy(oldT_x_u);
			if (t_x_u != oldT_x_u) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UNTITLEDModelPackage.T__TXU, oldT_x_u,
							t_x_u));
			}
		}
		return t_x_u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public U_s basicGetT_x_u() {
		return t_x_u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setT_x_u(U_s newT_x_u) {
		U_s oldT_x_u = t_x_u;
		t_x_u = newT_x_u;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UNTITLEDModelPackage.T__TXU, oldT_x_u, t_x_u));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P_s getT_x_p() {
		if (t_x_p != null && t_x_p.eIsProxy()) {
			InternalEObject oldT_x_p = (InternalEObject) t_x_p;
			t_x_p = (P_s) eResolveProxy(oldT_x_p);
			if (t_x_p != oldT_x_p) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UNTITLEDModelPackage.T__TXP, oldT_x_p,
							t_x_p));
			}
		}
		return t_x_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P_s basicGetT_x_p() {
		return t_x_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setT_x_p(P_s newT_x_p) {
		P_s oldT_x_p = t_x_p;
		t_x_p = newT_x_p;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UNTITLEDModelPackage.T__TXP, oldT_x_p, t_x_p));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public K getT_y_K_a() {
		if (t_y_K_a != null && t_y_K_a.eIsProxy()) {
			InternalEObject oldT_y_K_a = (InternalEObject) t_y_K_a;
			t_y_K_a = (K) eResolveProxy(oldT_y_K_a);
			if (t_y_K_a != oldT_y_K_a) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UNTITLEDModelPackage.T__TYKA, oldT_y_K_a,
							t_y_K_a));
			}
		}
		return t_y_K_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public K basicGetT_y_K_a() {
		return t_y_K_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setT_y_K_a(K newT_y_K_a) {
		K oldT_y_K_a = t_y_K_a;
		t_y_K_a = newT_y_K_a;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UNTITLEDModelPackage.T__TYKA, oldT_y_K_a, t_y_K_a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public U_s getT_y_u() {
		if (t_y_u != null && t_y_u.eIsProxy()) {
			InternalEObject oldT_y_u = (InternalEObject) t_y_u;
			t_y_u = (U_s) eResolveProxy(oldT_y_u);
			if (t_y_u != oldT_y_u) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UNTITLEDModelPackage.T__TYU, oldT_y_u,
							t_y_u));
			}
		}
		return t_y_u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public U_s basicGetT_y_u() {
		return t_y_u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setT_y_u(U_s newT_y_u) {
		U_s oldT_y_u = t_y_u;
		t_y_u = newT_y_u;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UNTITLEDModelPackage.T__TYU, oldT_y_u, t_y_u));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P_s getT_y_p() {
		if (t_y_p != null && t_y_p.eIsProxy()) {
			InternalEObject oldT_y_p = (InternalEObject) t_y_p;
			t_y_p = (P_s) eResolveProxy(oldT_y_p);
			if (t_y_p != oldT_y_p) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UNTITLEDModelPackage.T__TYP, oldT_y_p,
							t_y_p));
			}
		}
		return t_y_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P_s basicGetT_y_p() {
		return t_y_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setT_y_p(P_s newT_y_p) {
		P_s oldT_y_p = t_y_p;
		t_y_p = newT_y_p;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UNTITLEDModelPackage.T__TYP, oldT_y_p, t_y_p));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UNTITLEDModelPackage.T__TXKA:
			if (resolve)
				return getT_x_K_a();
			return basicGetT_x_K_a();
		case UNTITLEDModelPackage.T__TXU:
			if (resolve)
				return getT_x_u();
			return basicGetT_x_u();
		case UNTITLEDModelPackage.T__TXP:
			if (resolve)
				return getT_x_p();
			return basicGetT_x_p();
		case UNTITLEDModelPackage.T__TYKA:
			if (resolve)
				return getT_y_K_a();
			return basicGetT_y_K_a();
		case UNTITLEDModelPackage.T__TYU:
			if (resolve)
				return getT_y_u();
			return basicGetT_y_u();
		case UNTITLEDModelPackage.T__TYP:
			if (resolve)
				return getT_y_p();
			return basicGetT_y_p();
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
		case UNTITLEDModelPackage.T__TXKA:
			setT_x_K_a((K) newValue);
			return;
		case UNTITLEDModelPackage.T__TXU:
			setT_x_u((U_s) newValue);
			return;
		case UNTITLEDModelPackage.T__TXP:
			setT_x_p((P_s) newValue);
			return;
		case UNTITLEDModelPackage.T__TYKA:
			setT_y_K_a((K) newValue);
			return;
		case UNTITLEDModelPackage.T__TYU:
			setT_y_u((U_s) newValue);
			return;
		case UNTITLEDModelPackage.T__TYP:
			setT_y_p((P_s) newValue);
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
		case UNTITLEDModelPackage.T__TXKA:
			setT_x_K_a((K) null);
			return;
		case UNTITLEDModelPackage.T__TXU:
			setT_x_u((U_s) null);
			return;
		case UNTITLEDModelPackage.T__TXP:
			setT_x_p((P_s) null);
			return;
		case UNTITLEDModelPackage.T__TYKA:
			setT_y_K_a((K) null);
			return;
		case UNTITLEDModelPackage.T__TYU:
			setT_y_u((U_s) null);
			return;
		case UNTITLEDModelPackage.T__TYP:
			setT_y_p((P_s) null);
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
		case UNTITLEDModelPackage.T__TXKA:
			return t_x_K_a != null;
		case UNTITLEDModelPackage.T__TXU:
			return t_x_u != null;
		case UNTITLEDModelPackage.T__TXP:
			return t_x_p != null;
		case UNTITLEDModelPackage.T__TYKA:
			return t_y_K_a != null;
		case UNTITLEDModelPackage.T__TYU:
			return t_y_u != null;
		case UNTITLEDModelPackage.T__TYP:
			return t_y_p != null;
		}
		return super.eIsSet(featureID);
	}

} //TImpl