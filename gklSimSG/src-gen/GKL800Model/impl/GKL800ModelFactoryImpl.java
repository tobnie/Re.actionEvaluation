/**
 */
package GKL800Model.impl;

import GKL800Model.*;

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
public class GKL800ModelFactoryImpl extends EFactoryImpl implements GKL800ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GKL800ModelFactory init() {
		try {
			GKL800ModelFactory theGKL800ModelFactory = (GKL800ModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(GKL800ModelPackage.eNS_URI);
			if (theGKL800ModelFactory != null) {
				return theGKL800ModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GKL800ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GKL800ModelFactoryImpl() {
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
		case GKL800ModelPackage.P:
			return createP();
		case GKL800ModelPackage.T:
			return createT();
		case GKL800ModelPackage.K:
			return createK();
		case GKL800ModelPackage.US:
			return createU_s();
		case GKL800ModelPackage.PS:
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
	public GKL800ModelPackage getGKL800ModelPackage() {
		return (GKL800ModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GKL800ModelPackage getPackage() {
		return GKL800ModelPackage.eINSTANCE;
	}

} //GKL800ModelFactoryImpl
