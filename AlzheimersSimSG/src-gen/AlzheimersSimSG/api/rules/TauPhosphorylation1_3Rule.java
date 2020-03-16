package AlzheimersSimSG.api.rules;

import AlzheimerModel.GSK3b;
import AlzheimerModel.P1_s;
import AlzheimerModel.P53;
import AlzheimerModel.Tau;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.TauPhosphorylation1_3Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>TauPhosphorylation1_3()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class TauPhosphorylation1_3Rule extends GraphTransformationRule<TauPhosphorylation1_3Match, TauPhosphorylation1_3Rule> {
	private static String patternName = "TauPhosphorylation1_3";

	/**
	 * Creates a new rule TauPhosphorylation1_3().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public TauPhosphorylation1_3Rule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected TauPhosphorylation1_3Match convertMatch(final IMatch match) {
		return new TauPhosphorylation1_3Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("tau");
		names.add("us");
		names.add("gsk");
		names.add("p53");
		names.add("p1s");
		return names;
	}

	/**
	 * Binds the node tau to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauPhosphorylation1_3Rule bindTau(final Tau object) {
		parameters.put("tau", Objects.requireNonNull(object, "tau must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauPhosphorylation1_3Rule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	/**
	 * Binds the node gsk to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauPhosphorylation1_3Rule bindGsk(final GSK3b object) {
		parameters.put("gsk", Objects.requireNonNull(object, "gsk must not be null!"));
		return this;
	}

	/**
	 * Binds the node p53 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauPhosphorylation1_3Rule bindP53(final P53 object) {
		parameters.put("p53", Objects.requireNonNull(object, "p53 must not be null!"));
		return this;
	}

	/**
	 * Binds the node p1s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauPhosphorylation1_3Rule bindP1s(final P1_s object) {
		parameters.put("p1s", Objects.requireNonNull(object, "p1s must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	tau --> " + parameters.get("tau") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "	gsk --> " + parameters.get("gsk") + System.lineSeparator();
		s += "	p53 --> " + parameters.get("p53") + System.lineSeparator();
		s += "	p1s --> " + parameters.get("p1s") + System.lineSeparator();
		s += "}";
		return s;
	}
}
