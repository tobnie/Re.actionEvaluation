package AlzheimersSimSG.api.rules;

import AlzheimerModel.Mdm2;
import AlzheimerModel.P53;
import AlzheimerModel.P53DUB;
import AlzheimerModel.U_s;
import AlzheimerModel.UB1_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.P53DeUbiquitinationMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>P53DeUbiquitination()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class P53DeUbiquitinationRule extends GraphTransformationRule<P53DeUbiquitinationMatch, P53DeUbiquitinationRule> {
	private static String patternName = "P53DeUbiquitination";

	/**
	 * Creates a new rule P53DeUbiquitination().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public P53DeUbiquitinationRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected P53DeUbiquitinationMatch convertMatch(final IMatch match) {
		return new P53DeUbiquitinationMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("p53dub");
		names.add("mdm2");
		names.add("p53");
		names.add("us");
		names.add("ub1s");
		return names;
	}

	/**
	 * Binds the node p53dub to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53DeUbiquitinationRule bindP53dub(final P53DUB object) {
		parameters.put("p53dub", Objects.requireNonNull(object, "p53dub must not be null!"));
		return this;
	}

	/**
	 * Binds the node mdm2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53DeUbiquitinationRule bindMdm2(final Mdm2 object) {
		parameters.put("mdm2", Objects.requireNonNull(object, "mdm2 must not be null!"));
		return this;
	}

	/**
	 * Binds the node p53 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53DeUbiquitinationRule bindP53(final P53 object) {
		parameters.put("p53", Objects.requireNonNull(object, "p53 must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53DeUbiquitinationRule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	/**
	 * Binds the node ub1s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53DeUbiquitinationRule bindUb1s(final UB1_s object) {
		parameters.put("ub1s", Objects.requireNonNull(object, "ub1s must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	p53dub --> " + parameters.get("p53dub") + System.lineSeparator();
		s += "	mdm2 --> " + parameters.get("mdm2") + System.lineSeparator();
		s += "	p53 --> " + parameters.get("p53") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "	ub1s --> " + parameters.get("ub1s") + System.lineSeparator();
		s += "}";
		return s;
	}
}
