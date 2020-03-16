package AlzheimersSimSG.api.matches;

import AlzheimerModel.Mdm2;
import AlzheimerModel.P53;
import AlzheimerModel.P53DUB;
import AlzheimerModel.U_s;
import AlzheimerModel.UB1_s;
import AlzheimersSimSG.api.rules.P53DeUbiquitinationRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>P53DeUbiquitination()</code>.
 */
public class P53DeUbiquitinationMatch extends GraphTransformationMatch<P53DeUbiquitinationMatch, P53DeUbiquitinationRule> {
	private P53DUB varP53dub;
	private Mdm2 varMdm2;
	private P53 varP53;
	private U_s varUs;
	private UB1_s varUb1s;

	/**
	 * Creates a new match for the rule <code>P53DeUbiquitination()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public P53DeUbiquitinationMatch(final P53DeUbiquitinationRule pattern, final IMatch match) {
		super(pattern, match);
		varP53dub = (P53DUB) match.get("p53dub");
		varMdm2 = (Mdm2) match.get("mdm2");
		varP53 = (P53) match.get("p53");
		varUs = (U_s) match.get("us");
		varUb1s = (UB1_s) match.get("ub1s");
	}

	/**
	 * Returns the p53dub.
	 *
	 * @return the p53dub
	 */
	public P53DUB getP53dub() {
		return varP53dub;
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
	 * Returns the p53.
	 *
	 * @return the p53
	 */
	public P53 getP53() {
		return varP53;
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
	 * Returns the ub1s.
	 *
	 * @return the ub1s
	 */
	public UB1_s getUb1s() {
		return varUb1s;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	p53dub --> " + varP53dub + System.lineSeparator();
		s += "	mdm2 --> " + varMdm2 + System.lineSeparator();
		s += "	p53 --> " + varP53 + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "	ub1s --> " + varUb1s + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
