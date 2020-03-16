package AlzheimersSimSG.api.matches;

import AlzheimerModel.P2_s;
import AlzheimerModel.Tau;
import AlzheimersSimSG.api.rules.TauP2Agg1Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>TauP2Agg1()</code>.
 */
public class TauP2Agg1Match extends GraphTransformationMatch<TauP2Agg1Match, TauP2Agg1Rule> {
	private Tau varTau2;
	private Tau varTau1;
	private P2_s varP2s;

	/**
	 * Creates a new match for the rule <code>TauP2Agg1()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public TauP2Agg1Match(final TauP2Agg1Rule pattern, final IMatch match) {
		super(pattern, match);
		varTau2 = (Tau) match.get("tau2");
		varTau1 = (Tau) match.get("tau1");
		varP2s = (P2_s) match.get("p2s");
	}

	/**
	 * Returns the tau2.
	 *
	 * @return the tau2
	 */
	public Tau getTau2() {
		return varTau2;
	}

	/**
	 * Returns the tau1.
	 *
	 * @return the tau1
	 */
	public Tau getTau1() {
		return varTau1;
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
		s += "	tau2 --> " + varTau2 + System.lineSeparator();
		s += "	tau1 --> " + varTau1 + System.lineSeparator();
		s += "	p2s --> " + varP2s + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
