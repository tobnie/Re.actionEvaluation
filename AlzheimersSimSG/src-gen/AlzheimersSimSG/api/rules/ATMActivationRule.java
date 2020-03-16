package AlzheimersSimSG.api.rules;

import AlzheimerModel.ATMI;
import AlzheimerModel.DamDNA;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.ATMActivationMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>ATMActivation()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class ATMActivationRule extends GraphTransformationRule<ATMActivationMatch, ATMActivationRule> {
	private static String patternName = "ATMActivation";

	/**
	 * Creates a new rule ATMActivation().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public ATMActivationRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected ATMActivationMatch convertMatch(final IMatch match) {
		return new ATMActivationMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("atmi");
		names.add("damDNA");
		return names;
	}

	/**
	 * Binds the node atmi to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ATMActivationRule bindAtmi(final ATMI object) {
		parameters.put("atmi", Objects.requireNonNull(object, "atmi must not be null!"));
		return this;
	}

	/**
	 * Binds the node damDNA to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ATMActivationRule bindDamDNA(final DamDNA object) {
		parameters.put("damDNA", Objects.requireNonNull(object, "damDNA must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	atmi --> " + parameters.get("atmi") + System.lineSeparator();
		s += "	damDNA --> " + parameters.get("damDNA") + System.lineSeparator();
		s += "}";
		return s;
	}
}
