/**
 */
package AlzheimerModel.impl;

import AlzheimerModel.AlzheimerModelPackage;
import AlzheimerModel.Mdm2;
import AlzheimerModel.P_s;
import AlzheimerModel.UB1_s;
import AlzheimerModel.UB2_s;
import AlzheimerModel.UB3_s;
import AlzheimerModel.UB4_s;
import AlzheimerModel.UNB_s;
import AlzheimerModel.U_s;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mdm2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AlzheimerModel.impl.Mdm2Impl#getMdm2_z_u <em>Mdm2 zu</em>}</li>
 *   <li>{@link AlzheimerModel.impl.Mdm2Impl#getMdm2_z_p <em>Mdm2 zp</em>}</li>
 *   <li>{@link AlzheimerModel.impl.Mdm2Impl#getMdm2_ubi_unb <em>Mdm2 ubi unb</em>}</li>
 *   <li>{@link AlzheimerModel.impl.Mdm2Impl#getMdm2_ubi_ub1 <em>Mdm2 ubi ub1</em>}</li>
 *   <li>{@link AlzheimerModel.impl.Mdm2Impl#getMdm2_ubi_ub2 <em>Mdm2 ubi ub2</em>}</li>
 *   <li>{@link AlzheimerModel.impl.Mdm2Impl#getMdm2_ubi_ub3 <em>Mdm2 ubi ub3</em>}</li>
 *   <li>{@link AlzheimerModel.impl.Mdm2Impl#getMdm2_ubi_ub4 <em>Mdm2 ubi ub4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Mdm2Impl extends AgentImpl implements Mdm2 {
	/**
	 * The cached value of the '{@link #getMdm2_z_u() <em>Mdm2 zu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdm2_z_u()
	 * @generated
	 * @ordered
	 */
	protected U_s mdm2_z_u;

	/**
	 * The cached value of the '{@link #getMdm2_z_p() <em>Mdm2 zp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdm2_z_p()
	 * @generated
	 * @ordered
	 */
	protected P_s mdm2_z_p;

	/**
	 * The cached value of the '{@link #getMdm2_ubi_unb() <em>Mdm2 ubi unb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdm2_ubi_unb()
	 * @generated
	 * @ordered
	 */
	protected UNB_s mdm2_ubi_unb;

	/**
	 * The cached value of the '{@link #getMdm2_ubi_ub1() <em>Mdm2 ubi ub1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdm2_ubi_ub1()
	 * @generated
	 * @ordered
	 */
	protected UB1_s mdm2_ubi_ub1;

	/**
	 * The cached value of the '{@link #getMdm2_ubi_ub2() <em>Mdm2 ubi ub2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdm2_ubi_ub2()
	 * @generated
	 * @ordered
	 */
	protected UB2_s mdm2_ubi_ub2;

	/**
	 * The cached value of the '{@link #getMdm2_ubi_ub3() <em>Mdm2 ubi ub3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdm2_ubi_ub3()
	 * @generated
	 * @ordered
	 */
	protected UB3_s mdm2_ubi_ub3;

	/**
	 * The cached value of the '{@link #getMdm2_ubi_ub4() <em>Mdm2 ubi ub4</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdm2_ubi_ub4()
	 * @generated
	 * @ordered
	 */
	protected UB4_s mdm2_ubi_ub4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Mdm2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlzheimerModelPackage.Literals.MDM2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public U_s getMdm2_z_u() {
		if (mdm2_z_u != null && mdm2_z_u.eIsProxy()) {
			InternalEObject oldMdm2_z_u = (InternalEObject) mdm2_z_u;
			mdm2_z_u = (U_s) eResolveProxy(oldMdm2_z_u);
			if (mdm2_z_u != oldMdm2_z_u) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.MDM2__MDM2_ZU,
							oldMdm2_z_u, mdm2_z_u));
			}
		}
		return mdm2_z_u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public U_s basicGetMdm2_z_u() {
		return mdm2_z_u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMdm2_z_u(U_s newMdm2_z_u) {
		U_s oldMdm2_z_u = mdm2_z_u;
		mdm2_z_u = newMdm2_z_u;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.MDM2__MDM2_ZU, oldMdm2_z_u,
					mdm2_z_u));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P_s getMdm2_z_p() {
		if (mdm2_z_p != null && mdm2_z_p.eIsProxy()) {
			InternalEObject oldMdm2_z_p = (InternalEObject) mdm2_z_p;
			mdm2_z_p = (P_s) eResolveProxy(oldMdm2_z_p);
			if (mdm2_z_p != oldMdm2_z_p) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.MDM2__MDM2_ZP,
							oldMdm2_z_p, mdm2_z_p));
			}
		}
		return mdm2_z_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P_s basicGetMdm2_z_p() {
		return mdm2_z_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMdm2_z_p(P_s newMdm2_z_p) {
		P_s oldMdm2_z_p = mdm2_z_p;
		mdm2_z_p = newMdm2_z_p;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.MDM2__MDM2_ZP, oldMdm2_z_p,
					mdm2_z_p));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UNB_s getMdm2_ubi_unb() {
		if (mdm2_ubi_unb != null && mdm2_ubi_unb.eIsProxy()) {
			InternalEObject oldMdm2_ubi_unb = (InternalEObject) mdm2_ubi_unb;
			mdm2_ubi_unb = (UNB_s) eResolveProxy(oldMdm2_ubi_unb);
			if (mdm2_ubi_unb != oldMdm2_ubi_unb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.MDM2__MDM2_UBI_UNB,
							oldMdm2_ubi_unb, mdm2_ubi_unb));
			}
		}
		return mdm2_ubi_unb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UNB_s basicGetMdm2_ubi_unb() {
		return mdm2_ubi_unb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMdm2_ubi_unb(UNB_s newMdm2_ubi_unb) {
		UNB_s oldMdm2_ubi_unb = mdm2_ubi_unb;
		mdm2_ubi_unb = newMdm2_ubi_unb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.MDM2__MDM2_UBI_UNB,
					oldMdm2_ubi_unb, mdm2_ubi_unb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UB1_s getMdm2_ubi_ub1() {
		if (mdm2_ubi_ub1 != null && mdm2_ubi_ub1.eIsProxy()) {
			InternalEObject oldMdm2_ubi_ub1 = (InternalEObject) mdm2_ubi_ub1;
			mdm2_ubi_ub1 = (UB1_s) eResolveProxy(oldMdm2_ubi_ub1);
			if (mdm2_ubi_ub1 != oldMdm2_ubi_ub1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.MDM2__MDM2_UBI_UB1,
							oldMdm2_ubi_ub1, mdm2_ubi_ub1));
			}
		}
		return mdm2_ubi_ub1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB1_s basicGetMdm2_ubi_ub1() {
		return mdm2_ubi_ub1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMdm2_ubi_ub1(UB1_s newMdm2_ubi_ub1) {
		UB1_s oldMdm2_ubi_ub1 = mdm2_ubi_ub1;
		mdm2_ubi_ub1 = newMdm2_ubi_ub1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.MDM2__MDM2_UBI_UB1,
					oldMdm2_ubi_ub1, mdm2_ubi_ub1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UB2_s getMdm2_ubi_ub2() {
		if (mdm2_ubi_ub2 != null && mdm2_ubi_ub2.eIsProxy()) {
			InternalEObject oldMdm2_ubi_ub2 = (InternalEObject) mdm2_ubi_ub2;
			mdm2_ubi_ub2 = (UB2_s) eResolveProxy(oldMdm2_ubi_ub2);
			if (mdm2_ubi_ub2 != oldMdm2_ubi_ub2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.MDM2__MDM2_UBI_UB2,
							oldMdm2_ubi_ub2, mdm2_ubi_ub2));
			}
		}
		return mdm2_ubi_ub2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB2_s basicGetMdm2_ubi_ub2() {
		return mdm2_ubi_ub2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMdm2_ubi_ub2(UB2_s newMdm2_ubi_ub2) {
		UB2_s oldMdm2_ubi_ub2 = mdm2_ubi_ub2;
		mdm2_ubi_ub2 = newMdm2_ubi_ub2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.MDM2__MDM2_UBI_UB2,
					oldMdm2_ubi_ub2, mdm2_ubi_ub2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UB3_s getMdm2_ubi_ub3() {
		if (mdm2_ubi_ub3 != null && mdm2_ubi_ub3.eIsProxy()) {
			InternalEObject oldMdm2_ubi_ub3 = (InternalEObject) mdm2_ubi_ub3;
			mdm2_ubi_ub3 = (UB3_s) eResolveProxy(oldMdm2_ubi_ub3);
			if (mdm2_ubi_ub3 != oldMdm2_ubi_ub3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.MDM2__MDM2_UBI_UB3,
							oldMdm2_ubi_ub3, mdm2_ubi_ub3));
			}
		}
		return mdm2_ubi_ub3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB3_s basicGetMdm2_ubi_ub3() {
		return mdm2_ubi_ub3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMdm2_ubi_ub3(UB3_s newMdm2_ubi_ub3) {
		UB3_s oldMdm2_ubi_ub3 = mdm2_ubi_ub3;
		mdm2_ubi_ub3 = newMdm2_ubi_ub3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.MDM2__MDM2_UBI_UB3,
					oldMdm2_ubi_ub3, mdm2_ubi_ub3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UB4_s getMdm2_ubi_ub4() {
		if (mdm2_ubi_ub4 != null && mdm2_ubi_ub4.eIsProxy()) {
			InternalEObject oldMdm2_ubi_ub4 = (InternalEObject) mdm2_ubi_ub4;
			mdm2_ubi_ub4 = (UB4_s) eResolveProxy(oldMdm2_ubi_ub4);
			if (mdm2_ubi_ub4 != oldMdm2_ubi_ub4) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.MDM2__MDM2_UBI_UB4,
							oldMdm2_ubi_ub4, mdm2_ubi_ub4));
			}
		}
		return mdm2_ubi_ub4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB4_s basicGetMdm2_ubi_ub4() {
		return mdm2_ubi_ub4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMdm2_ubi_ub4(UB4_s newMdm2_ubi_ub4) {
		UB4_s oldMdm2_ubi_ub4 = mdm2_ubi_ub4;
		mdm2_ubi_ub4 = newMdm2_ubi_ub4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.MDM2__MDM2_UBI_UB4,
					oldMdm2_ubi_ub4, mdm2_ubi_ub4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AlzheimerModelPackage.MDM2__MDM2_ZU:
			if (resolve)
				return getMdm2_z_u();
			return basicGetMdm2_z_u();
		case AlzheimerModelPackage.MDM2__MDM2_ZP:
			if (resolve)
				return getMdm2_z_p();
			return basicGetMdm2_z_p();
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UNB:
			if (resolve)
				return getMdm2_ubi_unb();
			return basicGetMdm2_ubi_unb();
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UB1:
			if (resolve)
				return getMdm2_ubi_ub1();
			return basicGetMdm2_ubi_ub1();
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UB2:
			if (resolve)
				return getMdm2_ubi_ub2();
			return basicGetMdm2_ubi_ub2();
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UB3:
			if (resolve)
				return getMdm2_ubi_ub3();
			return basicGetMdm2_ubi_ub3();
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UB4:
			if (resolve)
				return getMdm2_ubi_ub4();
			return basicGetMdm2_ubi_ub4();
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
		case AlzheimerModelPackage.MDM2__MDM2_ZU:
			setMdm2_z_u((U_s) newValue);
			return;
		case AlzheimerModelPackage.MDM2__MDM2_ZP:
			setMdm2_z_p((P_s) newValue);
			return;
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UNB:
			setMdm2_ubi_unb((UNB_s) newValue);
			return;
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UB1:
			setMdm2_ubi_ub1((UB1_s) newValue);
			return;
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UB2:
			setMdm2_ubi_ub2((UB2_s) newValue);
			return;
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UB3:
			setMdm2_ubi_ub3((UB3_s) newValue);
			return;
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UB4:
			setMdm2_ubi_ub4((UB4_s) newValue);
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
		case AlzheimerModelPackage.MDM2__MDM2_ZU:
			setMdm2_z_u((U_s) null);
			return;
		case AlzheimerModelPackage.MDM2__MDM2_ZP:
			setMdm2_z_p((P_s) null);
			return;
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UNB:
			setMdm2_ubi_unb((UNB_s) null);
			return;
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UB1:
			setMdm2_ubi_ub1((UB1_s) null);
			return;
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UB2:
			setMdm2_ubi_ub2((UB2_s) null);
			return;
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UB3:
			setMdm2_ubi_ub3((UB3_s) null);
			return;
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UB4:
			setMdm2_ubi_ub4((UB4_s) null);
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
		case AlzheimerModelPackage.MDM2__MDM2_ZU:
			return mdm2_z_u != null;
		case AlzheimerModelPackage.MDM2__MDM2_ZP:
			return mdm2_z_p != null;
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UNB:
			return mdm2_ubi_unb != null;
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UB1:
			return mdm2_ubi_ub1 != null;
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UB2:
			return mdm2_ubi_ub2 != null;
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UB3:
			return mdm2_ubi_ub3 != null;
		case AlzheimerModelPackage.MDM2__MDM2_UBI_UB4:
			return mdm2_ubi_ub4 != null;
		}
		return super.eIsSet(featureID);
	}

} //Mdm2Impl
