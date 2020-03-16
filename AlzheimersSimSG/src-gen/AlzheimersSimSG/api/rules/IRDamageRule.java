package AlzheimersSimSG.api.rules;

import AlzheimerModel.IR;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.IRDamageMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>IRDamage()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class IRDamageRule extends GraphTransformationRule<IRDamageMatch, IRDamageRule> {
	private static String patternName = "IRDamage";

	/**
	 * Creates a new rule IRDamage().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public IRDamageRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected IRDamageMatch convertMatch(final IMatch match) {
		return new IRDamageMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("ir");
		return names;
	}

	/**
	 * Binds the node ir to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public IRDamageRule bindIr(final IR object) {
		parameters.put("ir", Objects.requireNonNull(object, "ir must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	ir --> " + parameters.get("ir") + System.lineSeparator();
		s += "}";
		return s;
	}
}
