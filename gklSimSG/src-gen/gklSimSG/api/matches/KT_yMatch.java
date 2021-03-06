package gklSimSG.api.matches;

import GKL1600Model.K;
import GKL1600Model.T;
import gklSimSG.api.rules.KT_yRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>KT_y()</code>.
 */
public class KT_yMatch extends GraphTransformationMatch<KT_yMatch, KT_yRule> {
	private T varT;
	private K varK;

	/**
	 * Creates a new match for the rule <code>KT_y()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public KT_yMatch(final KT_yRule pattern, final IMatch match) {
		super(pattern, match);
		varT = (T) match.get("t");
		varK = (K) match.get("k");
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
	 * Returns the k.
	 *
	 * @return the k
	 */
	public K getK() {
		return varK;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	t --> " + varT + System.lineSeparator();
		s += "	k --> " + varK + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
