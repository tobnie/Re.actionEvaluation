/**
 */
package AlzheimerModel.impl;

import AlzheimerModel.AlzheimerModelPackage;
import AlzheimerModel.GSK3b;
import AlzheimerModel.Mdm2;
import AlzheimerModel.P53;
import AlzheimerModel.P_s;
import AlzheimerModel.Proteasome;
import AlzheimerModel.UB1_s;
import AlzheimerModel.UB2_s;
import AlzheimerModel.UB3_s;
import AlzheimerModel.UB4_s;
import AlzheimerModel.U_s;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>P53</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AlzheimerModel.impl.P53Impl#getP53_b_Mdm2_z <em>P53 bMdm2 z</em>}</li>
 *   <li>{@link AlzheimerModel.impl.P53Impl#getP53_b_GSK3b_x <em>P53 bGSK 3b x</em>}</li>
 *   <li>{@link AlzheimerModel.impl.P53Impl#getP53_b_Proteasome_x <em>P53 bProteasome x</em>}</li>
 *   <li>{@link AlzheimerModel.impl.P53Impl#getP53_b_u <em>P53 bu</em>}</li>
 *   <li>{@link AlzheimerModel.impl.P53Impl#getP53_b_ub4 <em>P53 bub4</em>}</li>
 *   <li>{@link AlzheimerModel.impl.P53Impl#getP53_b_ub2 <em>P53 bub2</em>}</li>
 *   <li>{@link AlzheimerModel.impl.P53Impl#getP53_b_ub1 <em>P53 bub1</em>}</li>
 *   <li>{@link AlzheimerModel.impl.P53Impl#getP53_b_ub3 <em>P53 bub3</em>}</li>
 *   <li>{@link AlzheimerModel.impl.P53Impl#getP53_b_p <em>P53 bp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class P53Impl extends AgentImpl implements P53 {
	/**
	 * The cached value of the '{@link #getP53_b_Mdm2_z() <em>P53 bMdm2 z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP53_b_Mdm2_z()
	 * @generated
	 * @ordered
	 */
	protected Mdm2 p53_b_Mdm2_z;

	/**
	 * The cached value of the '{@link #getP53_b_GSK3b_x() <em>P53 bGSK 3b x</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP53_b_GSK3b_x()
	 * @generated
	 * @ordered
	 */
	protected GSK3b p53_b_GSK3b_x;

	/**
	 * The cached value of the '{@link #getP53_b_Proteasome_x() <em>P53 bProteasome x</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP53_b_Proteasome_x()
	 * @generated
	 * @ordered
	 */
	protected Proteasome p53_b_Proteasome_x;

	/**
	 * The cached value of the '{@link #getP53_b_u() <em>P53 bu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP53_b_u()
	 * @generated
	 * @ordered
	 */
	protected U_s p53_b_u;

	/**
	 * The cached value of the '{@link #getP53_b_ub4() <em>P53 bub4</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP53_b_ub4()
	 * @generated
	 * @ordered
	 */
	protected UB4_s p53_b_ub4;

	/**
	 * The cached value of the '{@link #getP53_b_ub2() <em>P53 bub2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP53_b_ub2()
	 * @generated
	 * @ordered
	 */
	protected UB2_s p53_b_ub2;

	/**
	 * The cached value of the '{@link #getP53_b_ub1() <em>P53 bub1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP53_b_ub1()
	 * @generated
	 * @ordered
	 */
	protected UB1_s p53_b_ub1;

	/**
	 * The cached value of the '{@link #getP53_b_ub3() <em>P53 bub3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP53_b_ub3()
	 * @generated
	 * @ordered
	 */
	protected UB3_s p53_b_ub3;

	/**
	 * The cached value of the '{@link #getP53_b_p() <em>P53 bp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP53_b_p()
	 * @generated
	 * @ordered
	 */
	protected P_s p53_b_p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected P53Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlzheimerModelPackage.Literals.P53;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mdm2 getP53_b_Mdm2_z() {
		if (p53_b_Mdm2_z != null && p53_b_Mdm2_z.eIsProxy()) {
			InternalEObject oldP53_b_Mdm2_z = (InternalEObject) p53_b_Mdm2_z;
			p53_b_Mdm2_z = (Mdm2) eResolveProxy(oldP53_b_Mdm2_z);
			if (p53_b_Mdm2_z != oldP53_b_Mdm2_z) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.P53__P53_BMDM2_Z,
							oldP53_b_Mdm2_z, p53_b_Mdm2_z));
			}
		}
		return p53_b_Mdm2_z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mdm2 basicGetP53_b_Mdm2_z() {
		return p53_b_Mdm2_z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setP53_b_Mdm2_z(Mdm2 newP53_b_Mdm2_z) {
		Mdm2 oldP53_b_Mdm2_z = p53_b_Mdm2_z;
		p53_b_Mdm2_z = newP53_b_Mdm2_z;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.P53__P53_BMDM2_Z,
					oldP53_b_Mdm2_z, p53_b_Mdm2_z));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GSK3b getP53_b_GSK3b_x() {
		if (p53_b_GSK3b_x != null && p53_b_GSK3b_x.eIsProxy()) {
			InternalEObject oldP53_b_GSK3b_x = (InternalEObject) p53_b_GSK3b_x;
			p53_b_GSK3b_x = (GSK3b) eResolveProxy(oldP53_b_GSK3b_x);
			if (p53_b_GSK3b_x != oldP53_b_GSK3b_x) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.P53__P53_BGSK_3B_X,
							oldP53_b_GSK3b_x, p53_b_GSK3b_x));
			}
		}
		return p53_b_GSK3b_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSK3b basicGetP53_b_GSK3b_x() {
		return p53_b_GSK3b_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setP53_b_GSK3b_x(GSK3b newP53_b_GSK3b_x) {
		GSK3b oldP53_b_GSK3b_x = p53_b_GSK3b_x;
		p53_b_GSK3b_x = newP53_b_GSK3b_x;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.P53__P53_BGSK_3B_X,
					oldP53_b_GSK3b_x, p53_b_GSK3b_x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Proteasome getP53_b_Proteasome_x() {
		if (p53_b_Proteasome_x != null && p53_b_Proteasome_x.eIsProxy()) {
			InternalEObject oldP53_b_Proteasome_x = (InternalEObject) p53_b_Proteasome_x;
			p53_b_Proteasome_x = (Proteasome) eResolveProxy(oldP53_b_Proteasome_x);
			if (p53_b_Proteasome_x != oldP53_b_Proteasome_x) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AlzheimerModelPackage.P53__P53_BPROTEASOME_X, oldP53_b_Proteasome_x, p53_b_Proteasome_x));
			}
		}
		return p53_b_Proteasome_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proteasome basicGetP53_b_Proteasome_x() {
		return p53_b_Proteasome_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setP53_b_Proteasome_x(Proteasome newP53_b_Proteasome_x) {
		Proteasome oldP53_b_Proteasome_x = p53_b_Proteasome_x;
		p53_b_Proteasome_x = newP53_b_Proteasome_x;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.P53__P53_BPROTEASOME_X,
					oldP53_b_Proteasome_x, p53_b_Proteasome_x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public U_s getP53_b_u() {
		if (p53_b_u != null && p53_b_u.eIsProxy()) {
			InternalEObject oldP53_b_u = (InternalEObject) p53_b_u;
			p53_b_u = (U_s) eResolveProxy(oldP53_b_u);
			if (p53_b_u != oldP53_b_u) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.P53__P53_BU,
							oldP53_b_u, p53_b_u));
			}
		}
		return p53_b_u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public U_s basicGetP53_b_u() {
		return p53_b_u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setP53_b_u(U_s newP53_b_u) {
		U_s oldP53_b_u = p53_b_u;
		p53_b_u = newP53_b_u;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.P53__P53_BU, oldP53_b_u,
					p53_b_u));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UB4_s getP53_b_ub4() {
		if (p53_b_ub4 != null && p53_b_ub4.eIsProxy()) {
			InternalEObject oldP53_b_ub4 = (InternalEObject) p53_b_ub4;
			p53_b_ub4 = (UB4_s) eResolveProxy(oldP53_b_ub4);
			if (p53_b_ub4 != oldP53_b_ub4) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.P53__P53_BUB4,
							oldP53_b_ub4, p53_b_ub4));
			}
		}
		return p53_b_ub4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB4_s basicGetP53_b_ub4() {
		return p53_b_ub4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setP53_b_ub4(UB4_s newP53_b_ub4) {
		UB4_s oldP53_b_ub4 = p53_b_ub4;
		p53_b_ub4 = newP53_b_ub4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.P53__P53_BUB4, oldP53_b_ub4,
					p53_b_ub4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UB2_s getP53_b_ub2() {
		if (p53_b_ub2 != null && p53_b_ub2.eIsProxy()) {
			InternalEObject oldP53_b_ub2 = (InternalEObject) p53_b_ub2;
			p53_b_ub2 = (UB2_s) eResolveProxy(oldP53_b_ub2);
			if (p53_b_ub2 != oldP53_b_ub2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.P53__P53_BUB2,
							oldP53_b_ub2, p53_b_ub2));
			}
		}
		return p53_b_ub2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB2_s basicGetP53_b_ub2() {
		return p53_b_ub2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setP53_b_ub2(UB2_s newP53_b_ub2) {
		UB2_s oldP53_b_ub2 = p53_b_ub2;
		p53_b_ub2 = newP53_b_ub2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.P53__P53_BUB2, oldP53_b_ub2,
					p53_b_ub2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UB1_s getP53_b_ub1() {
		if (p53_b_ub1 != null && p53_b_ub1.eIsProxy()) {
			InternalEObject oldP53_b_ub1 = (InternalEObject) p53_b_ub1;
			p53_b_ub1 = (UB1_s) eResolveProxy(oldP53_b_ub1);
			if (p53_b_ub1 != oldP53_b_ub1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.P53__P53_BUB1,
							oldP53_b_ub1, p53_b_ub1));
			}
		}
		return p53_b_ub1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB1_s basicGetP53_b_ub1() {
		return p53_b_ub1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setP53_b_ub1(UB1_s newP53_b_ub1) {
		UB1_s oldP53_b_ub1 = p53_b_ub1;
		p53_b_ub1 = newP53_b_ub1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.P53__P53_BUB1, oldP53_b_ub1,
					p53_b_ub1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UB3_s getP53_b_ub3() {
		if (p53_b_ub3 != null && p53_b_ub3.eIsProxy()) {
			InternalEObject oldP53_b_ub3 = (InternalEObject) p53_b_ub3;
			p53_b_ub3 = (UB3_s) eResolveProxy(oldP53_b_ub3);
			if (p53_b_ub3 != oldP53_b_ub3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.P53__P53_BUB3,
							oldP53_b_ub3, p53_b_ub3));
			}
		}
		return p53_b_ub3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB3_s basicGetP53_b_ub3() {
		return p53_b_ub3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setP53_b_ub3(UB3_s newP53_b_ub3) {
		UB3_s oldP53_b_ub3 = p53_b_ub3;
		p53_b_ub3 = newP53_b_ub3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.P53__P53_BUB3, oldP53_b_ub3,
					p53_b_ub3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P_s getP53_b_p() {
		if (p53_b_p != null && p53_b_p.eIsProxy()) {
			InternalEObject oldP53_b_p = (InternalEObject) p53_b_p;
			p53_b_p = (P_s) eResolveProxy(oldP53_b_p);
			if (p53_b_p != oldP53_b_p) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.P53__P53_BP,
							oldP53_b_p, p53_b_p));
			}
		}
		return p53_b_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P_s basicGetP53_b_p() {
		return p53_b_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setP53_b_p(P_s newP53_b_p) {
		P_s oldP53_b_p = p53_b_p;
		p53_b_p = newP53_b_p;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.P53__P53_BP, oldP53_b_p,
					p53_b_p));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AlzheimerModelPackage.P53__P53_BMDM2_Z:
			if (resolve)
				return getP53_b_Mdm2_z();
			return basicGetP53_b_Mdm2_z();
		case AlzheimerModelPackage.P53__P53_BGSK_3B_X:
			if (resolve)
				return getP53_b_GSK3b_x();
			return basicGetP53_b_GSK3b_x();
		case AlzheimerModelPackage.P53__P53_BPROTEASOME_X:
			if (resolve)
				return getP53_b_Proteasome_x();
			return basicGetP53_b_Proteasome_x();
		case AlzheimerModelPackage.P53__P53_BU:
			if (resolve)
				return getP53_b_u();
			return basicGetP53_b_u();
		case AlzheimerModelPackage.P53__P53_BUB4:
			if (resolve)
				return getP53_b_ub4();
			return basicGetP53_b_ub4();
		case AlzheimerModelPackage.P53__P53_BUB2:
			if (resolve)
				return getP53_b_ub2();
			return basicGetP53_b_ub2();
		case AlzheimerModelPackage.P53__P53_BUB1:
			if (resolve)
				return getP53_b_ub1();
			return basicGetP53_b_ub1();
		case AlzheimerModelPackage.P53__P53_BUB3:
			if (resolve)
				return getP53_b_ub3();
			return basicGetP53_b_ub3();
		case AlzheimerModelPackage.P53__P53_BP:
			if (resolve)
				return getP53_b_p();
			return basicGetP53_b_p();
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
		case AlzheimerModelPackage.P53__P53_BMDM2_Z:
			setP53_b_Mdm2_z((Mdm2) newValue);
			return;
		case AlzheimerModelPackage.P53__P53_BGSK_3B_X:
			setP53_b_GSK3b_x((GSK3b) newValue);
			return;
		case AlzheimerModelPackage.P53__P53_BPROTEASOME_X:
			setP53_b_Proteasome_x((Proteasome) newValue);
			return;
		case AlzheimerModelPackage.P53__P53_BU:
			setP53_b_u((U_s) newValue);
			return;
		case AlzheimerModelPackage.P53__P53_BUB4:
			setP53_b_ub4((UB4_s) newValue);
			return;
		case AlzheimerModelPackage.P53__P53_BUB2:
			setP53_b_ub2((UB2_s) newValue);
			return;
		case AlzheimerModelPackage.P53__P53_BUB1:
			setP53_b_ub1((UB1_s) newValue);
			return;
		case AlzheimerModelPackage.P53__P53_BUB3:
			setP53_b_ub3((UB3_s) newValue);
			return;
		case AlzheimerModelPackage.P53__P53_BP:
			setP53_b_p((P_s) newValue);
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
		case AlzheimerModelPackage.P53__P53_BMDM2_Z:
			setP53_b_Mdm2_z((Mdm2) null);
			return;
		case AlzheimerModelPackage.P53__P53_BGSK_3B_X:
			setP53_b_GSK3b_x((GSK3b) null);
			return;
		case AlzheimerModelPackage.P53__P53_BPROTEASOME_X:
			setP53_b_Proteasome_x((Proteasome) null);
			return;
		case AlzheimerModelPackage.P53__P53_BU:
			setP53_b_u((U_s) null);
			return;
		case AlzheimerModelPackage.P53__P53_BUB4:
			setP53_b_ub4((UB4_s) null);
			return;
		case AlzheimerModelPackage.P53__P53_BUB2:
			setP53_b_ub2((UB2_s) null);
			return;
		case AlzheimerModelPackage.P53__P53_BUB1:
			setP53_b_ub1((UB1_s) null);
			return;
		case AlzheimerModelPackage.P53__P53_BUB3:
			setP53_b_ub3((UB3_s) null);
			return;
		case AlzheimerModelPackage.P53__P53_BP:
			setP53_b_p((P_s) null);
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
		case AlzheimerModelPackage.P53__P53_BMDM2_Z:
			return p53_b_Mdm2_z != null;
		case AlzheimerModelPackage.P53__P53_BGSK_3B_X:
			return p53_b_GSK3b_x != null;
		case AlzheimerModelPackage.P53__P53_BPROTEASOME_X:
			return p53_b_Proteasome_x != null;
		case AlzheimerModelPackage.P53__P53_BU:
			return p53_b_u != null;
		case AlzheimerModelPackage.P53__P53_BUB4:
			return p53_b_ub4 != null;
		case AlzheimerModelPackage.P53__P53_BUB2:
			return p53_b_ub2 != null;
		case AlzheimerModelPackage.P53__P53_BUB1:
			return p53_b_ub1 != null;
		case AlzheimerModelPackage.P53__P53_BUB3:
			return p53_b_ub3 != null;
		case AlzheimerModelPackage.P53__P53_BP:
			return p53_b_p != null;
		}
		return super.eIsSet(featureID);
	}

} //P53Impl
