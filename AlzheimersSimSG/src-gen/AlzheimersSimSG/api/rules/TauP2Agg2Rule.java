package AlzheimersSimSG.api.rules;

import AlzheimerModel.AggTau;
import AlzheimerModel.P2_s;
import AlzheimerModel.Tau;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.TauP2Agg2Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>TauP2Agg2()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class TauP2Agg2Rule extends GraphTransformationRule<TauP2Agg2Match, TauP2Agg2Rule> {
	private static String patternName = "TauP2Agg2";

	/**
	 * Creates a new rule TauP2Agg2().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public TauP2Agg2Rule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected TauP2Agg2Match convertMatch(final IMatch match) {
		return new TauP2Agg2Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("agg1");
		names.add("tau1");
		names.add("p2s");
		return names;
	}

	/**
	 * Binds the node agg1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauP2Agg2Rule bindAgg1(final AggTau object) {
		parameters.put("agg1", Objects.requireNonNull(object, "agg1 must not be null!"));
		return this;
	}

	/**
	 * Binds the node tau1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauP2Agg2Rule bindTau1(final Tau object) {
		parameters.put("tau1", Objects.requireNonNull(object, "tau1 must not be null!"));
		return this;
	}

	/**
	 * Binds the node p2s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauP2Agg2Rule bindP2s(final P2_s object) {
		parameters.put("p2s", Objects.requireNonNull(object, "p2s must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	agg1 --> " + parameters.get("agg1") + System.lineSeparator();
		s += "	tau1 --> " + parameters.get("tau1") + System.lineSeparator();
		s += "	p2s --> " + parameters.get("p2s") + System.lineSeparator();
		s += "}";
		return s;
	}
}
