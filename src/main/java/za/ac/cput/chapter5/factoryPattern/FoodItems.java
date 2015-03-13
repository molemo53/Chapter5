package za.ac.cput.chapter5.factoryPattern;

/**
 * Created by student on 2015/03/09.
 */
public class FoodItems {

    public Food getItems(String type)
    {
        if("Burger".equals(type))
        {
            return new Burger();
        }
        else
            if("Chips".equals(type))
            {
                return  new Chips();
            }
        else
            {
                return new Cookies();
            }
    }
}
