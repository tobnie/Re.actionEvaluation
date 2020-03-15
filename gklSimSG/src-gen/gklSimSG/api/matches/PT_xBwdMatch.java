package gklSimSG.api.matches;

import gklSimSG.api.rules.PT_xBwdRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import UNTITLEDModel.P;
import UNTITLEDModel.T;

/**
 * A match for the rule <code>PT_xBwd()</code>.
 */
public class PT_xBwdMatch extends GraphTransformationMatch<PT_xBwdMatch, PT_xBwdRule> {
	private P varP;
	private T varT;

	/**
	 * Creates a new match for the rule <code>PT_xBwd()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public PT_xBwdMatch(final PT_xBwdRule pattern, final IMatch match) {
		super(pattern, match);
		varP = (P) match.get("p");
		varT = (T) match.get("t");
	}

	/**
	 * Returns the p.
	 *
	 * @return the p
	 */
	public P getP() {
		return varP;
	}

	/**
	 * Returns the t.
	 *
	 * @return the t
	 */
	public T getT() {
		return varT;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	p --> " + varP + System.lineSeparator();
		s += "	t --> " + varT + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
