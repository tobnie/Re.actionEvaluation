package AlzheimersSimSG.api.matches;

import AlzheimerModel.P53;
import AlzheimersSimSG.api.rules.P53_b_GSK3b_xBoundSrcRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>P53_b_GSK3b_xBoundSrc()</code>.
 */
public class P53_b_GSK3b_xBoundSrcMatch extends GraphTransformationMatch<P53_b_GSK3b_xBoundSrcMatch, P53_b_GSK3b_xBoundSrcRule> {
	private P53 varSrc;

	/**
	 * Creates a new match for the rule <code>P53_b_GSK3b_xBoundSrc()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public P53_b_GSK3b_xBoundSrcMatch(final P53_b_GSK3b_xBoundSrcRule pattern, final IMatch match) {
		super(pattern, match);
		varSrc = (P53) match.get("src");
	}

	/**
	 * Returns the src.
	 *
	 * @return the src
	 */
	public P53 getSrc() {
		return varSrc;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	src --> " + varSrc + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
