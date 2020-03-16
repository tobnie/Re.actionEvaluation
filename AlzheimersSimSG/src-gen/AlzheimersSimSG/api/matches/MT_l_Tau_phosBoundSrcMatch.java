package AlzheimersSimSG.api.matches;

import AlzheimerModel.MT;
import AlzheimersSimSG.api.rules.MT_l_Tau_phosBoundSrcRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>MT_l_Tau_phosBoundSrc()</code>.
 */
public class MT_l_Tau_phosBoundSrcMatch extends GraphTransformationMatch<MT_l_Tau_phosBoundSrcMatch, MT_l_Tau_phosBoundSrcRule> {
	private MT varSrc;

	/**
	 * Creates a new match for the rule <code>MT_l_Tau_phosBoundSrc()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public MT_l_Tau_phosBoundSrcMatch(final MT_l_Tau_phosBoundSrcRule pattern, final IMatch match) {
		super(pattern, match);
		varSrc = (MT) match.get("src");
	}

	/**
	 * Returns the src.
	 *
	 * @return the src
	 */
	public MT getSrc() {
		return varSrc;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	src --> " + varSrc + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
