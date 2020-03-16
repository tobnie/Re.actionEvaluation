package AlzheimersSimSG.api.rules;

import AlzheimerModel.Proteasome;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.Proteasome_x_Mdm2_ubiBoundSrcMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>Proteasome_x_Mdm2_ubiBoundSrc()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Proteasome_x_Mdm2_ubiBoundSrcRule extends GraphTransformationRule<Proteasome_x_Mdm2_ubiBoundSrcMatch, Proteasome_x_Mdm2_ubiBoundSrcRule> {
	private static String patternName = "Proteasome_x_Mdm2_ubiBoundSrc";

	/**
	 * Creates a new rule Proteasome_x_Mdm2_ubiBoundSrc().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Proteasome_x_Mdm2_ubiBoundSrcRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Proteasome_x_Mdm2_ubiBoundSrcMatch convertMatch(final IMatch match) {
		return new Proteasome_x_Mdm2_ubiBoundSrcMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("src");
		return names;
	}

	/**
	 * Binds the node src to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Proteasome_x_Mdm2_ubiBoundSrcRule bindSrc(final Proteasome object) {
		parameters.put("src", Objects.requireNonNull(object, "src must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	src --> " + parameters.get("src") + System.lineSeparator();
		s += "}";
		return s;
	}
}
