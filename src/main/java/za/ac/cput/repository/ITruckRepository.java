package za.ac.cput.repository;

import za.ac.cput.domain.Truck;

import java.util.HashMap;

public interface ITruckRepository extends  IRepository<Truck,String> {
    public HashMap<String, Truck> getAll();
}
