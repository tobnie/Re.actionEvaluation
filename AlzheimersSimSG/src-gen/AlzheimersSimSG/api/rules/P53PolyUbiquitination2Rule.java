package AlzheimersSimSG.api.rules;

import AlzheimerModel.E2;
import AlzheimerModel.Mdm2;
import AlzheimerModel.P53;
import AlzheimerModel.U_s;
import AlzheimerModel.UB2_s;
import AlzheimerModel.UB3_s;
import AlzheimerModel.UBI_s;
import AlzheimerModel.UNB_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.P53PolyUbiquitination2Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>P53PolyUbiquitination2()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class P53PolyUbiquitination2Rule extends GraphTransformationRule<P53PolyUbiquitination2Match, P53PolyUbiquitination2Rule> {
	private static String patternName = "P53PolyUbiquitination2";

	/**
	 * Creates a new rule P53PolyUbiquitination2().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public P53PolyUbiquitination2Rule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected P53PolyUbiquitination2Match convertMatch(final IMatch match) {
		return new P53PolyUbiquitination2Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("e2");
		names.add("ubis");
		names.add("mdm2");
		names.add("p53");
		names.add("us");
		names.add("ub2s");
		names.add("unbs");
		names.add("ub3s");
		return names;
	}

	/**
	 * Binds the node e2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53PolyUbiquitination2Rule bindE2(final E2 object) {
		parameters.put("e2", Objects.requireNonNull(object, "e2 must not be null!"));
		return this;
	}

	/**
	 * Binds the node ubis to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53PolyUbiquitination2Rule bindUbis(final UBI_s object) {
		parameters.put("ubis", Objects.requireNonNull(object, "ubis must not be null!"));
		return this;
	}

	/**
	 * Binds the node mdm2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53PolyUbiquitination2Rule bindMdm2(final Mdm2 object) {
		parameters.put("mdm2", Objects.requireNonNull(object, "mdm2 must not be null!"));
		return this;
	}

	/**
	 * Binds the node p53 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53PolyUbiquitination2Rule bindP53(final P53 object) {
		parameters.put("p53", Objects.requireNonNull(object, "p53 must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53PolyUbiquitination2Rule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	/**
	 * Binds the node ub2s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53PolyUbiquitination2Rule bindUb2s(final UB2_s object) {
		parameters.put("ub2s", Objects.requireNonNull(object, "ub2s must not be null!"));
		return this;
	}

	/**
	 * Binds the node unbs to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53PolyUbiquitination2Rule bindUnbs(final UNB_s object) {
		parameters.put("unbs", Objects.requireNonNull(object, "unbs must not be null!"));
		return this;
	}

	/**
	 * Binds the node ub3s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53PolyUbiquitination2Rule bindUb3s(final UB3_s object) {
		parameters.put("ub3s", Objects.requireNonNull(object, "ub3s must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	e2 --> " + parameters.get("e2") + System.lineSeparator();
		s += "	ubis --> " + parameters.get("ubis") + System.lineSeparator();
		s += "	mdm2 --> " + parameters.get("mdm2") + System.lineSeparator();
		s += "	p53 --> " + parameters.get("p53") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "	ub2s --> " + parameters.get("ub2s") + System.lineSeparator();
		s += "	unbs --> " + parameters.get("unbs") + System.lineSeparator();
		s += "	ub3s --> " + parameters.get("ub3s") + System.lineSeparator();
		s += "}";
		return s;
	}
}
