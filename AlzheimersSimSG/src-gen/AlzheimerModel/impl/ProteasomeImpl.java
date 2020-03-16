/**
 */
package AlzheimerModel.impl;

import AlzheimerModel.AggAbeta;
import AlzheimerModel.AggTau;
import AlzheimerModel.AlzheimerModelPackage;
import AlzheimerModel.Mdm2;
import AlzheimerModel.Proteasome;
import AlzheimerModel.Tau;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proteasome</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AlzheimerModel.impl.ProteasomeImpl#getProteasome_x_Tau_phos <em>Proteasome xTau phos</em>}</li>
 *   <li>{@link AlzheimerModel.impl.ProteasomeImpl#getProteasome_x_AggTau_y <em>Proteasome xAgg Tau y</em>}</li>
 *   <li>{@link AlzheimerModel.impl.ProteasomeImpl#getProteasome_x_AggAbeta_y <em>Proteasome xAgg Abeta y</em>}</li>
 *   <li>{@link AlzheimerModel.impl.ProteasomeImpl#getProteasome_x_Mdm2_ubi <em>Proteasome xMdm2 ubi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProteasomeImpl extends AgentImpl implements Proteasome {
	/**
	 * The cached value of the '{@link #getProteasome_x_Tau_phos() <em>Proteasome xTau phos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProteasome_x_Tau_phos()
	 * @generated
	 * @ordered
	 */
	protected Tau proteasome_x_Tau_phos;

	/**
	 * The cached value of the '{@link #getProteasome_x_AggTau_y() <em>Proteasome xAgg Tau y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProteasome_x_AggTau_y()
	 * @generated
	 * @ordered
	 */
	protected AggTau proteasome_x_AggTau_y;

	/**
	 * The cached value of the '{@link #getProteasome_x_AggAbeta_y() <em>Proteasome xAgg Abeta y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProteasome_x_AggAbeta_y()
	 * @generated
	 * @ordered
	 */
	protected AggAbeta proteasome_x_AggAbeta_y;

	/**
	 * The cached value of the '{@link #getProteasome_x_Mdm2_ubi() <em>Proteasome xMdm2 ubi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProteasome_x_Mdm2_ubi()
	 * @generated
	 * @ordered
	 */
	protected Mdm2 proteasome_x_Mdm2_ubi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProteasomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlzheimerModelPackage.Literals.PROTEASOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tau getProteasome_x_Tau_phos() {
		if (proteasome_x_Tau_phos != null && proteasome_x_Tau_phos.eIsProxy()) {
			InternalEObject oldProteasome_x_Tau_phos = (InternalEObject) proteasome_x_Tau_phos;
			proteasome_x_Tau_phos = (Tau) eResolveProxy(oldProteasome_x_Tau_phos);
			if (proteasome_x_Tau_phos != oldProteasome_x_Tau_phos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AlzheimerModelPackage.PROTEASOME__PROTEASOME_XTAU_PHOS, oldProteasome_x_Tau_phos,
							proteasome_x_Tau_phos));
			}
		}
		return proteasome_x_Tau_phos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tau basicGetProteasome_x_Tau_phos() {
		return proteasome_x_Tau_phos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProteasome_x_Tau_phos(Tau newProteasome_x_Tau_phos) {
		Tau oldProteasome_x_Tau_phos = proteasome_x_Tau_phos;
		proteasome_x_Tau_phos = newProteasome_x_Tau_phos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AlzheimerModelPackage.PROTEASOME__PROTEASOME_XTAU_PHOS, oldProteasome_x_Tau_phos,
					proteasome_x_Tau_phos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggTau getProteasome_x_AggTau_y() {
		if (proteasome_x_AggTau_y != null && proteasome_x_AggTau_y.eIsProxy()) {
			InternalEObject oldProteasome_x_AggTau_y = (InternalEObject) proteasome_x_AggTau_y;
			proteasome_x_AggTau_y = (AggTau) eResolveProxy(oldProteasome_x_AggTau_y);
			if (proteasome_x_AggTau_y != oldProteasome_x_AggTau_y) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AlzheimerModelPackage.PROTEASOME__PROTEASOME_XAGG_TAU_Y, oldProteasome_x_AggTau_y,
							proteasome_x_AggTau_y));
			}
		}
		return proteasome_x_AggTau_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggTau basicGetProteasome_x_AggTau_y() {
		return proteasome_x_AggTau_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProteasome_x_AggTau_y(AggTau newProteasome_x_AggTau_y) {
		AggTau oldProteasome_x_AggTau_y = proteasome_x_AggTau_y;
		proteasome_x_AggTau_y = newProteasome_x_AggTau_y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AlzheimerModelPackage.PROTEASOME__PROTEASOME_XAGG_TAU_Y, oldProteasome_x_AggTau_y,
					proteasome_x_AggTau_y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggAbeta getProteasome_x_AggAbeta_y() {
		if (proteasome_x_AggAbeta_y != null && proteasome_x_AggAbeta_y.eIsProxy()) {
			InternalEObject oldProteasome_x_AggAbeta_y = (InternalEObject) proteasome_x_AggAbeta_y;
			proteasome_x_AggAbeta_y = (AggAbeta) eResolveProxy(oldProteasome_x_AggAbeta_y);
			if (proteasome_x_AggAbeta_y != oldProteasome_x_AggAbeta_y) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AlzheimerModelPackage.PROTEASOME__PROTEASOME_XAGG_ABETA_Y, oldProteasome_x_AggAbeta_y,
							proteasome_x_AggAbeta_y));
			}
		}
		return proteasome_x_AggAbeta_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggAbeta basicGetProteasome_x_AggAbeta_y() {
		return proteasome_x_AggAbeta_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProteasome_x_AggAbeta_y(AggAbeta newProteasome_x_AggAbeta_y) {
		AggAbeta oldProteasome_x_AggAbeta_y = proteasome_x_AggAbeta_y;
		proteasome_x_AggAbeta_y = newProteasome_x_AggAbeta_y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AlzheimerModelPackage.PROTEASOME__PROTEASOME_XAGG_ABETA_Y, oldProteasome_x_AggAbeta_y,
					proteasome_x_AggAbeta_y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mdm2 getProteasome_x_Mdm2_ubi() {
		if (proteasome_x_Mdm2_ubi != null && proteasome_x_Mdm2_ubi.eIsProxy()) {
			InternalEObject oldProteasome_x_Mdm2_ubi = (InternalEObject) proteasome_x_Mdm2_ubi;
			proteasome_x_Mdm2_ubi = (Mdm2) eResolveProxy(oldProteasome_x_Mdm2_ubi);
			if (proteasome_x_Mdm2_ubi != oldProteasome_x_Mdm2_ubi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AlzheimerModelPackage.PROTEASOME__PROTEASOME_XMDM2_UBI, oldProteasome_x_Mdm2_ubi,
							proteasome_x_Mdm2_ubi));
			}
		}
		return proteasome_x_Mdm2_ubi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mdm2 basicGetProteasome_x_Mdm2_ubi() {
		return proteasome_x_Mdm2_ubi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProteasome_x_Mdm2_ubi(Mdm2 newProteasome_x_Mdm2_ubi) {
		Mdm2 oldProteasome_x_Mdm2_ubi = proteasome_x_Mdm2_ubi;
		proteasome_x_Mdm2_ubi = newProteasome_x_Mdm2_ubi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AlzheimerModelPackage.PROTEASOME__PROTEASOME_XMDM2_UBI, oldProteasome_x_Mdm2_ubi,
					proteasome_x_Mdm2_ubi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AlzheimerModelPackage.PROTEASOME__PROTEASOME_XTAU_PHOS:
			if (resolve)
				return getProteasome_x_Tau_phos();
			return basicGetProteasome_x_Tau_phos();
		case AlzheimerModelPackage.PROTEASOME__PROTEASOME_XAGG_TAU_Y:
			if (resolve)
				return getProteasome_x_AggTau_y();
			return basicGetProteasome_x_AggTau_y();
		case AlzheimerModelPackage.PROTEASOME__PROTEASOME_XAGG_ABETA_Y:
			if (resolve)
				return getProteasome_x_AggAbeta_y();
			return basicGetProteasome_x_AggAbeta_y();
		case AlzheimerModelPackage.PROTEASOME__PROTEASOME_XMDM2_UBI:
			if (resolve)
				return getProteasome_x_Mdm2_ubi();
			return basicGetProteasome_x_Mdm2_ubi();
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
		case AlzheimerModelPackage.PROTEASOME__PROTEASOME_XTAU_PHOS:
			setProteasome_x_Tau_phos((Tau) newValue);
			return;
		case AlzheimerModelPackage.PROTEASOME__PROTEASOME_XAGG_TAU_Y:
			setProteasome_x_AggTau_y((AggTau) newValue);
			return;
		case AlzheimerModelPackage.PROTEASOME__PROTEASOME_XAGG_ABETA_Y:
			setProteasome_x_AggAbeta_y((AggAbeta) newValue);
			return;
		case AlzheimerModelPackage.PROTEASOME__PROTEASOME_XMDM2_UBI:
			setProteasome_x_Mdm2_ubi((Mdm2) newValue);
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
		case AlzheimerModelPackage.PROTEASOME__PROTEASOME_XTAU_PHOS:
			setProteasome_x_Tau_phos((Tau) null);
			return;
		case AlzheimerModelPackage.PROTEASOME__PROTEASOME_XAGG_TAU_Y:
			setProteasome_x_AggTau_y((AggTau) null);
			return;
		case AlzheimerModelPackage.PROTEASOME__PROTEASOME_XAGG_ABETA_Y:
			setProteasome_x_AggAbeta_y((AggAbeta) null);
			return;
		case AlzheimerModelPackage.PROTEASOME__PROTEASOME_XMDM2_UBI:
			setProteasome_x_Mdm2_ubi((Mdm2) null);
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
		case AlzheimerModelPackage.PROTEASOME__PROTEASOME_XTAU_PHOS:
			return proteasome_x_Tau_phos != null;
		case AlzheimerModelPackage.PROTEASOME__PROTEASOME_XAGG_TAU_Y:
			return proteasome_x_AggTau_y != null;
		case AlzheimerModelPackage.PROTEASOME__PROTEASOME_XAGG_ABETA_Y:
			return proteasome_x_AggAbeta_y != null;
		case AlzheimerModelPackage.PROTEASOME__PROTEASOME_XMDM2_UBI:
			return proteasome_x_Mdm2_ubi != null;
		}
		return super.eIsSet(featureID);
	}

} //ProteasomeImpl
