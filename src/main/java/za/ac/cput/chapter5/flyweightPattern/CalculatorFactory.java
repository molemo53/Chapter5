package za.ac.cput.chapter5.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/03/10.
 */
public class CalculatorFactory {

    private static CalculatorFactory calculatorFactory;

    private Map<String, Calculator> calculatorMap;

    public CalculatorFactory()
    {

        calculatorMap = new HashMap<String, Calculator>();
    }

    public static CalculatorFactory getInstance()
    {
        if(calculatorFactory ==null)
        {
            calculatorFactory = new CalculatorFactory();

        }

        return calculatorFactory;
    }

    public Calculator getCalculator (String key)
    {
        if (calculatorMap.containsKey(key))
        {
            return calculatorMap.get(key);
        }
        else {

            Calculator calculator;

            if("Add".equals(key))
            {
                calculator = new CalculatorMultiply();
            }
           else
            {
                calculator = new CalculatorAdd();
            }


            calculatorMap.put(key, calculator);
            return calculator;


        }
    }
}
