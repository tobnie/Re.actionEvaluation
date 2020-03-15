package gklSimSG.benchmark;

import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;
import org.simsg.core.utils.Runtimer;

import gklSimSG.api.GklSimSGSimSGApi;
import reactionContainer.ReactionContainerPackage;

public class GKLBenchmark {
	
	String modelName;
	GklSimSGSimSGApi api;
	
	public GKLBenchmark(String modelName) {
		this.modelName = modelName;
		api = new GklSimSGSimSGApi();
	}
	
	public void setDemocles() {
		api.configureForDemocles();
	}
	
	public void setHiPE() {
		api.configureForHiPE();
	}
	
	public void start() {
		api.configureStochasticSimulation();
		SimulationConfigurator config = api.getSimulationConfigurator();
		config.setModel(modelName);
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
