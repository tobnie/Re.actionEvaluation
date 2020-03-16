/**
 */
package AlzheimerModel.impl;

import AlzheimerModel.*;

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
public class AlzheimerModelFactoryImpl extends EFactoryImpl implements AlzheimerModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AlzheimerModelFactory init() {
		try {
			AlzheimerModelFactory theAlzheimerModelFactory = (AlzheimerModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(AlzheimerModelPackage.eNS_URI);
			if (theAlzheimerModelFactory != null) {
				return theAlzheimerModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AlzheimerModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlzheimerModelFactoryImpl() {
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
		case AlzheimerModelPackage.P53:
			return createP53();
		case AlzheimerModelPackage.MDM2M_RNA:
			return createMdm2mRNA();
		case AlzheimerModelPackage.PROTEASOME:
			return createProteasome();
		case AlzheimerModelPackage.P53DUB:
			return createP53DUB();
		case AlzheimerModelPackage.AMP:
			return createAMP();
		case AlzheimerModelPackage.MT:
			return createMT();
		case AlzheimerModelPackage.TAU:
			return createTau();
		case AlzheimerModelPackage.MDM2:
			return createMdm2();
		case AlzheimerModelPackage.UB:
			return createUb();
		case AlzheimerModelPackage.E2:
			return createE2();
		case AlzheimerModelPackage.BASAL_ROS:
			return createBasalROS();
		case AlzheimerModelPackage.MDM2_DUB:
			return createMdm2DUB();
		case AlzheimerModelPackage.P5_3M_RNA:
			return createP53mRNA();
		case AlzheimerModelPackage.ATMI:
			return createATMI();
		case AlzheimerModelPackage.ATP:
			return createATP();
		case AlzheimerModelPackage.E1:
			return createE1();
		case AlzheimerModelPackage.GSK_3B:
			return createGSK3b();
		case AlzheimerModelPackage.ADP:
			return createADP();
		case AlzheimerModelPackage.PPT:
			return createPPT();
		case AlzheimerModelPackage.AGG_TAU:
			return createAggTau();
		case AlzheimerModelPackage.NFT:
			return createNFT();
		case AlzheimerModelPackage.ABETA:
			return createAbeta();
		case AlzheimerModelPackage.AGG_ABETA:
			return createAggAbeta();
		case AlzheimerModelPackage.ABETA_PLAQUE:
			return createAbetaPlaque();
		case AlzheimerModelPackage.DAM_DNA:
			return createDamDNA();
		case AlzheimerModelPackage.ATMA:
			return createATMA();
		case AlzheimerModelPackage.IR:
			return createIR();
		case AlzheimerModelPackage.ROS:
			return createROS();
		case AlzheimerModelPackage.US:
			return createU_s();
		case AlzheimerModelPackage.UB4_S:
			return createUB4_s();
		case AlzheimerModelPackage.UB2_S:
			return createUB2_s();
		case AlzheimerModelPackage.UB1_S:
			return createUB1_s();
		case AlzheimerModelPackage.UB3_S:
			return createUB3_s();
		case AlzheimerModelPackage.PS:
			return createP_s();
		case AlzheimerModelPackage.P1_S:
			return createP1_s();
		case AlzheimerModelPackage.P2_S:
			return createP2_s();
		case AlzheimerModelPackage.UNB_S:
			return createUNB_s();
		case AlzheimerModelPackage.UBI_S:
			return createUBI_s();
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
	public P53 createP53() {
		P53Impl p53 = new P53Impl();
		return p53;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mdm2mRNA createMdm2mRNA() {
		Mdm2mRNAImpl mdm2mRNA = new Mdm2mRNAImpl();
		return mdm2mRNA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Proteasome createProteasome() {
		ProteasomeImpl proteasome = new ProteasomeImpl();
		return proteasome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P53DUB createP53DUB() {
		P53DUBImpl p53DUB = new P53DUBImpl();
		return p53DUB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AMP createAMP() {
		AMPImpl amp = new AMPImpl();
		return amp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MT createMT() {
		MTImpl mt = new MTImpl();
		return mt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tau createTau() {
		TauImpl tau = new TauImpl();
		return tau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mdm2 createMdm2() {
		Mdm2Impl mdm2 = new Mdm2Impl();
		return mdm2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ub createUb() {
		UbImpl ub = new UbImpl();
		return ub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public E2 createE2() {
		E2Impl e2 = new E2Impl();
		return e2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasalROS createBasalROS() {
		BasalROSImpl basalROS = new BasalROSImpl();
		return basalROS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mdm2DUB createMdm2DUB() {
		Mdm2DUBImpl mdm2DUB = new Mdm2DUBImpl();
		return mdm2DUB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P53mRNA createP53mRNA() {
		P53mRNAImpl p53mRNA = new P53mRNAImpl();
		return p53mRNA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATMI createATMI() {
		ATMIImpl atmi = new ATMIImpl();
		return atmi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATP createATP() {
		ATPImpl atp = new ATPImpl();
		return atp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public E1 createE1() {
		E1Impl e1 = new E1Impl();
		return e1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GSK3b createGSK3b() {
		GSK3bImpl gsk3b = new GSK3bImpl();
		return gsk3b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ADP createADP() {
		ADPImpl adp = new ADPImpl();
		return adp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PPT createPPT() {
		PPTImpl ppt = new PPTImpl();
		return ppt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggTau createAggTau() {
		AggTauImpl aggTau = new AggTauImpl();
		return aggTau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NFT createNFT() {
		NFTImpl nft = new NFTImpl();
		return nft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abeta createAbeta() {
		AbetaImpl abeta = new AbetaImpl();
		return abeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggAbeta createAggAbeta() {
		AggAbetaImpl aggAbeta = new AggAbetaImpl();
		return aggAbeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbetaPlaque createAbetaPlaque() {
		AbetaPlaqueImpl abetaPlaque = new AbetaPlaqueImpl();
		return abetaPlaque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DamDNA createDamDNA() {
		DamDNAImpl damDNA = new DamDNAImpl();
		return damDNA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATMA createATMA() {
		ATMAImpl atma = new ATMAImpl();
		return atma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IR createIR() {
		IRImpl ir = new IRImpl();
		return ir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ROS createROS() {
		ROSImpl ros = new ROSImpl();
		return ros;
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
	public UB4_s createUB4_s() {
		UB4_sImpl ub4_s = new UB4_sImpl();
		return ub4_s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UB2_s createUB2_s() {
		UB2_sImpl ub2_s = new UB2_sImpl();
		return ub2_s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UB1_s createUB1_s() {
		UB1_sImpl ub1_s = new UB1_sImpl();
		return ub1_s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UB3_s createUB3_s() {
		UB3_sImpl ub3_s = new UB3_sImpl();
		return ub3_s;
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
	public P1_s createP1_s() {
		P1_sImpl p1_s = new P1_sImpl();
		return p1_s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P2_s createP2_s() {
		P2_sImpl p2_s = new P2_sImpl();
		return p2_s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UNB_s createUNB_s() {
		UNB_sImpl unB_s = new UNB_sImpl();
		return unB_s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UBI_s createUBI_s() {
		UBI_sImpl ubI_s = new UBI_sImpl();
		return ubI_s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlzheimerModelPackage getAlzheimerModelPackage() {
		return (AlzheimerModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AlzheimerModelPackage getPackage() {
		return AlzheimerModelPackage.eINSTANCE;
	}

} //AlzheimerModelFactoryImpl
