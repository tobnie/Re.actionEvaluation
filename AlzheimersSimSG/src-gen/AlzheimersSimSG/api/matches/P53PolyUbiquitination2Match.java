package AlzheimersSimSG.api.matches;

import AlzheimerModel.E2;
import AlzheimerModel.Mdm2;
import AlzheimerModel.P53;
import AlzheimerModel.U_s;
import AlzheimerModel.UB2_s;
import AlzheimerModel.UB3_s;
import AlzheimerModel.UBI_s;
import AlzheimerModel.UNB_s;
import AlzheimersSimSG.api.rules.P53PolyUbiquitination2Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>P53PolyUbiquitination2()</code>.
 */
public class P53PolyUbiquitination2Match extends GraphTransformationMatch<P53PolyUbiquitination2Match, P53PolyUbiquitination2Rule> {
	private E2 varE2;
	private UBI_s varUbis;
	private Mdm2 varMdm2;
	private P53 varP53;
	private U_s varUs;
	private UB2_s varUb2s;
	private UNB_s varUnbs;
	private UB3_s varUb3s;

	/**
	 * Creates a new match for the rule <code>P53PolyUbiquitination2()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public P53PolyUbiquitination2Match(final P53PolyUbiquitination2Rule pattern, final IMatch match) {
		super(pattern, match);
		varE2 = (E2) match.get("e2");
		varUbis = (UBI_s) match.get("ubis");
		varMdm2 = (Mdm2) match.get("mdm2");
		varP53 = (P53) match.get("p53");
		varUs = (U_s) match.get("us");
		varUb2s = (UB2_s) match.get("ub2s");
		varUnbs = (UNB_s) match.get("unbs");
		varUb3s = (UB3_s) match.get("ub3s");
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
	 * Returns the ub2s.
	 *
	 * @return the ub2s
	 */
	public UB2_s getUb2s() {
		return varUb2s;
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
	 * Returns the ub3s.
	 *
	 * @return the ub3s
	 */
	public UB3_s getUb3s() {
		return varUb3s;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	e2 --> " + varE2 + System.lineSeparator();
		s += "	ubis --> " + varUbis + System.lineSeparator();
		s += "	mdm2 --> " + varMdm2 + System.lineSeparator();
		s += "	p53 --> " + varP53 + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "	ub2s --> " + varUb2s + System.lineSeparator();
		s += "	unbs --> " + varUnbs + System.lineSeparator();
		s += "	ub3s --> " + varUb3s + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
