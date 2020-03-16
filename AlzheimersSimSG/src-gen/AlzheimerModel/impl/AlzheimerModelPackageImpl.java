/**
 */
package AlzheimerModel.impl;

import AlzheimerModel.Abeta;
import AlzheimerModel.AbetaPlaque;
import AlzheimerModel.AggAbeta;
import AlzheimerModel.AggTau;
import AlzheimerModel.AlzheimerModelFactory;
import AlzheimerModel.AlzheimerModelPackage;
import AlzheimerModel.BasalROS;
import AlzheimerModel.DamDNA;
import AlzheimerModel.GSK3b;
import AlzheimerModel.Mdm2;
import AlzheimerModel.Mdm2DUB;
import AlzheimerModel.Mdm2mRNA;
import AlzheimerModel.P1_s;
import AlzheimerModel.P2_s;
import AlzheimerModel.P53mRNA;
import AlzheimerModel.P_s;
import AlzheimerModel.Proteasome;
import AlzheimerModel.Tau;
import AlzheimerModel.UB1_s;
import AlzheimerModel.UB2_s;
import AlzheimerModel.UB3_s;
import AlzheimerModel.UB4_s;
import AlzheimerModel.UBI_s;
import AlzheimerModel.UNB_s;
import AlzheimerModel.U_s;
import AlzheimerModel.Ub;

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
public class AlzheimerModelPackageImpl extends EPackageImpl implements AlzheimerModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p53EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdm2mRNAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proteasomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p53DUBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdm2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass e2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basalROSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdm2DUBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p53mRNAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atmiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass e1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsk3bEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggTauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggAbetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abetaPlaqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass damDNAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atmaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass irEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosEClass = null;

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
	private EClass ub4_sEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ub2_sEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ub1_sEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ub3_sEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p_sEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p1_sEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p2_sEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unB_sEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ubI_sEClass = null;

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
	 * @see AlzheimerModel.AlzheimerModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AlzheimerModelPackageImpl() {
		super(eNS_URI, AlzheimerModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AlzheimerModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AlzheimerModelPackage init() {
		if (isInited)
			return (AlzheimerModelPackage) EPackage.Registry.INSTANCE.getEPackage(AlzheimerModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAlzheimerModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AlzheimerModelPackageImpl theAlzheimerModelPackage = registeredAlzheimerModelPackage instanceof AlzheimerModelPackageImpl
				? (AlzheimerModelPackageImpl) registeredAlzheimerModelPackage
				: new AlzheimerModelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReactionContainerPackage.eNS_URI);
		ReactionContainerPackageImpl theReactionContainerPackage = (ReactionContainerPackageImpl) (registeredPackage instanceof ReactionContainerPackageImpl
				? registeredPackage
				: ReactionContainerPackage.eINSTANCE);

		// Create package meta-data objects
		theAlzheimerModelPackage.createPackageContents();
		theReactionContainerPackage.createPackageContents();

		// Initialize created meta-data
		theAlzheimerModelPackage.initializePackageContents();
		theReactionContainerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAlzheimerModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AlzheimerModelPackage.eNS_URI, theAlzheimerModelPackage);
		return theAlzheimerModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getP53() {
		return p53EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getP53_P53_b_Mdm2_z() {
		return (EReference) p53EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getP53_P53_b_GSK3b_x() {
		return (EReference) p53EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getP53_P53_b_Proteasome_x() {
		return (EReference) p53EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getP53_P53_b_u() {
		return (EReference) p53EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getP53_P53_b_ub4() {
		return (EReference) p53EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getP53_P53_b_ub2() {
		return (EReference) p53EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getP53_P53_b_ub1() {
		return (EReference) p53EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getP53_P53_b_ub3() {
		return (EReference) p53EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getP53_P53_b_p() {
		return (EReference) p53EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMdm2mRNA() {
		return mdm2mRNAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProteasome() {
		return proteasomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProteasome_Proteasome_x_Tau_phos() {
		return (EReference) proteasomeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProteasome_Proteasome_x_AggTau_y() {
		return (EReference) proteasomeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProteasome_Proteasome_x_AggAbeta_y() {
		return (EReference) proteasomeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProteasome_Proteasome_x_Mdm2_ubi() {
		return (EReference) proteasomeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getP53DUB() {
		return p53DUBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAMP() {
		return ampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMT() {
		return mtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMT_MT_l_Tau_phos() {
		return (EReference) mtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTau() {
		return tauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTau_Tau_phos_u() {
		return (EReference) tauEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTau_Tau_phos_p1() {
		return (EReference) tauEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTau_Tau_phos_p2() {
		return (EReference) tauEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMdm2() {
		return mdm2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMdm2_Mdm2_z_u() {
		return (EReference) mdm2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMdm2_Mdm2_z_p() {
		return (EReference) mdm2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMdm2_Mdm2_ubi_unb() {
		return (EReference) mdm2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMdm2_Mdm2_ubi_ub1() {
		return (EReference) mdm2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMdm2_Mdm2_ubi_ub2() {
		return (EReference) mdm2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMdm2_Mdm2_ubi_ub3() {
		return (EReference) mdm2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMdm2_Mdm2_ubi_ub4() {
		return (EReference) mdm2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUb() {
		return ubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getE2() {
		return e2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getE2_E2_x_unb() {
		return (EReference) e2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getE2_E2_x_ubi() {
		return (EReference) e2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasalROS() {
		return basalROSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMdm2DUB() {
		return mdm2DUBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getP53mRNA() {
		return p53mRNAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getATMI() {
		return atmiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getATP() {
		return atpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getE1() {
		return e1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getE1_E1_x_unb() {
		return (EReference) e1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getE1_E1_x_ubi() {
		return (EReference) e1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGSK3b() {
		return gsk3bEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getADP() {
		return adpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPPT() {
		return pptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAggTau() {
		return aggTauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNFT() {
		return nftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbeta() {
		return abetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAggAbeta() {
		return aggAbetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbetaPlaque() {
		return abetaPlaqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDamDNA() {
		return damDNAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getATMA() {
		return atmaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIR() {
		return irEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getROS() {
		return rosEClass;
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
	public EClass getUB4_s() {
		return ub4_sEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUB2_s() {
		return ub2_sEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUB1_s() {
		return ub1_sEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUB3_s() {
		return ub3_sEClass;
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
	public EClass getP1_s() {
		return p1_sEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getP2_s() {
		return p2_sEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUNB_s() {
		return unB_sEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUBI_s() {
		return ubI_sEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlzheimerModelFactory getAlzheimerModelFactory() {
		return (AlzheimerModelFactory) getEFactoryInstance();
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
		p53EClass = createEClass(P53);
		createEReference(p53EClass, P53__P53_BMDM2_Z);
		createEReference(p53EClass, P53__P53_BGSK_3B_X);
		createEReference(p53EClass, P53__P53_BPROTEASOME_X);
		createEReference(p53EClass, P53__P53_BU);
		createEReference(p53EClass, P53__P53_BUB4);
		createEReference(p53EClass, P53__P53_BUB2);
		createEReference(p53EClass, P53__P53_BUB1);
		createEReference(p53EClass, P53__P53_BUB3);
		createEReference(p53EClass, P53__P53_BP);

		mdm2mRNAEClass = createEClass(MDM2M_RNA);

		proteasomeEClass = createEClass(PROTEASOME);
		createEReference(proteasomeEClass, PROTEASOME__PROTEASOME_XTAU_PHOS);
		createEReference(proteasomeEClass, PROTEASOME__PROTEASOME_XAGG_TAU_Y);
		createEReference(proteasomeEClass, PROTEASOME__PROTEASOME_XAGG_ABETA_Y);
		createEReference(proteasomeEClass, PROTEASOME__PROTEASOME_XMDM2_UBI);

		p53DUBEClass = createEClass(P53DUB);

		ampEClass = createEClass(AMP);

		mtEClass = createEClass(MT);
		createEReference(mtEClass, MT__MT_LTAU_PHOS);

		tauEClass = createEClass(TAU);
		createEReference(tauEClass, TAU__TAU_PHOS_U);
		createEReference(tauEClass, TAU__TAU_PHOS_P1);
		createEReference(tauEClass, TAU__TAU_PHOS_P2);

		mdm2EClass = createEClass(MDM2);
		createEReference(mdm2EClass, MDM2__MDM2_ZU);
		createEReference(mdm2EClass, MDM2__MDM2_ZP);
		createEReference(mdm2EClass, MDM2__MDM2_UBI_UNB);
		createEReference(mdm2EClass, MDM2__MDM2_UBI_UB1);
		createEReference(mdm2EClass, MDM2__MDM2_UBI_UB2);
		createEReference(mdm2EClass, MDM2__MDM2_UBI_UB3);
		createEReference(mdm2EClass, MDM2__MDM2_UBI_UB4);

		ubEClass = createEClass(UB);

		e2EClass = createEClass(E2);
		createEReference(e2EClass, E2__E2_XUNB);
		createEReference(e2EClass, E2__E2_XUBI);

		basalROSEClass = createEClass(BASAL_ROS);

		mdm2DUBEClass = createEClass(MDM2_DUB);

		p53mRNAEClass = createEClass(P5_3M_RNA);

		atmiEClass = createEClass(ATMI);

		atpEClass = createEClass(ATP);

		e1EClass = createEClass(E1);
		createEReference(e1EClass, E1__E1_XUNB);
		createEReference(e1EClass, E1__E1_XUBI);

		gsk3bEClass = createEClass(GSK_3B);

		adpEClass = createEClass(ADP);

		pptEClass = createEClass(PPT);

		aggTauEClass = createEClass(AGG_TAU);

		nftEClass = createEClass(NFT);

		abetaEClass = createEClass(ABETA);

		aggAbetaEClass = createEClass(AGG_ABETA);

		abetaPlaqueEClass = createEClass(ABETA_PLAQUE);

		damDNAEClass = createEClass(DAM_DNA);

		atmaEClass = createEClass(ATMA);

		irEClass = createEClass(IR);

		rosEClass = createEClass(ROS);

		u_sEClass = createEClass(US);

		ub4_sEClass = createEClass(UB4_S);

		ub2_sEClass = createEClass(UB2_S);

		ub1_sEClass = createEClass(UB1_S);

		ub3_sEClass = createEClass(UB3_S);

		p_sEClass = createEClass(PS);

		p1_sEClass = createEClass(P1_S);

		p2_sEClass = createEClass(P2_S);

		unB_sEClass = createEClass(UNB_S);

		ubI_sEClass = createEClass(UBI_S);
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
		p53EClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		mdm2mRNAEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		proteasomeEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		p53DUBEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		ampEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		mtEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		tauEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		mdm2EClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		ubEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		e2EClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		basalROSEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		mdm2DUBEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		p53mRNAEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		atmiEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		atpEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		e1EClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		gsk3bEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		adpEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		pptEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		aggTauEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		nftEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		abetaEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		aggAbetaEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		abetaPlaqueEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		damDNAEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		atmaEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		irEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		rosEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		u_sEClass.getESuperTypes().add(theReactionContainerPackage.getState());
		ub4_sEClass.getESuperTypes().add(theReactionContainerPackage.getState());
		ub2_sEClass.getESuperTypes().add(theReactionContainerPackage.getState());
		ub1_sEClass.getESuperTypes().add(theReactionContainerPackage.getState());
		ub3_sEClass.getESuperTypes().add(theReactionContainerPackage.getState());
		p_sEClass.getESuperTypes().add(theReactionContainerPackage.getState());
		p1_sEClass.getESuperTypes().add(theReactionContainerPackage.getState());
		p2_sEClass.getESuperTypes().add(theReactionContainerPackage.getState());
		unB_sEClass.getESuperTypes().add(theReactionContainerPackage.getState());
		ubI_sEClass.getESuperTypes().add(theReactionContainerPackage.getState());

		// Initialize classes, features, and operations; add parameters
		initEClass(p53EClass, AlzheimerModel.P53.class, "P53", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getP53_P53_b_Mdm2_z(), this.getMdm2(), null, "P53_b_Mdm2_z", null, 0, 1,
				AlzheimerModel.P53.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getP53_P53_b_GSK3b_x(), this.getGSK3b(), null, "P53_b_GSK3b_x", null, 0, 1,
				AlzheimerModel.P53.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getP53_P53_b_Proteasome_x(), this.getProteasome(), null, "P53_b_Proteasome_x", null, 0, 1,
				AlzheimerModel.P53.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getP53_P53_b_u(), this.getU_s(), null, "P53_b_u", null, 0, 1, AlzheimerModel.P53.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getP53_P53_b_ub4(), this.getUB4_s(), null, "P53_b_ub4", null, 0, 1, AlzheimerModel.P53.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getP53_P53_b_ub2(), this.getUB2_s(), null, "P53_b_ub2", null, 0, 1, AlzheimerModel.P53.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getP53_P53_b_ub1(), this.getUB1_s(), null, "P53_b_ub1", null, 0, 1, AlzheimerModel.P53.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getP53_P53_b_ub3(), this.getUB3_s(), null, "P53_b_ub3", null, 0, 1, AlzheimerModel.P53.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getP53_P53_b_p(), this.getP_s(), null, "P53_b_p", null, 0, 1, AlzheimerModel.P53.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mdm2mRNAEClass, Mdm2mRNA.class, "Mdm2mRNA", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(proteasomeEClass, Proteasome.class, "Proteasome", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProteasome_Proteasome_x_Tau_phos(), this.getTau(), null, "Proteasome_x_Tau_phos", null, 0, 1,
				Proteasome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProteasome_Proteasome_x_AggTau_y(), this.getAggTau(), null, "Proteasome_x_AggTau_y", null, 0,
				1, Proteasome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProteasome_Proteasome_x_AggAbeta_y(), this.getAggAbeta(), null, "Proteasome_x_AggAbeta_y",
				null, 0, 1, Proteasome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProteasome_Proteasome_x_Mdm2_ubi(), this.getMdm2(), null, "Proteasome_x_Mdm2_ubi", null, 0, 1,
				Proteasome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(p53DUBEClass, AlzheimerModel.P53DUB.class, "P53DUB", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ampEClass, AlzheimerModel.AMP.class, "AMP", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mtEClass, AlzheimerModel.MT.class, "MT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMT_MT_l_Tau_phos(), this.getTau(), null, "MT_l_Tau_phos", null, 0, 1, AlzheimerModel.MT.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tauEClass, Tau.class, "Tau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTau_Tau_phos_u(), this.getU_s(), null, "Tau_phos_u", null, 0, 1, Tau.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTau_Tau_phos_p1(), this.getP1_s(), null, "Tau_phos_p1", null, 0, 1, Tau.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTau_Tau_phos_p2(), this.getP2_s(), null, "Tau_phos_p2", null, 0, 1, Tau.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(mdm2EClass, Mdm2.class, "Mdm2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMdm2_Mdm2_z_u(), this.getU_s(), null, "Mdm2_z_u", null, 0, 1, Mdm2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMdm2_Mdm2_z_p(), this.getP_s(), null, "Mdm2_z_p", null, 0, 1, Mdm2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMdm2_Mdm2_ubi_unb(), this.getUNB_s(), null, "Mdm2_ubi_unb", null, 0, 1, Mdm2.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMdm2_Mdm2_ubi_ub1(), this.getUB1_s(), null, "Mdm2_ubi_ub1", null, 0, 1, Mdm2.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMdm2_Mdm2_ubi_ub2(), this.getUB2_s(), null, "Mdm2_ubi_ub2", null, 0, 1, Mdm2.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMdm2_Mdm2_ubi_ub3(), this.getUB3_s(), null, "Mdm2_ubi_ub3", null, 0, 1, Mdm2.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMdm2_Mdm2_ubi_ub4(), this.getUB4_s(), null, "Mdm2_ubi_ub4", null, 0, 1, Mdm2.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ubEClass, Ub.class, "Ub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(e2EClass, AlzheimerModel.E2.class, "E2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getE2_E2_x_unb(), this.getUNB_s(), null, "E2_x_unb", null, 0, 1, AlzheimerModel.E2.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getE2_E2_x_ubi(), this.getUBI_s(), null, "E2_x_ubi", null, 0, 1, AlzheimerModel.E2.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basalROSEClass, BasalROS.class, "BasalROS", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mdm2DUBEClass, Mdm2DUB.class, "Mdm2DUB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(p53mRNAEClass, P53mRNA.class, "P53mRNA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atmiEClass, AlzheimerModel.ATMI.class, "ATMI", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(atpEClass, AlzheimerModel.ATP.class, "ATP", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(e1EClass, AlzheimerModel.E1.class, "E1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getE1_E1_x_unb(), this.getUNB_s(), null, "E1_x_unb", null, 0, 1, AlzheimerModel.E1.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getE1_E1_x_ubi(), this.getUBI_s(), null, "E1_x_ubi", null, 0, 1, AlzheimerModel.E1.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gsk3bEClass, GSK3b.class, "GSK3b", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adpEClass, AlzheimerModel.ADP.class, "ADP", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(pptEClass, AlzheimerModel.PPT.class, "PPT", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggTauEClass, AggTau.class, "AggTau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nftEClass, AlzheimerModel.NFT.class, "NFT", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(abetaEClass, Abeta.class, "Abeta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggAbetaEClass, AggAbeta.class, "AggAbeta", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(abetaPlaqueEClass, AbetaPlaque.class, "AbetaPlaque", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(damDNAEClass, DamDNA.class, "DamDNA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atmaEClass, AlzheimerModel.ATMA.class, "ATMA", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(irEClass, AlzheimerModel.IR.class, "IR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rosEClass, AlzheimerModel.ROS.class, "ROS", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(u_sEClass, U_s.class, "U_s", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ub4_sEClass, UB4_s.class, "UB4_s", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ub2_sEClass, UB2_s.class, "UB2_s", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ub1_sEClass, UB1_s.class, "UB1_s", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ub3_sEClass, UB3_s.class, "UB3_s", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(p_sEClass, P_s.class, "P_s", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(p1_sEClass, P1_s.class, "P1_s", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(p2_sEClass, P2_s.class, "P2_s", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unB_sEClass, UNB_s.class, "UNB_s", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ubI_sEClass, UBI_s.class, "UBI_s", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AlzheimerModelPackageImpl
