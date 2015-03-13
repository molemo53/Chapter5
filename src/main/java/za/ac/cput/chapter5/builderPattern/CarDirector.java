package za.ac.cput.chapter5.builderPattern;

/**
 * Created by student on 2015/03/10.
 */
public class CarDirector {

    private CarBuilder carBuilder = null;

    public CarDirector(CarBuilder carBuilder)
    {
        this.carBuilder = carBuilder;
    }

    public void constructCar()
    {
        carBuilder.brandName();
        carBuilder.brandModel();
        carBuilder.modelColour();
        carBuilder.yearModel();;
    }

    public Car getCar()
    {

        return carBuilder.getCar();
    }
}
