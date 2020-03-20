package PatternSizeSimSG.api.rules;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import Params6Model.V;
import PatternSizeSimSG.api.matches.U_a_V_aBoundTrgMatch;
import PatternSizeSimSG.api.PatternSizeSimSGAPI;

/**
 * The rule <code>U_a_V_aBoundTrg()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class U_a_V_aBoundTrgRule extends GraphTransformationRule<U_a_V_aBoundTrgMatch, U_a_V_aBoundTrgRule> {
	private static String patternName = "U_a_V_aBoundTrg";

	/**
	 * Creates a new rule U_a_V_aBoundTrg().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public U_a_V_aBoundTrgRule(final PatternSizeSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected U_a_V_aBoundTrgMatch convertMatch(final IMatch match) {
		return new U_a_V_aBoundTrgMatch(this, match);
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
	public U_a_V_aBoundTrgRule bindTrg(final V object) {
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
