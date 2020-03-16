package AlzheimersSimSG.api.rules;

import AlzheimerModel.Abeta;
import AlzheimerModel.AggAbeta;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.AbetaAgg2Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>AbetaAgg2()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class AbetaAgg2Rule extends GraphTransformationRule<AbetaAgg2Match, AbetaAgg2Rule> {
	private static String patternName = "AbetaAgg2";

	/**
	 * Creates a new rule AbetaAgg2().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public AbetaAgg2Rule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected AbetaAgg2Match convertMatch(final IMatch match) {
		return new AbetaAgg2Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("abeta1");
		names.add("agg1");
		return names;
	}

	/**
	 * Binds the node abeta1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AbetaAgg2Rule bindAbeta1(final Abeta object) {
		parameters.put("abeta1", Objects.requireNonNull(object, "abeta1 must not be null!"));
		return this;
	}

	/**
	 * Binds the node agg1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AbetaAgg2Rule bindAgg1(final AggAbeta object) {
		parameters.put("agg1", Objects.requireNonNull(object, "agg1 must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	abeta1 --> " + parameters.get("abeta1") + System.lineSeparator();
		s += "	agg1 --> " + parameters.get("agg1") + System.lineSeparator();
		s += "}";
		return s;
	}
}
