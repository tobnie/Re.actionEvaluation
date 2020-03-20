package AlzheimersSimSG.api.rules;

import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.P53mRNASynthesisMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import reactionContainer.Container;

/**
 * The rule <code>p53mRNASynthesis()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class P53mRNASynthesisRule extends GraphTransformationRule<P53mRNASynthesisMatch, P53mRNASynthesisRule> {
	private static String patternName = "p53mRNASynthesis";

	/**
	 * Creates a new rule p53mRNASynthesis().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public P53mRNASynthesisRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected P53mRNASynthesisMatch convertMatch(final IMatch match) {
		return new P53mRNASynthesisMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("blank");
		return names;
	}

	/**
	 * Binds the node blank to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53mRNASynthesisRule bindBlank(final Container object) {
		parameters.put("blank", Objects.requireNonNull(object, "blank must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	blank --> " + parameters.get("blank") + System.lineSeparator();
		s += "}";
		return s;
	}
}
