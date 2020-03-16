package AlzheimersSimSG.api.rules;

import AlzheimerModel.DamDNA;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.Obs_obs_damDNAMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>obs_obs_damDNA()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Obs_obs_damDNARule extends GraphTransformationRule<Obs_obs_damDNAMatch, Obs_obs_damDNARule> {
	private static String patternName = "obs_obs_damDNA";

	/**
	 * Creates a new rule obs_obs_damDNA().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Obs_obs_damDNARule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Obs_obs_damDNAMatch convertMatch(final IMatch match) {
		return new Obs_obs_damDNAMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("damDNA");
		return names;
	}

	/**
	 * Binds the node damDNA to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Obs_obs_damDNARule bindDamDNA(final DamDNA object) {
		parameters.put("damDNA", Objects.requireNonNull(object, "damDNA must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	damDNA --> " + parameters.get("damDNA") + System.lineSeparator();
		s += "}";
		return s;
	}
}
