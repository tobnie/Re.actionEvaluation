package AlzheimersSimSG.api.matches;

import AlzheimerModel.Mdm2;
import AlzheimerModel.Mdm2DUB;
import AlzheimerModel.UB1_s;
import AlzheimerModel.UNB_s;
import AlzheimersSimSG.api.rules.Mdm2deubiquinationRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>mdm2deubiquination()</code>.
 */
public class Mdm2deubiquinationMatch extends GraphTransformationMatch<Mdm2deubiquinationMatch, Mdm2deubiquinationRule> {
	private Mdm2DUB varMdm2dub;
	private Mdm2 varMdm2;
	private UB1_s varUb1s;
	private UNB_s varUnbs;

	/**
	 * Creates a new match for the rule <code>mdm2deubiquination()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Mdm2deubiquinationMatch(final Mdm2deubiquinationRule pattern, final IMatch match) {
		super(pattern, match);
		varMdm2dub = (Mdm2DUB) match.get("mdm2dub");
		varMdm2 = (Mdm2) match.get("mdm2");
		varUb1s = (UB1_s) match.get("ub1s");
		varUnbs = (UNB_s) match.get("unbs");
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
	 * Returns the ub1s.
	 *
	 * @return the ub1s
	 */
	public UB1_s getUb1s() {
		return varUb1s;
	}

	/**
	 * Returns the unbs.
	 *
	 * @return the unbs
	 */
	public UNB_s getUnbs() {
		return varUnbs;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	mdm2dub --> " + varMdm2dub + System.lineSeparator();
		s += "	mdm2 --> " + varMdm2 + System.lineSeparator();
		s += "	ub1s --> " + varUb1s + System.lineSeparator();
		s += "	unbs --> " + varUnbs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
