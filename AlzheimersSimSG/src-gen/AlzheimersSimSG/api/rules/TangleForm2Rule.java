package AlzheimersSimSG.api.rules;

import AlzheimerModel.AggTau;
import AlzheimerModel.NFT;
import AlzheimersSimSG.api.AlzheimersSimSGAPI;
import AlzheimersSimSG.api.matches.TangleForm2Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>tangleForm2()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class TangleForm2Rule extends GraphTransformationRule<TangleForm2Match, TangleForm2Rule> {
	private static String patternName = "tangleForm2";

	/**
	 * Creates a new rule tangleForm2().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public TangleForm2Rule(final AlzheimersSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected TangleForm2Match convertMatch(final IMatch match) {
		return new TangleForm2Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("nft1");
		names.add("agg1");
		return names;
	}

	/**
	 * Binds the node nft1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TangleForm2Rule bindNft1(final NFT object) {
		parameters.put("nft1", Objects.requireNonNull(object, "nft1 must not be null!"));
		return this;
	}

	/**
	 * Binds the node agg1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TangleForm2Rule bindAgg1(final AggTau object) {
		parameters.put("agg1", Objects.requireNonNull(object, "agg1 must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	nft1 --> " + parameters.get("nft1") + System.lineSeparator();
		s += "	agg1 --> " + parameters.get("agg1") + System.lineSeparator();
		s += "}";
		return s;
	}
}
