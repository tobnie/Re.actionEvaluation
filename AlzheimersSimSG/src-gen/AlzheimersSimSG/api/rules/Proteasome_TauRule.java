package AlzheimersSimSG.api.rules;

import AlzheimerModel.Proteasome;
import AlzheimerModel.Tau;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.Proteasome_TauMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>Proteasome_Tau()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Proteasome_TauRule extends GraphTransformationRule<Proteasome_TauMatch, Proteasome_TauRule> {
	private static String patternName = "Proteasome_Tau";

	/**
	 * Creates a new rule Proteasome_Tau().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Proteasome_TauRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Proteasome_TauMatch convertMatch(final IMatch match) {
		return new Proteasome_TauMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("prot");
		names.add("tau");
		names.add("us");
		return names;
	}

	/**
	 * Binds the node prot to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Proteasome_TauRule bindProt(final Proteasome object) {
		parameters.put("prot", Objects.requireNonNull(object, "prot must not be null!"));
		return this;
	}

	/**
	 * Binds the node tau to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Proteasome_TauRule bindTau(final Tau object) {
		parameters.put("tau", Objects.requireNonNull(object, "tau must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Proteasome_TauRule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	prot --> " + parameters.get("prot") + System.lineSeparator();
		s += "	tau --> " + parameters.get("tau") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "}";
		return s;
	}
}
