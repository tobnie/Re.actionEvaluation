package gklSimSG.api;

import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationApp;
import UNTITLEDModel.UNTITLEDModelPackage;

/**
 * An application using the GklSimSGAPI.
 */
public class GklSimSGApp extends GraphTransformationApp<GklSimSGAPI> {

	/**
	 * Creates the application with the given engine.
	 * 
	 * @param engine
	 *            the pattern matching engine
	 */
	public GklSimSGApp(final IContextPatternInterpreter engine) {
		super(engine);
	}

	/**
	 * Creates the application with the given engine.
	 * 
	 * @param engine
	 *            the pattern matching engine
	 * @param workspacePath
	 *            the workspace path
	 */
	public GklSimSGApp(final IContextPatternInterpreter engine, final String workspacePath) {
		super(engine, workspacePath);
	}

	@Override
	public void registerMetaModels() {
		registerMetaModel(UNTITLEDModelPackage.eINSTANCE);
	}

	@Override
	public GklSimSGAPI initAPI() {
		if (defaultResource.isPresent()) {
			return new GklSimSGAPI(engine, resourceSet, defaultResource.get(), workspacePath);
		}
		return new GklSimSGAPI(engine, resourceSet, workspacePath);
	}
}
