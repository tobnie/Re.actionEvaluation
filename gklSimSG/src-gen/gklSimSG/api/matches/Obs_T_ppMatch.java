package gklSimSG.api.matches;

import GKL1600Model.P_s;
import GKL1600Model.T;
import gklSimSG.api.rules.Obs_T_ppRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>obs_T_pp()</code>.
 */
public class Obs_T_ppMatch extends GraphTransformationMatch<Obs_T_ppMatch, Obs_T_ppRule> {
	private T varT;
	private P_s varPs;

	/**
	 * Creates a new match for the rule <code>obs_T_pp()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_T_ppMatch(final Obs_T_ppRule pattern, final IMatch match) {
		super(pattern, match);
		varT = (T) match.get("t");
		varPs = (P_s) match.get("ps");
	}

	/**
	 * Returns the t.
	 *
	 * @return the t
	 */
	public T getT() {
		return varT;
	}

	/**
	 * Returns the ps.
	 *
	 * @return the ps
	 */
	public P_s getPs() {
		return varPs;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	t --> " + varT + System.lineSeparator();
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
