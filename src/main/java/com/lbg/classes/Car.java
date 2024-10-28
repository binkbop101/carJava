package com.lbg.classes;

public class Car {

    public Car(String make, String model, CarColour colour)
    {
        this.setMake(make);
        this.setModel(model);
        this.setColour(colour);
    }

    public Car(){
        this.make = "Unknown";
        this.setModel("Unknown");
    }
    @Override
    public String toString(){
        String info = "Car: " + this.getMake();
        return "I am a car";
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
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void  setColour(CarColour colour){
        this.colour = colour;
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
