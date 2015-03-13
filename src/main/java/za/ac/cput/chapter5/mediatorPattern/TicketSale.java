package za.ac.cput.chapter5.mediatorPattern;

/**
 * Created by student on 2015/03/13.
 */
public class TicketSale {

    Mediator mediator;
    float priceInDollars;

    public TicketSale(Mediator mediator, float priceInDollars)
    {
        this.mediator = mediator;
        this.priceInDollars = priceInDollars;
        this.mediator.registerTicket(this);
    }

    public boolean buyTicket( float buyInDollars)
    {
        if(buyInDollars >= priceInDollars)
        {
            System.out.println("Succesful buy " + buyInDollars + " dollars\n");
            return true;
        } else {
            System.out.println("Failed to Buy " + buyInDollars + " dollars\n");
            return false;
        }
    }
}
