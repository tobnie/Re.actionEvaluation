package AlzheimersSimSG.api.matches;

import AlzheimerModel.P53;
import AlzheimersSimSG.api.rules.Obs_obs_p53Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>obs_obs_p53()</code>.
 */
public class Obs_obs_p53Match extends GraphTransformationMatch<Obs_obs_p53Match, Obs_obs_p53Rule> {
	private P53 varP53;

	/**
	 * Creates a new match for the rule <code>obs_obs_p53()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_obs_p53Match(final Obs_obs_p53Rule pattern, final IMatch match) {
		super(pattern, match);
		varP53 = (P53) match.get("p53");
	}

	/**
	 * Returns the p53.
	 *
	 * @return the p53
	 */
	public P53 getP53() {
		return varP53;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	p53 --> " + varP53 + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
