package AlzheimersSimSG.api.matches;

import AlzheimerModel.DamDNA;
import AlzheimersSimSG.api.rules.Obs_obs_damDNARule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>obs_obs_damDNA()</code>.
 */
public class Obs_obs_damDNAMatch extends GraphTransformationMatch<Obs_obs_damDNAMatch, Obs_obs_damDNARule> {
	private DamDNA varDamDNA;

	/**
	 * Creates a new match for the rule <code>obs_obs_damDNA()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_obs_damDNAMatch(final Obs_obs_damDNARule pattern, final IMatch match) {
		super(pattern, match);
		varDamDNA = (DamDNA) match.get("damDNA");
	}

	/**
	 * Returns the damDNA.
	 *
	 * @return the damDNA
	 */
	public DamDNA getDamDNA() {
		return varDamDNA;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	damDNA --> " + varDamDNA + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
