package AlzheimersSimSG.api.rules;

import AlzheimerModel.Mdm2;
import AlzheimerModel.P53;
import AlzheimerModel.P_s;
import AlzheimerModel.Proteasome;
import AlzheimerModel.U_s;
import AlzheimerModel.UB4_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.P53ProteasomeBindingMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>P53ProteasomeBinding()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class P53ProteasomeBindingRule extends GraphTransformationRule<P53ProteasomeBindingMatch, P53ProteasomeBindingRule> {
	private static String patternName = "P53ProteasomeBinding";

	/**
	 * Creates a new rule P53ProteasomeBinding().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public P53ProteasomeBindingRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected P53ProteasomeBindingMatch convertMatch(final IMatch match) {
		return new P53ProteasomeBindingMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("prot");
		names.add("mdm2");
		names.add("p53");
		names.add("ps");
		names.add("ub4s");
		names.add("us");
		return names;
	}

	/**
	 * Binds the node prot to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53ProteasomeBindingRule bindProt(final Proteasome object) {
		parameters.put("prot", Objects.requireNonNull(object, "prot must not be null!"));
		return this;
	}

	/**
	 * Binds the node mdm2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53ProteasomeBindingRule bindMdm2(final Mdm2 object) {
		parameters.put("mdm2", Objects.requireNonNull(object, "mdm2 must not be null!"));
		return this;
	}

	/**
	 * Binds the node p53 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53ProteasomeBindingRule bindP53(final P53 object) {
		parameters.put("p53", Objects.requireNonNull(object, "p53 must not be null!"));
		return this;
	}

	/**
	 * Binds the node ps to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53ProteasomeBindingRule bindPs(final P_s object) {
		parameters.put("ps", Objects.requireNonNull(object, "ps must not be null!"));
		return this;
	}

	/**
	 * Binds the node ub4s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53ProteasomeBindingRule bindUb4s(final UB4_s object) {
		parameters.put("ub4s", Objects.requireNonNull(object, "ub4s must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53ProteasomeBindingRule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	prot --> " + parameters.get("prot") + System.lineSeparator();
		s += "	mdm2 --> " + parameters.get("mdm2") + System.lineSeparator();
		s += "	p53 --> " + parameters.get("p53") + System.lineSeparator();
		s += "	ps --> " + parameters.get("ps") + System.lineSeparator();
		s += "	ub4s --> " + parameters.get("ub4s") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "}";
		return s;
	}
}
