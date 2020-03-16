package AlzheimersSimSG.api.matches;

import AlzheimerModel.U_s;
import AlzheimersSimSG.api.rules.TauSynthesisRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>TauSynthesis()</code>.
 */
public class TauSynthesisMatch extends GraphTransformationMatch<TauSynthesisMatch, TauSynthesisRule> {
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>TauSynthesis()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public TauSynthesisMatch(final TauSynthesisRule pattern, final IMatch match) {
		super(pattern, match);
		varUs = (U_s) match.get("us");
	}

	/**
	 * Returns the us.
	 *
	 * @return the us
	 */
	public U_s getUs() {
		return varUs;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
