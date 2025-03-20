package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Bus;

import static org.junit.jupiter.api.Assertions.*;

class BusFactoryTest {
    BusFactory busFactory = new BusFactory();
    Bus bus1 = busFactory.createBus(163,4,"Mercedes-Benz","Citaro","Grey",14);
    Bus bus2 = busFactory.createBus(16,3,"BazBus","Minibus","White",4);
    Bus bus3 = busFactory.createBus(163,2,"Intercape","Sleepliner","Red,white,yellow",6);

    @Test
    void checkIfCreatedBusIsNotNull(){assertNotNull(bus1);}
}