package isp.lab3;

import isp.lab3.exercise3.Vehicle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {
    @Test
    public void TesttoString(){
        Vehicle vehicle=new Vehicle("Dacia","Logan",150,'D');
        assertEquals("the verification is:","Dacia(Logan)speed150fuelTypeD",vehicle.toString());
    }
}
