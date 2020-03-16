package AlzheimersSimSG.api.rules;

import AlzheimerModel.Mdm2mRNA;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.Obs_obs_mdm2mRNAMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>obs_obs_mdm2mRNA()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Obs_obs_mdm2mRNARule extends GraphTransformationRule<Obs_obs_mdm2mRNAMatch, Obs_obs_mdm2mRNARule> {
	private static String patternName = "obs_obs_mdm2mRNA";

	/**
	 * Creates a new rule obs_obs_mdm2mRNA().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Obs_obs_mdm2mRNARule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Obs_obs_mdm2mRNAMatch convertMatch(final IMatch match) {
		return new Obs_obs_mdm2mRNAMatch(this, match);
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
	public Obs_obs_mdm2mRNARule bindMdm2mRna(final Mdm2mRNA object) {
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
