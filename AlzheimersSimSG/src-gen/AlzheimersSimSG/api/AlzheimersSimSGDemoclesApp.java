package AlzheimersSimSG.api;

import org.emoflon.ibex.gt.democles.runtime.DemoclesGTEngine;

/**
 * An application using the AlzheimersSimSGAPI with Democles.
 */
public class AlzheimersSimSGDemoclesApp extends AlzheimersSimSGApp {

	/**
	 * Creates the application with Democles.
	 */
	public AlzheimersSimSGDemoclesApp() {
		super(new DemoclesGTEngine());
	}

	/**
	 * Creates the application with Democles.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public AlzheimersSimSGDemoclesApp(final String workspacePath) {
		super(new DemoclesGTEngine(), workspacePath);
	}
}
