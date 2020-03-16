package AlzheimersSimSG.api.rules;

import AlzheimerModel.Abeta;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.AbetaAgg1Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>AbetaAgg1()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class AbetaAgg1Rule extends GraphTransformationRule<AbetaAgg1Match, AbetaAgg1Rule> {
	private static String patternName = "AbetaAgg1";

	/**
	 * Creates a new rule AbetaAgg1().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public AbetaAgg1Rule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected AbetaAgg1Match convertMatch(final IMatch match) {
		return new AbetaAgg1Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("abeta1");
		names.add("abeta2");
		return names;
	}

	/**
	 * Binds the node abeta1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AbetaAgg1Rule bindAbeta1(final Abeta object) {
		parameters.put("abeta1", Objects.requireNonNull(object, "abeta1 must not be null!"));
		return this;
	}

	/**
	 * Binds the node abeta2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AbetaAgg1Rule bindAbeta2(final Abeta object) {
		parameters.put("abeta2", Objects.requireNonNull(object, "abeta2 must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	abeta1 --> " + parameters.get("abeta1") + System.lineSeparator();
		s += "	abeta2 --> " + parameters.get("abeta2") + System.lineSeparator();
		s += "}";
		return s;
	}
}
