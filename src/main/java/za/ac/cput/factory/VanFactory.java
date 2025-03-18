package za.ac.cput.factory;

import za.ac.cput.domain.Van;

public class VanFactory {
    public Van buildVan(String make,String model,String color,int wheels,double cargoCapacity,boolean hasSlidingDoor ) {
        if( make==null || model==null || color==null || cargoCapacity <= 0 || hasSlidingDoor ){
            return null;
        }

        return new Van.Builder()
                .setCargoCapacity(cargoCapacity)
                .setColor(color)
                .setMake(make)
                .setWheels(wheels)
                .setHasSlidingDoor(hasSlidingDoor)
                .setModel(model)
                .build();
    }
}