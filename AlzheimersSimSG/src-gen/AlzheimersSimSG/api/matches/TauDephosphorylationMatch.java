package AlzheimersSimSG.api.matches;

import AlzheimerModel.P1_s;
import AlzheimerModel.P2_s;
import AlzheimerModel.PPT;
import AlzheimerModel.Tau;
import AlzheimersSimSG.api.rules.TauDephosphorylationRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>TauDephosphorylation()</code>.
 */
public class TauDephosphorylationMatch extends GraphTransformationMatch<TauDephosphorylationMatch, TauDephosphorylationRule> {
	private PPT varPpt;
	private Tau varTau;
	private P2_s varP2s;
	private P1_s varP1s;

	/**
	 * Creates a new match for the rule <code>TauDephosphorylation()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public TauDephosphorylationMatch(final TauDephosphorylationRule pattern, final IMatch match) {
		super(pattern, match);
		varPpt = (PPT) match.get("ppt");
		varTau = (Tau) match.get("tau");
		varP2s = (P2_s) match.get("p2s");
		varP1s = (P1_s) match.get("p1s");
	}

	/**
	 * Returns the ppt.
	 *
	 * @return the ppt
	 */
	public PPT getPpt() {
		return varPpt;
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
	 * Returns the p2s.
	 *
	 * @return the p2s
	 */
	public P2_s getP2s() {
		return varP2s;
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
		s += "	ppt --> " + varPpt + System.lineSeparator();
		s += "	tau --> " + varTau + System.lineSeparator();
		s += "	p2s --> " + varP2s + System.lineSeparator();
		s += "	p1s --> " + varP1s + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
