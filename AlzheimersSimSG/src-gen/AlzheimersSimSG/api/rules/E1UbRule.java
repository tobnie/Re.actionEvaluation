package AlzheimersSimSG.api.rules;

import AlzheimerModel.ATP;
import AlzheimerModel.E1;
import AlzheimerModel.Ub;
import AlzheimerModel.UBI_s;
import AlzheimerModel.UNB_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.E1UbMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>E1Ub()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class E1UbRule extends GraphTransformationRule<E1UbMatch, E1UbRule> {
	private static String patternName = "E1Ub";

	/**
	 * Creates a new rule E1Ub().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public E1UbRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected E1UbMatch convertMatch(final IMatch match) {
		return new E1UbMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("e1");
		names.add("unbs");
		names.add("atp");
		names.add("ub");
		names.add("ubis");
		return names;
	}

	/**
	 * Binds the node e1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public E1UbRule bindE1(final E1 object) {
		parameters.put("e1", Objects.requireNonNull(object, "e1 must not be null!"));
		return this;
	}

	/**
	 * Binds the node unbs to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public E1UbRule bindUnbs(final UNB_s object) {
		parameters.put("unbs", Objects.requireNonNull(object, "unbs must not be null!"));
		return this;
	}

	/**
	 * Binds the node atp to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public E1UbRule bindAtp(final ATP object) {
		parameters.put("atp", Objects.requireNonNull(object, "atp must not be null!"));
		return this;
	}

	/**
	 * Binds the node ub to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public E1UbRule bindUb(final Ub object) {
		parameters.put("ub", Objects.requireNonNull(object, "ub must not be null!"));
		return this;
	}

	/**
	 * Binds the node ubis to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public E1UbRule bindUbis(final UBI_s object) {
		parameters.put("ubis", Objects.requireNonNull(object, "ubis must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	e1 --> " + parameters.get("e1") + System.lineSeparator();
		s += "	unbs --> " + parameters.get("unbs") + System.lineSeparator();
		s += "	atp --> " + parameters.get("atp") + System.lineSeparator();
		s += "	ub --> " + parameters.get("ub") + System.lineSeparator();
		s += "	ubis --> " + parameters.get("ubis") + System.lineSeparator();
		s += "}";
		return s;
	}
}
