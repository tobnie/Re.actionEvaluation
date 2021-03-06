package gklSimSG.api.rules;

import GKL1600Model.K;
import gklSimSG.api.GklSimSGAPI;
import gklSimSG.api.matches.T_x_K_aBoundTrgMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>T_x_K_aBoundTrg()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class T_x_K_aBoundTrgRule extends GraphTransformationRule<T_x_K_aBoundTrgMatch, T_x_K_aBoundTrgRule> {
	private static String patternName = "T_x_K_aBoundTrg";

	/**
	 * Creates a new rule T_x_K_aBoundTrg().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public T_x_K_aBoundTrgRule(final GklSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected T_x_K_aBoundTrgMatch convertMatch(final IMatch match) {
		return new T_x_K_aBoundTrgMatch(this, match);
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
	public T_x_K_aBoundTrgRule bindTrg(final K object) {
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
