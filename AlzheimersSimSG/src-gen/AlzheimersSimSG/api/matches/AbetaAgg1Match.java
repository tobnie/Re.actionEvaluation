package AlzheimersSimSG.api.matches;

import AlzheimerModel.Abeta;
import AlzheimersSimSG.api.rules.AbetaAgg1Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>AbetaAgg1()</code>.
 */
public class AbetaAgg1Match extends GraphTransformationMatch<AbetaAgg1Match, AbetaAgg1Rule> {
	private Abeta varAbeta1;
	private Abeta varAbeta2;

	/**
	 * Creates a new match for the rule <code>AbetaAgg1()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public AbetaAgg1Match(final AbetaAgg1Rule pattern, final IMatch match) {
		super(pattern, match);
		varAbeta1 = (Abeta) match.get("abeta1");
		varAbeta2 = (Abeta) match.get("abeta2");
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
	 * Returns the abeta2.
	 *
	 * @return the abeta2
	 */
	public Abeta getAbeta2() {
		return varAbeta2;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	abeta1 --> " + varAbeta1 + System.lineSeparator();
		s += "	abeta2 --> " + varAbeta2 + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
