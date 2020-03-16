package AlzheimersSimSG.api.rules;

import AlzheimerModel.DamDNA;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.DNARepairMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>DNARepair()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class DNARepairRule extends GraphTransformationRule<DNARepairMatch, DNARepairRule> {
	private static String patternName = "DNARepair";

	/**
	 * Creates a new rule DNARepair().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public DNARepairRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected DNARepairMatch convertMatch(final IMatch match) {
		return new DNARepairMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("damDNA");
		return names;
	}

	/**
	 * Binds the node damDNA to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public DNARepairRule bindDamDNA(final DamDNA object) {
		parameters.put("damDNA", Objects.requireNonNull(object, "damDNA must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	damDNA --> " + parameters.get("damDNA") + System.lineSeparator();
		s += "}";
		return s;
	}
}
