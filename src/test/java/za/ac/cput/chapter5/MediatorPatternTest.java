package za.ac.cput.chapter5;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5.mediatorPattern.*;

/**
 * Created by student on 2015/03/13.
 */
public class MediatorPatternTest {

    Mediator mediator;
    Client  localClient;
    Client  globalClient;

    TicketSale ticketSale;
    float sellingPrice = 10.f;
    Convert convert;

    @Before
    public void setUpClass() throws Exception
    {
        mediator = new Mediator();

        localClient = new LocalClient(mediator);
        globalClient = new GlobalClient(mediator);

        ticketSale = new TicketSale(mediator,sellingPrice);

        convert = new Convert(mediator);
    }

    @Test
    public void buyINRands() throws Exception
    {
        float rands = 55.0f;
        while (!localClient.attemptBuy(rands))
        {
            rands +=15.0f;
        }
    }

    @Test
    public void buyINNiras() throws Exception
    {
        float narias = 3.0f;
        while (!globalClient.attemptBuy(narias))
        {
            narias +=15.0f;
        }
    }
}
