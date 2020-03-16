package AlzheimersSimSG.api.rules;

import AlzheimerModel.AggAbeta;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.Proteasome_x_AggAbeta_yBoundTrgMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>Proteasome_x_AggAbeta_yBoundTrg()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Proteasome_x_AggAbeta_yBoundTrgRule extends GraphTransformationRule<Proteasome_x_AggAbeta_yBoundTrgMatch, Proteasome_x_AggAbeta_yBoundTrgRule> {
	private static String patternName = "Proteasome_x_AggAbeta_yBoundTrg";

	/**
	 * Creates a new rule Proteasome_x_AggAbeta_yBoundTrg().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Proteasome_x_AggAbeta_yBoundTrgRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Proteasome_x_AggAbeta_yBoundTrgMatch convertMatch(final IMatch match) {
		return new Proteasome_x_AggAbeta_yBoundTrgMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("trg");
		return names;
	}

	/**
	 * Binds the node trg to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Proteasome_x_AggAbeta_yBoundTrgRule bindTrg(final AggAbeta object) {
		parameters.put("trg", Objects.requireNonNull(object, "trg must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	trg --> " + parameters.get("trg") + System.lineSeparator();
		s += "}";
		return s;
	}
}
