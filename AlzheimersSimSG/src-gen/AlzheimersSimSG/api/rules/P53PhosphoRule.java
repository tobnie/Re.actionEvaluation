package AlzheimersSimSG.api.rules;

import AlzheimerModel.ATMA;
import AlzheimerModel.P53;
import AlzheimerModel.P_s;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.P53PhosphoMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>P53Phospho()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class P53PhosphoRule extends GraphTransformationRule<P53PhosphoMatch, P53PhosphoRule> {
	private static String patternName = "P53Phospho";

	/**
	 * Creates a new rule P53Phospho().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public P53PhosphoRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected P53PhosphoMatch convertMatch(final IMatch match) {
		return new P53PhosphoMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("atma");
		names.add("p53");
		names.add("us");
		names.add("ps");
		return names;
	}

	/**
	 * Binds the node atma to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53PhosphoRule bindAtma(final ATMA object) {
		parameters.put("atma", Objects.requireNonNull(object, "atma must not be null!"));
		return this;
	}

	/**
	 * Binds the node p53 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53PhosphoRule bindP53(final P53 object) {
		parameters.put("p53", Objects.requireNonNull(object, "p53 must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53PhosphoRule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	/**
	 * Binds the node ps to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53PhosphoRule bindPs(final P_s object) {
		parameters.put("ps", Objects.requireNonNull(object, "ps must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	atma --> " + parameters.get("atma") + System.lineSeparator();
		s += "	p53 --> " + parameters.get("p53") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "	ps --> " + parameters.get("ps") + System.lineSeparator();
		s += "}";
		return s;
	}
}
