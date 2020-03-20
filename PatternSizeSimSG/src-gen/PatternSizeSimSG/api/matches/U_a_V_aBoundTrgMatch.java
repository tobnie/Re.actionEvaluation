package PatternSizeSimSG.api.matches;

import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import Params6Model.V;
import PatternSizeSimSG.api.rules.U_a_V_aBoundTrgRule;

/**
 * A match for the rule <code>U_a_V_aBoundTrg()</code>.
 */
public class U_a_V_aBoundTrgMatch extends GraphTransformationMatch<U_a_V_aBoundTrgMatch, U_a_V_aBoundTrgRule> {
	private V varTrg;

	/**
	 * Creates a new match for the rule <code>U_a_V_aBoundTrg()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public U_a_V_aBoundTrgMatch(final U_a_V_aBoundTrgRule pattern, final IMatch match) {
		super(pattern, match);
		varTrg = (V) match.get("trg");
	}

	/**
	 * Returns the trg.
	 *
	 * @return the trg
	 */
	public V getTrg() {
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
