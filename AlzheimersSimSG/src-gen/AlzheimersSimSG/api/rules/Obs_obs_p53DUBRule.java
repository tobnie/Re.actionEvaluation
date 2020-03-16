package AlzheimersSimSG.api.rules;

import AlzheimerModel.P53DUB;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.Obs_obs_p53DUBMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>obs_obs_p53DUB()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Obs_obs_p53DUBRule extends GraphTransformationRule<Obs_obs_p53DUBMatch, Obs_obs_p53DUBRule> {
	private static String patternName = "obs_obs_p53DUB";

	/**
	 * Creates a new rule obs_obs_p53DUB().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Obs_obs_p53DUBRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Obs_obs_p53DUBMatch convertMatch(final IMatch match) {
		return new Obs_obs_p53DUBMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("p53dub");
		return names;
	}

	/**
	 * Binds the node p53dub to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Obs_obs_p53DUBRule bindP53dub(final P53DUB object) {
		parameters.put("p53dub", Objects.requireNonNull(object, "p53dub must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	p53dub --> " + parameters.get("p53dub") + System.lineSeparator();
		s += "}";
		return s;
	}
}
