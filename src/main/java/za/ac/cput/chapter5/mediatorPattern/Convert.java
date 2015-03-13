package za.ac.cput.chapter5.mediatorPattern;

/**
 * Created by student on 2015/03/13.
 */
public class Convert {

    Mediator mediator;

    public static final float DOLLAR_UNIT = 1.0f;
    public static final float Rands = 0.7f;
    public static final float Niras_UNIT = 8.0f;

    public Convert(Mediator mediator)
    {
        this.mediator = mediator;
        this.mediator.registerCurrency(this);
    }

    private float convertRandsToDollars(float rand) {
        float dollars = rand * (DOLLAR_UNIT /Rands);
        System.out.println("Converting " + rand + " Rands to " + dollars + " dollars");
        return dollars;
    }

    private float convertNirasToDollars(float niras) {
        float dollars = niras * (DOLLAR_UNIT / Niras_UNIT);
        System.out.println("Converting " + niras + " Niras to " + dollars + " dollars");
        return dollars;
    }

    public float convertCurrencyToDollars(float amount, String amountCurrency) {
        if ("Rands".equalsIgnoreCase(amountCurrency)) {
            return convertRandsToDollars(amount);
        } else {
            return convertNirasToDollars(amount);
        }
    }

}
