package AlzheimersSimSG.api.matches;

import AlzheimerModel.GSK3b;
import AlzheimerModel.P53;
import AlzheimersSimSG.api.rules.GSK3b_p53BwdRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>GSK3b_p53Bwd()</code>.
 */
public class GSK3b_p53BwdMatch extends GraphTransformationMatch<GSK3b_p53BwdMatch, GSK3b_p53BwdRule> {
	private GSK3b varGsk;
	private P53 varP53;

	/**
	 * Creates a new match for the rule <code>GSK3b_p53Bwd()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public GSK3b_p53BwdMatch(final GSK3b_p53BwdRule pattern, final IMatch match) {
		super(pattern, match);
		varGsk = (GSK3b) match.get("gsk");
		varP53 = (P53) match.get("p53");
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
	 * Returns the p53.
	 *
	 * @return the p53
	 */
	public P53 getP53() {
		return varP53;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	gsk --> " + varGsk + System.lineSeparator();
		s += "	p53 --> " + varP53 + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
