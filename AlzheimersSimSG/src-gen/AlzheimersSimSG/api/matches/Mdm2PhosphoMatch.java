package AlzheimersSimSG.api.matches;

import AlzheimerModel.ATMA;
import AlzheimerModel.Mdm2;
import AlzheimerModel.P_s;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.rules.Mdm2PhosphoRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>Mdm2Phospho()</code>.
 */
public class Mdm2PhosphoMatch extends GraphTransformationMatch<Mdm2PhosphoMatch, Mdm2PhosphoRule> {
	private ATMA varAtma;
	private Mdm2 varMdm2;
	private U_s varUs;
	private P_s varPs;

	/**
	 * Creates a new match for the rule <code>Mdm2Phospho()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Mdm2PhosphoMatch(final Mdm2PhosphoRule pattern, final IMatch match) {
		super(pattern, match);
		varAtma = (ATMA) match.get("atma");
		varMdm2 = (Mdm2) match.get("mdm2");
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
	 * Returns the mdm2.
	 *
	 * @return the mdm2
	 */
	public Mdm2 getMdm2() {
		return varMdm2;
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
		s += "	mdm2 --> " + varMdm2 + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
