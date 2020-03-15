package gklSimSG.api;

import org.emoflon.ibex.gt.hipe.runtime.HiPEGTEngine;

/**
 * An application using the GklSimSGAPI with HiPE.
 */
public class GklSimSGHiPEApp extends GklSimSGApp {

	/**
	 * Creates the application with HiPE.
	 */
	public GklSimSGHiPEApp() {
		super(new HiPEGTEngine());
	}

	/**
	 * Creates the application with HiPE.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public GklSimSGHiPEApp(final String workspacePath) {
		super(new HiPEGTEngine(), workspacePath);
	}
}
