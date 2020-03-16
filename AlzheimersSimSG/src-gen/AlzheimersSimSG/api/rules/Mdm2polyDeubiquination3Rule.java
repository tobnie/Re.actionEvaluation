package AlzheimersSimSG.api.rules;

import AlzheimerModel.Mdm2;
import AlzheimerModel.Mdm2DUB;
import AlzheimerModel.UB3_s;
import AlzheimerModel.UB4_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.Mdm2polyDeubiquination3Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>mdm2polyDeubiquination3()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Mdm2polyDeubiquination3Rule extends GraphTransformationRule<Mdm2polyDeubiquination3Match, Mdm2polyDeubiquination3Rule> {
	private static String patternName = "mdm2polyDeubiquination3";

	/**
	 * Creates a new rule mdm2polyDeubiquination3().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Mdm2polyDeubiquination3Rule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Mdm2polyDeubiquination3Match convertMatch(final IMatch match) {
		return new Mdm2polyDeubiquination3Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("mdm2dub");
		names.add("mdm2");
		names.add("ub4s");
		names.add("ub3s");
		return names;
	}

	/**
	 * Binds the node mdm2dub to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2polyDeubiquination3Rule bindMdm2dub(final Mdm2DUB object) {
		parameters.put("mdm2dub", Objects.requireNonNull(object, "mdm2dub must not be null!"));
		return this;
	}

	/**
	 * Binds the node mdm2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2polyDeubiquination3Rule bindMdm2(final Mdm2 object) {
		parameters.put("mdm2", Objects.requireNonNull(object, "mdm2 must not be null!"));
		return this;
	}

	/**
	 * Binds the node ub4s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2polyDeubiquination3Rule bindUb4s(final UB4_s object) {
		parameters.put("ub4s", Objects.requireNonNull(object, "ub4s must not be null!"));
		return this;
	}

	/**
	 * Binds the node ub3s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2polyDeubiquination3Rule bindUb3s(final UB3_s object) {
		parameters.put("ub3s", Objects.requireNonNull(object, "ub3s must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	mdm2dub --> " + parameters.get("mdm2dub") + System.lineSeparator();
		s += "	mdm2 --> " + parameters.get("mdm2") + System.lineSeparator();
		s += "	ub4s --> " + parameters.get("ub4s") + System.lineSeparator();
		s += "	ub3s --> " + parameters.get("ub3s") + System.lineSeparator();
		s += "}";
		return s;
	}
}
