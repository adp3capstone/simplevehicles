package za.ac.cput.factory;

import za.ac.cput.domain.Bus;
import za.ac.cput.util.Helper;

public class BusFactory {
    public static Bus createBus(int capacity, int doorCount, int wheels){
        if(Helper.isNull(capacity) || Helper.isNull(doorCount) || Helper.isNull(wheels))
            return null;

        return new Bus.Builder().setCapacity(capacity)
                .setdoorCount(doorCount)
                .setWheels(wheels)
                .build();
    }//end of createBus() method

    public static Bus createBus(int capacity, int doorCount, String make, String model, String color, int wheels){
        if(Helper.isNullorEmpty(make) || Helper.isNullorEmpty(model) || Helper.isNullorEmpty(color))
            return null;

        return new Bus.Builder().setMake(make)
                .setModel(model)
                .setColor(color)
                .build();
    }//end of createBus() method


}//end of BusFactory class
