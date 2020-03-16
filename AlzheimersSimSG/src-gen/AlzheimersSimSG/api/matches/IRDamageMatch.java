package AlzheimersSimSG.api.matches;

import AlzheimerModel.IR;
import AlzheimersSimSG.api.rules.IRDamageRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>IRDamage()</code>.
 */
public class IRDamageMatch extends GraphTransformationMatch<IRDamageMatch, IRDamageRule> {
	private IR varIr;

	/**
	 * Creates a new match for the rule <code>IRDamage()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public IRDamageMatch(final IRDamageRule pattern, final IMatch match) {
		super(pattern, match);
		varIr = (IR) match.get("ir");
	}

	/**
	 * Returns the ir.
	 *
	 * @return the ir
	 */
	public IR getIr() {
		return varIr;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	ir --> " + varIr + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
