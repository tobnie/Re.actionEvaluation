package PatternSizeSimSG.api;

import org.emoflon.ibex.gt.hipe.runtime.HiPEGTEngine;

/**
 * An application using the PatternSizeSimSGAPI with HiPE.
 */
public class PatternSizeSimSGHiPEApp extends PatternSizeSimSGApp {

	/**
	 * Creates the application with HiPE.
	 */
	public PatternSizeSimSGHiPEApp() {
		super(new HiPEGTEngine());
	}

	/**
	 * Creates the application with HiPE.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public PatternSizeSimSGHiPEApp(final String workspacePath) {
		super(new HiPEGTEngine(), workspacePath);
	}
}
