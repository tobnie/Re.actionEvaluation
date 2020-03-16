package AlzheimersSimSG.api.matches;

import AlzheimerModel.ATMI;
import AlzheimerModel.DamDNA;
import AlzheimersSimSG.api.rules.ATMActivationRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>ATMActivation()</code>.
 */
public class ATMActivationMatch extends GraphTransformationMatch<ATMActivationMatch, ATMActivationRule> {
	private ATMI varAtmi;
	private DamDNA varDamDNA;

	/**
	 * Creates a new match for the rule <code>ATMActivation()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ATMActivationMatch(final ATMActivationRule pattern, final IMatch match) {
		super(pattern, match);
		varAtmi = (ATMI) match.get("atmi");
		varDamDNA = (DamDNA) match.get("damDNA");
	}

	/**
	 * Returns the atmi.
	 *
	 * @return the atmi
	 */
	public ATMI getAtmi() {
		return varAtmi;
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
		s += "	atmi --> " + varAtmi + System.lineSeparator();
		s += "	damDNA --> " + varDamDNA + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
