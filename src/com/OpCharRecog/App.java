package com.OpCharRecog;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;

import com.OpCharRecog.BackpropNeuralNetwork;
import com.OpCharRecog.NeuralNetConstants;
public class App {
	public static void main(String[] args) throws Exception {
		ArrayList<ArrayList<Double>> lists = new ArrayList<ArrayList<Double>>();
		lists = CSVfileReader.exTractTraningData(new FileReader("C:\\Users\\alper\\Desktop\\OCRData\\optdigitsTrain.tra"));
		
		double[][] trainingData = lists.stream()
                .map(l -> l.stream().mapToDouble(Double::doubleValue).toArray())
                .toArray(double[][]::new);
				/*lists.stream()
                			.map(l -> l.stream()
                           .mapToFloat(Float::parseFloat)
                           .toArray())
                           .toArray(Float[][]::new);*/
			/* new float[] {0,0,1,1,1,1,0,0,0,1,1,0,0,1,1,0,1,1,0,0,0,0,1,1,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1,1,1,0,0,0,0,1,1,0,1,1,0,0,1,1,0,0,0,1,1,1,1,0,0},
			 new float[] {1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1},
			 new float[] {0,0,0,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,0,0,1,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
			 new float[] {0,0,1,1,0,0,0,1,0,1,1,0,1,0,1,1,0,1,0,0,0,1,1,1,1,1,0,0,1,1,0,1,1,0,0,1,1,0,0,1,1,0,0,1,0,0,0,1,1,1,1,1,0,0,0,1,0,1,1,0,0,0,0,1},
			 new float[] {0,1,1,0,0,0,1,1,0,1,0,0,0,0,0,1,1,1,0,0,0,0,0,1,1,0,0,0,0,0,0,1,1,0,0,0,1,0,1,1,1,1,0,0,1,0,1,0,0,1,1,0,1,0,1,0,0,0,1,1,1,1,1,0},
			 new float[] {0,0,0,0,1,1,0,0,1,0,0,1,1,1,0,0,0,0,1,1,0,1,0,0,0,1,1,0,0,1,0,0,1,1,0,0,1,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0},
			 new float[] {1,1,1,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,1,1,1,0,0,0,1,1,1,1,1,0,0,0,0,1,1,0,1,0,0,0,0,0,0,0},
			 new float[] {0,0,1,1,1,1,0,0,0,1,1,1,0,1,1,0,1,1,0,0,0,1,1,1,1,0,0,0,0,1,0,1,1,0,1,0,0,1,0,1,1,1,0,0,0,1,0,1,0,1,1,0,0,1,1,1,0,0,1,0,0,1,1,0},
			 new float[] {1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,0,0,0,1,0,1,1,1,0,0,1,1,1,1,0,1,0,0,1,1,1,0,0,1,0,0,1,1,0,0,0,1,0,1,1,1,0,0,0,1,1,1,0,1,0,0,0},
			 new float[] {0,0,0,0,0,0,0,0,0,1,1,0,0,1,1,0,1,1,1,1,1,1,1,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,1,1,1,1,1,1,1,0,1,1,0,0,1,1,0,0,0,0,0,0,0,0,0},
			 new float[] {0,1,1,1,0,0,0,1,1,1,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,0,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,0,1,0,0,1,1,1,0,1,1,0,0,1,0,1,1,1,1,1,1,1}*/
				
		
		
		double[][] trainingResults = new double[][] {
			 //new double[] {1,0,0,0,0,0,0,0,0,0}, // "0"
			 new double[] {1,0,0,0,0,0,0,0,0,0}, // "0"
			 new double[] {0,1,0,0,0,0,0,0,0,0},// "1"
			 new double[] {0,0,1,0,0,0,0,0,0,0},// "2"
			 new double[] {0,0,0,1,0,0,0,0,0,0},// "3"
			 new double[] {0,0,0,0,1,0,0,0,0,0},// "4"
			 new double[] {0,0,0,0,0,1,0,0,0,0},// "5"
			 new double[] {0,0,0,0,0,0,1,0,0,0},// "6"
			 new double[] {0,0,0,0,0,0,0,1,0,0},// "7"
			 new double[] {0,0,0,0,0,0,0,0,1,0},// "8"
			 new double[] {0,0,0,0,0,0,0,0,0,1}// "9"
		};
		ArrayList<Integer> classes = new ArrayList<Integer>();
		classes = com.OpCharRecog.CSVfileReader.classes;
		
		BackpropNeuralNetwork backpropagationNeuralNetworks = new BackpropNeuralNetwork(64, 15, 10);
	
		for (int iterations = 0; iterations < NeuralNetConstants.ITERATIONS; iterations++) {
	
			for (int i = 0; i < trainingData.length; i++) {
				backpropagationNeuralNetworks.train(trainingData[i], trainingResults[classes.get(i)], NeuralNetConstants.LEARNING_RATE, NeuralNetConstants.MOMENTUM);
			}
	
			if ((iterations + 1) % 100 == 0) {
				System.out.println();
				for (int i = 0; i < trainingData.length; i++) {
					double[] data = trainingData[i];
					double[] calculatedOutput = backpropagationNeuralNetworks.run(data);
					System.out.println(calculatedOutput[0]+" "+calculatedOutput[1]+" "+calculatedOutput[2]+" "+calculatedOutput[3]+" "+calculatedOutput[4]+" "+calculatedOutput[5]+" "+calculatedOutput[6]+" "+calculatedOutput[7]+" "+calculatedOutput[8]+" "+calculatedOutput[9]);
				}
			}
		}		
	
		System.out.println("---------------------------");
		/*CharacterReader.readImage();
		double[] calculatedOutput = backpropagationNeuralNetworks.run(CharacterReader.pixelarray);
		System.out.println(calculatedOutput[0]+" "+calculatedOutput[1]+" "+calculatedOutput[2]+" "+calculatedOutput[3]+" "+calculatedOutput[4]+" "+calculatedOutput[5]+" "+calculatedOutput[6]+" "+calculatedOutput[7]+" "+calculatedOutput[8]+" "+calculatedOutput[9]);
		System.out.println("---------------------------");*/
		double[] calculatedOutput = backpropagationNeuralNetworks.run(new double[] {0,0,1,1,1,0,0,0,0,0,1,1,1,1,0,0,0,0,1,1,0,1,0,0,0,0,0,1,1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1,1,1,0,0,0,0,1,0,0,1,1,0,0,0,1,1,1,1,0,0});
		System.out.println(calculatedOutput[0]+" "+calculatedOutput[1]+" "+calculatedOutput[2]+" "+calculatedOutput[3]+" "+calculatedOutput[4]+" "+calculatedOutput[5]+" "+calculatedOutput[6]+" "+calculatedOutput[7]+" "+calculatedOutput[8]+" "+calculatedOutput[9]);
		System.out.println("---------------------------");
		int character=10;
		double max=calculatedOutput[0];
		for(int i=0;i<10;i++){
			
				if(calculatedOutput[i]>max){
					max = calculatedOutput[i];
					character=i;
				}
			
		}
		if(character<10)
			System.out.println("Recognized character is "+character);
	}
}
