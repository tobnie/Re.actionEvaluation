package PatternSizeSimSG.api;
		import org.simsg.core.simulation.SimSGAPI;
		
		public class PatternSizeSimSGSimSGApi extends SimSGAPI{
			
			public PatternSizeSimSGSimSGApi() {
				super();
				configurator.setRootDataFolder(System.getProperty("user.dir")+"/instances"); 
				configurator.setSimulationDefinitionFolder(System.getProperty("user.dir")+"/instances/simulation_definitions"); 
				configurator.setSimulationResultsFolder(System.getProperty("user.dir")+"/instances/simulation_results"); 
			}
			
			public void configureForHiPE() {
				configurator.setIBeXPMC();
				configurator.setIBeXHiPEGT("PatternSizeSimSG.api");
				configurator.setIBeXHiPEAsEngine("PatternSizeSimSG.api");
			}
			
			public void configureForDemocles() {
				configurator.setIBeXPMC();
				configurator.setIBeXDemoclesGT("PatternSizeSimSG.api");
				configurator.setIBeXDemoclesAsEngine("PatternSizeSimSG.api");
			}
			
			public void configureForHiPE(final String externalApiPackage) {
				configurator.setIBeXPMC();
				configurator.setIBeXHiPEGT(externalApiPackage);
				configurator.setIBeXHiPEAsEngine(externalApiPackage);
			}
			
			public void configureForDemocles(final String externalApiPackage) {
				configurator.setIBeXPMC();
				configurator.setIBeXDemoclesGT(externalApiPackage);
				configurator.setIBeXDemoclesAsEngine(externalApiPackage);
			}	
				
			public void configureStochasticSimulation() {
				try {
					configurator.setStochasticSimulation();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			public void configureSimpleSimulation(final boolean deterministic) {
				try {
					configurator.setSimpleSimulation(deterministic);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
