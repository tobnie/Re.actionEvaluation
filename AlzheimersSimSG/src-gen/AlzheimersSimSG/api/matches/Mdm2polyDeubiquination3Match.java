package AlzheimersSimSG.api.matches;

import AlzheimerModel.Mdm2;
import AlzheimerModel.Mdm2DUB;
import AlzheimerModel.UB3_s;
import AlzheimerModel.UB4_s;
import AlzheimersSimSG.api.rules.Mdm2polyDeubiquination3Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>mdm2polyDeubiquination3()</code>.
 */
public class Mdm2polyDeubiquination3Match extends GraphTransformationMatch<Mdm2polyDeubiquination3Match, Mdm2polyDeubiquination3Rule> {
	private Mdm2DUB varMdm2dub;
	private Mdm2 varMdm2;
	private UB4_s varUb4s;
	private UB3_s varUb3s;

	/**
	 * Creates a new match for the rule <code>mdm2polyDeubiquination3()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Mdm2polyDeubiquination3Match(final Mdm2polyDeubiquination3Rule pattern, final IMatch match) {
		super(pattern, match);
		varMdm2dub = (Mdm2DUB) match.get("mdm2dub");
		varMdm2 = (Mdm2) match.get("mdm2");
		varUb4s = (UB4_s) match.get("ub4s");
		varUb3s = (UB3_s) match.get("ub3s");
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
	 * Returns the ub4s.
	 *
	 * @return the ub4s
	 */
	public UB4_s getUb4s() {
		return varUb4s;
	}

	/**
	 * Returns the ub3s.
	 *
	 * @return the ub3s
	 */
	public UB3_s getUb3s() {
		return varUb3s;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	mdm2dub --> " + varMdm2dub + System.lineSeparator();
		s += "	mdm2 --> " + varMdm2 + System.lineSeparator();
		s += "	ub4s --> " + varUb4s + System.lineSeparator();
		s += "	ub3s --> " + varUb3s + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
