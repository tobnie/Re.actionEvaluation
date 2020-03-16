package AlzheimersSimSG.api.rules;

import AlzheimerModel.AbetaPlaque;
import AlzheimerModel.AggAbeta;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.AbetaPlaque2Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>AbetaPlaque2()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class AbetaPlaque2Rule extends GraphTransformationRule<AbetaPlaque2Match, AbetaPlaque2Rule> {
	private static String patternName = "AbetaPlaque2";

	/**
	 * Creates a new rule AbetaPlaque2().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public AbetaPlaque2Rule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected AbetaPlaque2Match convertMatch(final IMatch match) {
		return new AbetaPlaque2Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("plaque1");
		names.add("agg1");
		return names;
	}

	/**
	 * Binds the node plaque1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AbetaPlaque2Rule bindPlaque1(final AbetaPlaque object) {
		parameters.put("plaque1", Objects.requireNonNull(object, "plaque1 must not be null!"));
		return this;
	}

	/**
	 * Binds the node agg1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AbetaPlaque2Rule bindAgg1(final AggAbeta object) {
		parameters.put("agg1", Objects.requireNonNull(object, "agg1 must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	plaque1 --> " + parameters.get("plaque1") + System.lineSeparator();
		s += "	agg1 --> " + parameters.get("agg1") + System.lineSeparator();
		s += "}";
		return s;
	}
}
