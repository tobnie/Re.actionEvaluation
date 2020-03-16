package AlzheimersSimSG.api.matches;

import AlzheimerModel.DamDNA;
import AlzheimersSimSG.api.rules.DNARepairRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>DNARepair()</code>.
 */
public class DNARepairMatch extends GraphTransformationMatch<DNARepairMatch, DNARepairRule> {
	private DamDNA varDamDNA;

	/**
	 * Creates a new match for the rule <code>DNARepair()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public DNARepairMatch(final DNARepairRule pattern, final IMatch match) {
		super(pattern, match);
		varDamDNA = (DamDNA) match.get("damDNA");
	}

	/**
	 * Returns the damDNA.
	 *
	 * @return the damDNA
	 */
	public DamDNA getDamDNA() {
		return varDamDNA;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	damDNA --> " + varDamDNA + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
