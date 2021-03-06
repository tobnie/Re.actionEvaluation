package gklSimSG.api.rules;

import GKL1600Model.P;
import gklSimSG.api.GklSimSGAPI;
import gklSimSG.api.matches.P_a_T_yBoundSrcMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>P_a_T_yBoundSrc()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class P_a_T_yBoundSrcRule extends GraphTransformationRule<P_a_T_yBoundSrcMatch, P_a_T_yBoundSrcRule> {
	private static String patternName = "P_a_T_yBoundSrc";

	/**
	 * Creates a new rule P_a_T_yBoundSrc().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public P_a_T_yBoundSrcRule(final GklSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected P_a_T_yBoundSrcMatch convertMatch(final IMatch match) {
		return new P_a_T_yBoundSrcMatch(this, match);
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
	public P_a_T_yBoundSrcRule bindSrc(final P object) {
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
