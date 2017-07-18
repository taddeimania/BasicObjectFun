/**
 * Created by taddeimania on 7/18/17.
 */
public class Car {

    private String color;
    public String engine;

    public Car (String engineType) {
        this.engine = engineType;
        System.out.println("Car has been created!");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

