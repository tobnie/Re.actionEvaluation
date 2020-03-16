package AlzheimersSimSG.api.matches;

import AlzheimerModel.Mdm2mRNA;
import AlzheimersSimSG.api.rules.Mdm2mRNADegradationRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>mdm2mRNADegradation()</code>.
 */
public class Mdm2mRNADegradationMatch extends GraphTransformationMatch<Mdm2mRNADegradationMatch, Mdm2mRNADegradationRule> {
	private Mdm2mRNA varMdm2mRna;

	/**
	 * Creates a new match for the rule <code>mdm2mRNADegradation()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Mdm2mRNADegradationMatch(final Mdm2mRNADegradationRule pattern, final IMatch match) {
		super(pattern, match);
		varMdm2mRna = (Mdm2mRNA) match.get("mdm2mRna");
	}

	/**
	 * Returns the mdm2mRna.
	 *
	 * @return the mdm2mRna
	 */
	public Mdm2mRNA getMdm2mRna() {
		return varMdm2mRna;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	mdm2mRna --> " + varMdm2mRna + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
