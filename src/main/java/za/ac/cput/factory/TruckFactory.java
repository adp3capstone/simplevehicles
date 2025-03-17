package za.ac.cput.factory;

import za.ac.cput.domain.Truck;

public class TruckFactory {
    public Truck createTruck(String make,String model,String color,int wheels,double loadWeightLimit,boolean truckTrailer){
        return new Truck.Builder()
                .setMake(make)
                .setModel(model)
                .setColor(color)
                .setWheels(wheels)
                .setLoadWeightLimit(loadWeightLimit)
                .setTruckTrailer(truckTrailer)
                .build();
    }
}
