package za.ac.cput.repository;

import za.ac.cput.domain.Truck;
import za.ac.cput.factory.TruckFactory;

import java.io.IOException;
import java.util.HashMap;

public class TruckRepository implements ITruckRepository {

    private TruckFactory truckFactory;
    private static ITruckRepository repository = null;
    private HashMap<String, Truck> trucksHashMap;

    private TruckRepository() throws IOException {
        trucksHashMap = new HashMap<String, Truck>();
        repository = getRepository();
        truckFactory = new TruckFactory();
    }

    public static ITruckRepository getRepository() throws IOException {
        if (repository == null) {
            repository = new TruckRepository();
        }
        return repository;
    }
    @Override
    public HashMap<String, Truck> getAll() {
        return null;
    }

    @Override
    public Truck get(String s) {
        return null;
    }

    @Override
    public Truck create(Truck truck) {
        Truck newTruck = truckFactory.createTruck(
             truck.getMake()
            ,truck.getModel()
            ,truck.getColor()
            ,truck.getWheels()
            ,truck.getLoadWeightLimit()
            ,truck.getTruckTrailer()
        );
        return null;
    }

    @Override
    public Truck update(String s) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return true;
    }
}
