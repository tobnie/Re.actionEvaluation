package AlzheimersSimSG.api.rules;

import AlzheimerModel.GSK3b;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.P53_b_GSK3b_xBoundTrgMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>P53_b_GSK3b_xBoundTrg()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class P53_b_GSK3b_xBoundTrgRule extends GraphTransformationRule<P53_b_GSK3b_xBoundTrgMatch, P53_b_GSK3b_xBoundTrgRule> {
	private static String patternName = "P53_b_GSK3b_xBoundTrg";

	/**
	 * Creates a new rule P53_b_GSK3b_xBoundTrg().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public P53_b_GSK3b_xBoundTrgRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected P53_b_GSK3b_xBoundTrgMatch convertMatch(final IMatch match) {
		return new P53_b_GSK3b_xBoundTrgMatch(this, match);
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
	public P53_b_GSK3b_xBoundTrgRule bindTrg(final GSK3b object) {
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
