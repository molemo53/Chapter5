package za.ac.cput.chapter5.builderPattern;

/**
 * Created by student on 2015/03/10.
 */
public class Car {

    private String model;
    private String colour;
    private String make;
    private String year;

    public void setMake(String make)
    {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getColour() {
        return colour;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Make Of Car: "+ make + "Model :" +model +"Colour :"+colour +"Year: "+year;
    }
}
