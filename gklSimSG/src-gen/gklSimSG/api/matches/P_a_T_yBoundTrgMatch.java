package gklSimSG.api.matches;

import GKL1600Model.T;
import gklSimSG.api.rules.P_a_T_yBoundTrgRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>P_a_T_yBoundTrg()</code>.
 */
public class P_a_T_yBoundTrgMatch extends GraphTransformationMatch<P_a_T_yBoundTrgMatch, P_a_T_yBoundTrgRule> {
	private T varTrg;

	/**
	 * Creates a new match for the rule <code>P_a_T_yBoundTrg()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public P_a_T_yBoundTrgMatch(final P_a_T_yBoundTrgRule pattern, final IMatch match) {
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
