package AlzheimersSimSG.api.matches;

import AlzheimerModel.Proteasome;
import AlzheimersSimSG.api.rules.Proteasome_x_Mdm2_ubiBoundSrcRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>Proteasome_x_Mdm2_ubiBoundSrc()</code>.
 */
public class Proteasome_x_Mdm2_ubiBoundSrcMatch extends GraphTransformationMatch<Proteasome_x_Mdm2_ubiBoundSrcMatch, Proteasome_x_Mdm2_ubiBoundSrcRule> {
	private Proteasome varSrc;

	/**
	 * Creates a new match for the rule <code>Proteasome_x_Mdm2_ubiBoundSrc()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Proteasome_x_Mdm2_ubiBoundSrcMatch(final Proteasome_x_Mdm2_ubiBoundSrcRule pattern, final IMatch match) {
		super(pattern, match);
		varSrc = (Proteasome) match.get("src");
	}

	/**
	 * Returns the src.
	 *
	 * @return the src
	 */
	public Proteasome getSrc() {
		return varSrc;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	src --> " + varSrc + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
