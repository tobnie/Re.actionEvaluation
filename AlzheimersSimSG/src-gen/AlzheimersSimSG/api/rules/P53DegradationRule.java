package AlzheimersSimSG.api.rules;

import AlzheimerModel.ATP;
import AlzheimerModel.P53;
import AlzheimerModel.Proteasome;
import AlzheimerModel.UB4_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.P53DegradationMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>P53Degradation()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class P53DegradationRule extends GraphTransformationRule<P53DegradationMatch, P53DegradationRule> {
	private static String patternName = "P53Degradation";

	/**
	 * Creates a new rule P53Degradation().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public P53DegradationRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected P53DegradationMatch convertMatch(final IMatch match) {
		return new P53DegradationMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("prot");
		names.add("p53");
		names.add("atp");
		names.add("ub4s");
		return names;
	}

	/**
	 * Binds the node prot to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53DegradationRule bindProt(final Proteasome object) {
		parameters.put("prot", Objects.requireNonNull(object, "prot must not be null!"));
		return this;
	}

	/**
	 * Binds the node p53 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53DegradationRule bindP53(final P53 object) {
		parameters.put("p53", Objects.requireNonNull(object, "p53 must not be null!"));
		return this;
	}

	/**
	 * Binds the node atp to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53DegradationRule bindAtp(final ATP object) {
		parameters.put("atp", Objects.requireNonNull(object, "atp must not be null!"));
		return this;
	}

	/**
	 * Binds the node ub4s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53DegradationRule bindUb4s(final UB4_s object) {
		parameters.put("ub4s", Objects.requireNonNull(object, "ub4s must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	prot --> " + parameters.get("prot") + System.lineSeparator();
		s += "	p53 --> " + parameters.get("p53") + System.lineSeparator();
		s += "	atp --> " + parameters.get("atp") + System.lineSeparator();
		s += "	ub4s --> " + parameters.get("ub4s") + System.lineSeparator();
		s += "}";
		return s;
	}
}
