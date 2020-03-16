package AlzheimersSimSG.api.rules;

import AlzheimerModel.AggTau;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.TangleForm1Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>tangleForm1()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class TangleForm1Rule extends GraphTransformationRule<TangleForm1Match, TangleForm1Rule> {
	private static String patternName = "tangleForm1";

	/**
	 * Creates a new rule tangleForm1().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public TangleForm1Rule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected TangleForm1Match convertMatch(final IMatch match) {
		return new TangleForm1Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("agg2");
		names.add("agg1");
		return names;
	}

	/**
	 * Binds the node agg2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TangleForm1Rule bindAgg2(final AggTau object) {
		parameters.put("agg2", Objects.requireNonNull(object, "agg2 must not be null!"));
		return this;
	}

	/**
	 * Binds the node agg1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TangleForm1Rule bindAgg1(final AggTau object) {
		parameters.put("agg1", Objects.requireNonNull(object, "agg1 must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	agg2 --> " + parameters.get("agg2") + System.lineSeparator();
		s += "	agg1 --> " + parameters.get("agg1") + System.lineSeparator();
		s += "}";
		return s;
	}
}
