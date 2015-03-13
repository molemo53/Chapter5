package za.ac.cput.chapter5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.chapter5.builderPattern.*;
import za.ac.cput.chapter5.config.AppConfig;

/**
 * Created by student on 2015/03/10.
 */
public class BuilderPatternTest {

    private CarBuilder carBuilder;
    private CarDirector carDirector;
    private Car car;
    private ApplicationContext ctx;


    @Before
    public void setUpBuilderBmw() throws Exception
    {


        carBuilder = new Bmw();
        carDirector = new CarDirector(carBuilder);

    }

    @After
    public void setupBuilderAudi() throws Exception
    {
        carBuilder = new Audi();
        carDirector = new CarDirector(carBuilder);
    }

    @Test
    public void constructBmw() throws Exception
    {

        carDirector.constructCar();
        car = carDirector.getCar();
        System.out.println("Vehicle 1:" +car);
    }

    @Test
    public void constructAudi() throws Exception
    {
        carDirector.constructCar();
        Car car = carDirector.getCar();
        System.out.println("Vehicle 2:" +car);
    }
}
