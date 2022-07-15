package com.futurecollars.taskSeven;

public class WeightedAverage {

    public static double calculateWeightedAverage(int trainingLengthParameter, int caloriesBurnedParameter, int pulseParameter) {
        return (trainingLengthParameter + caloriesBurnedParameter * 2 + pulseParameter * 3) / 6.0;
    }
}
