package AlzheimersSimSG.api.rules;

import AlzheimerModel.BasalROS;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.BasalROSDamageMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>BasalROSDamage()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class BasalROSDamageRule extends GraphTransformationRule<BasalROSDamageMatch, BasalROSDamageRule> {
	private static String patternName = "BasalROSDamage";

	/**
	 * Creates a new rule BasalROSDamage().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public BasalROSDamageRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected BasalROSDamageMatch convertMatch(final IMatch match) {
		return new BasalROSDamageMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("basalRos");
		return names;
	}

	/**
	 * Binds the node basalRos to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public BasalROSDamageRule bindBasalRos(final BasalROS object) {
		parameters.put("basalRos", Objects.requireNonNull(object, "basalRos must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	basalRos --> " + parameters.get("basalRos") + System.lineSeparator();
		s += "}";
		return s;
	}
}
