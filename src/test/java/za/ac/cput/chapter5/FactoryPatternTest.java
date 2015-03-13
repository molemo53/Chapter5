package za.ac.cput.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.chapter5.config.AppConfig;
import za.ac.cput.chapter5.factoryPattern.*;

/**
 * Created by student on 2015/03/09.
 */
public class FactoryPatternTest {

    private Burger burger;
   // private Chips chips;
    private Cookies cookies;

    private FoodItems foodItems;

    private ApplicationContext ctx;

    /**
     * @Before public void setUpClass() throws Exception
     * {
     * ctx = new AnnotationConfigApplicationContext(AppConfig.class);
     * burger = (Burger)ctx.getBean("FactoryBurger");
     * chips = (Chips)ctx.getBean("FactoryChips");
     * cookies = (Cookies)ctx.getBean("FactoryCookies");
     * }
     */

    @Before
    public void setUpClass() throws Exception
    {
        foodItems = new FoodItems();
    }



    @Test
    public void GetItems() throws  Exception
    {
        Food chips = foodItems.getItems("Chips");
        Assert.assertEquals("Fries", chips.typeFood());
        System.out.println("Food Type: " + chips.typeFood());




        Food burger = foodItems.getItems("Burger");
        Assert.assertEquals("Cheese Burger", burger.typeFood());
        System.out.println("Food Type: " + burger.typeFood());
    }

}
