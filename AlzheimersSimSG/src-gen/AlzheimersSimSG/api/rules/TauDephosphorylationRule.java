package AlzheimersSimSG.api.rules;

import AlzheimerModel.P1_s;
import AlzheimerModel.P2_s;
import AlzheimerModel.PPT;
import AlzheimerModel.Tau;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.TauDephosphorylationMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>TauDephosphorylation()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class TauDephosphorylationRule extends GraphTransformationRule<TauDephosphorylationMatch, TauDephosphorylationRule> {
	private static String patternName = "TauDephosphorylation";

	/**
	 * Creates a new rule TauDephosphorylation().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public TauDephosphorylationRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected TauDephosphorylationMatch convertMatch(final IMatch match) {
		return new TauDephosphorylationMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("ppt");
		names.add("tau");
		names.add("p2s");
		names.add("p1s");
		return names;
	}

	/**
	 * Binds the node ppt to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauDephosphorylationRule bindPpt(final PPT object) {
		parameters.put("ppt", Objects.requireNonNull(object, "ppt must not be null!"));
		return this;
	}

	/**
	 * Binds the node tau to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauDephosphorylationRule bindTau(final Tau object) {
		parameters.put("tau", Objects.requireNonNull(object, "tau must not be null!"));
		return this;
	}

	/**
	 * Binds the node p2s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauDephosphorylationRule bindP2s(final P2_s object) {
		parameters.put("p2s", Objects.requireNonNull(object, "p2s must not be null!"));
		return this;
	}

	/**
	 * Binds the node p1s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauDephosphorylationRule bindP1s(final P1_s object) {
		parameters.put("p1s", Objects.requireNonNull(object, "p1s must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	ppt --> " + parameters.get("ppt") + System.lineSeparator();
		s += "	tau --> " + parameters.get("tau") + System.lineSeparator();
		s += "	p2s --> " + parameters.get("p2s") + System.lineSeparator();
		s += "	p1s --> " + parameters.get("p1s") + System.lineSeparator();
		s += "}";
		return s;
	}
}
