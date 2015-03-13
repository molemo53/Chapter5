package za.ac.cput.chapter5;

import org.junit.Test;
import za.ac.cput.chapter5.templateMethodPattern.Audi;
import za.ac.cput.chapter5.templateMethodPattern.Bmw;
import za.ac.cput.chapter5.templateMethodPattern.Car;

/**
 * Created by student on 2015/03/13.
 */
public class TemplateMethodPatternTest {

    @Test
    public void getBmw() throws  Exception
    {
        Car car = new Bmw();
        car.getType();
    }

    @Test
    public void getAudi() throws  Exception
    {
        Car car = new Audi();
        car.getType();
    }
}
