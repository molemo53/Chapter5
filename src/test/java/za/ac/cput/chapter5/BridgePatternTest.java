package za.ac.cput.chapter5;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5.bridgePattern.*;

/**
 * Created by student on 2015/03/13.
 */
public class BridgePatternTest {

    Person person;
    @Test
    public void adultProcess() throws  Exception
    {
        person = new Adult(new BpmChild());
        person.run();
        person.setMove(new BpmAdult());
        person.run();

    }

    @Test
    public void childProcess() throws  Exception
    {
        person = new Child(new BpmChild());
        person.run();
        person.setMove(new BpmAdult());
        person.run();

    }
}
