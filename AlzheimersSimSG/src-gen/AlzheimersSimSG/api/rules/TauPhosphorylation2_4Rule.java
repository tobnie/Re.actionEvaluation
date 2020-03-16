package AlzheimersSimSG.api.rules;

import AlzheimerModel.GSK3b;
import AlzheimerModel.P1_s;
import AlzheimerModel.P2_s;
import AlzheimerModel.P53;
import AlzheimerModel.Tau;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.TauPhosphorylation2_4Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>TauPhosphorylation2_4()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class TauPhosphorylation2_4Rule extends GraphTransformationRule<TauPhosphorylation2_4Match, TauPhosphorylation2_4Rule> {
	private static String patternName = "TauPhosphorylation2_4";

	/**
	 * Creates a new rule TauPhosphorylation2_4().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public TauPhosphorylation2_4Rule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected TauPhosphorylation2_4Match convertMatch(final IMatch match) {
		return new TauPhosphorylation2_4Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("tau");
		names.add("p1s");
		names.add("gsk");
		names.add("p53");
		names.add("p2s");
		return names;
	}

	/**
	 * Binds the node tau to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauPhosphorylation2_4Rule bindTau(final Tau object) {
		parameters.put("tau", Objects.requireNonNull(object, "tau must not be null!"));
		return this;
	}

	/**
	 * Binds the node p1s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauPhosphorylation2_4Rule bindP1s(final P1_s object) {
		parameters.put("p1s", Objects.requireNonNull(object, "p1s must not be null!"));
		return this;
	}

	/**
	 * Binds the node gsk to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauPhosphorylation2_4Rule bindGsk(final GSK3b object) {
		parameters.put("gsk", Objects.requireNonNull(object, "gsk must not be null!"));
		return this;
	}

	/**
	 * Binds the node p53 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauPhosphorylation2_4Rule bindP53(final P53 object) {
		parameters.put("p53", Objects.requireNonNull(object, "p53 must not be null!"));
		return this;
	}

	/**
	 * Binds the node p2s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauPhosphorylation2_4Rule bindP2s(final P2_s object) {
		parameters.put("p2s", Objects.requireNonNull(object, "p2s must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	tau --> " + parameters.get("tau") + System.lineSeparator();
		s += "	p1s --> " + parameters.get("p1s") + System.lineSeparator();
		s += "	gsk --> " + parameters.get("gsk") + System.lineSeparator();
		s += "	p53 --> " + parameters.get("p53") + System.lineSeparator();
		s += "	p2s --> " + parameters.get("p2s") + System.lineSeparator();
		s += "}";
		return s;
	}
}
