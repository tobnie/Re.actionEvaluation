package PatternSizeSimSG.api.matches;

import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import Params6Model.U;
import Params6Model.V;
import Params6Model.W;
import Params6Model.X;
import Params6Model.Y;
import Params6Model.Z;
import PatternSizeSimSG.api.rules.OscRule;

/**
 * A match for the rule <code>osc()</code>.
 */
public class OscMatch extends GraphTransformationMatch<OscMatch, OscRule> {
	private U varU;
	private V varV;
	private W varW;
	private X varX;
	private Y varY;
	private Z varZ;

	/**
	 * Creates a new match for the rule <code>osc()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public OscMatch(final OscRule pattern, final IMatch match) {
		super(pattern, match);
		varU = (U) match.get("u");
		varV = (V) match.get("v");
		varW = (W) match.get("w");
		varX = (X) match.get("x");
		varY = (Y) match.get("y");
		varZ = (Z) match.get("z");
	}

	/**
	 * Returns the u.
	 *
	 * @return the u
	 */
	public U getU() {
		return varU;
	}

	/**
	 * Returns the v.
	 *
	 * @return the v
	 */
	public V getV() {
		return varV;
	}

	/**
	 * Returns the w.
	 *
	 * @return the w
	 */
	public W getW() {
		return varW;
	}

	/**
	 * Returns the x.
	 *
	 * @return the x
	 */
	public X getX() {
		return varX;
	}

	/**
	 * Returns the y.
	 *
	 * @return the y
	 */
	public Y getY() {
		return varY;
	}

	/**
	 * Returns the z.
	 *
	 * @return the z
	 */
	public Z getZ() {
		return varZ;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	u --> " + varU + System.lineSeparator();
		s += "	v --> " + varV + System.lineSeparator();
		s += "	w --> " + varW + System.lineSeparator();
		s += "	x --> " + varX + System.lineSeparator();
		s += "	y --> " + varY + System.lineSeparator();
		s += "	z --> " + varZ + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
