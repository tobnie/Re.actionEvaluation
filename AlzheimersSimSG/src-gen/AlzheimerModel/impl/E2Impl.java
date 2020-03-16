/**
 */
package AlzheimerModel.impl;

import AlzheimerModel.AlzheimerModelPackage;
import AlzheimerModel.E2;
import AlzheimerModel.UBI_s;
import AlzheimerModel.UNB_s;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>E2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AlzheimerModel.impl.E2Impl#getE2_x_unb <em>E2 xunb</em>}</li>
 *   <li>{@link AlzheimerModel.impl.E2Impl#getE2_x_ubi <em>E2 xubi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class E2Impl extends AgentImpl implements E2 {
	/**
	 * The cached value of the '{@link #getE2_x_unb() <em>E2 xunb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE2_x_unb()
	 * @generated
	 * @ordered
	 */
	protected UNB_s e2_x_unb;

	/**
	 * The cached value of the '{@link #getE2_x_ubi() <em>E2 xubi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE2_x_ubi()
	 * @generated
	 * @ordered
	 */
	protected UBI_s e2_x_ubi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected E2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlzheimerModelPackage.Literals.E2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UNB_s getE2_x_unb() {
		if (e2_x_unb != null && e2_x_unb.eIsProxy()) {
			InternalEObject oldE2_x_unb = (InternalEObject) e2_x_unb;
			e2_x_unb = (UNB_s) eResolveProxy(oldE2_x_unb);
			if (e2_x_unb != oldE2_x_unb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.E2__E2_XUNB,
							oldE2_x_unb, e2_x_unb));
			}
		}
		return e2_x_unb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UNB_s basicGetE2_x_unb() {
		return e2_x_unb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setE2_x_unb(UNB_s newE2_x_unb) {
		UNB_s oldE2_x_unb = e2_x_unb;
		e2_x_unb = newE2_x_unb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.E2__E2_XUNB, oldE2_x_unb,
					e2_x_unb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UBI_s getE2_x_ubi() {
		if (e2_x_ubi != null && e2_x_ubi.eIsProxy()) {
			InternalEObject oldE2_x_ubi = (InternalEObject) e2_x_ubi;
			e2_x_ubi = (UBI_s) eResolveProxy(oldE2_x_ubi);
			if (e2_x_ubi != oldE2_x_ubi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.E2__E2_XUBI,
							oldE2_x_ubi, e2_x_ubi));
			}
		}
		return e2_x_ubi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UBI_s basicGetE2_x_ubi() {
		return e2_x_ubi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setE2_x_ubi(UBI_s newE2_x_ubi) {
		UBI_s oldE2_x_ubi = e2_x_ubi;
		e2_x_ubi = newE2_x_ubi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.E2__E2_XUBI, oldE2_x_ubi,
					e2_x_ubi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AlzheimerModelPackage.E2__E2_XUNB:
			if (resolve)
				return getE2_x_unb();
			return basicGetE2_x_unb();
		case AlzheimerModelPackage.E2__E2_XUBI:
			if (resolve)
				return getE2_x_ubi();
			return basicGetE2_x_ubi();
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
		case AlzheimerModelPackage.E2__E2_XUNB:
			setE2_x_unb((UNB_s) newValue);
			return;
		case AlzheimerModelPackage.E2__E2_XUBI:
			setE2_x_ubi((UBI_s) newValue);
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
		case AlzheimerModelPackage.E2__E2_XUNB:
			setE2_x_unb((UNB_s) null);
			return;
		case AlzheimerModelPackage.E2__E2_XUBI:
			setE2_x_ubi((UBI_s) null);
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
		case AlzheimerModelPackage.E2__E2_XUNB:
			return e2_x_unb != null;
		case AlzheimerModelPackage.E2__E2_XUBI:
			return e2_x_ubi != null;
		}
		return super.eIsSet(featureID);
	}

} //E2Impl
