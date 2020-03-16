/**
 */
package AlzheimerModel.impl;

import AlzheimerModel.AlzheimerModelPackage;
import AlzheimerModel.MT;
import AlzheimerModel.Tau;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AlzheimerModel.impl.MTImpl#getMT_l_Tau_phos <em>MT lTau phos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MTImpl extends AgentImpl implements MT {
	/**
	 * The cached value of the '{@link #getMT_l_Tau_phos() <em>MT lTau phos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMT_l_Tau_phos()
	 * @generated
	 * @ordered
	 */
	protected Tau mT_l_Tau_phos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlzheimerModelPackage.Literals.MT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tau getMT_l_Tau_phos() {
		if (mT_l_Tau_phos != null && mT_l_Tau_phos.eIsProxy()) {
			InternalEObject oldMT_l_Tau_phos = (InternalEObject) mT_l_Tau_phos;
			mT_l_Tau_phos = (Tau) eResolveProxy(oldMT_l_Tau_phos);
			if (mT_l_Tau_phos != oldMT_l_Tau_phos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlzheimerModelPackage.MT__MT_LTAU_PHOS,
							oldMT_l_Tau_phos, mT_l_Tau_phos));
			}
		}
		return mT_l_Tau_phos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tau basicGetMT_l_Tau_phos() {
		return mT_l_Tau_phos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMT_l_Tau_phos(Tau newMT_l_Tau_phos) {
		Tau oldMT_l_Tau_phos = mT_l_Tau_phos;
		mT_l_Tau_phos = newMT_l_Tau_phos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlzheimerModelPackage.MT__MT_LTAU_PHOS,
					oldMT_l_Tau_phos, mT_l_Tau_phos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AlzheimerModelPackage.MT__MT_LTAU_PHOS:
			if (resolve)
				return getMT_l_Tau_phos();
			return basicGetMT_l_Tau_phos();
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
		case AlzheimerModelPackage.MT__MT_LTAU_PHOS:
			setMT_l_Tau_phos((Tau) newValue);
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
		case AlzheimerModelPackage.MT__MT_LTAU_PHOS:
			setMT_l_Tau_phos((Tau) null);
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
		case AlzheimerModelPackage.MT__MT_LTAU_PHOS:
			return mT_l_Tau_phos != null;
		}
		return super.eIsSet(featureID);
	}

} //MTImpl
