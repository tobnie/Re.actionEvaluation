package AlzheimersSimSG.api.matches;

import AlzheimerModel.P53mRNA;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.rules.P53SynthesisRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>P53Synthesis()</code>.
 */
public class P53SynthesisMatch extends GraphTransformationMatch<P53SynthesisMatch, P53SynthesisRule> {
	private P53mRNA varP53mRNA;
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>P53Synthesis()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public P53SynthesisMatch(final P53SynthesisRule pattern, final IMatch match) {
		super(pattern, match);
		varP53mRNA = (P53mRNA) match.get("p53mRNA");
		varUs = (U_s) match.get("us");
	}

	/**
	 * Returns the p53mRNA.
	 *
	 * @return the p53mRNA
	 */
	public P53mRNA getP53mRNA() {
		return varP53mRNA;
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
		s += "	p53mRNA --> " + varP53mRNA + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
