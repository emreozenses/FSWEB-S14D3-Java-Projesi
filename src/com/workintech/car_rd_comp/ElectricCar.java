package com.workintech.car_rd_comp;

public class ElectricCar extends CarSkeleton{

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public void startEngine(){
        System.out.println("The electric motor has started");
        System.out.println(getClass().getSimpleName());
    }

    protected void runEngine(){
        System.out.println("The electric motor is running");
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "avgKmPerCharge=" + avgKmPerCharge +
                ", batterySize=" + batterySize +
                '}';
    }
}
