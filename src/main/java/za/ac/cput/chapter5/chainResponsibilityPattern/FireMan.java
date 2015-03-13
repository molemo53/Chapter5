package za.ac.cput.chapter5.chainResponsibilityPattern;

/**
 * Created by student on 2015/03/13.
 */
public class FireMan extends PersonHandler {

    public void handleRequest(PersonEnum request) {
        if (request == PersonEnum.FireMan) {
            System.out.println("FireManHandler handles " + request);
            System.out.println("I fight fire.\n");
        } else {
            System.out.println("FireManHandler doesn't handle " + request);
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
