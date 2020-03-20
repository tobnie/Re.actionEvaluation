package PatternSizeSimSG.api;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationAPI;
import PatternSizeSimSG.api.rules.OscBwdRule;
import PatternSizeSimSG.api.rules.OscRule;
import PatternSizeSimSG.api.rules.U_a_V_aBoundSrcRule;
import PatternSizeSimSG.api.rules.U_a_V_aBoundTrgRule;
import PatternSizeSimSG.api.rules.W_a_X_aBoundSrcRule;
import PatternSizeSimSG.api.rules.W_a_X_aBoundTrgRule;
import PatternSizeSimSG.api.rules.Y_a_Z_aBoundSrcRule;
import PatternSizeSimSG.api.rules.Y_a_Z_aBoundTrgRule;

/**
 * The PatternSizeSimSGAPI with 8 rules.
 */
public class PatternSizeSimSGAPI extends GraphTransformationAPI {
	public static String patternPath = "PatternSizeSimSG/src-gen/PatternSizeSimSG/api/ibex-patterns.xmi";

	/**
	 * Creates a new PatternSizeSimSGAPI.
	 *
	 * @param engine
	 *            the engine to use for queries and transformations
	 * @param model
	 *            the resource set containing the model file
	 * @param workspacePath
	 *            the path to the workspace which is concatenated with the project
	 *            relative path to the patterns
	 */
	public PatternSizeSimSGAPI(final IContextPatternInterpreter engine, final ResourceSet model, final String workspacePath) {
		super(engine, model);
		URI uri = URI.createFileURI(workspacePath + patternPath);
		interpreter.loadPatternSet(uri);
	}

	/**
	 * Creates a new PatternSizeSimSGAPI.
	 *
	 * @param engine
	 *            the engine to use for queries and transformations
	 * @param model
	 *            the resource set containing the model file
	 * @param defaultResource
	 *            the default resource
	 * @param workspacePath
	 *            the path to the workspace which is concatenated with the project
	 *            relative path to the patterns
	 */
	public PatternSizeSimSGAPI(final IContextPatternInterpreter engine, final ResourceSet model, final Resource defaultResource,
			final String workspacePath) {
		super(engine, model, defaultResource);
		URI uri = URI.createFileURI(workspacePath + patternPath);
		interpreter.loadPatternSet(uri);
	}

	/**
	 * Creates a new instance of the rule <code>U_a_V_aBoundSrc()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public U_a_V_aBoundSrcRule U_a_V_aBoundSrc() {
		return new U_a_V_aBoundSrcRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>U_a_V_aBoundTrg()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public U_a_V_aBoundTrgRule U_a_V_aBoundTrg() {
		return new U_a_V_aBoundTrgRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>W_a_X_aBoundSrc()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public W_a_X_aBoundSrcRule W_a_X_aBoundSrc() {
		return new W_a_X_aBoundSrcRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>W_a_X_aBoundTrg()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public W_a_X_aBoundTrgRule W_a_X_aBoundTrg() {
		return new W_a_X_aBoundTrgRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Y_a_Z_aBoundSrc()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Y_a_Z_aBoundSrcRule Y_a_Z_aBoundSrc() {
		return new Y_a_Z_aBoundSrcRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Y_a_Z_aBoundTrg()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Y_a_Z_aBoundTrgRule Y_a_Z_aBoundTrg() {
		return new Y_a_Z_aBoundTrgRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>osc()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public OscRule osc() {
		return new OscRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>oscBwd()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public OscBwdRule oscBwd() {
		return new OscBwdRule(this, interpreter);
	}
}
