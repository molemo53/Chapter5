package za.ac.cput.chapter5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5.adapterPattern.Calculator;
import za.ac.cput.chapter5.adapterPattern.CalculatorClass;

/**
 * Created by student on 2015/03/10.
 */
public class AdapterPatternTest {
    Calculator calTemp;

    @Before
    public void setUpClass() throws Exception
    {
        calTemp = new CalculatorClass();
        //setUpClass(calTemp);
        calTemp.setNumber(0);


    }

   g
}
