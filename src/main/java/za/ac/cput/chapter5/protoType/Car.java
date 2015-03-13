package za.ac.cput.chapter5.protoType;

/**
 * Created by student on 2015/03/10.
 */
public class Car implements Prototype {

    String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public Prototype doClone() {
        return new Car(name);
    }

    public String toString() {
        return  name;
    }
}
