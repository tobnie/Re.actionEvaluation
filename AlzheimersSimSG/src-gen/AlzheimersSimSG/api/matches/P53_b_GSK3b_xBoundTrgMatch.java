package AlzheimersSimSG.api.matches;

import AlzheimerModel.GSK3b;
import AlzheimersSimSG.api.rules.P53_b_GSK3b_xBoundTrgRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>P53_b_GSK3b_xBoundTrg()</code>.
 */
public class P53_b_GSK3b_xBoundTrgMatch extends GraphTransformationMatch<P53_b_GSK3b_xBoundTrgMatch, P53_b_GSK3b_xBoundTrgRule> {
	private GSK3b varTrg;

	/**
	 * Creates a new match for the rule <code>P53_b_GSK3b_xBoundTrg()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public P53_b_GSK3b_xBoundTrgMatch(final P53_b_GSK3b_xBoundTrgRule pattern, final IMatch match) {
		super(pattern, match);
		varTrg = (GSK3b) match.get("trg");
	}

	/**
	 * Returns the trg.
	 *
	 * @return the trg
	 */
	public GSK3b getTrg() {
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
