package gklSimSG.api.matches;

import GKL1600Model.T;
import gklSimSG.api.rules.P_a_T_xBoundTrgRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>P_a_T_xBoundTrg()</code>.
 */
public class P_a_T_xBoundTrgMatch extends GraphTransformationMatch<P_a_T_xBoundTrgMatch, P_a_T_xBoundTrgRule> {
	private T varTrg;

	/**
	 * Creates a new match for the rule <code>P_a_T_xBoundTrg()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public P_a_T_xBoundTrgMatch(final P_a_T_xBoundTrgRule pattern, final IMatch match) {
		super(pattern, match);
		varTrg = (T) match.get("trg");
	}

	/**
	 * Returns the trg.
	 *
	 * @return the trg
	 */
	public T getTrg() {
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
