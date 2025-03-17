package za.ac.cput.domain;

public class Truck extends Vehicle{
    private double loadWeightLimit;
    private boolean truckTrailer; //to check if truck has a trailer or not

    public Truck(Builder builder){
        super.make = builder.make;
        super.model = builder.model;
        super.color = builder.color;
        super.wheels= builder.wheels;
        loadWeightLimit = builder.loadWeightLimit;
        truckTrailer = builder.truckTrailer;
    }

    public double getLoadWeightLimit() {
        return loadWeightLimit;
    }

    public boolean getTruckTrailer() {
        return truckTrailer;
    }

    @Override
    public String drive(){
        return "The truck is driving...";
    }

    @Override
    public String useBreak(){
        return "The truck's breaks has been used...";
    }

    @Override
    public String changeDirection(){
        return "The truck's direction has been changed...";
    }

    public static class Builder{
        private String make;
        private String model;
        private String color;
        private int wheels;
        private double loadWeightLimit;
        private boolean truckTrailer;

        public Builder setMake(String make) {
            this.make = make;
            return this;
        }
        public Builder setModel(String model) {
            this.model = model;
            return this;
        }
        public Builder setColor(String color) {
            this.color = color;
            return this;
        }
        public Builder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }
        public Builder setLoadWeightLimit(double loadWeightLimit) {
            this.loadWeightLimit = loadWeightLimit;
            return this;
        }
        public Builder setTruckTrailer(boolean truckTrailer) {
            this.truckTrailer = truckTrailer;
            return this;
        }
        public Truck build(){
            return new Truck(this);
        }
    }
}
