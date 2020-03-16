package AlzheimersSimSG.api.matches;

import AlzheimerModel.Mdm2;
import AlzheimerModel.P_s;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.rules.Mdm2DePhosphoRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>Mdm2DePhospho()</code>.
 */
public class Mdm2DePhosphoMatch extends GraphTransformationMatch<Mdm2DePhosphoMatch, Mdm2DePhosphoRule> {
	private Mdm2 varMdm2;
	private P_s varPs;
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>Mdm2DePhospho()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Mdm2DePhosphoMatch(final Mdm2DePhosphoRule pattern, final IMatch match) {
		super(pattern, match);
		varMdm2 = (Mdm2) match.get("mdm2");
		varPs = (P_s) match.get("ps");
		varUs = (U_s) match.get("us");
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
	 * Returns the ps.
	 *
	 * @return the ps
	 */
	public P_s getPs() {
		return varPs;
	}

	/**
	 * Returns the us.
	 *
	 * @return the us
	 */
	public U_s getUs() {
		return varUs;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	mdm2 --> " + varMdm2 + System.lineSeparator();
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
