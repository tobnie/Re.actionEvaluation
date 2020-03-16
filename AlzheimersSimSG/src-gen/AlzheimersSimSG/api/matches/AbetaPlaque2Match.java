package AlzheimersSimSG.api.matches;

import AlzheimerModel.AbetaPlaque;
import AlzheimerModel.AggAbeta;
import AlzheimersSimSG.api.rules.AbetaPlaque2Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>AbetaPlaque2()</code>.
 */
public class AbetaPlaque2Match extends GraphTransformationMatch<AbetaPlaque2Match, AbetaPlaque2Rule> {
	private AbetaPlaque varPlaque1;
	private AggAbeta varAgg1;

	/**
	 * Creates a new match for the rule <code>AbetaPlaque2()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public AbetaPlaque2Match(final AbetaPlaque2Rule pattern, final IMatch match) {
		super(pattern, match);
		varPlaque1 = (AbetaPlaque) match.get("plaque1");
		varAgg1 = (AggAbeta) match.get("agg1");
	}

	/**
	 * Returns the plaque1.
	 *
	 * @return the plaque1
	 */
	public AbetaPlaque getPlaque1() {
		return varPlaque1;
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
		s += "	plaque1 --> " + varPlaque1 + System.lineSeparator();
		s += "	agg1 --> " + varAgg1 + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
