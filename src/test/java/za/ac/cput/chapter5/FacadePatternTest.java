package za.ac.cput.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5.facadePattern.*;

import java.lang.Number;

/**
 * Created by student on 2015/03/10.
 */
public class FacadePatternTest {

    private Numbers numbers;
    int x = 3;
    @Before
    public void setUpClass() throws Exception
    {
       numbers = new Numbers();
    }

    @Test
    public void performCal() throws Exception
    {
        System.out.println(numbers.AddNumber(x));
        System.out.println(numbers.MultiplyNumber(x));
        System.out.println(numbers.CombineNumber(x));


    }
}
