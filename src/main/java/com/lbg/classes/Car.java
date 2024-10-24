package com.lbg.classes;

public class Car {

    public Car(String model){
        this.setModel(model);
    }
    public Car(){
        this.make = "Unknown";
        this.setModel("Unknown");
    }
    private int speed;
    private String make;
    private CarColour colour;
    private String model;

    //getters
    public int getSpeed(){
        return this.speed;
    }
    public String getMake(){
        return this.make;
    }
    public CarColour getColour(){
        return this.colour;
    }
    public String getModel() {
        return model;
    }

    //setters
    public void  setColour(CarColour colour){
        this.colour = colour;
    }
    public void setModel(String model) {
        this.model = model;
    }

    //methods
    public void accelerate(int deltaV) {
        if (deltaV > 0){
            this.speed += deltaV;
        }
    }
    public void deAccelerate(int deltaV) {
        if (deltaV > 0){
            this.speed -= deltaV;
        }
    }
}
