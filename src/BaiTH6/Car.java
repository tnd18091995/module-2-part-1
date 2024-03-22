package BaiTH6;

public class Car {
    private String name;
    private String Color;
    public static int numberOfCar;

    public Car() {
    }

    public Car(String name, String color) {
        this.name = name;
        Color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public static int getNumberOfCar() {
        return numberOfCar;
    }

    public static void setNumberOfCar(int numberOfCar) {
        Car.numberOfCar = numberOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }


}
