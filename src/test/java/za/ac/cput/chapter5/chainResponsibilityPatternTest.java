package za.ac.cput.chapter5;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5.chainResponsibilityPattern.FireMan;
import za.ac.cput.chapter5.chainResponsibilityPattern.PersonEnum;
import za.ac.cput.chapter5.chainResponsibilityPattern.PersonHandler;
import za.ac.cput.chapter5.chainResponsibilityPattern.Student;

/**
 * Created by student on 2015/03/13.
 */
public class chainResponsibilityPatternTest {

    @Test
    public void testStudent() throws  Exception
    {
        PersonHandler studentHadler = new Student();
        studentHadler.setSuccessor(studentHadler);
        studentHadler.handleRequest(PersonEnum.Student);


    }



    @Test
    public void testFireMan() throws Exception
    {
        PersonHandler fireManHandler = new FireMan();
        fireManHandler.setSuccessor(fireManHandler);
        fireManHandler.handleRequest(PersonEnum.FireMan);


    }
}
