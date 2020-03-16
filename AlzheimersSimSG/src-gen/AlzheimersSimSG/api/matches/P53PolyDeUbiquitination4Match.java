package AlzheimersSimSG.api.matches;

import AlzheimerModel.Mdm2;
import AlzheimerModel.P53;
import AlzheimerModel.P53DUB;
import AlzheimerModel.U_s;
import AlzheimerModel.UB3_s;
import AlzheimerModel.UB4_s;
import AlzheimersSimSG.api.rules.P53PolyDeUbiquitination4Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>P53PolyDeUbiquitination4()</code>.
 */
public class P53PolyDeUbiquitination4Match extends GraphTransformationMatch<P53PolyDeUbiquitination4Match, P53PolyDeUbiquitination4Rule> {
	private P53DUB varP53dub;
	private Mdm2 varMdm2;
	private P53 varP53;
	private U_s varUs;
	private UB4_s varUb4s;
	private UB3_s varUb3s;

	/**
	 * Creates a new match for the rule <code>P53PolyDeUbiquitination4()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public P53PolyDeUbiquitination4Match(final P53PolyDeUbiquitination4Rule pattern, final IMatch match) {
		super(pattern, match);
		varP53dub = (P53DUB) match.get("p53dub");
		varMdm2 = (Mdm2) match.get("mdm2");
		varP53 = (P53) match.get("p53");
		varUs = (U_s) match.get("us");
		varUb4s = (UB4_s) match.get("ub4s");
		varUb3s = (UB3_s) match.get("ub3s");
	}

	/**
	 * Returns the p53dub.
	 *
	 * @return the p53dub
	 */
	public P53DUB getP53dub() {
		return varP53dub;
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
	 * Returns the ub4s.
	 *
	 * @return the ub4s
	 */
	public UB4_s getUb4s() {
		return varUb4s;
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
		s += "	p53dub --> " + varP53dub + System.lineSeparator();
		s += "	mdm2 --> " + varMdm2 + System.lineSeparator();
		s += "	p53 --> " + varP53 + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "	ub4s --> " + varUb4s + System.lineSeparator();
		s += "	ub3s --> " + varUb3s + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
