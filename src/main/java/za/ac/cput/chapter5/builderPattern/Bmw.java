package za.ac.cput.chapter5.builderPattern;

/**
 * Created by student on 2015/03/10.
 */
public class Bmw implements CarBuilder {

    private Car car;

    public Bmw()
    {
        car = new Car();
    }
    @Override
    public void brandName()
    {
        car.setMake("BMW");
    }

    @Override
    public void brandModel()
    {
        car.setModel("1 Series M");
    }

    @Override
    public void modelColour()
    {
        car.setColour("Blue");
    }

    @Override
    public void yearModel()
    {
        car.setYear("2014");
    }

    @Override
    public Car getCar()
    {

     return car;
    }

}
