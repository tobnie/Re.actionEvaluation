package gklSimSG.api.matches;

import GKL1600Model.K;
import GKL1600Model.T;
import gklSimSG.api.rules.KT_xRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>KT_x()</code>.
 */
public class KT_xMatch extends GraphTransformationMatch<KT_xMatch, KT_xRule> {
	private T varT;
	private K varK;

	/**
	 * Creates a new match for the rule <code>KT_x()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public KT_xMatch(final KT_xRule pattern, final IMatch match) {
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
