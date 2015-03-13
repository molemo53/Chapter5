package za.ac.cput.chapter5.chainResponsibilityPattern;

/**
 * Created by student on 2015/03/13.
 */
public class Student extends PersonHandler{


    public void handleRequest(PersonEnum request) {
        if (request == PersonEnum.Student) {
            System.out.println("StudentHandler handles " + request);
            System.out.println("Studying @ Cput.\n");
        } else {
            System.out.println("StudentHandler doesn't handle " + request);
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
