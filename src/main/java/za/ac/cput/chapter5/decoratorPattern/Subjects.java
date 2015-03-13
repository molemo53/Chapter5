package za.ac.cput.chapter5.decoratorPattern;

/**
 * Created by student on 2015/03/13.
 */
public class Subjects extends PersonDecorator{

    public Subjects(Person person)
    {
        super(person);
    }

    @Override
    public void id()
    {
        person.id();
        System.out.println("National Diploma");
        course();
    }

    public void course()
    {
        System.out.println("Development Software");
    }
}
