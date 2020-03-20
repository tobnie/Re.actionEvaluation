package benchmark;

import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;
import org.simsg.core.utils.Runtimer;

import PatternSizeSimSG.api.PatternSizeSimSGSimSGApi;
import reactionContainer.ReactionContainerPackage;

public class PatternSizeBenchmark {

	public static void main(String[] args) {
		ReactionContainerPackage.eINSTANCE.eClass();
		PatternSizeSimSGSimSGApi api = new PatternSizeSimSGSimSGApi();
		api.configureForHiPE();
		api.configureStochasticSimulation();
		SimulationConfigurator config = api.getSimulationConfigurator();

		config.setModel("Params6Model");
		config.addObservableStatistic();

		Simulation sim = config.createSimulation();
		sim.initializeClocked();
		sim.runClocked();
		sim.printCurrentMatches();
		sim.displayResults();
		sim.saveModelGraph();
		sim.finish();

		System.out.println(Runtimer.getInstance().toString());
	}
}
