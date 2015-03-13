package za.ac.cput.chapter5.templateMethodPattern;

/**
 * Created by student on 2015/03/13.
 */
public class Bmw extends Car{

    @Override
    public void brandName()
    {
        System.out.println("Bmw ");
    }
    @Override
    public  void model()
    {
        System.out.println("1 Series M ");
    }
    @Override
    public  void year()
    {
        System.out.println("2014 ");
    }
}
