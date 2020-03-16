package AlzheimersSimSG.api.matches;

import AlzheimerModel.AggTau;
import AlzheimersSimSG.api.rules.TangleForm1Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>tangleForm1()</code>.
 */
public class TangleForm1Match extends GraphTransformationMatch<TangleForm1Match, TangleForm1Rule> {
	private AggTau varAgg2;
	private AggTau varAgg1;

	/**
	 * Creates a new match for the rule <code>tangleForm1()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public TangleForm1Match(final TangleForm1Rule pattern, final IMatch match) {
		super(pattern, match);
		varAgg2 = (AggTau) match.get("agg2");
		varAgg1 = (AggTau) match.get("agg1");
	}

	/**
	 * Returns the agg2.
	 *
	 * @return the agg2
	 */
	public AggTau getAgg2() {
		return varAgg2;
	}

	/**
	 * Returns the agg1.
	 *
	 * @return the agg1
	 */
	public AggTau getAgg1() {
		return varAgg1;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	agg2 --> " + varAgg2 + System.lineSeparator();
		s += "	agg1 --> " + varAgg1 + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
