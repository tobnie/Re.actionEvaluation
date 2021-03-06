package PatternSizeSimSG.api.rules;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import Params6Model.U;
import Params6Model.V;
import Params6Model.W;
import Params6Model.X;
import Params6Model.Y;
import Params6Model.Z;
import PatternSizeSimSG.api.matches.OscMatch;
import PatternSizeSimSG.api.PatternSizeSimSGAPI;

/**
 * The rule <code>osc()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class OscRule extends GraphTransformationRule<OscMatch, OscRule> {
	private static String patternName = "osc";

	/**
	 * Creates a new rule osc().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public OscRule(final PatternSizeSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected OscMatch convertMatch(final IMatch match) {
		return new OscMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("u");
		names.add("v");
		names.add("w");
		names.add("x");
		names.add("y");
		names.add("z");
		return names;
	}

	/**
	 * Binds the node u to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public OscRule bindU(final U object) {
		parameters.put("u", Objects.requireNonNull(object, "u must not be null!"));
		return this;
	}

	/**
	 * Binds the node v to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public OscRule bindV(final V object) {
		parameters.put("v", Objects.requireNonNull(object, "v must not be null!"));
		return this;
	}

	/**
	 * Binds the node w to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public OscRule bindW(final W object) {
		parameters.put("w", Objects.requireNonNull(object, "w must not be null!"));
		return this;
	}

	/**
	 * Binds the node x to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public OscRule bindX(final X object) {
		parameters.put("x", Objects.requireNonNull(object, "x must not be null!"));
		return this;
	}

	/**
	 * Binds the node y to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public OscRule bindY(final Y object) {
		parameters.put("y", Objects.requireNonNull(object, "y must not be null!"));
		return this;
	}

	/**
	 * Binds the node z to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public OscRule bindZ(final Z object) {
		parameters.put("z", Objects.requireNonNull(object, "z must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	u --> " + parameters.get("u") + System.lineSeparator();
		s += "	v --> " + parameters.get("v") + System.lineSeparator();
		s += "	w --> " + parameters.get("w") + System.lineSeparator();
		s += "	x --> " + parameters.get("x") + System.lineSeparator();
		s += "	y --> " + parameters.get("y") + System.lineSeparator();
		s += "	z --> " + parameters.get("z") + System.lineSeparator();
		s += "}";
		return s;
	}
}
