package AlzheimersSimSG.api.rules;

import AlzheimerModel.P53;
import AlzheimerModel.P_s;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.P53DePhosphoMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>P53DePhospho()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class P53DePhosphoRule extends GraphTransformationRule<P53DePhosphoMatch, P53DePhosphoRule> {
	private static String patternName = "P53DePhospho";

	/**
	 * Creates a new rule P53DePhospho().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public P53DePhosphoRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected P53DePhosphoMatch convertMatch(final IMatch match) {
		return new P53DePhosphoMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("p53");
		names.add("ps");
		names.add("us");
		return names;
	}

	/**
	 * Binds the node p53 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53DePhosphoRule bindP53(final P53 object) {
		parameters.put("p53", Objects.requireNonNull(object, "p53 must not be null!"));
		return this;
	}

	/**
	 * Binds the node ps to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53DePhosphoRule bindPs(final P_s object) {
		parameters.put("ps", Objects.requireNonNull(object, "ps must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53DePhosphoRule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	p53 --> " + parameters.get("p53") + System.lineSeparator();
		s += "	ps --> " + parameters.get("ps") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "}";
		return s;
	}
}
