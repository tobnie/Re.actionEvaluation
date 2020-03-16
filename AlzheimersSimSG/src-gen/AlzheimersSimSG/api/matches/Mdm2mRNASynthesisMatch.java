package AlzheimersSimSG.api.matches;

import AlzheimerModel.P53;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.rules.Mdm2mRNASynthesisRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>mdm2mRNASynthesis()</code>.
 */
public class Mdm2mRNASynthesisMatch extends GraphTransformationMatch<Mdm2mRNASynthesisMatch, Mdm2mRNASynthesisRule> {
	private P53 varP53;
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>mdm2mRNASynthesis()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Mdm2mRNASynthesisMatch(final Mdm2mRNASynthesisRule pattern, final IMatch match) {
		super(pattern, match);
		varP53 = (P53) match.get("p53");
		varUs = (U_s) match.get("us");
	}

	/**
	 * Returns the p53.
	 *
	 * @return the p53
	 */
	public P53 getP53() {
		return varP53;
	}

	/**
	 * Returns the us.
	 *
	 * @return the us
	 */
	public U_s getUs() {
		return varUs;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	p53 --> " + varP53 + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
