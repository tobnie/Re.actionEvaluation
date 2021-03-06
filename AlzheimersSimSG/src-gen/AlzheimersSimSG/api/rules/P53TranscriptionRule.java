package AlzheimersSimSG.api.rules;

import AlzheimerModel.Abeta;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.P53TranscriptionMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>P53Transcription()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class P53TranscriptionRule extends GraphTransformationRule<P53TranscriptionMatch, P53TranscriptionRule> {
	private static String patternName = "P53Transcription";

	/**
	 * Creates a new rule P53Transcription().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public P53TranscriptionRule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected P53TranscriptionMatch convertMatch(final IMatch match) {
		return new P53TranscriptionMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("abeta");
		return names;
	}

	/**
	 * Binds the node abeta to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public P53TranscriptionRule bindAbeta(final Abeta object) {
		parameters.put("abeta", Objects.requireNonNull(object, "abeta must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	abeta --> " + parameters.get("abeta") + System.lineSeparator();
		s += "}";
		return s;
	}
}
