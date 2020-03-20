package benchmark;

import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;
import org.simsg.core.utils.Runtimer;

import AlzheimersSimSG.api.AlzheimersSimSGSimSGApi;
import reactionContainer.ReactionContainerPackage;

public class AlzheimersBenchmark {

	public static void main(String[] args) {
		ReactionContainerPackage.eINSTANCE.eClass();
		AlzheimersSimSGSimSGApi api = new AlzheimersSimSGSimSGApi();
		api.configureForDemocles();
		api.configureStochasticSimulation();
		SimulationConfigurator config = api.getSimulationConfigurator();

		config.setModel("AlzheimerModel");
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
