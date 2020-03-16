package AlzheimersSimSG.api.matches;

import AlzheimerModel.BasalROS;
import AlzheimersSimSG.api.rules.BasalROSDamageRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>BasalROSDamage()</code>.
 */
public class BasalROSDamageMatch extends GraphTransformationMatch<BasalROSDamageMatch, BasalROSDamageRule> {
	private BasalROS varBasalRos;

	/**
	 * Creates a new match for the rule <code>BasalROSDamage()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public BasalROSDamageMatch(final BasalROSDamageRule pattern, final IMatch match) {
		super(pattern, match);
		varBasalRos = (BasalROS) match.get("basalRos");
	}

	/**
	 * Returns the basalRos.
	 *
	 * @return the basalRos
	 */
	public BasalROS getBasalRos() {
		return varBasalRos;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	basalRos --> " + varBasalRos + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
