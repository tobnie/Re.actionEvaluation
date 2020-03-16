package AlzheimersSimSG.api.matches;

import AlzheimerModel.AbetaPlaque;
import AlzheimersSimSG.api.rules.Obs_obs_abetaPlaqueRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>obs_obs_abetaPlaque()</code>.
 */
public class Obs_obs_abetaPlaqueMatch extends GraphTransformationMatch<Obs_obs_abetaPlaqueMatch, Obs_obs_abetaPlaqueRule> {
	private AbetaPlaque varAbetaPlaque;

	/**
	 * Creates a new match for the rule <code>obs_obs_abetaPlaque()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_obs_abetaPlaqueMatch(final Obs_obs_abetaPlaqueRule pattern, final IMatch match) {
		super(pattern, match);
		varAbetaPlaque = (AbetaPlaque) match.get("abetaPlaque");
	}

	/**
	 * Returns the abetaPlaque.
	 *
	 * @return the abetaPlaque
	 */
	public AbetaPlaque getAbetaPlaque() {
		return varAbetaPlaque;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	abetaPlaque --> " + varAbetaPlaque + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
