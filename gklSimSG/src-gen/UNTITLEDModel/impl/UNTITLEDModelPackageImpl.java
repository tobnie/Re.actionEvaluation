/**
 */
package UNTITLEDModel.impl;

import UNTITLEDModel.P_s;
import UNTITLEDModel.UNTITLEDModelFactory;
import UNTITLEDModel.UNTITLEDModelPackage;
import UNTITLEDModel.U_s;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import reactionContainer.ReactionContainerPackage;

import reactionContainer.impl.ReactionContainerPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UNTITLEDModelPackageImpl extends EPackageImpl implements UNTITLEDModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass u_sEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p_sEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see UNTITLEDModel.UNTITLEDModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UNTITLEDModelPackageImpl() {
		super(eNS_URI, UNTITLEDModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UNTITLEDModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UNTITLEDModelPackage init() {
		if (isInited)
			return (UNTITLEDModelPackage) EPackage.Registry.INSTANCE.getEPackage(UNTITLEDModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUNTITLEDModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UNTITLEDModelPackageImpl theUNTITLEDModelPackage = registeredUNTITLEDModelPackage instanceof UNTITLEDModelPackageImpl
				? (UNTITLEDModelPackageImpl) registeredUNTITLEDModelPackage
				: new UNTITLEDModelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReactionContainerPackage.eNS_URI);
		ReactionContainerPackageImpl theReactionContainerPackage = (ReactionContainerPackageImpl) (registeredPackage instanceof ReactionContainerPackageImpl
				? registeredPackage
				: ReactionContainerPackage.eINSTANCE);

		// Create package meta-data objects
		theUNTITLEDModelPackage.createPackageContents();
		theReactionContainerPackage.createPackageContents();

		// Initialize created meta-data
		theUNTITLEDModelPackage.initializePackageContents();
		theReactionContainerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUNTITLEDModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UNTITLEDModelPackage.eNS_URI, theUNTITLEDModelPackage);
		return theUNTITLEDModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getP() {
		return pEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getP_P_a_T_x() {
		return (EReference) pEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getP_P_a_T_y() {
		return (EReference) pEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getT() {
		return tEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getT_T_x_K_a() {
		return (EReference) tEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getT_T_x_u() {
		return (EReference) tEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getT_T_x_p() {
		return (EReference) tEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getT_T_y_K_a() {
		return (EReference) tEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getT_T_y_u() {
		return (EReference) tEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getT_T_y_p() {
		return (EReference) tEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getK() {
		return kEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getU_s() {
		return u_sEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getP_s() {
		return p_sEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UNTITLEDModelFactory getUNTITLEDModelFactory() {
		return (UNTITLEDModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		pEClass = createEClass(P);
		createEReference(pEClass, P__PATX);
		createEReference(pEClass, P__PATY);

		tEClass = createEClass(T);
		createEReference(tEClass, T__TXKA);
		createEReference(tEClass, T__TXU);
		createEReference(tEClass, T__TXP);
		createEReference(tEClass, T__TYKA);
		createEReference(tEClass, T__TYU);
		createEReference(tEClass, T__TYP);

		kEClass = createEClass(K);

		u_sEClass = createEClass(US);

		p_sEClass = createEClass(PS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ReactionContainerPackage theReactionContainerPackage = (ReactionContainerPackage) EPackage.Registry.INSTANCE
				.getEPackage(ReactionContainerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		tEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		kEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		u_sEClass.getESuperTypes().add(theReactionContainerPackage.getState());
		p_sEClass.getESuperTypes().add(theReactionContainerPackage.getState());

		// Initialize classes, features, and operations; add parameters
		initEClass(pEClass, UNTITLEDModel.P.class, "P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getP_P_a_T_x(), this.getT(), null, "P_a_T_x", null, 0, 1, UNTITLEDModel.P.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getP_P_a_T_y(), this.getT(), null, "P_a_T_y", null, 0, 1, UNTITLEDModel.P.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(tEClass, UNTITLEDModel.T.class, "T", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_T_x_K_a(), this.getK(), null, "T_x_K_a", null, 0, 1, UNTITLEDModel.T.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getT_T_x_u(), this.getU_s(), null, "T_x_u", null, 0, 1, UNTITLEDModel.T.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getT_T_x_p(), this.getP_s(), null, "T_x_p", null, 0, 1, UNTITLEDModel.T.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getT_T_y_K_a(), this.getK(), null, "T_y_K_a", null, 0, 1, UNTITLEDModel.T.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getT_T_y_u(), this.getU_s(), null, "T_y_u", null, 0, 1, UNTITLEDModel.T.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getT_T_y_p(), this.getP_s(), null, "T_y_p", null, 0, 1, UNTITLEDModel.T.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(kEClass, UNTITLEDModel.K.class, "K", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(u_sEClass, U_s.class, "U_s", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(p_sEClass, P_s.class, "P_s", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //UNTITLEDModelPackageImpl
