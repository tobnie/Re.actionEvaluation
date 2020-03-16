/**
 */
package GKL1600Model.impl;

import GKL1600Model.*;

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
public class GKL1600ModelFactoryImpl extends EFactoryImpl implements GKL1600ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GKL1600ModelFactory init() {
		try {
			GKL1600ModelFactory theGKL1600ModelFactory = (GKL1600ModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(GKL1600ModelPackage.eNS_URI);
			if (theGKL1600ModelFactory != null) {
				return theGKL1600ModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GKL1600ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GKL1600ModelFactoryImpl() {
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
		case GKL1600ModelPackage.P:
			return createP();
		case GKL1600ModelPackage.T:
			return createT();
		case GKL1600ModelPackage.K:
			return createK();
		case GKL1600ModelPackage.US:
			return createU_s();
		case GKL1600ModelPackage.PS:
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
	public GKL1600ModelPackage getGKL1600ModelPackage() {
		return (GKL1600ModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GKL1600ModelPackage getPackage() {
		return GKL1600ModelPackage.eINSTANCE;
	}

} //GKL1600ModelFactoryImpl
