package AlzheimersSimSG.api.rules;

import AlzheimerModel.Mdm2;
import AlzheimerModel.Mdm2DUB;
import AlzheimerModel.UB1_s;
import AlzheimerModel.UNB_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.Mdm2deubiquinationMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>mdm2deubiquination()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Mdm2deubiquinationRule extends GraphTransformationRule<Mdm2deubiquinationMatch, Mdm2deubiquinationRule> {
	private static String patternName = "mdm2deubiquination";

	/**
	 * Creates a new rule mdm2deubiquination().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Mdm2deubiquinationRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Mdm2deubiquinationMatch convertMatch(final IMatch match) {
		return new Mdm2deubiquinationMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("mdm2dub");
		names.add("mdm2");
		names.add("ub1s");
		names.add("unbs");
		return names;
	}

	/**
	 * Binds the node mdm2dub to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2deubiquinationRule bindMdm2dub(final Mdm2DUB object) {
		parameters.put("mdm2dub", Objects.requireNonNull(object, "mdm2dub must not be null!"));
		return this;
	}

	/**
	 * Binds the node mdm2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2deubiquinationRule bindMdm2(final Mdm2 object) {
		parameters.put("mdm2", Objects.requireNonNull(object, "mdm2 must not be null!"));
		return this;
	}

	/**
	 * Binds the node ub1s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2deubiquinationRule bindUb1s(final UB1_s object) {
		parameters.put("ub1s", Objects.requireNonNull(object, "ub1s must not be null!"));
		return this;
	}

	/**
	 * Binds the node unbs to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2deubiquinationRule bindUnbs(final UNB_s object) {
		parameters.put("unbs", Objects.requireNonNull(object, "unbs must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	mdm2dub --> " + parameters.get("mdm2dub") + System.lineSeparator();
		s += "	mdm2 --> " + parameters.get("mdm2") + System.lineSeparator();
		s += "	ub1s --> " + parameters.get("ub1s") + System.lineSeparator();
		s += "	unbs --> " + parameters.get("unbs") + System.lineSeparator();
		s += "}";
		return s;
	}
}
