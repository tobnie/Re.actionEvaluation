package AlzheimersSimSG.api.rules;

import AlzheimerModel.AggAbeta;
import AlzheimerModel.Proteasome;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.ProteasomeInhibitionAggAbetaMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>ProteasomeInhibitionAggAbeta()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class ProteasomeInhibitionAggAbetaRule extends GraphTransformationRule<ProteasomeInhibitionAggAbetaMatch, ProteasomeInhibitionAggAbetaRule> {
	private static String patternName = "ProteasomeInhibitionAggAbeta";

	/**
	 * Creates a new rule ProteasomeInhibitionAggAbeta().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public ProteasomeInhibitionAggAbetaRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected ProteasomeInhibitionAggAbetaMatch convertMatch(final IMatch match) {
		return new ProteasomeInhibitionAggAbetaMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("agg");
		names.add("prot");
		return names;
	}

	/**
	 * Binds the node agg to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ProteasomeInhibitionAggAbetaRule bindAgg(final AggAbeta object) {
		parameters.put("agg", Objects.requireNonNull(object, "agg must not be null!"));
		return this;
	}

	/**
	 * Binds the node prot to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ProteasomeInhibitionAggAbetaRule bindProt(final Proteasome object) {
		parameters.put("prot", Objects.requireNonNull(object, "prot must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	agg --> " + parameters.get("agg") + System.lineSeparator();
		s += "	prot --> " + parameters.get("prot") + System.lineSeparator();
		s += "}";
		return s;
	}
}
