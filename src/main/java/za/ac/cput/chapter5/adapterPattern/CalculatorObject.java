package za.ac.cput.chapter5.adapterPattern;

/**
 * Created by student on 2015/03/10.
 */
public class CalculatorObject implements CalculatorInfo
{
    Calculator calculator;

    public CalculatorObject()
    {
        calculator = new Calculator();
    }
    @Override
    public double getNumber()
    {
        return calculator.getNumber();
    }

    @Override
    public void setNumber(double number)
    {
        calculator.setNumber(number);
    }

    @Override
    public double getNumberInfo()
    {
        return multiplyInfo(calculator.getNumber());
    }

    @Override
    public void setNumberInfo(double numberInfo)
    {
        calculator.setNumber(numberInfo);
    }

    private double multiplyInfo(double numberC) {
        return ((numberC*2)+10);
    }
}
