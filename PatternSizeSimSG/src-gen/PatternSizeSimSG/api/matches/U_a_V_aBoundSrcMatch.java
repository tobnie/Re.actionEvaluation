package PatternSizeSimSG.api.matches;

import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import Params6Model.U;
import PatternSizeSimSG.api.rules.U_a_V_aBoundSrcRule;

/**
 * A match for the rule <code>U_a_V_aBoundSrc()</code>.
 */
public class U_a_V_aBoundSrcMatch extends GraphTransformationMatch<U_a_V_aBoundSrcMatch, U_a_V_aBoundSrcRule> {
	private U varSrc;

	/**
	 * Creates a new match for the rule <code>U_a_V_aBoundSrc()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public U_a_V_aBoundSrcMatch(final U_a_V_aBoundSrcRule pattern, final IMatch match) {
		super(pattern, match);
		varSrc = (U) match.get("src");
	}

	/**
	 * Returns the src.
	 *
	 * @return the src
	 */
	public U getSrc() {
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
