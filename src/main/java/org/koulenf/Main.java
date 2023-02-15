package org.koulenf;

/**
 * The builder pattern:
 *  - creational design pattern: about the way of creating objects
 *  - Separates (complex) construction code from logic of class
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


        // Problem: Big constructor
        Car carBigConstructor = new Car(id, brand, model, color, weight, height, numberOfDoors, engine);

        // Problem: Value of null
        Car carOptional = new Car(id, brand, model, null, weight, height, numberOfDoors, null);





        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.makeSuzukiSwift(builder);
        Car car = builder.getResult();
        Manual manual = manualBuilder.getResult();

        System.out.println(car);
        System.out.println(manual);
    }
}