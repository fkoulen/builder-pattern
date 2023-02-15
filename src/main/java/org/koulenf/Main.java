package org.koulenf;

public class Main {
    public static void main(String[] args) {

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