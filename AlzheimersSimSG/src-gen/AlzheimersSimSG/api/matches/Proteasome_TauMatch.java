package AlzheimersSimSG.api.matches;

import AlzheimerModel.Proteasome;
import AlzheimerModel.Tau;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.rules.Proteasome_TauRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>Proteasome_Tau()</code>.
 */
public class Proteasome_TauMatch extends GraphTransformationMatch<Proteasome_TauMatch, Proteasome_TauRule> {
	private Proteasome varProt;
	private Tau varTau;
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>Proteasome_Tau()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Proteasome_TauMatch(final Proteasome_TauRule pattern, final IMatch match) {
		super(pattern, match);
		varProt = (Proteasome) match.get("prot");
		varTau = (Tau) match.get("tau");
		varUs = (U_s) match.get("us");
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
	 * Returns the tau.
	 *
	 * @return the tau
	 */
	public Tau getTau() {
		return varTau;
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
		s += "	prot --> " + varProt + System.lineSeparator();
		s += "	tau --> " + varTau + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
