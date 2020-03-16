package AlzheimersSimSG.api.matches;

import AlzheimerModel.Tau;
import AlzheimersSimSG.api.rules.Proteasome_x_Tau_phosBoundTrgRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>Proteasome_x_Tau_phosBoundTrg()</code>.
 */
public class Proteasome_x_Tau_phosBoundTrgMatch extends GraphTransformationMatch<Proteasome_x_Tau_phosBoundTrgMatch, Proteasome_x_Tau_phosBoundTrgRule> {
	private Tau varTrg;

	/**
	 * Creates a new match for the rule <code>Proteasome_x_Tau_phosBoundTrg()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Proteasome_x_Tau_phosBoundTrgMatch(final Proteasome_x_Tau_phosBoundTrgRule pattern, final IMatch match) {
		super(pattern, match);
		varTrg = (Tau) match.get("trg");
	}

	/**
	 * Returns the trg.
	 *
	 * @return the trg
	 */
	public Tau getTrg() {
		return varTrg;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	trg --> " + varTrg + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
