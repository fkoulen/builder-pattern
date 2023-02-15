package org.koulenf;

/**
 * The builder pattern:
 * - creational design pattern: about the way of creating objects
 * - Separates (complex) construction code from logic of class
 */
public class Main {
    public static void main(String[] args) {
        int id = 1;
        String brand = "Suzuki";
        String model = "Swift";
        String color = "Red";
        double weight = 988.80;
        double height = 2.3;
        int numberOfDoors = 5;
        String engine = "1298 cc";


        // Solution: set through builder
        Car carBigConstructor = new Car.Builder().id(id)
                .brand(brand)
                .model(model)
                .color(color)
                .weight(weight)
                .height(height)
                .numberOfDoors(numberOfDoors)
                .engine(engine)
                .build();

        // Solution: only fill in values you want
        Car carOptional = new Car.Builder().id(id)
                .brand(brand)
                .model(model)
                .color(color)
                .engine(engine)
                .build();


        System.out.println(carOptional);
    }
}