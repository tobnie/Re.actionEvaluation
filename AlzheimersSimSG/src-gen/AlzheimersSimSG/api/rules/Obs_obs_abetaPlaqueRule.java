package AlzheimersSimSG.api.rules;

import AlzheimerModel.AbetaPlaque;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.Obs_obs_abetaPlaqueMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>obs_obs_abetaPlaque()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Obs_obs_abetaPlaqueRule extends GraphTransformationRule<Obs_obs_abetaPlaqueMatch, Obs_obs_abetaPlaqueRule> {
	private static String patternName = "obs_obs_abetaPlaque";

	/**
	 * Creates a new rule obs_obs_abetaPlaque().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Obs_obs_abetaPlaqueRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Obs_obs_abetaPlaqueMatch convertMatch(final IMatch match) {
		return new Obs_obs_abetaPlaqueMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("abetaPlaque");
		return names;
	}

	/**
	 * Binds the node abetaPlaque to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Obs_obs_abetaPlaqueRule bindAbetaPlaque(final AbetaPlaque object) {
		parameters.put("abetaPlaque", Objects.requireNonNull(object, "abetaPlaque must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	abetaPlaque --> " + parameters.get("abetaPlaque") + System.lineSeparator();
		s += "}";
		return s;
	}
}
