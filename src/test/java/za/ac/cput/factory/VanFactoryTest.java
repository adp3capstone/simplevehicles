package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Bus;
import za.ac.cput.domain.Van;

import static org.junit.jupiter.api.Assertions.*;

class VanFactoryTest {

   VanFactory factory = new VanFactory();
    Van van1 = factory.buildVan("Micro Van","Japaneese 4WD","blue",4,400,true);
    Van van2 = factory.buildVan("Compact Van","MVP34","red",4,1000,true);
    Van van3 = factory.buildVan("Pannel Van","Kia sonnet runner","green",4,600,true);


    @Test
    void checkIfNotCreatedIsNotNull(){
        assertNotNull(van2);
    }
}