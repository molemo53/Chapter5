package za.ac.cput.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5.compositePattern.Composite;
import za.ac.cput.chapter5.compositePattern.Leaf;

/**
 * Created by student on 2015/03/10.
 */
public class CompositePatternTest {

    private Composite composite;
    private Composite composite1;
    private Leaf leaf1;
    private Leaf leaf2;
    private Leaf leaf3;

    @Before
    public void setUpClass() throws Exception
    {

        composite = new Composite();
        composite1 = new Composite();
        leaf1 = new Leaf("Molemo");
        leaf2 = new Leaf("Motheo");
        leaf3 = new Leaf("Kevin");

    }

    @Test
    public void addComponent() throws Exception
    {
     composite.addComponent(leaf1);
        composite.addComponent(leaf2);

    }

    @Test
    public void addComponent2() throws Exception{
        composite1.addComponent(leaf3);
    }

    @Test
    public void messageComponent() throws Exception
    {
        leaf1.sayHello();
        leaf2.sayHello();
        leaf1.sayGoodbye();
        leaf2.sayGoodbye();


    }
}
