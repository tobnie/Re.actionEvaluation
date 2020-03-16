package AlzheimersSimSG.api.matches;

import AlzheimerModel.AggAbeta;
import AlzheimersSimSG.api.rules.Proteasome_x_AggAbeta_yBoundTrgRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>Proteasome_x_AggAbeta_yBoundTrg()</code>.
 */
public class Proteasome_x_AggAbeta_yBoundTrgMatch extends GraphTransformationMatch<Proteasome_x_AggAbeta_yBoundTrgMatch, Proteasome_x_AggAbeta_yBoundTrgRule> {
	private AggAbeta varTrg;

	/**
	 * Creates a new match for the rule <code>Proteasome_x_AggAbeta_yBoundTrg()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Proteasome_x_AggAbeta_yBoundTrgMatch(final Proteasome_x_AggAbeta_yBoundTrgRule pattern, final IMatch match) {
		super(pattern, match);
		varTrg = (AggAbeta) match.get("trg");
	}

	/**
	 * Returns the trg.
	 *
	 * @return the trg
	 */
	public AggAbeta getTrg() {
		return varTrg;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	trg --> " + varTrg + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
