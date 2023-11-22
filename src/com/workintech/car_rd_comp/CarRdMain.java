package com.workintech.car_rd_comp;

import com.workintech.pasific_car_comp.Car;
import com.workintech.pasific_car_comp.Ford;
import com.workintech.pasific_car_comp.Holden;
import com.workintech.pasific_car_comp.Mitsubishi;

public class CarRdMain {

    public static void main(String[] args) {
        CarSkeleton car1 = new CarSkeleton("Base Car","Our design basis");

        car1.startEngine();

        car1.drive();



        CarSkeleton gasPower = new GasPoweredCar("old","old generation car",10,4);

        gasPower.startEngine();

        gasPower.drive();



        CarSkeleton electric = new ElectricCar("new","new gen car",4,1000) ;

        electric.startEngine();

        electric.drive();



        CarSkeleton hybrid = new HybridCar("new old","new gen but little old",6,500,2);

        hybrid.startEngine();

        hybrid.drive();

     
    }
}
