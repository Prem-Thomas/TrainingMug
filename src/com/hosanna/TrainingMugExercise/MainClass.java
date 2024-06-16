package com.hosanna.TrainingMugExercise;

public class MainClass {
    public static void main(String[] args) {
        Car_Day06 car = new Car_Day06();
        car.name = "Chevrolet Corvette";
        car.brand = "Chevrolet";
        car.model = "V-8 Corvette";
        car.year = 2024;
        car.price = 69995;
        car.diplayInfo();;
        System.out.println();
        
        Car_Day06 car1 = new Car_Day06();
        car1.name = "Jaguar";
        car1.brand = "2022Jaguar";
        car1.model = "jaguar F-type";
        car1.year = 2022;
        car1.price = 71050;
        car1.diplayInfo();;
    }
}
