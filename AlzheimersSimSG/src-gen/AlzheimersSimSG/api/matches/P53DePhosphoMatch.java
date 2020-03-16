package AlzheimersSimSG.api.matches;

import AlzheimerModel.P53;
import AlzheimerModel.P_s;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.rules.P53DePhosphoRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>P53DePhospho()</code>.
 */
public class P53DePhosphoMatch extends GraphTransformationMatch<P53DePhosphoMatch, P53DePhosphoRule> {
	private P53 varP53;
	private P_s varPs;
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>P53DePhospho()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public P53DePhosphoMatch(final P53DePhosphoRule pattern, final IMatch match) {
		super(pattern, match);
		varP53 = (P53) match.get("p53");
		varPs = (P_s) match.get("ps");
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
	 * Returns the ps.
	 *
	 * @return the ps
	 */
	public P_s getPs() {
		return varPs;
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
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
