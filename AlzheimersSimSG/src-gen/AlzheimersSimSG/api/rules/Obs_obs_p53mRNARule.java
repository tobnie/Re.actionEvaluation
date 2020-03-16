package AlzheimersSimSG.api.rules;

import AlzheimerModel.P53mRNA;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.Obs_obs_p53mRNAMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>obs_obs_p53mRNA()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Obs_obs_p53mRNARule extends GraphTransformationRule<Obs_obs_p53mRNAMatch, Obs_obs_p53mRNARule> {
	private static String patternName = "obs_obs_p53mRNA";

	/**
	 * Creates a new rule obs_obs_p53mRNA().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Obs_obs_p53mRNARule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Obs_obs_p53mRNAMatch convertMatch(final IMatch match) {
		return new Obs_obs_p53mRNAMatch(this, match);
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
	public Obs_obs_p53mRNARule bindP53mRna(final P53mRNA object) {
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
