package za.ac.cput.chapter5.mediatorPattern;

/**
 * Created by student on 2015/03/13.
 */
public class Mediator {

    LocalClient localClient;
    GlobalClient globalClient;
    TicketSale ticketSale;
    Convert convert;
    public Mediator()
    {

    }

    public void registerLocal( LocalClient localClient)
    {
        this.localClient= localClient;
    }

    public void registorGlobal(GlobalClient globalClient)
    {
        this.globalClient = globalClient;

    }

    public void registerTicket(TicketSale ticketSale)
    {
     this.ticketSale = ticketSale;
    }

    public void registerCurrency(Convert convert)
    {
        this.convert = convert;

    }

    public boolean buyTicket(float price, String amountCurrency)
    {
        float amountTotalDollar = convert.convertCurrencyToDollars(price, amountCurrency);
        return ticketSale.buyTicket(amountTotalDollar);
    }
}
