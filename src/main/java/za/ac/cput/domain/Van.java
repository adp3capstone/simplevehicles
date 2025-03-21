package za.ac.cput.domain;

public class Van extends Vehicle {
    private double cargoCapacity;
    private boolean hasSlidingDoor;

    public Van(Builder builder) {
        super.make = builder.make;
        super.model = builder.model;
        super.color = builder.color;
        super.wheels= builder.wheels;
        cargoCapacity = builder.cargoCapacity;
        hasSlidingDoor = builder.hasSlidingDoor;
    }

    @Override
    public String drive(){
        return "The Van is being driven";
    }

    @Override
    public String useBreak(){
        return "The van's breaks has been used...";
    }

    @Override
    public String changeDirection(){
        return "The van's direction has been changed...";
    }

    public static class Builder {
        private String make;
        private String model;
        private String color;
        private int wheels;
        private double cargoCapacity;
        private boolean hasSlidingDoor;

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

        public Builder setCargoCapacity(double cargoCapacity) {
            this.cargoCapacity = cargoCapacity;
            return this;
        }

        public Builder setHasSlidingDoor(boolean hasSlidingDoor) {
            this.hasSlidingDoor = hasSlidingDoor;
            return this;
        }

        public Van build() {
            return new Van(this);
        }
    }
}
