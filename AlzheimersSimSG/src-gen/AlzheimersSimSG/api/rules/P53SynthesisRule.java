package AlzheimersSimSG.api.rules;

import AlzheimerModel.P53mRNA;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.P53SynthesisMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>P53Synthesis()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class P53SynthesisRule extends GraphTransformationRule<P53SynthesisMatch, P53SynthesisRule> {
	private static String patternName = "P53Synthesis";

	/**
	 * Creates a new rule P53Synthesis().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public P53SynthesisRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected P53SynthesisMatch convertMatch(final IMatch match) {
		return new P53SynthesisMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("p53mRNA");
		names.add("us");
		return names;
	}

	/**
	 * Binds the node p53mRNA to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53SynthesisRule bindP53mRNA(final P53mRNA object) {
		parameters.put("p53mRNA", Objects.requireNonNull(object, "p53mRNA must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53SynthesisRule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	p53mRNA --> " + parameters.get("p53mRNA") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "}";
		return s;
	}
}
