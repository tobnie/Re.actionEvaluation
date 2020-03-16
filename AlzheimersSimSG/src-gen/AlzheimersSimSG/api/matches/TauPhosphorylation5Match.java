package AlzheimersSimSG.api.matches;

import AlzheimerModel.GSK3b;
import AlzheimerModel.P1_s;
import AlzheimerModel.Tau;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.rules.TauPhosphorylation5Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>TauPhosphorylation5()</code>.
 */
public class TauPhosphorylation5Match extends GraphTransformationMatch<TauPhosphorylation5Match, TauPhosphorylation5Rule> {
	private Tau varTau;
	private U_s varUs;
	private GSK3b varGsk;
	private P1_s varP1s;

	/**
	 * Creates a new match for the rule <code>TauPhosphorylation5()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public TauPhosphorylation5Match(final TauPhosphorylation5Rule pattern, final IMatch match) {
		super(pattern, match);
		varTau = (Tau) match.get("tau");
		varUs = (U_s) match.get("us");
		varGsk = (GSK3b) match.get("gsk");
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
		s += "	p1s --> " + varP1s + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
