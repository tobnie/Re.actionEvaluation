package AlzheimersSimSG.api.matches;

import AlzheimerModel.Abeta;
import AlzheimersSimSG.api.rules.P53TranscriptionRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>P53Transcription()</code>.
 */
public class P53TranscriptionMatch extends GraphTransformationMatch<P53TranscriptionMatch, P53TranscriptionRule> {
	private Abeta varAbeta;

	/**
	 * Creates a new match for the rule <code>P53Transcription()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public P53TranscriptionMatch(final P53TranscriptionRule pattern, final IMatch match) {
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
