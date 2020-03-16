package AlzheimersSimSG.api.matches;

import AlzheimerModel.AggTau;
import AlzheimerModel.NFT;
import AlzheimersSimSG.api.rules.TangleForm2Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>tangleForm2()</code>.
 */
public class TangleForm2Match extends GraphTransformationMatch<TangleForm2Match, TangleForm2Rule> {
	private NFT varNft1;
	private AggTau varAgg1;

	/**
	 * Creates a new match for the rule <code>tangleForm2()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public TangleForm2Match(final TangleForm2Rule pattern, final IMatch match) {
		super(pattern, match);
		varNft1 = (NFT) match.get("nft1");
		varAgg1 = (AggTau) match.get("agg1");
	}

	/**
	 * Returns the nft1.
	 *
	 * @return the nft1
	 */
	public NFT getNft1() {
		return varNft1;
	}

	/**
	 * Returns the agg1.
	 *
	 * @return the agg1
	 */
	public AggTau getAgg1() {
		return varAgg1;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	nft1 --> " + varNft1 + System.lineSeparator();
		s += "	agg1 --> " + varAgg1 + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
