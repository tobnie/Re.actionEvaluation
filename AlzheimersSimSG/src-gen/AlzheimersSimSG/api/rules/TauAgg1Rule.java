package AlzheimersSimSG.api.rules;

import AlzheimerModel.Tau;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.TauAgg1Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>TauAgg1()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class TauAgg1Rule extends GraphTransformationRule<TauAgg1Match, TauAgg1Rule> {
	private static String patternName = "TauAgg1";

	/**
	 * Creates a new rule TauAgg1().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public TauAgg1Rule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected TauAgg1Match convertMatch(final IMatch match) {
		return new TauAgg1Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("tau2");
		names.add("tau1");
		names.add("us");
		return names;
	}

	/**
	 * Binds the node tau2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauAgg1Rule bindTau2(final Tau object) {
		parameters.put("tau2", Objects.requireNonNull(object, "tau2 must not be null!"));
		return this;
	}

	/**
	 * Binds the node tau1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauAgg1Rule bindTau1(final Tau object) {
		parameters.put("tau1", Objects.requireNonNull(object, "tau1 must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauAgg1Rule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	tau2 --> " + parameters.get("tau2") + System.lineSeparator();
		s += "	tau1 --> " + parameters.get("tau1") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "}";
		return s;
	}
}
