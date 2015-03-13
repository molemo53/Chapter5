package za.ac.cput.chapter5.builderPattern;

/**
 * Created by student on 2015/03/10.
 */
public interface CarBuilder {

    public void brandName();
    public void brandModel();
    public void modelColour();
    public void yearModel();
    public Car getCar();

}
