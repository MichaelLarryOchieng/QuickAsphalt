public class Car {
    private int year;
    private String model;
    private String color;

    public void setYear(){
        year = 2015;
    }

    public void setModel(){
        model = "RS10";

    }

    public void setColor(){
        color = "Yellow";
    }

    public int getYear(){
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    Car audi = new Car();
    audi.getColor();
}

public static void main(String[] args){

}
