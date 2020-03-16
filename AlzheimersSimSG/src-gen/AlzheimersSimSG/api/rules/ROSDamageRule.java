package AlzheimersSimSG.api.rules;

import AlzheimerModel.ROS;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.ROSDamageMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>ROSDamage()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class ROSDamageRule extends GraphTransformationRule<ROSDamageMatch, ROSDamageRule> {
	private static String patternName = "ROSDamage";

	/**
	 * Creates a new rule ROSDamage().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public ROSDamageRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected ROSDamageMatch convertMatch(final IMatch match) {
		return new ROSDamageMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("ros");
		return names;
	}

	/**
	 * Binds the node ros to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ROSDamageRule bindRos(final ROS object) {
		parameters.put("ros", Objects.requireNonNull(object, "ros must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	ros --> " + parameters.get("ros") + System.lineSeparator();
		s += "}";
		return s;
	}
}
