package AlzheimersSimSG.api.matches;

import AlzheimerModel.GSK3b;
import AlzheimerModel.P53;
import AlzheimersSimSG.api.rules.Obs_obs_p53gskRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>obs_obs_p53gsk()</code>.
 */
public class Obs_obs_p53gskMatch extends GraphTransformationMatch<Obs_obs_p53gskMatch, Obs_obs_p53gskRule> {
	private GSK3b varGsk;
	private P53 varP53;

	/**
	 * Creates a new match for the rule <code>obs_obs_p53gsk()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_obs_p53gskMatch(final Obs_obs_p53gskRule pattern, final IMatch match) {
		super(pattern, match);
		varGsk = (GSK3b) match.get("gsk");
		varP53 = (P53) match.get("p53");
	}

	/**
	 * Returns the gsk.
	 *
	 * @return the gsk
	 */
	public GSK3b getGsk() {
		return varGsk;
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
		s += "	gsk --> " + varGsk + System.lineSeparator();
		s += "	p53 --> " + varP53 + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
