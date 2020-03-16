package AlzheimersSimSG.api.matches;

import AlzheimerModel.GSK3b;
import AlzheimerModel.P1_s;
import AlzheimerModel.P2_s;
import AlzheimerModel.Tau;
import AlzheimersSimSG.api.rules.TauPhosphorylation6Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>TauPhosphorylation6()</code>.
 */
public class TauPhosphorylation6Match extends GraphTransformationMatch<TauPhosphorylation6Match, TauPhosphorylation6Rule> {
	private Tau varTau;
	private P1_s varP1s;
	private GSK3b varGsk;
	private P2_s varP2s;

	/**
	 * Creates a new match for the rule <code>TauPhosphorylation6()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public TauPhosphorylation6Match(final TauPhosphorylation6Rule pattern, final IMatch match) {
		super(pattern, match);
		varTau = (Tau) match.get("tau");
		varP1s = (P1_s) match.get("p1s");
		varGsk = (GSK3b) match.get("gsk");
		varP2s = (P2_s) match.get("p2s");
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
	 * Returns the p1s.
	 *
	 * @return the p1s
	 */
	public P1_s getP1s() {
		return varP1s;
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
	 * Returns the p2s.
	 *
	 * @return the p2s
	 */
	public P2_s getP2s() {
		return varP2s;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	tau --> " + varTau + System.lineSeparator();
		s += "	p1s --> " + varP1s + System.lineSeparator();
		s += "	gsk --> " + varGsk + System.lineSeparator();
		s += "	p2s --> " + varP2s + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
