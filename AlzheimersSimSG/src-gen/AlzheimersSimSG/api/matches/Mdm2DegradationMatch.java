package AlzheimersSimSG.api.matches;

import AlzheimerModel.ATP;
import AlzheimerModel.Mdm2;
import AlzheimerModel.Proteasome;
import AlzheimerModel.UB4_s;
import AlzheimersSimSG.api.rules.Mdm2DegradationRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>Mdm2Degradation()</code>.
 */
public class Mdm2DegradationMatch extends GraphTransformationMatch<Mdm2DegradationMatch, Mdm2DegradationRule> {
	private Proteasome varProt;
	private Mdm2 varMdm2;
	private ATP varAtp;
	private UB4_s varUb4s;

	/**
	 * Creates a new match for the rule <code>Mdm2Degradation()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Mdm2DegradationMatch(final Mdm2DegradationRule pattern, final IMatch match) {
		super(pattern, match);
		varProt = (Proteasome) match.get("prot");
		varMdm2 = (Mdm2) match.get("mdm2");
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
	 * Returns the mdm2.
	 *
	 * @return the mdm2
	 */
	public Mdm2 getMdm2() {
		return varMdm2;
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
		s += "	mdm2 --> " + varMdm2 + System.lineSeparator();
		s += "	atp --> " + varAtp + System.lineSeparator();
		s += "	ub4s --> " + varUb4s + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
