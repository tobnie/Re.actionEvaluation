package AlzheimersSimSG.api.matches;

import AlzheimerModel.Tau;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.rules.TauAgg1Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>TauAgg1()</code>.
 */
public class TauAgg1Match extends GraphTransformationMatch<TauAgg1Match, TauAgg1Rule> {
	private Tau varTau2;
	private Tau varTau1;
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>TauAgg1()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public TauAgg1Match(final TauAgg1Rule pattern, final IMatch match) {
		super(pattern, match);
		varTau2 = (Tau) match.get("tau2");
		varTau1 = (Tau) match.get("tau1");
		varUs = (U_s) match.get("us");
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
		s += "	tau2 --> " + varTau2 + System.lineSeparator();
		s += "	tau1 --> " + varTau1 + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
