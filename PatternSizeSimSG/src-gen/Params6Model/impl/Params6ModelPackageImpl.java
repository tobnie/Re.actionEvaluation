/**
 */
package Params6Model.impl;

import Params6Model.Params6ModelFactory;
import Params6Model.Params6ModelPackage;

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
public class Params6ModelPackageImpl extends EPackageImpl implements Params6ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zEClass = null;

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
	 * @see Params6Model.Params6ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Params6ModelPackageImpl() {
		super(eNS_URI, Params6ModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Params6ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Params6ModelPackage init() {
		if (isInited)
			return (Params6ModelPackage) EPackage.Registry.INSTANCE.getEPackage(Params6ModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredParams6ModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Params6ModelPackageImpl theParams6ModelPackage = registeredParams6ModelPackage instanceof Params6ModelPackageImpl
				? (Params6ModelPackageImpl) registeredParams6ModelPackage
				: new Params6ModelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReactionContainerPackage.eNS_URI);
		ReactionContainerPackageImpl theReactionContainerPackage = (ReactionContainerPackageImpl) (registeredPackage instanceof ReactionContainerPackageImpl
				? registeredPackage
				: ReactionContainerPackage.eINSTANCE);

		// Create package meta-data objects
		theParams6ModelPackage.createPackageContents();
		theReactionContainerPackage.createPackageContents();

		// Initialize created meta-data
		theParams6ModelPackage.initializePackageContents();
		theReactionContainerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theParams6ModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Params6ModelPackage.eNS_URI, theParams6ModelPackage);
		return theParams6ModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getU() {
		return uEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getU_U_a_V_a() {
		return (EReference) uEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getV() {
		return vEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getW() {
		return wEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_W_a_X_a() {
		return (EReference) wEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getX() {
		return xEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getY() {
		return yEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getY_Y_a_Z_a() {
		return (EReference) yEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZ() {
		return zEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Params6ModelFactory getParams6ModelFactory() {
		return (Params6ModelFactory) getEFactoryInstance();
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
		uEClass = createEClass(U);
		createEReference(uEClass, U__UAVA);

		vEClass = createEClass(V);

		wEClass = createEClass(W);
		createEReference(wEClass, W__WAXA);

		xEClass = createEClass(X);

		yEClass = createEClass(Y);
		createEReference(yEClass, Y__YAZA);

		zEClass = createEClass(Z);
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
		uEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		vEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		wEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		xEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		yEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		zEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());

		// Initialize classes, features, and operations; add parameters
		initEClass(uEClass, Params6Model.U.class, "U", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getU_U_a_V_a(), this.getV(), null, "U_a_V_a", null, 0, 1, Params6Model.U.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(vEClass, Params6Model.V.class, "V", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wEClass, Params6Model.W.class, "W", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getW_W_a_X_a(), this.getX(), null, "W_a_X_a", null, 0, 1, Params6Model.W.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(xEClass, Params6Model.X.class, "X", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yEClass, Params6Model.Y.class, "Y", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getY_Y_a_Z_a(), this.getZ(), null, "Y_a_Z_a", null, 0, 1, Params6Model.Y.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(zEClass, Params6Model.Z.class, "Z", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Params6ModelPackageImpl
