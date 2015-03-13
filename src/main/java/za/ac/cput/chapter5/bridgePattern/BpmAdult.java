package za.ac.cput.chapter5.bridgePattern;

/**
 * Created by student on 2015/03/13.
 */
public class BpmAdult implements Move {

    int bpm;

    public BpmAdult()
    {
        bpm = 70;
    }

    @Override
    public int go()
    {
        System.out.println("Moving");
        return bpm;
    }
}
