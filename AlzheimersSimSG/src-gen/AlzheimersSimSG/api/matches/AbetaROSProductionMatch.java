package AlzheimersSimSG.api.matches;

import AlzheimerModel.AggAbeta;
import AlzheimersSimSG.api.rules.AbetaROSProductionRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>AbetaROSProduction()</code>.
 */
public class AbetaROSProductionMatch extends GraphTransformationMatch<AbetaROSProductionMatch, AbetaROSProductionRule> {
	private AggAbeta varAgg;

	/**
	 * Creates a new match for the rule <code>AbetaROSProduction()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public AbetaROSProductionMatch(final AbetaROSProductionRule pattern, final IMatch match) {
		super(pattern, match);
		varAgg = (AggAbeta) match.get("agg");
	}

	/**
	 * Returns the agg.
	 *
	 * @return the agg
	 */
	public AggAbeta getAgg() {
		return varAgg;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	agg --> " + varAgg + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
