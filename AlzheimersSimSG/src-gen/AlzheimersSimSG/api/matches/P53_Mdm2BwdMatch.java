package AlzheimersSimSG.api.matches;

import AlzheimerModel.Mdm2;
import AlzheimerModel.P53;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.rules.P53_Mdm2BwdRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>P53_Mdm2Bwd()</code>.
 */
public class P53_Mdm2BwdMatch extends GraphTransformationMatch<P53_Mdm2BwdMatch, P53_Mdm2BwdRule> {
	private P53 varP53;
	private Mdm2 varMdm2;
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>P53_Mdm2Bwd()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public P53_Mdm2BwdMatch(final P53_Mdm2BwdRule pattern, final IMatch match) {
		super(pattern, match);
		varP53 = (P53) match.get("p53");
		varMdm2 = (Mdm2) match.get("mdm2");
		varUs = (U_s) match.get("us");
	}

	/**
	 * Returns the p53.
	 *
	 * @return the p53
	 */
	public P53 getP53() {
		return varP53;
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
	 * Returns the us.
	 *
	 * @return the us
	 */
	public U_s getUs() {
		return varUs;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	p53 --> " + varP53 + System.lineSeparator();
		s += "	mdm2 --> " + varMdm2 + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
