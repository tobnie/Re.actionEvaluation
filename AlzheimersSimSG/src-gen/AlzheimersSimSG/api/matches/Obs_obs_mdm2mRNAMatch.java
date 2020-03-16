package AlzheimersSimSG.api.matches;

import AlzheimerModel.Mdm2mRNA;
import AlzheimersSimSG.api.rules.Obs_obs_mdm2mRNARule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>obs_obs_mdm2mRNA()</code>.
 */
public class Obs_obs_mdm2mRNAMatch extends GraphTransformationMatch<Obs_obs_mdm2mRNAMatch, Obs_obs_mdm2mRNARule> {
	private Mdm2mRNA varMdm2mRna;

	/**
	 * Creates a new match for the rule <code>obs_obs_mdm2mRNA()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_obs_mdm2mRNAMatch(final Obs_obs_mdm2mRNARule pattern, final IMatch match) {
		super(pattern, match);
		varMdm2mRna = (Mdm2mRNA) match.get("mdm2mRna");
	}

	/**
	 * Returns the mdm2mRna.
	 *
	 * @return the mdm2mRna
	 */
	public Mdm2mRNA getMdm2mRna() {
		return varMdm2mRna;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	mdm2mRna --> " + varMdm2mRna + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
