package AlzheimersSimSG.api.rules;

import AlzheimerModel.GSK3b;
import AlzheimerModel.P1_s;
import AlzheimerModel.Tau;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.TauPhosphorylation5Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>TauPhosphorylation5()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class TauPhosphorylation5Rule extends GraphTransformationRule<TauPhosphorylation5Match, TauPhosphorylation5Rule> {
	private static String patternName = "TauPhosphorylation5";

	/**
	 * Creates a new rule TauPhosphorylation5().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public TauPhosphorylation5Rule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected TauPhosphorylation5Match convertMatch(final IMatch match) {
		return new TauPhosphorylation5Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("tau");
		names.add("us");
		names.add("gsk");
		names.add("p1s");
		return names;
	}

	/**
	 * Binds the node tau to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauPhosphorylation5Rule bindTau(final Tau object) {
		parameters.put("tau", Objects.requireNonNull(object, "tau must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauPhosphorylation5Rule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	/**
	 * Binds the node gsk to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauPhosphorylation5Rule bindGsk(final GSK3b object) {
		parameters.put("gsk", Objects.requireNonNull(object, "gsk must not be null!"));
		return this;
	}

	/**
	 * Binds the node p1s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauPhosphorylation5Rule bindP1s(final P1_s object) {
		parameters.put("p1s", Objects.requireNonNull(object, "p1s must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	tau --> " + parameters.get("tau") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "	gsk --> " + parameters.get("gsk") + System.lineSeparator();
		s += "	p1s --> " + parameters.get("p1s") + System.lineSeparator();
		s += "}";
		return s;
	}
}
