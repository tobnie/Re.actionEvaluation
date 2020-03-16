package AlzheimersSimSG.api.matches;

import AlzheimerModel.AggTau;
import AlzheimerModel.P1_s;
import AlzheimerModel.Tau;
import AlzheimersSimSG.api.rules.TauP1Agg2Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>TauP1Agg2()</code>.
 */
public class TauP1Agg2Match extends GraphTransformationMatch<TauP1Agg2Match, TauP1Agg2Rule> {
	private AggTau varAgg1;
	private Tau varTau1;
	private P1_s varP1s;

	/**
	 * Creates a new match for the rule <code>TauP1Agg2()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public TauP1Agg2Match(final TauP1Agg2Rule pattern, final IMatch match) {
		super(pattern, match);
		varAgg1 = (AggTau) match.get("agg1");
		varTau1 = (Tau) match.get("tau1");
		varP1s = (P1_s) match.get("p1s");
	}

	/**
	 * Returns the agg1.
	 *
	 * @return the agg1
	 */
	public AggTau getAgg1() {
		return varAgg1;
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
		s += "	agg1 --> " + varAgg1 + System.lineSeparator();
		s += "	tau1 --> " + varTau1 + System.lineSeparator();
		s += "	p1s --> " + varP1s + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
