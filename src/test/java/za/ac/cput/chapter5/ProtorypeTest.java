package za.ac.cput.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5.protoType.Car;

/**
 * Created by student on 2015/03/10.
 */
public class ProtorypeTest {

    private Car car;
    private Car carClone;

    @Before
    public void setUpclas() throws Exception
    {
       car = new Car("Bmw");
        Assert.assertEquals("Bmw", car.toString());
        System.out.println(car);
    }

    @Test
    public void copyClone() throws Exception
    {

        carClone = (Car) car.doClone();
        System.out.println("Clone care: "+car);
    }


}
