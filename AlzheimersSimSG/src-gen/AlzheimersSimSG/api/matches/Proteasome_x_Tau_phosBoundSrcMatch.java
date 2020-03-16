package AlzheimersSimSG.api.matches;

import AlzheimerModel.Proteasome;
import AlzheimersSimSG.api.rules.Proteasome_x_Tau_phosBoundSrcRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>Proteasome_x_Tau_phosBoundSrc()</code>.
 */
public class Proteasome_x_Tau_phosBoundSrcMatch extends GraphTransformationMatch<Proteasome_x_Tau_phosBoundSrcMatch, Proteasome_x_Tau_phosBoundSrcRule> {
	private Proteasome varSrc;

	/**
	 * Creates a new match for the rule <code>Proteasome_x_Tau_phosBoundSrc()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Proteasome_x_Tau_phosBoundSrcMatch(final Proteasome_x_Tau_phosBoundSrcRule pattern, final IMatch match) {
		super(pattern, match);
		varSrc = (Proteasome) match.get("src");
	}

	/**
	 * Returns the src.
	 *
	 * @return the src
	 */
	public Proteasome getSrc() {
		return varSrc;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	src --> " + varSrc + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
