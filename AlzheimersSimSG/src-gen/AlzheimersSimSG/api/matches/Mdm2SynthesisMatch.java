package AlzheimersSimSG.api.matches;

import AlzheimerModel.Mdm2mRNA;
import AlzheimerModel.U_s;
import AlzheimerModel.UNB_s;
import AlzheimersSimSG.api.rules.Mdm2SynthesisRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>Mdm2Synthesis()</code>.
 */
public class Mdm2SynthesisMatch extends GraphTransformationMatch<Mdm2SynthesisMatch, Mdm2SynthesisRule> {
	private Mdm2mRNA varMdm2mRna;
	private U_s varUs;
	private UNB_s varUnbs;

	/**
	 * Creates a new match for the rule <code>Mdm2Synthesis()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Mdm2SynthesisMatch(final Mdm2SynthesisRule pattern, final IMatch match) {
		super(pattern, match);
		varMdm2mRna = (Mdm2mRNA) match.get("mdm2mRna");
		varUs = (U_s) match.get("us");
		varUnbs = (UNB_s) match.get("unbs");
	}

	/**
	 * Returns the mdm2mRna.
	 *
	 * @return the mdm2mRna
	 */
	public Mdm2mRNA getMdm2mRna() {
		return varMdm2mRna;
	}

	/**
	 * Returns the us.
	 *
	 * @return the us
	 */
	public U_s getUs() {
		return varUs;
	}

	/**
	 * Returns the unbs.
	 *
	 * @return the unbs
	 */
	public UNB_s getUnbs() {
		return varUnbs;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	mdm2mRna --> " + varMdm2mRna + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "	unbs --> " + varUnbs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
