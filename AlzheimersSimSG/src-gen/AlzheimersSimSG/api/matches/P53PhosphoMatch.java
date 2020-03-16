package AlzheimersSimSG.api.matches;

import AlzheimerModel.ATMA;
import AlzheimerModel.P53;
import AlzheimerModel.P_s;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.rules.P53PhosphoRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>P53Phospho()</code>.
 */
public class P53PhosphoMatch extends GraphTransformationMatch<P53PhosphoMatch, P53PhosphoRule> {
	private ATMA varAtma;
	private P53 varP53;
	private U_s varUs;
	private P_s varPs;

	/**
	 * Creates a new match for the rule <code>P53Phospho()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public P53PhosphoMatch(final P53PhosphoRule pattern, final IMatch match) {
		super(pattern, match);
		varAtma = (ATMA) match.get("atma");
		varP53 = (P53) match.get("p53");
		varUs = (U_s) match.get("us");
		varPs = (P_s) match.get("ps");
	}

	/**
	 * Returns the atma.
	 *
	 * @return the atma
	 */
	public ATMA getAtma() {
		return varAtma;
	}

	/**
	 * Returns the p53.
	 *
	 * @return the p53
	 */
	public P53 getP53() {
		return varP53;
	}

	/**
	 * Returns the us.
	 *
	 * @return the us
	 */
	public U_s getUs() {
		return varUs;
	}

	/**
	 * Returns the ps.
	 *
	 * @return the ps
	 */
	public P_s getPs() {
		return varPs;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	atma --> " + varAtma + System.lineSeparator();
		s += "	p53 --> " + varP53 + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
