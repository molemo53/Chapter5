package za.ac.cput.chapter5;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5.decoratorPattern.ExtraMurial;
import za.ac.cput.chapter5.decoratorPattern.Person;
import za.ac.cput.chapter5.decoratorPattern.Student;
import za.ac.cput.chapter5.decoratorPattern.Subjects;

/**
 * Created by student on 2015/03/13.
 */
public class DecoratorTest {

    Person person;

    @Before
    public void setPerson() throws  Exception
    {
        person = new Student();
        person.id();

    }

    @Test
    public void setExtraActivity() throws Exception
    {
        person = new ExtraMurial(person);
        person.id();
    }

    @Test
    public void setSubject() throws Exception
    {
        person = new Subjects(person);
        person.id();
    }

}
