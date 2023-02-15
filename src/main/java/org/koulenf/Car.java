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

    public Car(Builder builder) {
        this.id = builder.id;
        this.brand = builder.brand;
        this.model = builder.model;
        this.color = builder.color;
        this.weight = builder.weight;
        this.height = builder.height;
        this.numberOfDoors = builder.numberOfDoors;
        this.engine = builder.engine;
    }

    public void drive() {
    }

    public void brake() {
    }

    public void turnOnAC() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", numberOfDoors=" + numberOfDoors +
                ", engine='" + engine + '\'' +
                '}';
    }

    public static class Builder {
        private int id;
        private String brand;
        private String model;
        private String color;
        private double weight;
        private double height;
        private int numberOfDoors;
        private String engine;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder height(double height) {
            this.height = height;
            return this;
        }

        public Builder numberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

}
