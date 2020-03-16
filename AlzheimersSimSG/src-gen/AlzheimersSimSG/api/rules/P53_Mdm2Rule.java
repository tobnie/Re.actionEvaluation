package AlzheimersSimSG.api.rules;

import AlzheimerModel.Mdm2;
import AlzheimerModel.P53;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.P53_Mdm2Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>P53_Mdm2()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class P53_Mdm2Rule extends GraphTransformationRule<P53_Mdm2Match, P53_Mdm2Rule> {
	private static String patternName = "P53_Mdm2";

	/**
	 * Creates a new rule P53_Mdm2().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public P53_Mdm2Rule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected P53_Mdm2Match convertMatch(final IMatch match) {
		return new P53_Mdm2Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("p53");
		names.add("us");
		names.add("mdm2");
		return names;
	}

	/**
	 * Binds the node p53 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53_Mdm2Rule bindP53(final P53 object) {
		parameters.put("p53", Objects.requireNonNull(object, "p53 must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53_Mdm2Rule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	/**
	 * Binds the node mdm2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53_Mdm2Rule bindMdm2(final Mdm2 object) {
		parameters.put("mdm2", Objects.requireNonNull(object, "mdm2 must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	p53 --> " + parameters.get("p53") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "	mdm2 --> " + parameters.get("mdm2") + System.lineSeparator();
		s += "}";
		return s;
	}
}
