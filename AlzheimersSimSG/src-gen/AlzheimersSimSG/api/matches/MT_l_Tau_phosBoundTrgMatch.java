package AlzheimersSimSG.api.matches;

import AlzheimerModel.Tau;
import AlzheimersSimSG.api.rules.MT_l_Tau_phosBoundTrgRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>MT_l_Tau_phosBoundTrg()</code>.
 */
public class MT_l_Tau_phosBoundTrgMatch extends GraphTransformationMatch<MT_l_Tau_phosBoundTrgMatch, MT_l_Tau_phosBoundTrgRule> {
	private Tau varTrg;

	/**
	 * Creates a new match for the rule <code>MT_l_Tau_phosBoundTrg()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public MT_l_Tau_phosBoundTrgMatch(final MT_l_Tau_phosBoundTrgRule pattern, final IMatch match) {
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
