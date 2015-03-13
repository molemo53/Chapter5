package za.ac.cput.chapter5.decoratorPattern;

/**
 * Created by student on 2015/03/13.
 */
public class ExtraMurial extends PersonDecorator {

    public ExtraMurial(Person person)
    {
        super(person);
    }

    @Override
    public void id()
    {
        person.id();
        System.out.println("Soccer");
        role();
    }

    public void role()
    {
        System.out.println("Goal keeper");
    }
}
