package AlzheimersSimSG.api.rules;

import AlzheimerModel.NFT;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.Obs_obs_tauTangleMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>obs_obs_tauTangle()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Obs_obs_tauTangleRule extends GraphTransformationRule<Obs_obs_tauTangleMatch, Obs_obs_tauTangleRule> {
	private static String patternName = "obs_obs_tauTangle";

	/**
	 * Creates a new rule obs_obs_tauTangle().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Obs_obs_tauTangleRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Obs_obs_tauTangleMatch convertMatch(final IMatch match) {
		return new Obs_obs_tauTangleMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("nft");
		return names;
	}

	/**
	 * Binds the node nft to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Obs_obs_tauTangleRule bindNft(final NFT object) {
		parameters.put("nft", Objects.requireNonNull(object, "nft must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	nft --> " + parameters.get("nft") + System.lineSeparator();
		s += "}";
		return s;
	}
}
