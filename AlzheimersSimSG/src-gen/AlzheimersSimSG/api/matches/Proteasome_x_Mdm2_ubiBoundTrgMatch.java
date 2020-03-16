package AlzheimersSimSG.api.matches;

import AlzheimerModel.Mdm2;
import AlzheimersSimSG.api.rules.Proteasome_x_Mdm2_ubiBoundTrgRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>Proteasome_x_Mdm2_ubiBoundTrg()</code>.
 */
public class Proteasome_x_Mdm2_ubiBoundTrgMatch extends GraphTransformationMatch<Proteasome_x_Mdm2_ubiBoundTrgMatch, Proteasome_x_Mdm2_ubiBoundTrgRule> {
	private Mdm2 varTrg;

	/**
	 * Creates a new match for the rule <code>Proteasome_x_Mdm2_ubiBoundTrg()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Proteasome_x_Mdm2_ubiBoundTrgMatch(final Proteasome_x_Mdm2_ubiBoundTrgRule pattern, final IMatch match) {
		super(pattern, match);
		varTrg = (Mdm2) match.get("trg");
	}

	/**
	 * Returns the trg.
	 *
	 * @return the trg
	 */
	public Mdm2 getTrg() {
		return varTrg;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	trg --> " + varTrg + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
