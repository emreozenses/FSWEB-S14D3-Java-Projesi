package com.workintech.pasific_car_comp;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public void startEngine(){
        System.out.println("The Ford engine is starting");
        System.out.println(getClass().getSimpleName());
    }
    public void accelerate(){
        System.out.println( getName()+"is accelerating");
        System.out.println(getClass().getSimpleName());
    }
    public void breaking (){
        System.out.println(getName()+ "is breaking");
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "Ford{}";
    }
}
