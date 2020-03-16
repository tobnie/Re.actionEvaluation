package AlzheimersSimSG.api.rules;

import AlzheimerModel.GSK3b;
import AlzheimerModel.P53;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.GSK3b_p53Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>GSK3b_p53()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class GSK3b_p53Rule extends GraphTransformationRule<GSK3b_p53Match, GSK3b_p53Rule> {
	private static String patternName = "GSK3b_p53";

	/**
	 * Creates a new rule GSK3b_p53().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public GSK3b_p53Rule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected GSK3b_p53Match convertMatch(final IMatch match) {
		return new GSK3b_p53Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("gsk");
		names.add("p53");
		return names;
	}

	/**
	 * Binds the node gsk to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public GSK3b_p53Rule bindGsk(final GSK3b object) {
		parameters.put("gsk", Objects.requireNonNull(object, "gsk must not be null!"));
		return this;
	}

	/**
	 * Binds the node p53 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public GSK3b_p53Rule bindP53(final P53 object) {
		parameters.put("p53", Objects.requireNonNull(object, "p53 must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	gsk --> " + parameters.get("gsk") + System.lineSeparator();
		s += "	p53 --> " + parameters.get("p53") + System.lineSeparator();
		s += "}";
		return s;
	}
}
