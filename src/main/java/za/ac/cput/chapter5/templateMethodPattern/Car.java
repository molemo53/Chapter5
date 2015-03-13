package za.ac.cput.chapter5.templateMethodPattern;

/**
 * Created by student on 2015/03/13.
 */
public abstract class Car {

    public final void getType()
    {
        brandName();
        model();
        year();

    }

    public abstract void brandName();
    public abstract void model();
    public abstract void year();

}
