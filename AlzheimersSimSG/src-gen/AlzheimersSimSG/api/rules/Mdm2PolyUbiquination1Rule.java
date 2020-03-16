package AlzheimersSimSG.api.rules;

import AlzheimerModel.E2;
import AlzheimerModel.Mdm2;
import AlzheimerModel.UB1_s;
import AlzheimerModel.UB2_s;
import AlzheimerModel.UBI_s;
import AlzheimerModel.UNB_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.Mdm2PolyUbiquination1Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>mdm2PolyUbiquination1()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Mdm2PolyUbiquination1Rule extends GraphTransformationRule<Mdm2PolyUbiquination1Match, Mdm2PolyUbiquination1Rule> {
	private static String patternName = "mdm2PolyUbiquination1";

	/**
	 * Creates a new rule mdm2PolyUbiquination1().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Mdm2PolyUbiquination1Rule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Mdm2PolyUbiquination1Match convertMatch(final IMatch match) {
		return new Mdm2PolyUbiquination1Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("e2");
		names.add("ubis");
		names.add("mdm2");
		names.add("ub1s");
		names.add("unbs");
		names.add("ub2s");
		return names;
	}

	/**
	 * Binds the node e2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2PolyUbiquination1Rule bindE2(final E2 object) {
		parameters.put("e2", Objects.requireNonNull(object, "e2 must not be null!"));
		return this;
	}

	/**
	 * Binds the node ubis to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2PolyUbiquination1Rule bindUbis(final UBI_s object) {
		parameters.put("ubis", Objects.requireNonNull(object, "ubis must not be null!"));
		return this;
	}

	/**
	 * Binds the node mdm2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2PolyUbiquination1Rule bindMdm2(final Mdm2 object) {
		parameters.put("mdm2", Objects.requireNonNull(object, "mdm2 must not be null!"));
		return this;
	}

	/**
	 * Binds the node ub1s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2PolyUbiquination1Rule bindUb1s(final UB1_s object) {
		parameters.put("ub1s", Objects.requireNonNull(object, "ub1s must not be null!"));
		return this;
	}

	/**
	 * Binds the node unbs to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2PolyUbiquination1Rule bindUnbs(final UNB_s object) {
		parameters.put("unbs", Objects.requireNonNull(object, "unbs must not be null!"));
		return this;
	}

	/**
	 * Binds the node ub2s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2PolyUbiquination1Rule bindUb2s(final UB2_s object) {
		parameters.put("ub2s", Objects.requireNonNull(object, "ub2s must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	e2 --> " + parameters.get("e2") + System.lineSeparator();
		s += "	ubis --> " + parameters.get("ubis") + System.lineSeparator();
		s += "	mdm2 --> " + parameters.get("mdm2") + System.lineSeparator();
		s += "	ub1s --> " + parameters.get("ub1s") + System.lineSeparator();
		s += "	unbs --> " + parameters.get("unbs") + System.lineSeparator();
		s += "	ub2s --> " + parameters.get("ub2s") + System.lineSeparator();
		s += "}";
		return s;
	}
}
