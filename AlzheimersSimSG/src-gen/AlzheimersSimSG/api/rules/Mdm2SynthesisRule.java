package AlzheimersSimSG.api.rules;

import AlzheimerModel.Mdm2mRNA;
import AlzheimerModel.U_s;
import AlzheimerModel.UNB_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.Mdm2SynthesisMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>Mdm2Synthesis()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Mdm2SynthesisRule extends GraphTransformationRule<Mdm2SynthesisMatch, Mdm2SynthesisRule> {
	private static String patternName = "Mdm2Synthesis";

	/**
	 * Creates a new rule Mdm2Synthesis().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Mdm2SynthesisRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Mdm2SynthesisMatch convertMatch(final IMatch match) {
		return new Mdm2SynthesisMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("mdm2mRna");
		names.add("us");
		names.add("unbs");
		return names;
	}

	/**
	 * Binds the node mdm2mRna to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2SynthesisRule bindMdm2mRna(final Mdm2mRNA object) {
		parameters.put("mdm2mRna", Objects.requireNonNull(object, "mdm2mRna must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2SynthesisRule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	/**
	 * Binds the node unbs to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2SynthesisRule bindUnbs(final UNB_s object) {
		parameters.put("unbs", Objects.requireNonNull(object, "unbs must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	mdm2mRna --> " + parameters.get("mdm2mRna") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "	unbs --> " + parameters.get("unbs") + System.lineSeparator();
		s += "}";
		return s;
	}
}
