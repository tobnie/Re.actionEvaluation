package AlzheimersSimSG.api.rules;

import AlzheimerModel.Mdm2;
import AlzheimerModel.Mdm2DUB;
import AlzheimerModel.UB1_s;
import AlzheimerModel.UB2_s;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.Mdm2polyDeubiquination1Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>mdm2polyDeubiquination1()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Mdm2polyDeubiquination1Rule extends GraphTransformationRule<Mdm2polyDeubiquination1Match, Mdm2polyDeubiquination1Rule> {
	private static String patternName = "mdm2polyDeubiquination1";

	/**
	 * Creates a new rule mdm2polyDeubiquination1().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Mdm2polyDeubiquination1Rule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Mdm2polyDeubiquination1Match convertMatch(final IMatch match) {
		return new Mdm2polyDeubiquination1Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("mdm2dub");
		names.add("mdm2");
		names.add("ub2s");
		names.add("ub1s");
		return names;
	}

	/**
	 * Binds the node mdm2dub to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2polyDeubiquination1Rule bindMdm2dub(final Mdm2DUB object) {
		parameters.put("mdm2dub", Objects.requireNonNull(object, "mdm2dub must not be null!"));
		return this;
	}

	/**
	 * Binds the node mdm2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2polyDeubiquination1Rule bindMdm2(final Mdm2 object) {
		parameters.put("mdm2", Objects.requireNonNull(object, "mdm2 must not be null!"));
		return this;
	}

	/**
	 * Binds the node ub2s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2polyDeubiquination1Rule bindUb2s(final UB2_s object) {
		parameters.put("ub2s", Objects.requireNonNull(object, "ub2s must not be null!"));
		return this;
	}

	/**
	 * Binds the node ub1s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Mdm2polyDeubiquination1Rule bindUb1s(final UB1_s object) {
		parameters.put("ub1s", Objects.requireNonNull(object, "ub1s must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	mdm2dub --> " + parameters.get("mdm2dub") + System.lineSeparator();
		s += "	mdm2 --> " + parameters.get("mdm2") + System.lineSeparator();
		s += "	ub2s --> " + parameters.get("ub2s") + System.lineSeparator();
		s += "	ub1s --> " + parameters.get("ub1s") + System.lineSeparator();
		s += "}";
		return s;
	}
}
