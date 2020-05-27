package com.OpCharRecog;

public class ActivationFunction {
	public static double sigmoid(double x) {
		return (double) (1 / (1 + Math.exp(-x)));
	}

	public static double dSigmoid(double x) {
		return x*(1-x); // because the output is the sigmoid(x) !!! we dont have to apply it twice
	}
}
