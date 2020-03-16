package AlzheimersSimSG.api.rules;

import AlzheimerModel.P53mRNA;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.P53mRNADegradationMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>p53mRNADegradation()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class P53mRNADegradationRule extends GraphTransformationRule<P53mRNADegradationMatch, P53mRNADegradationRule> {
	private static String patternName = "p53mRNADegradation";

	/**
	 * Creates a new rule p53mRNADegradation().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public P53mRNADegradationRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected P53mRNADegradationMatch convertMatch(final IMatch match) {
		return new P53mRNADegradationMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("p53mRna");
		return names;
	}

	/**
	 * Binds the node p53mRna to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53mRNADegradationRule bindP53mRna(final P53mRNA object) {
		parameters.put("p53mRna", Objects.requireNonNull(object, "p53mRna must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	p53mRna --> " + parameters.get("p53mRna") + System.lineSeparator();
		s += "}";
		return s;
	}
}
