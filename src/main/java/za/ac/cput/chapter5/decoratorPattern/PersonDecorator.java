package za.ac.cput.chapter5.decoratorPattern;

/**
 * Created by student on 2015/03/13.
 */
public abstract  class PersonDecorator implements Person {

    Person person;

    public PersonDecorator(Person person)
    {
        this.person = person;
    }
}
