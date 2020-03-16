package AlzheimersSimSG.api.rules;

import AlzheimerModel.MT;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.MT_l_Tau_phosBoundSrcMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>MT_l_Tau_phosBoundSrc()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class MT_l_Tau_phosBoundSrcRule extends GraphTransformationRule<MT_l_Tau_phosBoundSrcMatch, MT_l_Tau_phosBoundSrcRule> {
	private static String patternName = "MT_l_Tau_phosBoundSrc";

	/**
	 * Creates a new rule MT_l_Tau_phosBoundSrc().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public MT_l_Tau_phosBoundSrcRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected MT_l_Tau_phosBoundSrcMatch convertMatch(final IMatch match) {
		return new MT_l_Tau_phosBoundSrcMatch(this, match);
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
	public MT_l_Tau_phosBoundSrcRule bindSrc(final MT object) {
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
