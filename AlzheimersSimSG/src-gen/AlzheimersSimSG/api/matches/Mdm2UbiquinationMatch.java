package AlzheimersSimSG.api.matches;

import AlzheimerModel.E2;
import AlzheimerModel.Mdm2;
import AlzheimerModel.UB1_s;
import AlzheimerModel.UBI_s;
import AlzheimerModel.UNB_s;
import AlzheimersSimSG.api.rules.Mdm2UbiquinationRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>mdm2Ubiquination()</code>.
 */
public class Mdm2UbiquinationMatch extends GraphTransformationMatch<Mdm2UbiquinationMatch, Mdm2UbiquinationRule> {
	private E2 varE2;
	private UBI_s varUbis;
	private Mdm2 varMdm2;
	private UNB_s varUnbs;
	private UB1_s varUb1s;

	/**
	 * Creates a new match for the rule <code>mdm2Ubiquination()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Mdm2UbiquinationMatch(final Mdm2UbiquinationRule pattern, final IMatch match) {
		super(pattern, match);
		varE2 = (E2) match.get("e2");
		varUbis = (UBI_s) match.get("ubis");
		varMdm2 = (Mdm2) match.get("mdm2");
		varUnbs = (UNB_s) match.get("unbs");
		varUb1s = (UB1_s) match.get("ub1s");
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

	/**
	 * Returns the mdm2.
	 *
	 * @return the mdm2
	 */
	public Mdm2 getMdm2() {
		return varMdm2;
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
	 * Returns the ub1s.
	 *
	 * @return the ub1s
	 */
	public UB1_s getUb1s() {
		return varUb1s;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	e2 --> " + varE2 + System.lineSeparator();
		s += "	ubis --> " + varUbis + System.lineSeparator();
		s += "	mdm2 --> " + varMdm2 + System.lineSeparator();
		s += "	unbs --> " + varUnbs + System.lineSeparator();
		s += "	ub1s --> " + varUb1s + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
