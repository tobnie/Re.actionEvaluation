package AlzheimersSimSG.api.matches;

import AlzheimerModel.NFT;
import AlzheimersSimSG.api.rules.Obs_obs_tauTangleRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>obs_obs_tauTangle()</code>.
 */
public class Obs_obs_tauTangleMatch extends GraphTransformationMatch<Obs_obs_tauTangleMatch, Obs_obs_tauTangleRule> {
	private NFT varNft;

	/**
	 * Creates a new match for the rule <code>obs_obs_tauTangle()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_obs_tauTangleMatch(final Obs_obs_tauTangleRule pattern, final IMatch match) {
		super(pattern, match);
		varNft = (NFT) match.get("nft");
	}

	/**
	 * Returns the nft.
	 *
	 * @return the nft
	 */
	public NFT getNft() {
		return varNft;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	nft --> " + varNft + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
