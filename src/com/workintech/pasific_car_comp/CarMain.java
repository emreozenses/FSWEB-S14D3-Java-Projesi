package com.workintech.pasific_car_comp;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");

        car.startEngine();

        car.accelerate();

        car.breaking();

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

       mitsubishi.startEngine();

        mitsubishi.accelerate();

        mitsubishi.breaking();

        Car ford = new Ford(6, "Ford Falcon");

        ford.startEngine();

        ford.accelerate();

        ford.breaking();

        Car holden = new Holden(6, "Holden Commodore");

       holden.startEngine();

        holden.accelerate();

        holden.breaking();
    }
}
