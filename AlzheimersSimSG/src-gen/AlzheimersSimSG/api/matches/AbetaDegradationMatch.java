package AlzheimersSimSG.api.matches;

import AlzheimerModel.Abeta;
import AlzheimersSimSG.api.rules.AbetaDegradationRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>AbetaDegradation()</code>.
 */
public class AbetaDegradationMatch extends GraphTransformationMatch<AbetaDegradationMatch, AbetaDegradationRule> {
	private Abeta varAbeta;

	/**
	 * Creates a new match for the rule <code>AbetaDegradation()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public AbetaDegradationMatch(final AbetaDegradationRule pattern, final IMatch match) {
		super(pattern, match);
		varAbeta = (Abeta) match.get("abeta");
	}

	/**
	 * Returns the abeta.
	 *
	 * @return the abeta
	 */
	public Abeta getAbeta() {
		return varAbeta;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	abeta --> " + varAbeta + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
