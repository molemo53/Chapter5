package za.ac.cput.chapter5.bridgePattern;

/**
 * Created by student on 2015/03/13.
 */
public class Child extends Person {

    public Child(Move move)
    {

        this.weight = 50;
        this.move = move;
    }

    @Override
    public void run(){

        System.out.println("\nChild Testing");
        int bpm = move.go();
        speedTest(bpm);

    }
}
