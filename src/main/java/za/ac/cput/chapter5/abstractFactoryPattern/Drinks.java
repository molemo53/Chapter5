package za.ac.cput.chapter5.abstractFactoryPattern;

/**
 * Created by student on 2015/03/10.
 */
public class Drinks extends Items {

    @Override
    public Shop getItems(String type)
    {
        if ("Beer".equals(type))
        {
            return new Beer();
        }

        else
        {
            return new SoftDrink();
        }

    }
}
