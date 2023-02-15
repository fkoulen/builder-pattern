package org.koulenf;

public class Director {
    public void makeSuzukiSwift(Car.Builder builder) {
        builder.brand("Suzuki")
                .model("Swift")
                .engine("1298 cc")
                .numberOfDoors(5);
    }
}
