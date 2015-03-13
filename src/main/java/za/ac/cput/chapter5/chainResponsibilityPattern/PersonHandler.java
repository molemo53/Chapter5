package za.ac.cput.chapter5.chainResponsibilityPattern;

/**
 * Created by student on 2015/03/13.
 */
public abstract class PersonHandler {
    PersonHandler successor;

    public void setSuccessor(PersonHandler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(PersonEnum request);
}
