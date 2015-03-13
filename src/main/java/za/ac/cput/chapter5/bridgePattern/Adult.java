package za.ac.cput.chapter5.bridgePattern;

/**
 * Created by student on 2015/03/13.
 */
public class Adult  extends  Person{

    public Adult(Move move)
    {

        this.weight = 100;
        this.move = move;
    }

    @Override
    public void run(){

        System.out.println("\nAdult Running");
        int bpm = move.go();
        speedTest(bpm);

    }

}
