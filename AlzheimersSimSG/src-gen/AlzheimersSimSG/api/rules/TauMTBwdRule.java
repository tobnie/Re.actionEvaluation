package AlzheimersSimSG.api.rules;

import AlzheimerModel.MT;
import AlzheimerModel.Tau;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.TauMTBwdMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>TauMTBwd()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class TauMTBwdRule extends GraphTransformationRule<TauMTBwdMatch, TauMTBwdRule> {
	private static String patternName = "TauMTBwd";

	/**
	 * Creates a new rule TauMTBwd().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public TauMTBwdRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected TauMTBwdMatch convertMatch(final IMatch match) {
		return new TauMTBwdMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("mt");
		names.add("tau");
		names.add("us");
		return names;
	}

	/**
	 * Binds the node mt to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauMTBwdRule bindMt(final MT object) {
		parameters.put("mt", Objects.requireNonNull(object, "mt must not be null!"));
		return this;
	}

	/**
	 * Binds the node tau to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauMTBwdRule bindTau(final Tau object) {
		parameters.put("tau", Objects.requireNonNull(object, "tau must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TauMTBwdRule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	mt --> " + parameters.get("mt") + System.lineSeparator();
		s += "	tau --> " + parameters.get("tau") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "}";
		return s;
	}
}
