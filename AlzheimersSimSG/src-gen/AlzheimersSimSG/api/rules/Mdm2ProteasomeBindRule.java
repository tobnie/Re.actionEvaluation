package AlzheimersSimSG.api.rules;

import AlzheimerModel.Mdm2;
import AlzheimerModel.Proteasome;
import AlzheimerModel.UB4_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.Mdm2ProteasomeBindMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>Mdm2ProteasomeBind()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Mdm2ProteasomeBindRule extends GraphTransformationRule<Mdm2ProteasomeBindMatch, Mdm2ProteasomeBindRule> {
	private static String patternName = "Mdm2ProteasomeBind";

	/**
	 * Creates a new rule Mdm2ProteasomeBind().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Mdm2ProteasomeBindRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Mdm2ProteasomeBindMatch convertMatch(final IMatch match) {
		return new Mdm2ProteasomeBindMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("prot");
		names.add("mdm2");
		names.add("ub4s");
		return names;
	}

	/**
	 * Binds the node prot to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2ProteasomeBindRule bindProt(final Proteasome object) {
		parameters.put("prot", Objects.requireNonNull(object, "prot must not be null!"));
		return this;
	}

	/**
	 * Binds the node mdm2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2ProteasomeBindRule bindMdm2(final Mdm2 object) {
		parameters.put("mdm2", Objects.requireNonNull(object, "mdm2 must not be null!"));
		return this;
	}

	/**
	 * Binds the node ub4s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2ProteasomeBindRule bindUb4s(final UB4_s object) {
		parameters.put("ub4s", Objects.requireNonNull(object, "ub4s must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	prot --> " + parameters.get("prot") + System.lineSeparator();
		s += "	mdm2 --> " + parameters.get("mdm2") + System.lineSeparator();
		s += "	ub4s --> " + parameters.get("ub4s") + System.lineSeparator();
		s += "}";
		return s;
	}
}
