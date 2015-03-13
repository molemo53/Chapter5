package za.ac.cput.chapter5.compositePattern;

/**
 * Created by student on 2015/03/10.
 */
public class Leaf implements Component {

    String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println(name + "Hello the");
    }

    @Override
    public void sayGoodbye() {
        System.out.println(name + " Goodbye the");
    }
}
