package za.ac.cput.domain;

public class Vehicle {
    protected String make;
    protected String model;
    protected String color;
    protected int wheels;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getWheels() {
        return wheels;
    }

    String drive(){
        return null;
    }

    String useBreak(){
        return null;
    }

    String changeDirection(){
        return null;
    }

}
