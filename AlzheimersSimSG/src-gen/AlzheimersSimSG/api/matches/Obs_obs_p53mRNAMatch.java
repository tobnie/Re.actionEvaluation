package AlzheimersSimSG.api.matches;

import AlzheimerModel.P53mRNA;
import AlzheimersSimSG.api.rules.Obs_obs_p53mRNARule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>obs_obs_p53mRNA()</code>.
 */
public class Obs_obs_p53mRNAMatch extends GraphTransformationMatch<Obs_obs_p53mRNAMatch, Obs_obs_p53mRNARule> {
	private P53mRNA varP53mRna;

	/**
	 * Creates a new match for the rule <code>obs_obs_p53mRNA()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_obs_p53mRNAMatch(final Obs_obs_p53mRNARule pattern, final IMatch match) {
		super(pattern, match);
		varP53mRna = (P53mRNA) match.get("p53mRna");
	}

	/**
	 * Returns the p53mRna.
	 *
	 * @return the p53mRna
	 */
	public P53mRNA getP53mRna() {
		return varP53mRna;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	p53mRna --> " + varP53mRna + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
