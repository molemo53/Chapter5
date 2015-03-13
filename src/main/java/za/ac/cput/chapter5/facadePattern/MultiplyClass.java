package za.ac.cput.chapter5.facadePattern;

/**
 * Created by student on 2015/03/10.
 */
public class MultiplyClass {

    public int multiValue(AddClass addClass, int a)
    {
        return  2 *addClass.addValue(a);
    }
}
