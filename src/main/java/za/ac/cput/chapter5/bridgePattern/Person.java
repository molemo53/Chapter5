package za.ac.cput.chapter5.bridgePattern;

/**
 * Created by student on 2015/03/13.
 */
public abstract class Person {

    Move move;
    int weight;

    public abstract void run();

    public void setMove(Move move)
    {
        this.move = move;
    }

    public void speedTest(int speed)
    {
        int ratio = weight / speed;
        if(ratio < 3) {
        System.out.println("Running " +ratio);
        }
        else if((ratio >= 3) &&(ratio < 8))
        {
            System.out.println("Walking " + ratio);
        }
        else {
            System.out.println("User Passed Failed " + ratio);

        }
        }
    }

