package PatternSizeSimSG.api.matches;

import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import Params6Model.Y;
import PatternSizeSimSG.api.rules.Y_a_Z_aBoundSrcRule;

/**
 * A match for the rule <code>Y_a_Z_aBoundSrc()</code>.
 */
public class Y_a_Z_aBoundSrcMatch extends GraphTransformationMatch<Y_a_Z_aBoundSrcMatch, Y_a_Z_aBoundSrcRule> {
	private Y varSrc;

	/**
	 * Creates a new match for the rule <code>Y_a_Z_aBoundSrc()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Y_a_Z_aBoundSrcMatch(final Y_a_Z_aBoundSrcRule pattern, final IMatch match) {
		super(pattern, match);
		varSrc = (Y) match.get("src");
	}

	/**
	 * Returns the src.
	 *
	 * @return the src
	 */
	public Y getSrc() {
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
