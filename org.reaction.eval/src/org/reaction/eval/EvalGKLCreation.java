package org.reaction.eval;

import java.util.LinkedList;
import java.util.List;

import org.reaction.main.Transformation;

import benchmark.GKLBenchmark;
//import gklSimSG.benchmark.GKLBenchmark;
import reactionContainer.ReactionContainerPackage;

public class EvalGKLCreation {

	public static void main(String[] args) {

		final String dslModelLocation = "..\\..\\re.actionEvaluation\\models\\gkl\\";
		final String trgProjectLocation = "..\\..\\re.actionEvaluation\\gklSimSG";

		ReactionContainerPackage.eINSTANCE.eClass();
		List<Transformation> transformations = new LinkedList<>();

		String[] modelNames = { "GKL100", "GKL200", "GKL400", "GKL800", "GKL1600" };

		for (int i = 0; i < modelNames.length; i++) {
			transformations.add(new Transformation(dslModelLocation, modelNames[i], trgProjectLocation, "GKL"));
//			benchmarks.add(new GKLBenchmark(modelNames[i] + "Model.xmi"));
		}

		System.out.println("Starting Transformations...");
		for (int i = 0; i < modelNames.length; i++) {
			Transformation trafo = transformations.get(i);

			System.out.println("Starting Transformation of Model " + modelNames[i] + "..");
			trafo.start();
			System.out.println("Finished Transformation.\n");
		}
		System.out.println("Finished Transformations.");
		System.out.println("\n------------------------------------------------\n");
		System.out.println("Starting Benchmarks...");
		for (int i = 0; i < modelNames.length; i++) {
			System.out.println("Starting benchmark for Model " + modelNames[i] + " with Democles..");
			GKLBenchmark.main(modelNames);
			System.out.println("Finished benchmark.");
		}
		System.out.println("Finished Benchmarks.");
	}

}
