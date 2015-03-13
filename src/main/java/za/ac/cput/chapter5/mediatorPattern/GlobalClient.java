package za.ac.cput.chapter5.mediatorPattern;

/**
 * Created by student on 2015/03/13.
 */
public class GlobalClient extends Client{

    public GlobalClient(Mediator mediator)
    {
        super(mediator, "Niras");
        this.mediator.registorGlobal(this);
    }
}
