package AlzheimersSimSG.api.matches;

import AlzheimerModel.ATP;
import AlzheimerModel.P53;
import AlzheimerModel.Proteasome;
import AlzheimerModel.UB4_s;
import AlzheimersSimSG.api.rules.P53DegradationRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>P53Degradation()</code>.
 */
public class P53DegradationMatch extends GraphTransformationMatch<P53DegradationMatch, P53DegradationRule> {
	private Proteasome varProt;
	private P53 varP53;
	private ATP varAtp;
	private UB4_s varUb4s;

	/**
	 * Creates a new match for the rule <code>P53Degradation()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public P53DegradationMatch(final P53DegradationRule pattern, final IMatch match) {
		super(pattern, match);
		varProt = (Proteasome) match.get("prot");
		varP53 = (P53) match.get("p53");
		varAtp = (ATP) match.get("atp");
		varUb4s = (UB4_s) match.get("ub4s");
	}

	/**
	 * Returns the prot.
	 *
	 * @return the prot
	 */
	public Proteasome getProt() {
		return varProt;
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
	 * Returns the atp.
	 *
	 * @return the atp
	 */
	public ATP getAtp() {
		return varAtp;
	}

	/**
	 * Returns the ub4s.
	 *
	 * @return the ub4s
	 */
	public UB4_s getUb4s() {
		return varUb4s;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	prot --> " + varProt + System.lineSeparator();
		s += "	p53 --> " + varP53 + System.lineSeparator();
		s += "	atp --> " + varAtp + System.lineSeparator();
		s += "	ub4s --> " + varUb4s + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
