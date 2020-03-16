package AlzheimersSimSG.api.rules;

import AlzheimerModel.U_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.TauSynthesisMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>TauSynthesis()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class TauSynthesisRule extends GraphTransformationRule<TauSynthesisMatch, TauSynthesisRule> {
	private static String patternName = "TauSynthesis";

	/**
	 * Creates a new rule TauSynthesis().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public TauSynthesisRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected TauSynthesisMatch convertMatch(final IMatch match) {
		return new TauSynthesisMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("us");
		return names;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauSynthesisRule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "}";
		return s;
	}
}
