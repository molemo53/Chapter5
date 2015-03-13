package za.ac.cput.chapter5;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5.flyweightPattern.Calculator;
import za.ac.cput.chapter5.flyweightPattern.CalculatorAdd;
import za.ac.cput.chapter5.flyweightPattern.CalculatorFactory;

/**
 * Created by student on 2015/03/10.
 */
public class FlyWeightTest {

    CalculatorFactory calculator;

    @Before
    public void setUpClass() throws Exception
    {
        calculator = CalculatorFactory.getInstance();
    }

    @Test
    public void adding() throws Exception
    {




    }
}
