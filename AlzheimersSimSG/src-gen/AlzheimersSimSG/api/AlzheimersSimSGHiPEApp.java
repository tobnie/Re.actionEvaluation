package AlzheimersSimSG.api;

import org.emoflon.ibex.gt.hipe.runtime.HiPEGTEngine;

/**
 * An application using the AlzheimersSimSGAPI with HiPE.
 */
public class AlzheimersSimSGHiPEApp extends AlzheimersSimSGApp {

	/**
	 * Creates the application with HiPE.
	 */
	public AlzheimersSimSGHiPEApp() {
		super(new HiPEGTEngine());
	}

	/**
	 * Creates the application with HiPE.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public AlzheimersSimSGHiPEApp(final String workspacePath) {
		super(new HiPEGTEngine(), workspacePath);
	}
}
