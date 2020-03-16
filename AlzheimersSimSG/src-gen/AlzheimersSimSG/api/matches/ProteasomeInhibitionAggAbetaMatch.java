package AlzheimersSimSG.api.matches;

import AlzheimerModel.AggAbeta;
import AlzheimerModel.Proteasome;
import AlzheimersSimSG.api.rules.ProteasomeInhibitionAggAbetaRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>ProteasomeInhibitionAggAbeta()</code>.
 */
public class ProteasomeInhibitionAggAbetaMatch extends GraphTransformationMatch<ProteasomeInhibitionAggAbetaMatch, ProteasomeInhibitionAggAbetaRule> {
	private AggAbeta varAgg;
	private Proteasome varProt;

	/**
	 * Creates a new match for the rule <code>ProteasomeInhibitionAggAbeta()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ProteasomeInhibitionAggAbetaMatch(final ProteasomeInhibitionAggAbetaRule pattern, final IMatch match) {
		super(pattern, match);
		varAgg = (AggAbeta) match.get("agg");
		varProt = (Proteasome) match.get("prot");
	}

	/**
	 * Returns the agg.
	 *
	 * @return the agg
	 */
	public AggAbeta getAgg() {
		return varAgg;
	}

	/**
	 * Returns the prot.
	 *
	 * @return the prot
	 */
	public Proteasome getProt() {
		return varProt;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	agg --> " + varAgg + System.lineSeparator();
		s += "	prot --> " + varProt + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
