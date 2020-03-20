package PatternSizeSimSG.api.matches;

import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import Params6Model.X;
import PatternSizeSimSG.api.rules.W_a_X_aBoundTrgRule;

/**
 * A match for the rule <code>W_a_X_aBoundTrg()</code>.
 */
public class W_a_X_aBoundTrgMatch extends GraphTransformationMatch<W_a_X_aBoundTrgMatch, W_a_X_aBoundTrgRule> {
	private X varTrg;

	/**
	 * Creates a new match for the rule <code>W_a_X_aBoundTrg()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public W_a_X_aBoundTrgMatch(final W_a_X_aBoundTrgRule pattern, final IMatch match) {
		super(pattern, match);
		varTrg = (X) match.get("trg");
	}

	/**
	 * Returns the trg.
	 *
	 * @return the trg
	 */
	public X getTrg() {
		return varTrg;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	trg --> " + varTrg + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
