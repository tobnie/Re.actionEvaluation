package gklSimSG.api.rules;

import GKL1600Model.K;
import GKL1600Model.P_s;
import GKL1600Model.T;
import GKL1600Model.U_s;
import gklSimSG.api.GklSimSGAPI;
import gklSimSG.api.matches.Tp_xMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>Tp_x()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Tp_xRule extends GraphTransformationRule<Tp_xMatch, Tp_xRule> {
	private static String patternName = "Tp_x";

	/**
	 * Creates a new rule Tp_x().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Tp_xRule(final GklSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Tp_xMatch convertMatch(final IMatch match) {
		return new Tp_xMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("t");
		names.add("k");
		names.add("us");
		names.add("ps");
		return names;
	}

	/**
	 * Binds the node t to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Tp_xRule bindT(final T object) {
		parameters.put("t", Objects.requireNonNull(object, "t must not be null!"));
		return this;
	}

	/**
	 * Binds the node k to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Tp_xRule bindK(final K object) {
		parameters.put("k", Objects.requireNonNull(object, "k must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Tp_xRule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	/**
	 * Binds the node ps to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Tp_xRule bindPs(final P_s object) {
		parameters.put("ps", Objects.requireNonNull(object, "ps must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	t --> " + parameters.get("t") + System.lineSeparator();
		s += "	k --> " + parameters.get("k") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "	ps --> " + parameters.get("ps") + System.lineSeparator();
		s += "}";
		return s;
	}
}
