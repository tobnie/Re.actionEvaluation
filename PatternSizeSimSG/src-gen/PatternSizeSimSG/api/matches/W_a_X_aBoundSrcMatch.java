package PatternSizeSimSG.api.matches;

import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import Params6Model.W;
import PatternSizeSimSG.api.rules.W_a_X_aBoundSrcRule;

/**
 * A match for the rule <code>W_a_X_aBoundSrc()</code>.
 */
public class W_a_X_aBoundSrcMatch extends GraphTransformationMatch<W_a_X_aBoundSrcMatch, W_a_X_aBoundSrcRule> {
	private W varSrc;

	/**
	 * Creates a new match for the rule <code>W_a_X_aBoundSrc()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public W_a_X_aBoundSrcMatch(final W_a_X_aBoundSrcRule pattern, final IMatch match) {
		super(pattern, match);
		varSrc = (W) match.get("src");
	}

	/**
	 * Returns the src.
	 *
	 * @return the src
	 */
	public W getSrc() {
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
