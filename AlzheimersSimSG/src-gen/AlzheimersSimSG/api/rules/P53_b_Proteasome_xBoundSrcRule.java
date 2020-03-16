package AlzheimersSimSG.api.rules;

import AlzheimerModel.P53;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.P53_b_Proteasome_xBoundSrcMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>P53_b_Proteasome_xBoundSrc()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class P53_b_Proteasome_xBoundSrcRule extends GraphTransformationRule<P53_b_Proteasome_xBoundSrcMatch, P53_b_Proteasome_xBoundSrcRule> {
	private static String patternName = "P53_b_Proteasome_xBoundSrc";

	/**
	 * Creates a new rule P53_b_Proteasome_xBoundSrc().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public P53_b_Proteasome_xBoundSrcRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected P53_b_Proteasome_xBoundSrcMatch convertMatch(final IMatch match) {
		return new P53_b_Proteasome_xBoundSrcMatch(this, match);
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
	public P53_b_Proteasome_xBoundSrcRule bindSrc(final P53 object) {
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
