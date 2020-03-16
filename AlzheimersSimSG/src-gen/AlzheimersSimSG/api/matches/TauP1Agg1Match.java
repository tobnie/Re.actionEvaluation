package AlzheimersSimSG.api.matches;

import AlzheimerModel.P1_s;
import AlzheimerModel.Tau;
import AlzheimersSimSG.api.rules.TauP1Agg1Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>TauP1Agg1()</code>.
 */
public class TauP1Agg1Match extends GraphTransformationMatch<TauP1Agg1Match, TauP1Agg1Rule> {
	private Tau varTau2;
	private Tau varTau1;
	private P1_s varP1s;

	/**
	 * Creates a new match for the rule <code>TauP1Agg1()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public TauP1Agg1Match(final TauP1Agg1Rule pattern, final IMatch match) {
		super(pattern, match);
		varTau2 = (Tau) match.get("tau2");
		varTau1 = (Tau) match.get("tau1");
		varP1s = (P1_s) match.get("p1s");
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
		s += "	tau2 --> " + varTau2 + System.lineSeparator();
		s += "	tau1 --> " + varTau1 + System.lineSeparator();
		s += "	p1s --> " + varP1s + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
