package AlzheimersSimSG.api.matches;

import AlzheimerModel.ATP;
import AlzheimerModel.E1;
import AlzheimerModel.Ub;
import AlzheimerModel.UBI_s;
import AlzheimerModel.UNB_s;
import AlzheimersSimSG.api.rules.E1UbRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>E1Ub()</code>.
 */
public class E1UbMatch extends GraphTransformationMatch<E1UbMatch, E1UbRule> {
	private E1 varE1;
	private UNB_s varUnbs;
	private ATP varAtp;
	private Ub varUb;
	private UBI_s varUbis;

	/**
	 * Creates a new match for the rule <code>E1Ub()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public E1UbMatch(final E1UbRule pattern, final IMatch match) {
		super(pattern, match);
		varE1 = (E1) match.get("e1");
		varUnbs = (UNB_s) match.get("unbs");
		varAtp = (ATP) match.get("atp");
		varUb = (Ub) match.get("ub");
		varUbis = (UBI_s) match.get("ubis");
	}

	/**
	 * Returns the e1.
	 *
	 * @return the e1
	 */
	public E1 getE1() {
		return varE1;
	}

	/**
	 * Returns the unbs.
	 *
	 * @return the unbs
	 */
	public UNB_s getUnbs() {
		return varUnbs;
	}

	/**
	 * Returns the atp.
	 *
	 * @return the atp
	 */
	public ATP getAtp() {
		return varAtp;
	}

	/**
	 * Returns the ub.
	 *
	 * @return the ub
	 */
	public Ub getUb() {
		return varUb;
	}

	/**
	 * Returns the ubis.
	 *
	 * @return the ubis
	 */
	public UBI_s getUbis() {
		return varUbis;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	e1 --> " + varE1 + System.lineSeparator();
		s += "	unbs --> " + varUnbs + System.lineSeparator();
		s += "	atp --> " + varAtp + System.lineSeparator();
		s += "	ub --> " + varUb + System.lineSeparator();
		s += "	ubis --> " + varUbis + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
