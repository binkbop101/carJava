package com.lbg;
import com.lbg.classes.Car;
import com.lbg.classes.CarColour;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Car bartCar = new Car();
        System.out.println(bartCar.getSpeed());
        System.out.println(bartCar);
        bartCar.setColour(CarColour.BRITISH_RACING_GREEN);
        System.out.println(bartCar.getColour());
        bartCar.accelerate(50);
        System.out.println(bartCar.getSpeed());
        bartCar.deAccelerate(34);
        System.out.println(bartCar.getSpeed());

        Car sally = new Car("997 Carrera S");
        sally.setColour(CarColour.BABY_BLUE);
        System.out.println(sally.getSpeed());
        System.out.println(sally.getModel());

        Car[] cars = {bartCar, sally};
        for (Car car : cars){
            System.out.println(car.getColour());
        }

    }
}