/**
 */
package AlzheimerModel.impl;

import AlzheimerModel.AlzheimerModelPackage;
import AlzheimerModel.E1;
import AlzheimerModel.UBI_s;
import AlzheimerModel.UNB_s;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>E1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AlzheimerModel.impl.E1Impl#getE1_x_unb <em>E1 xunb</em>}</li>
 *   <li>{@link AlzheimerModel.impl.E1Impl#getE1_x_ubi <em>E1 xubi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class E1Impl extends AgentImpl implements E1 {
	/**
	 * The cached value of the '{@link #getE1_x_unb() <em>E1 xunb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE1_x_unb()
	 * @generated
	 * @ordered
	 */
	protected UNB_s e1_x_unb;

	/**
	 * The cached value of the '{@link #getE1_x_ubi() <em>E1 xubi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE1_x_ubi()
	 * @generated
	 * @ordered
	 */
	protected UBI_s e1_x_ubi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected E1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlzheimerModelPackage.Literals.E1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UNB_s getE1_x_unb() {
		if (e1_x_unb != null && e1_x_unb.eIsProxy()) {
			InternalEObject oldE1_x_unb = (InternalEObject) e1_x_unb;
			e1_x_unb = (UNB_s) eResolveProxy(oldE1_x_unb);
			if (e1_x_unb != oldE1_x_unb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.E1__E1_XUNB,
							oldE1_x_unb, e1_x_unb));
			}
		}
		return e1_x_unb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UNB_s basicGetE1_x_unb() {
		return e1_x_unb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setE1_x_unb(UNB_s newE1_x_unb) {
		UNB_s oldE1_x_unb = e1_x_unb;
		e1_x_unb = newE1_x_unb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.E1__E1_XUNB, oldE1_x_unb,
					e1_x_unb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UBI_s getE1_x_ubi() {
		if (e1_x_ubi != null && e1_x_ubi.eIsProxy()) {
			InternalEObject oldE1_x_ubi = (InternalEObject) e1_x_ubi;
			e1_x_ubi = (UBI_s) eResolveProxy(oldE1_x_ubi);
			if (e1_x_ubi != oldE1_x_ubi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.E1__E1_XUBI,
							oldE1_x_ubi, e1_x_ubi));
			}
		}
		return e1_x_ubi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UBI_s basicGetE1_x_ubi() {
		return e1_x_ubi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setE1_x_ubi(UBI_s newE1_x_ubi) {
		UBI_s oldE1_x_ubi = e1_x_ubi;
		e1_x_ubi = newE1_x_ubi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.E1__E1_XUBI, oldE1_x_ubi,
					e1_x_ubi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AlzheimerModelPackage.E1__E1_XUNB:
			if (resolve)
				return getE1_x_unb();
			return basicGetE1_x_unb();
		case AlzheimerModelPackage.E1__E1_XUBI:
			if (resolve)
				return getE1_x_ubi();
			return basicGetE1_x_ubi();
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
		case AlzheimerModelPackage.E1__E1_XUNB:
			setE1_x_unb((UNB_s) newValue);
			return;
		case AlzheimerModelPackage.E1__E1_XUBI:
			setE1_x_ubi((UBI_s) newValue);
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
		case AlzheimerModelPackage.E1__E1_XUNB:
			setE1_x_unb((UNB_s) null);
			return;
		case AlzheimerModelPackage.E1__E1_XUBI:
			setE1_x_ubi((UBI_s) null);
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
		case AlzheimerModelPackage.E1__E1_XUNB:
			return e1_x_unb != null;
		case AlzheimerModelPackage.E1__E1_XUBI:
			return e1_x_ubi != null;
		}
		return super.eIsSet(featureID);
	}

} //E1Impl
