package com.workintech.car_rd_comp;

import java.util.Objects;

public class CarSkeleton {

    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine(){
        System.out.println("The engine has started");
        System.out.println(getClass().getSimpleName());
    }
    public void drive(){
        System.out.println("The car is being driven");
        runEngine();
    }
    protected void runEngine(){
        System.out.println("The engine is running");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarSkeleton that = (CarSkeleton) o;
        return Objects.equals(name, that.name);
    }


}
