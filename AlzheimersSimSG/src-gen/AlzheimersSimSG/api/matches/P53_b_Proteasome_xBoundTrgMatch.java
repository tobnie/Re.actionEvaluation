package AlzheimersSimSG.api.matches;

import AlzheimerModel.Proteasome;
import AlzheimersSimSG.api.rules.P53_b_Proteasome_xBoundTrgRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>P53_b_Proteasome_xBoundTrg()</code>.
 */
public class P53_b_Proteasome_xBoundTrgMatch extends GraphTransformationMatch<P53_b_Proteasome_xBoundTrgMatch, P53_b_Proteasome_xBoundTrgRule> {
	private Proteasome varTrg;

	/**
	 * Creates a new match for the rule <code>P53_b_Proteasome_xBoundTrg()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public P53_b_Proteasome_xBoundTrgMatch(final P53_b_Proteasome_xBoundTrgRule pattern, final IMatch match) {
		super(pattern, match);
		varTrg = (Proteasome) match.get("trg");
	}

	/**
	 * Returns the trg.
	 *
	 * @return the trg
	 */
	public Proteasome getTrg() {
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
