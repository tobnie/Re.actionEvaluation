package AlzheimersSimSG.api.matches;

import AlzheimerModel.MT;
import AlzheimerModel.Tau;
import AlzheimerModel.U_s;
import AlzheimersSimSG.api.rules.TauMTRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>TauMT()</code>.
 */
public class TauMTMatch extends GraphTransformationMatch<TauMTMatch, TauMTRule> {
	private MT varMt;
	private Tau varTau;
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>TauMT()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public TauMTMatch(final TauMTRule pattern, final IMatch match) {
		super(pattern, match);
		varMt = (MT) match.get("mt");
		varTau = (Tau) match.get("tau");
		varUs = (U_s) match.get("us");
	}

	/**
	 * Returns the mt.
	 *
	 * @return the mt
	 */
	public MT getMt() {
		return varMt;
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
		s += "	mt --> " + varMt + System.lineSeparator();
		s += "	tau --> " + varTau + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
