package AlzheimersSimSG.api.matches;

import AlzheimerModel.GSK3b;
import AlzheimerModel.P1_s;
import AlzheimerModel.P53;
import AlzheimerModel.Tau;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.rules.TauPhosphorylation1_3Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>TauPhosphorylation1_3()</code>.
 */
public class TauPhosphorylation1_3Match extends GraphTransformationMatch<TauPhosphorylation1_3Match, TauPhosphorylation1_3Rule> {
	private Tau varTau;
	private U_s varUs;
	private GSK3b varGsk;
	private P53 varP53;
	private P1_s varP1s;

	/**
	 * Creates a new match for the rule <code>TauPhosphorylation1_3()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public TauPhosphorylation1_3Match(final TauPhosphorylation1_3Rule pattern, final IMatch match) {
		super(pattern, match);
		varTau = (Tau) match.get("tau");
		varUs = (U_s) match.get("us");
		varGsk = (GSK3b) match.get("gsk");
		varP53 = (P53) match.get("p53");
		varP1s = (P1_s) match.get("p1s");
	}

	/**
	 * Returns the tau.
	 *
	 * @return the tau
	 */
	public Tau getTau() {
		return varTau;
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
	 * Returns the gsk.
	 *
	 * @return the gsk
	 */
	public GSK3b getGsk() {
		return varGsk;
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
	 * Returns the p1s.
	 *
	 * @return the p1s
	 */
	public P1_s getP1s() {
		return varP1s;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	tau --> " + varTau + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "	gsk --> " + varGsk + System.lineSeparator();
		s += "	p53 --> " + varP53 + System.lineSeparator();
		s += "	p1s --> " + varP1s + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
