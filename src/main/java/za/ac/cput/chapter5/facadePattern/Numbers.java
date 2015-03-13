package za.ac.cput.chapter5.facadePattern;

/**
 * Created by student on 2015/03/10.
 */
public class Numbers {

    public int AddNumber(int a)
    {
        AddClass addClass = new AddClass();
        return addClass.addValue(a);
    }

    public int MultiplyNumber(int a)
    {
        AddClass addClass = new AddClass();
        MultiplyClass multiplyClass = new MultiplyClass();
        return  multiplyClass.multiValue(addClass, a);
    }

    public int CombineNumber(int a)
    {
        AddClass addClass = new AddClass();
        MultiplyClass multiplyClass = new MultiplyClass();
        CombineClass combineClass = new CombineClass();

        return combineClass.combValue(addClass, multiplyClass,a);
    }
}
