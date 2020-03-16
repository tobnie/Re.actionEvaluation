package AlzheimersSimSG.api.matches;

import AlzheimerModel.Mdm2DUB;
import AlzheimersSimSG.api.rules.Obs_obs_mdm2DUBRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>obs_obs_mdm2DUB()</code>.
 */
public class Obs_obs_mdm2DUBMatch extends GraphTransformationMatch<Obs_obs_mdm2DUBMatch, Obs_obs_mdm2DUBRule> {
	private Mdm2DUB varMdm2dub;

	/**
	 * Creates a new match for the rule <code>obs_obs_mdm2DUB()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_obs_mdm2DUBMatch(final Obs_obs_mdm2DUBRule pattern, final IMatch match) {
		super(pattern, match);
		varMdm2dub = (Mdm2DUB) match.get("mdm2dub");
	}

	/**
	 * Returns the mdm2dub.
	 *
	 * @return the mdm2dub
	 */
	public Mdm2DUB getMdm2dub() {
		return varMdm2dub;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	mdm2dub --> " + varMdm2dub + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
