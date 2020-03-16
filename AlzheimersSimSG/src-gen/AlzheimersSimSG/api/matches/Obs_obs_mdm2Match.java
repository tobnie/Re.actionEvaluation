package AlzheimersSimSG.api.matches;

import AlzheimerModel.Mdm2;
import AlzheimersSimSG.api.rules.Obs_obs_mdm2Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>obs_obs_mdm2()</code>.
 */
public class Obs_obs_mdm2Match extends GraphTransformationMatch<Obs_obs_mdm2Match, Obs_obs_mdm2Rule> {
	private Mdm2 varMdm2;

	/**
	 * Creates a new match for the rule <code>obs_obs_mdm2()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_obs_mdm2Match(final Obs_obs_mdm2Rule pattern, final IMatch match) {
		super(pattern, match);
		varMdm2 = (Mdm2) match.get("mdm2");
	}

	/**
	 * Returns the mdm2.
	 *
	 * @return the mdm2
	 */
	public Mdm2 getMdm2() {
		return varMdm2;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	mdm2 --> " + varMdm2 + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
