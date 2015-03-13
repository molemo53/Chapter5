package za.ac.cput.chapter5.templateMethodPattern;

/**
 * Created by student on 2015/03/13.
 */
public class Audi extends Car{
    @Override
    public void brandName()
    {
        System.out.println("Audi ");
    }
    @Override
    public  void model()
    {
        System.out.println("A3 Sports ");
    }
    @Override
    public  void year()
    {
        System.out.println("2014 ");
    }
}
