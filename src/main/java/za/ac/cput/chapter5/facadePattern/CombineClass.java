package za.ac.cput.chapter5.facadePattern;

/**
 * Created by student on 2015/03/10.
 */
public class CombineClass {

   public int combValue(AddClass addClass, MultiplyClass multiplyClass, int a)
   {
       return addClass.addValue(a) * multiplyClass.multiValue(addClass,a);
   }
}
