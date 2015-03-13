package za.ac.cput.chapter5;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.chapter5.config.AppConfig;
import za.ac.cput.chapter5.singleton.Person;

/**
 * Created by student on 2015/03/09.
 */
public class SingleTonTest {

    private Person person;
    private ApplicationContext ctx;

    public SingleTonTest()
    {

    }

    @Before
    public void setUpClass() throws  Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        person = (Person)ctx.getBean("Singleton");
    }

    @Test
    public  void getNull() throws  Exception
    {
        person = Person.getInstance();
    }

    @Test
    public void message() throws Exception
    {
        person.messagePerson();
    }
}
