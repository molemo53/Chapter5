package za.ac.cput.chapter5.flyweightPattern;

/**
 * Created by student on 2015/03/10.
 */
public class CalculatorMultiply implements Calculator {

    String operation;

    public CalculatorMultiply()
    {
        operation = "Multiply";

        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void doMath(int a, int b)
    {
        System.out.println(operation+ " "+ a + "and" +b+": "+(a*b));
    }
}
