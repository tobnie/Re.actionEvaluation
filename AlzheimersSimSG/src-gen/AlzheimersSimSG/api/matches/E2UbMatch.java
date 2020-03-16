package AlzheimersSimSG.api.matches;

import AlzheimerModel.E1;
import AlzheimerModel.E2;
import AlzheimerModel.Ub;
import AlzheimerModel.UBI_s;
import AlzheimerModel.UNB_s;
import AlzheimersSimSG.api.rules.E2UbRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>E2Ub()</code>.
 */
public class E2UbMatch extends GraphTransformationMatch<E2UbMatch, E2UbRule> {
	private E1 varE1;
	private UNB_s varUnbs;
	private Ub varUb;
	private E2 varE2;
	private UBI_s varUbis;

	/**
	 * Creates a new match for the rule <code>E2Ub()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public E2UbMatch(final E2UbRule pattern, final IMatch match) {
		super(pattern, match);
		varE1 = (E1) match.get("e1");
		varUnbs = (UNB_s) match.get("unbs");
		varUb = (Ub) match.get("ub");
		varE2 = (E2) match.get("e2");
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
	 * Returns the ub.
	 *
	 * @return the ub
	 */
	public Ub getUb() {
		return varUb;
	}

	/**
	 * Returns the e2.
	 *
	 * @return the e2
	 */
	public E2 getE2() {
		return varE2;
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
		s += "	ub --> " + varUb + System.lineSeparator();
		s += "	e2 --> " + varE2 + System.lineSeparator();
		s += "	ubis --> " + varUbis + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
