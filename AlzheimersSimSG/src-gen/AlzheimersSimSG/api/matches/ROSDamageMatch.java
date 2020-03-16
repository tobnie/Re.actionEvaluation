package AlzheimersSimSG.api.matches;

import AlzheimerModel.ROS;
import AlzheimersSimSG.api.rules.ROSDamageRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>ROSDamage()</code>.
 */
public class ROSDamageMatch extends GraphTransformationMatch<ROSDamageMatch, ROSDamageRule> {
	private ROS varRos;

	/**
	 * Creates a new match for the rule <code>ROSDamage()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ROSDamageMatch(final ROSDamageRule pattern, final IMatch match) {
		super(pattern, match);
		varRos = (ROS) match.get("ros");
	}

	/**
	 * Returns the ros.
	 *
	 * @return the ros
	 */
	public ROS getRos() {
		return varRos;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	ros --> " + varRos + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
