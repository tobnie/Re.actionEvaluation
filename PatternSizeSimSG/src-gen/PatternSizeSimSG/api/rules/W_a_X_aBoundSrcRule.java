package PatternSizeSimSG.api.rules;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import Params6Model.W;
import PatternSizeSimSG.api.matches.W_a_X_aBoundSrcMatch;
import PatternSizeSimSG.api.PatternSizeSimSGAPI;

/**
 * The rule <code>W_a_X_aBoundSrc()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class W_a_X_aBoundSrcRule extends GraphTransformationRule<W_a_X_aBoundSrcMatch, W_a_X_aBoundSrcRule> {
	private static String patternName = "W_a_X_aBoundSrc";

	/**
	 * Creates a new rule W_a_X_aBoundSrc().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public W_a_X_aBoundSrcRule(final PatternSizeSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected W_a_X_aBoundSrcMatch convertMatch(final IMatch match) {
		return new W_a_X_aBoundSrcMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("src");
		return names;
	}

	/**
	 * Binds the node src to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public W_a_X_aBoundSrcRule bindSrc(final W object) {
		parameters.put("src", Objects.requireNonNull(object, "src must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	src --> " + parameters.get("src") + System.lineSeparator();
		s += "}";
		return s;
	}
}
