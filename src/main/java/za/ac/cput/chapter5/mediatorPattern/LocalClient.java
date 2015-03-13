package za.ac.cput.chapter5.mediatorPattern;

/**
 * Created by student on 2015/03/13.
 */
public class LocalClient extends Client {

    public LocalClient(Mediator mediator)
    {
        super(mediator, "Rands");
        this.mediator.registerLocal(this);
    }
}
