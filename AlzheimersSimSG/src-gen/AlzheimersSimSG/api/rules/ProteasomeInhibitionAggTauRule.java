package AlzheimersSimSG.api.rules;

import AlzheimerModel.AggTau;
import AlzheimerModel.Proteasome;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.ProteasomeInhibitionAggTauMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>ProteasomeInhibitionAggTau()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class ProteasomeInhibitionAggTauRule extends GraphTransformationRule<ProteasomeInhibitionAggTauMatch, ProteasomeInhibitionAggTauRule> {
	private static String patternName = "ProteasomeInhibitionAggTau";

	/**
	 * Creates a new rule ProteasomeInhibitionAggTau().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public ProteasomeInhibitionAggTauRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected ProteasomeInhibitionAggTauMatch convertMatch(final IMatch match) {
		return new ProteasomeInhibitionAggTauMatch(this, match);
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
	public ProteasomeInhibitionAggTauRule bindAgg(final AggTau object) {
		parameters.put("agg", Objects.requireNonNull(object, "agg must not be null!"));
		return this;
	}

	/**
	 * Binds the node prot to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ProteasomeInhibitionAggTauRule bindProt(final Proteasome object) {
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
