package za.ac.cput.chapter5.builderPattern;

/**
 * Created by student on 2015/03/10.
 */
public class Audi implements CarBuilder {

    private Car car;

    public Audi()
    {
        car = new Car();
    }

    @Override
    public void brandName()
    {
        car.setMake("Audi");
    }

    @Override
    public void brandModel()
    {
        car.setModel("A3 SportsBack");
    }

    @Override
    public void modelColour()
    {
        car.setColour("Red");
    }

    @Override
    public void yearModel()
    {
        car.setYear("2015");
    }

    @Override
    public Car getCar()
    {
        return car;
    }
}
