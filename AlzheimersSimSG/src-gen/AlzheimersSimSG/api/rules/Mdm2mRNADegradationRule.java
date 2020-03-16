package AlzheimersSimSG.api.rules;

import AlzheimerModel.Mdm2mRNA;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.Mdm2mRNADegradationMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>mdm2mRNADegradation()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Mdm2mRNADegradationRule extends GraphTransformationRule<Mdm2mRNADegradationMatch, Mdm2mRNADegradationRule> {
	private static String patternName = "mdm2mRNADegradation";

	/**
	 * Creates a new rule mdm2mRNADegradation().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Mdm2mRNADegradationRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Mdm2mRNADegradationMatch convertMatch(final IMatch match) {
		return new Mdm2mRNADegradationMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("mdm2mRna");
		return names;
	}

	/**
	 * Binds the node mdm2mRna to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2mRNADegradationRule bindMdm2mRna(final Mdm2mRNA object) {
		parameters.put("mdm2mRna", Objects.requireNonNull(object, "mdm2mRna must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	mdm2mRna --> " + parameters.get("mdm2mRna") + System.lineSeparator();
		s += "}";
		return s;
	}
}
