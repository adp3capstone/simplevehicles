package za.ac.cput.domain;






public class Bus extends Vehicle{
    private int capacity;
    private int doorCount;

    public Bus(Builder builder){
        super.make = builder.make;
        super.model = builder.model;
        super.color = builder.color;
        super.wheels = builder.wheels;
        capacity = builder.capacity;
        doorCount = builder.doorCount;
    }

    @Override
    public String drive(){
        return "Bus is driving...";
    }

    @Override
    public String useBreak(){
        return "Bus is stopping...";
    }

    @Override
    public String changeDirection(){
        return "Bus is turning...";
    }


    public static class Builder {
        private String make;
        private String model;
        private String color;
        private int wheels;
        private int capacity;
        private int doorCount;


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

        public Builder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setMake(int doorCount) {
            this.doorCount = doorCount;
            return this;
        }

    }






//    public Bus(String make, String model, String color, int wheels, int capacity, int doorCount){
//        super();
//        this.capacity = capacity;
//        this.doorCount = doorCount;
//    }
}
