package AlzheimersSimSG.api.rules;

import AlzheimerModel.GSK3b;
import AlzheimerModel.Mdm2;
import AlzheimerModel.P53;
import AlzheimerModel.P_s;
import AlzheimerModel.U_s;
import AlzheimerModel.UB4_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.Mdm2GSK3Phospho2_3Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>Mdm2GSK3Phospho2_3()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Mdm2GSK3Phospho2_3Rule extends GraphTransformationRule<Mdm2GSK3Phospho2_3Match, Mdm2GSK3Phospho2_3Rule> {
	private static String patternName = "Mdm2GSK3Phospho2_3";

	/**
	 * Creates a new rule Mdm2GSK3Phospho2_3().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Mdm2GSK3Phospho2_3Rule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Mdm2GSK3Phospho2_3Match convertMatch(final IMatch match) {
		return new Mdm2GSK3Phospho2_3Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("p53_2");
		names.add("gsk");
		names.add("p53_1");
		names.add("mdm2");
		names.add("ub4s");
		names.add("us");
		names.add("ps");
		return names;
	}

	/**
	 * Binds the node p53_2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2GSK3Phospho2_3Rule bindP53_2(final P53 object) {
		parameters.put("p53_2", Objects.requireNonNull(object, "p53_2 must not be null!"));
		return this;
	}

	/**
	 * Binds the node gsk to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2GSK3Phospho2_3Rule bindGsk(final GSK3b object) {
		parameters.put("gsk", Objects.requireNonNull(object, "gsk must not be null!"));
		return this;
	}

	/**
	 * Binds the node p53_1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2GSK3Phospho2_3Rule bindP53_1(final P53 object) {
		parameters.put("p53_1", Objects.requireNonNull(object, "p53_1 must not be null!"));
		return this;
	}

	/**
	 * Binds the node mdm2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2GSK3Phospho2_3Rule bindMdm2(final Mdm2 object) {
		parameters.put("mdm2", Objects.requireNonNull(object, "mdm2 must not be null!"));
		return this;
	}

	/**
	 * Binds the node ub4s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2GSK3Phospho2_3Rule bindUb4s(final UB4_s object) {
		parameters.put("ub4s", Objects.requireNonNull(object, "ub4s must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2GSK3Phospho2_3Rule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	/**
	 * Binds the node ps to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2GSK3Phospho2_3Rule bindPs(final P_s object) {
		parameters.put("ps", Objects.requireNonNull(object, "ps must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	p53_2 --> " + parameters.get("p53_2") + System.lineSeparator();
		s += "	gsk --> " + parameters.get("gsk") + System.lineSeparator();
		s += "	p53_1 --> " + parameters.get("p53_1") + System.lineSeparator();
		s += "	mdm2 --> " + parameters.get("mdm2") + System.lineSeparator();
		s += "	ub4s --> " + parameters.get("ub4s") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "	ps --> " + parameters.get("ps") + System.lineSeparator();
		s += "}";
		return s;
	}
}
