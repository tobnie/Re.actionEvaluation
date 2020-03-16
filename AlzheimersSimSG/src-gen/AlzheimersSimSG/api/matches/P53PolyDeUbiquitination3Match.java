package AlzheimersSimSG.api.matches;

import AlzheimerModel.Mdm2;
import AlzheimerModel.P53;
import AlzheimerModel.P53DUB;
import AlzheimerModel.U_s;
import AlzheimerModel.UB2_s;
import AlzheimerModel.UB3_s;
import AlzheimersSimSG.api.rules.P53PolyDeUbiquitination3Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>P53PolyDeUbiquitination3()</code>.
 */
public class P53PolyDeUbiquitination3Match extends GraphTransformationMatch<P53PolyDeUbiquitination3Match, P53PolyDeUbiquitination3Rule> {
	private P53DUB varP53dub;
	private Mdm2 varMdm2;
	private P53 varP53;
	private U_s varUs;
	private UB3_s varUb3s;
	private UB2_s varUb2s;

	/**
	 * Creates a new match for the rule <code>P53PolyDeUbiquitination3()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public P53PolyDeUbiquitination3Match(final P53PolyDeUbiquitination3Rule pattern, final IMatch match) {
		super(pattern, match);
		varP53dub = (P53DUB) match.get("p53dub");
		varMdm2 = (Mdm2) match.get("mdm2");
		varP53 = (P53) match.get("p53");
		varUs = (U_s) match.get("us");
		varUb3s = (UB3_s) match.get("ub3s");
		varUb2s = (UB2_s) match.get("ub2s");
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
	 * Returns the ub3s.
	 *
	 * @return the ub3s
	 */
	public UB3_s getUb3s() {
		return varUb3s;
	}

	/**
	 * Returns the ub2s.
	 *
	 * @return the ub2s
	 */
	public UB2_s getUb2s() {
		return varUb2s;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	p53dub --> " + varP53dub + System.lineSeparator();
		s += "	mdm2 --> " + varMdm2 + System.lineSeparator();
		s += "	p53 --> " + varP53 + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "	ub3s --> " + varUb3s + System.lineSeparator();
		s += "	ub2s --> " + varUb2s + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
