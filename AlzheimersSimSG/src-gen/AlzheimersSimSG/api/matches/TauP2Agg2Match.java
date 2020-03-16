package AlzheimersSimSG.api.matches;

import AlzheimerModel.AggTau;
import AlzheimerModel.P2_s;
import AlzheimerModel.Tau;
import AlzheimersSimSG.api.rules.TauP2Agg2Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>TauP2Agg2()</code>.
 */
public class TauP2Agg2Match extends GraphTransformationMatch<TauP2Agg2Match, TauP2Agg2Rule> {
	private AggTau varAgg1;
	private Tau varTau1;
	private P2_s varP2s;

	/**
	 * Creates a new match for the rule <code>TauP2Agg2()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public TauP2Agg2Match(final TauP2Agg2Rule pattern, final IMatch match) {
		super(pattern, match);
		varAgg1 = (AggTau) match.get("agg1");
		varTau1 = (Tau) match.get("tau1");
		varP2s = (P2_s) match.get("p2s");
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
		s += "	agg1 --> " + varAgg1 + System.lineSeparator();
		s += "	tau1 --> " + varTau1 + System.lineSeparator();
		s += "	p2s --> " + varP2s + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
