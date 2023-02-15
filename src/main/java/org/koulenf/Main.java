package org.koulenf;

/**
 * The builder pattern:
 * - creational design pattern: about the way of creating objects
 * - Separates (complex) construction code from logic of class
 */
public class Main {
    public static void main(String[] args) {
        int id = 1;
        String brand = "Bugatti";
        String model = "Chiron";
        String color = "Blue";
        double weight = 1996.0;
        double height = 121.20;
        int numberOfDoors = 2;
        String engine = "8 l W16";


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

        // Solution: use to easily create objects with same building steps
        Director director = new Director();
        Car.Builder builder = new Car.Builder();
        director.makeSuzukiSwift(builder);
        Car suzukiSwift1 = builder.build();
        Car suzukiSwift2 = builder.color("red").build();

        System.out.println(carOptional);
        System.out.println(suzukiSwift1);
        System.out.println(suzukiSwift2);
    }
}