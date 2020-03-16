package AlzheimersSimSG.api.matches;

import AlzheimerModel.Abeta;
import AlzheimerModel.AggAbeta;
import AlzheimersSimSG.api.rules.AbetaAgg2Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>AbetaAgg2()</code>.
 */
public class AbetaAgg2Match extends GraphTransformationMatch<AbetaAgg2Match, AbetaAgg2Rule> {
	private Abeta varAbeta1;
	private AggAbeta varAgg1;

	/**
	 * Creates a new match for the rule <code>AbetaAgg2()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public AbetaAgg2Match(final AbetaAgg2Rule pattern, final IMatch match) {
		super(pattern, match);
		varAbeta1 = (Abeta) match.get("abeta1");
		varAgg1 = (AggAbeta) match.get("agg1");
	}

	/**
	 * Returns the abeta1.
	 *
	 * @return the abeta1
	 */
	public Abeta getAbeta1() {
		return varAbeta1;
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
		s += "	abeta1 --> " + varAbeta1 + System.lineSeparator();
		s += "	agg1 --> " + varAgg1 + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
