package za.ac.cput.chapter5.adapterPattern;

/**
 * Created by student on 2015/03/10.
 */
public class CalculatorClass extends Calculator implements CalculatorInfo {

    //double numberInfo;
    @Override
    public double getNumber()
    {
        return number;
    }

    @Override
    public void setNumber(double number)
    {
        this.number = number;
    }

    @Override
    public double getNumberInfo()
    {
        return subtract(number);
    }

    @Override
    public void setNumberInfo(double numberInfo)
    {
        this.number = multiplyInfo(numberInfo);
    }

    private double multiplyInfo(double numberC) {
        return ((numberC*2)+10);
    }

    private double subtract(double numberF) {
        return ((numberF* 9 / 5) - 32);
    }
}
