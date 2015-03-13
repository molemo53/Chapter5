package za.ac.cput.chapter5.abstractFactoryPattern;

/**
 * Created by student on 2015/03/10.
 */
public class Food extends Items {

    @Override
    public Shop getItems(String type)
    {
        if ("Burger".equals(type))
        {
            return new Burger();
        }

        else
        {
            return new Chips();
        }
    }
}
