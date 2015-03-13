package za.ac.cput.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5.abstractFactoryPattern.GetItems;
import za.ac.cput.chapter5.abstractFactoryPattern.Items;
import za.ac.cput.chapter5.abstractFactoryPattern.Shop;

/**
 * Created by student on 2015/03/10.
 */
public class AbstractFactoryPatternTest {

    GetItems getItems;

    @Before
    public void setUpClass() throws Exception
    {
        getItems = new GetItems();
    }

    @Test
    public void fetchItemsDrinks() throws Exception
    {
        Items drinks = getItems.getItems("Drinks");

        Shop beer = drinks.getItems("Beer");
        Assert.assertEquals("Heneiken Beer", beer.itemType());
        System.out.println("Item Beer:" +beer.itemType());



    }

    @Test
    public void fetchItemsFood()  throws Exception
    {
        Items food = getItems.getItems("food");

        Shop burger = food.getItems("Burger");
        Assert.assertEquals("Cheese Burger", burger.itemType());
        System.out.println("Item Food:" + burger.itemType());


    }
}
