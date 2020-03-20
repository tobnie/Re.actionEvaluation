package PatternSizeSimSG.api.matches;

import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import Params6Model.Z;
import PatternSizeSimSG.api.rules.Y_a_Z_aBoundTrgRule;

/**
 * A match for the rule <code>Y_a_Z_aBoundTrg()</code>.
 */
public class Y_a_Z_aBoundTrgMatch extends GraphTransformationMatch<Y_a_Z_aBoundTrgMatch, Y_a_Z_aBoundTrgRule> {
	private Z varTrg;

	/**
	 * Creates a new match for the rule <code>Y_a_Z_aBoundTrg()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Y_a_Z_aBoundTrgMatch(final Y_a_Z_aBoundTrgRule pattern, final IMatch match) {
		super(pattern, match);
		varTrg = (Z) match.get("trg");
	}

	/**
	 * Returns the trg.
	 *
	 * @return the trg
	 */
	public Z getTrg() {
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
