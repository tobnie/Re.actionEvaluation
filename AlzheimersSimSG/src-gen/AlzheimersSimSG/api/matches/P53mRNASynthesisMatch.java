package AlzheimersSimSG.api.matches;

import AlzheimersSimSG.api.rules.P53mRNASynthesisRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>p53mRNASynthesis()</code>.
 */
public class P53mRNASynthesisMatch extends GraphTransformationMatch<P53mRNASynthesisMatch, P53mRNASynthesisRule> {

	/**
	 * Creates a new match for the rule <code>p53mRNASynthesis()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public P53mRNASynthesisMatch(final P53mRNASynthesisRule pattern, final IMatch match) {
		super(pattern, match);
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
