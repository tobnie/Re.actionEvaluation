package PatternSizeSimSG.api.rules;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import Params6Model.X;
import PatternSizeSimSG.api.matches.W_a_X_aBoundTrgMatch;
import PatternSizeSimSG.api.PatternSizeSimSGAPI;

/**
 * The rule <code>W_a_X_aBoundTrg()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class W_a_X_aBoundTrgRule extends GraphTransformationRule<W_a_X_aBoundTrgMatch, W_a_X_aBoundTrgRule> {
	private static String patternName = "W_a_X_aBoundTrg";

	/**
	 * Creates a new rule W_a_X_aBoundTrg().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public W_a_X_aBoundTrgRule(final PatternSizeSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected W_a_X_aBoundTrgMatch convertMatch(final IMatch match) {
		return new W_a_X_aBoundTrgMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("trg");
		return names;
	}

	/**
	 * Binds the node trg to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public W_a_X_aBoundTrgRule bindTrg(final X object) {
		parameters.put("trg", Objects.requireNonNull(object, "trg must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	trg --> " + parameters.get("trg") + System.lineSeparator();
		s += "}";
		return s;
	}
}
