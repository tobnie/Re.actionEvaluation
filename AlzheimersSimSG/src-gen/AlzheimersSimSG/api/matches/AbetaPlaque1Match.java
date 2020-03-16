package AlzheimersSimSG.api.matches;

import AlzheimerModel.AggAbeta;
import AlzheimersSimSG.api.rules.AbetaPlaque1Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>AbetaPlaque1()</code>.
 */
public class AbetaPlaque1Match extends GraphTransformationMatch<AbetaPlaque1Match, AbetaPlaque1Rule> {
	private AggAbeta varAgg2;
	private AggAbeta varAgg1;

	/**
	 * Creates a new match for the rule <code>AbetaPlaque1()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public AbetaPlaque1Match(final AbetaPlaque1Rule pattern, final IMatch match) {
		super(pattern, match);
		varAgg2 = (AggAbeta) match.get("agg2");
		varAgg1 = (AggAbeta) match.get("agg1");
	}

	/**
	 * Returns the agg2.
	 *
	 * @return the agg2
	 */
	public AggAbeta getAgg2() {
		return varAgg2;
	}

	/**
	 * Returns the agg1.
	 *
	 * @return the agg1
	 */
	public AggAbeta getAgg1() {
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
