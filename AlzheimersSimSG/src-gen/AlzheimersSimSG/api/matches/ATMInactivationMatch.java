package AlzheimersSimSG.api.matches;

import AlzheimerModel.ATMA;
import AlzheimersSimSG.api.rules.ATMInactivationRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>ATMInactivation()</code>.
 */
public class ATMInactivationMatch extends GraphTransformationMatch<ATMInactivationMatch, ATMInactivationRule> {
	private ATMA varAtma;

	/**
	 * Creates a new match for the rule <code>ATMInactivation()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ATMInactivationMatch(final ATMInactivationRule pattern, final IMatch match) {
		super(pattern, match);
		varAtma = (ATMA) match.get("atma");
	}

	/**
	 * Returns the atma.
	 *
	 * @return the atma
	 */
	public ATMA getAtma() {
		return varAtma;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	atma --> " + varAtma + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
