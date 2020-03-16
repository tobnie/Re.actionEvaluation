package AlzheimersSimSG.api.rules;

import AlzheimerModel.Mdm2DUB;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.Obs_obs_mdm2DUBMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>obs_obs_mdm2DUB()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Obs_obs_mdm2DUBRule extends GraphTransformationRule<Obs_obs_mdm2DUBMatch, Obs_obs_mdm2DUBRule> {
	private static String patternName = "obs_obs_mdm2DUB";

	/**
	 * Creates a new rule obs_obs_mdm2DUB().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Obs_obs_mdm2DUBRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Obs_obs_mdm2DUBMatch convertMatch(final IMatch match) {
		return new Obs_obs_mdm2DUBMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("mdm2dub");
		return names;
	}

	/**
	 * Binds the node mdm2dub to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Obs_obs_mdm2DUBRule bindMdm2dub(final Mdm2DUB object) {
		parameters.put("mdm2dub", Objects.requireNonNull(object, "mdm2dub must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	mdm2dub --> " + parameters.get("mdm2dub") + System.lineSeparator();
		s += "}";
		return s;
	}
}
