package AlzheimersSimSG.api.matches;

import AlzheimerModel.Mdm2;
import AlzheimerModel.Mdm2DUB;
import AlzheimerModel.UB1_s;
import AlzheimerModel.UB2_s;
import AlzheimersSimSG.api.rules.Mdm2polyDeubiquination1Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>mdm2polyDeubiquination1()</code>.
 */
public class Mdm2polyDeubiquination1Match extends GraphTransformationMatch<Mdm2polyDeubiquination1Match, Mdm2polyDeubiquination1Rule> {
	private Mdm2DUB varMdm2dub;
	private Mdm2 varMdm2;
	private UB2_s varUb2s;
	private UB1_s varUb1s;

	/**
	 * Creates a new match for the rule <code>mdm2polyDeubiquination1()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Mdm2polyDeubiquination1Match(final Mdm2polyDeubiquination1Rule pattern, final IMatch match) {
		super(pattern, match);
		varMdm2dub = (Mdm2DUB) match.get("mdm2dub");
		varMdm2 = (Mdm2) match.get("mdm2");
		varUb2s = (UB2_s) match.get("ub2s");
		varUb1s = (UB1_s) match.get("ub1s");
	}

	/**
	 * Returns the mdm2dub.
	 *
	 * @return the mdm2dub
	 */
	public Mdm2DUB getMdm2dub() {
		return varMdm2dub;
	}

	/**
	 * Returns the mdm2.
	 *
	 * @return the mdm2
	 */
	public Mdm2 getMdm2() {
		return varMdm2;
	}

	/**
	 * Returns the ub2s.
	 *
	 * @return the ub2s
	 */
	public UB2_s getUb2s() {
		return varUb2s;
	}

	/**
	 * Returns the ub1s.
	 *
	 * @return the ub1s
	 */
	public UB1_s getUb1s() {
		return varUb1s;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	mdm2dub --> " + varMdm2dub + System.lineSeparator();
		s += "	mdm2 --> " + varMdm2 + System.lineSeparator();
		s += "	ub2s --> " + varUb2s + System.lineSeparator();
		s += "	ub1s --> " + varUb1s + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
