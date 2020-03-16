package benchmark;

import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;
import org.simsg.core.utils.Runtimer;

import gklSimSG.api.GklSimSGSimSGApi;
import reactionContainer.ReactionContainerPackage;

public class GKLBenchmark {

	public static void main(String[] args) {
		ReactionContainerPackage.eINSTANCE.eClass();
		GklSimSGSimSGApi api = new GklSimSGSimSGApi();
		api.configureForDemocles();
		api.configureStochasticSimulation();
		SimulationConfigurator config = api.getSimulationConfigurator();

		config.setModel("GKL800Model");
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
