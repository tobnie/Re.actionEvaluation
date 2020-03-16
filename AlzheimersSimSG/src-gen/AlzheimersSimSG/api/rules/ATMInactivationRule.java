package AlzheimersSimSG.api.rules;

import AlzheimerModel.ATMA;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.ATMInactivationMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>ATMInactivation()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class ATMInactivationRule extends GraphTransformationRule<ATMInactivationMatch, ATMInactivationRule> {
	private static String patternName = "ATMInactivation";

	/**
	 * Creates a new rule ATMInactivation().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public ATMInactivationRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected ATMInactivationMatch convertMatch(final IMatch match) {
		return new ATMInactivationMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("atma");
		return names;
	}

	/**
	 * Binds the node atma to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ATMInactivationRule bindAtma(final ATMA object) {
		parameters.put("atma", Objects.requireNonNull(object, "atma must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	atma --> " + parameters.get("atma") + System.lineSeparator();
		s += "}";
		return s;
	}
}
