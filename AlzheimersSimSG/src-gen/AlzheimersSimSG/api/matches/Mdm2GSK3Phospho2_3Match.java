package AlzheimersSimSG.api.matches;

import AlzheimerModel.GSK3b;
import AlzheimerModel.Mdm2;
import AlzheimerModel.P53;
import AlzheimerModel.P_s;
import AlzheimerModel.U_s;
import AlzheimerModel.UB4_s;
import AlzheimersSimSG.api.rules.Mdm2GSK3Phospho2_3Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>Mdm2GSK3Phospho2_3()</code>.
 */
public class Mdm2GSK3Phospho2_3Match extends GraphTransformationMatch<Mdm2GSK3Phospho2_3Match, Mdm2GSK3Phospho2_3Rule> {
	private P53 varP53_2;
	private GSK3b varGsk;
	private P53 varP53_1;
	private Mdm2 varMdm2;
	private UB4_s varUb4s;
	private U_s varUs;
	private P_s varPs;

	/**
	 * Creates a new match for the rule <code>Mdm2GSK3Phospho2_3()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Mdm2GSK3Phospho2_3Match(final Mdm2GSK3Phospho2_3Rule pattern, final IMatch match) {
		super(pattern, match);
		varP53_2 = (P53) match.get("p53_2");
		varGsk = (GSK3b) match.get("gsk");
		varP53_1 = (P53) match.get("p53_1");
		varMdm2 = (Mdm2) match.get("mdm2");
		varUb4s = (UB4_s) match.get("ub4s");
		varUs = (U_s) match.get("us");
		varPs = (P_s) match.get("ps");
	}

	/**
	 * Returns the p53_2.
	 *
	 * @return the p53_2
	 */
	public P53 getP53_2() {
		return varP53_2;
	}

	/**
	 * Returns the gsk.
	 *
	 * @return the gsk
	 */
	public GSK3b getGsk() {
		return varGsk;
	}

	/**
	 * Returns the p53_1.
	 *
	 * @return the p53_1
	 */
	public P53 getP53_1() {
		return varP53_1;
	}

	/**
	 * Returns the mdm2.
	 *
	 * @return the mdm2
	 */
	public Mdm2 getMdm2() {
		return varMdm2;
	}

	/**
	 * Returns the ub4s.
	 *
	 * @return the ub4s
	 */
	public UB4_s getUb4s() {
		return varUb4s;
	}

	/**
	 * Returns the us.
	 *
	 * @return the us
	 */
	public U_s getUs() {
		return varUs;
	}

	/**
	 * Returns the ps.
	 *
	 * @return the ps
	 */
	public P_s getPs() {
		return varPs;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	p53_2 --> " + varP53_2 + System.lineSeparator();
		s += "	gsk --> " + varGsk + System.lineSeparator();
		s += "	p53_1 --> " + varP53_1 + System.lineSeparator();
		s += "	mdm2 --> " + varMdm2 + System.lineSeparator();
		s += "	ub4s --> " + varUb4s + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
