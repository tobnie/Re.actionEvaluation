/**
 */
package UNTITLEDModel.impl;

import UNTITLEDModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UNTITLEDModelFactoryImpl extends EFactoryImpl implements UNTITLEDModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UNTITLEDModelFactory init() {
		try {
			UNTITLEDModelFactory theUNTITLEDModelFactory = (UNTITLEDModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(UNTITLEDModelPackage.eNS_URI);
			if (theUNTITLEDModelFactory != null) {
				return theUNTITLEDModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UNTITLEDModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UNTITLEDModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case UNTITLEDModelPackage.P:
			return createP();
		case UNTITLEDModelPackage.T:
			return createT();
		case UNTITLEDModelPackage.K:
			return createK();
		case UNTITLEDModelPackage.US:
			return createU_s();
		case UNTITLEDModelPackage.PS:
			return createP_s();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P createP() {
		PImpl p = new PImpl();
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public T createT() {
		TImpl t = new TImpl();
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public K createK() {
		KImpl k = new KImpl();
		return k;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public U_s createU_s() {
		U_sImpl u_s = new U_sImpl();
		return u_s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P_s createP_s() {
		P_sImpl p_s = new P_sImpl();
		return p_s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UNTITLEDModelPackage getUNTITLEDModelPackage() {
		return (UNTITLEDModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UNTITLEDModelPackage getPackage() {
		return UNTITLEDModelPackage.eINSTANCE;
	}

} //UNTITLEDModelFactoryImpl
