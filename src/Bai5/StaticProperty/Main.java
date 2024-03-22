package Bai5.StaticProperty;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda","Black");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Toyota","White");
        System.out.println(Car.numberOfCars);
    }
}
