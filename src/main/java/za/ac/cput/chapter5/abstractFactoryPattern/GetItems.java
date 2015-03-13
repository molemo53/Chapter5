package za.ac.cput.chapter5.abstractFactoryPattern;

/**
 * Created by student on 2015/03/10.
 */
public class GetItems {

    public Items getItems(String  type)
    {
        if("Drinks".equals(type))
        {
            return new Drinks();
        }

        else if ("food".equals(type))
        {

            return new  Food();
        }

        else
        {
            return new Food();
        }
    }
}
