package za.ac.cput.chapter5.mediatorPattern;

/**
 * Created by student on 2015/03/13.
 */
public class Client {

    Mediator mediator;
    String amountCurrency;

    public Client(Mediator mediator, String amountCurrency)
    {
        this.mediator = mediator;
        this.amountCurrency = amountCurrency;

    }

    public boolean attemptBuy(float price)
    {
        System.out.println("Client attempting Buy" + mediator);
        return mediator.buyTicket(price, amountCurrency);
    }
}
