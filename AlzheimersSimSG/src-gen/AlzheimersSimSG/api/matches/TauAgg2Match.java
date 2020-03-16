package AlzheimersSimSG.api.matches;

import AlzheimerModel.AggTau;
import AlzheimerModel.Tau;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.rules.TauAgg2Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>TauAgg2()</code>.
 */
public class TauAgg2Match extends GraphTransformationMatch<TauAgg2Match, TauAgg2Rule> {
	private AggTau varAgg1;
	private Tau varTau1;
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>TauAgg2()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public TauAgg2Match(final TauAgg2Rule pattern, final IMatch match) {
		super(pattern, match);
		varAgg1 = (AggTau) match.get("agg1");
		varTau1 = (Tau) match.get("tau1");
		varUs = (U_s) match.get("us");
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
	 * Returns the us.
	 *
	 * @return the us
	 */
	public U_s getUs() {
		return varUs;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	agg1 --> " + varAgg1 + System.lineSeparator();
		s += "	tau1 --> " + varTau1 + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
