package AlzheimersSimSG.api.matches;

import AlzheimerModel.AggTau;
import AlzheimerModel.Proteasome;
import AlzheimersSimSG.api.rules.ProteasomeInhibitionAggTauRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>ProteasomeInhibitionAggTau()</code>.
 */
public class ProteasomeInhibitionAggTauMatch extends GraphTransformationMatch<ProteasomeInhibitionAggTauMatch, ProteasomeInhibitionAggTauRule> {
	private AggTau varAgg;
	private Proteasome varProt;

	/**
	 * Creates a new match for the rule <code>ProteasomeInhibitionAggTau()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ProteasomeInhibitionAggTauMatch(final ProteasomeInhibitionAggTauRule pattern, final IMatch match) {
		super(pattern, match);
		varAgg = (AggTau) match.get("agg");
		varProt = (Proteasome) match.get("prot");
	}

	/**
	 * Returns the agg.
	 *
	 * @return the agg
	 */
	public AggTau getAgg() {
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
