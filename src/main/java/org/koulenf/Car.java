package org.koulenf;

public class Car {
    private int id;
    private String brand;
    private String model;
    private String color;
    private double weight;
    private double height;
    private int numberOfDoors;
    private String engine;

    public Car(int id, String brand, String model, String color, double weight, double height, int numberOfDoors, String engine) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.numberOfDoors = numberOfDoors;
        this.engine = engine;
    }


    public void drive() {}
    public void brake() {}
    public void turnOnAC() {}

    // Problem: Too Many Constructors
    public Car(int id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public Car(int id, String brand, String model, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Car(int id, String brand, String model, String color, String engine) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public Car(int id, String brand, String model, String color, double weight, double height) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

}
