package PatternSizeSimSG.api;

import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationApp;
import Params6Model.Params6ModelPackage;

/**
 * An application using the PatternSizeSimSGAPI.
 */
public class PatternSizeSimSGApp extends GraphTransformationApp<PatternSizeSimSGAPI> {

	/**
	 * Creates the application with the given engine.
	 * 
	 * @param engine
	 *            the pattern matching engine
	 */
	public PatternSizeSimSGApp(final IContextPatternInterpreter engine) {
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
	public PatternSizeSimSGApp(final IContextPatternInterpreter engine, final String workspacePath) {
		super(engine, workspacePath);
	}

	@Override
	public void registerMetaModels() {
		registerMetaModel(Params6ModelPackage.eINSTANCE);
	}

	@Override
	public PatternSizeSimSGAPI initAPI() {
		if (defaultResource.isPresent()) {
			return new PatternSizeSimSGAPI(engine, resourceSet, defaultResource.get(), workspacePath);
		}
		return new PatternSizeSimSGAPI(engine, resourceSet, workspacePath);
	}
}
