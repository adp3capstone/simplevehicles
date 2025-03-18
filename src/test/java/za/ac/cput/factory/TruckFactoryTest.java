package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Truck;

import static org.junit.jupiter.api.Assertions.*;
class TruckFactoryTest {
    TruckFactory truckFactory = new TruckFactory();
    Truck truck1 = truckFactory.createTruck("Volvo", "FH16", "Blue", 18, 25000.0, true);
    Truck truck2 = truckFactory.createTruck("Mercedes-Benz", "Actros", "Red", 12, 15000.0, false);
    Truck truck3 = truckFactory.createTruck("Isuzu", "F-Series", "White", 6, 5000.0, true);

    @Test
    void checkIfCreatedTruckIsNotNull() {
        assertNotNull(truck1);
    }
}