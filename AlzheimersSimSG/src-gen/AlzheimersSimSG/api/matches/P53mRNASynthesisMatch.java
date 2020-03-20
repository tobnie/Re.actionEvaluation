package AlzheimersSimSG.api.matches;

import AlzheimersSimSG.api.rules.P53mRNASynthesisRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import reactionContainer.Container;

/**
 * A match for the rule <code>p53mRNASynthesis()</code>.
 */
public class P53mRNASynthesisMatch extends GraphTransformationMatch<P53mRNASynthesisMatch, P53mRNASynthesisRule> {
	private Container varBlank;

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
		varBlank = (Container) match.get("blank");
	}

	/**
	 * Returns the blank.
	 *
	 * @return the blank
	 */
	public Container getBlank() {
		return varBlank;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	blank --> " + varBlank + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
