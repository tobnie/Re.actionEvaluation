package AlzheimersSimSG.api;

import AlzheimerModel.AlzheimerModelPackage;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationApp;
import reactionContainer.ReactionContainerPackage;

/**
 * An application using the AlzheimersSimSGAPI.
 */
public class AlzheimersSimSGApp extends GraphTransformationApp<AlzheimersSimSGAPI> {

	/**
	 * Creates the application with the given engine.
	 * 
	 * @param engine
	 *            the pattern matching engine
	 */
	public AlzheimersSimSGApp(final IContextPatternInterpreter engine) {
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
	public AlzheimersSimSGApp(final IContextPatternInterpreter engine, final String workspacePath) {
		super(engine, workspacePath);
	}

	@Override
	public void registerMetaModels() {
		registerMetaModel(ReactionContainerPackage.eINSTANCE);
		registerMetaModel(AlzheimerModelPackage.eINSTANCE);
	}

	@Override
	public AlzheimersSimSGAPI initAPI() {
		if (defaultResource.isPresent()) {
			return new AlzheimersSimSGAPI(engine, resourceSet, defaultResource.get(), workspacePath);
		}
		return new AlzheimersSimSGAPI(engine, resourceSet, workspacePath);
	}
}
