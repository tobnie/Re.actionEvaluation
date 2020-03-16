package AlzheimersSimSG.api.rules;

import AlzheimerModel.AggAbeta;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.AbetaROSProductionMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>AbetaROSProduction()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class AbetaROSProductionRule extends GraphTransformationRule<AbetaROSProductionMatch, AbetaROSProductionRule> {
	private static String patternName = "AbetaROSProduction";

	/**
	 * Creates a new rule AbetaROSProduction().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public AbetaROSProductionRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected AbetaROSProductionMatch convertMatch(final IMatch match) {
		return new AbetaROSProductionMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("agg");
		return names;
	}

	/**
	 * Binds the node agg to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AbetaROSProductionRule bindAgg(final AggAbeta object) {
		parameters.put("agg", Objects.requireNonNull(object, "agg must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	agg --> " + parameters.get("agg") + System.lineSeparator();
		s += "}";
		return s;
	}
}
