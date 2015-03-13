package za.ac.cput.chapter5.singleton;

/**
 * Created by student on 2015/03/09.
 */
public class Person {

    private static Person person = null;

    public Person()
    {

    }
    public static Person getInstance()
    {
        if(person == null)
        {
            person = new Person();
        }

        return person;
    }

    public void messagePerson()
    {
        System.out.println("I am Human");
    }

}
