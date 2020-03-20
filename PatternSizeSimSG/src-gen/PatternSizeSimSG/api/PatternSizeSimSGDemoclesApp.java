package PatternSizeSimSG.api;

import org.emoflon.ibex.gt.democles.runtime.DemoclesGTEngine;

/**
 * An application using the PatternSizeSimSGAPI with Democles.
 */
public class PatternSizeSimSGDemoclesApp extends PatternSizeSimSGApp {

	/**
	 * Creates the application with Democles.
	 */
	public PatternSizeSimSGDemoclesApp() {
		super(new DemoclesGTEngine());
	}

	/**
	 * Creates the application with Democles.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public PatternSizeSimSGDemoclesApp(final String workspacePath) {
		super(new DemoclesGTEngine(), workspacePath);
	}
}
