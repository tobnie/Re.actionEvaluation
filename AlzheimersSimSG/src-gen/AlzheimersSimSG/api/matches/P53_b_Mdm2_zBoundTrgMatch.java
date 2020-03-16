package AlzheimersSimSG.api.matches;

import AlzheimerModel.Mdm2;
import AlzheimersSimSG.api.rules.P53_b_Mdm2_zBoundTrgRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>P53_b_Mdm2_zBoundTrg()</code>.
 */
public class P53_b_Mdm2_zBoundTrgMatch extends GraphTransformationMatch<P53_b_Mdm2_zBoundTrgMatch, P53_b_Mdm2_zBoundTrgRule> {
	private Mdm2 varTrg;

	/**
	 * Creates a new match for the rule <code>P53_b_Mdm2_zBoundTrg()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public P53_b_Mdm2_zBoundTrgMatch(final P53_b_Mdm2_zBoundTrgRule pattern, final IMatch match) {
		super(pattern, match);
		varTrg = (Mdm2) match.get("trg");
	}

	/**
	 * Returns the trg.
	 *
	 * @return the trg
	 */
	public Mdm2 getTrg() {
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
