package gklSimSG.api;

import org.emoflon.ibex.gt.democles.runtime.DemoclesGTEngine;

/**
 * An application using the GklSimSGAPI with Democles.
 */
public class GklSimSGDemoclesApp extends GklSimSGApp {

	/**
	 * Creates the application with Democles.
	 */
	public GklSimSGDemoclesApp() {
		super(new DemoclesGTEngine());
	}

	/**
	 * Creates the application with Democles.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public GklSimSGDemoclesApp(final String workspacePath) {
		super(new DemoclesGTEngine(), workspacePath);
	}
}
