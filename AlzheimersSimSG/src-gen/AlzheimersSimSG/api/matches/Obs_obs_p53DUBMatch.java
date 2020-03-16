package AlzheimersSimSG.api.matches;

import AlzheimerModel.P53DUB;
import AlzheimersSimSG.api.rules.Obs_obs_p53DUBRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>obs_obs_p53DUB()</code>.
 */
public class Obs_obs_p53DUBMatch extends GraphTransformationMatch<Obs_obs_p53DUBMatch, Obs_obs_p53DUBRule> {
	private P53DUB varP53dub;

	/**
	 * Creates a new match for the rule <code>obs_obs_p53DUB()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_obs_p53DUBMatch(final Obs_obs_p53DUBRule pattern, final IMatch match) {
		super(pattern, match);
		varP53dub = (P53DUB) match.get("p53dub");
	}

	/**
	 * Returns the p53dub.
	 *
	 * @return the p53dub
	 */
	public P53DUB getP53dub() {
		return varP53dub;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	p53dub --> " + varP53dub + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
