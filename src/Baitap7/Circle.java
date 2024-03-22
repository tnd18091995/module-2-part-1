package Baitap7;

public class Circle {
    public double radius;
    public double S;
    public String color;
    public Circle(double radius,String color){
        radius = 1.0;
        color = "Red";
        S = Math.PI*(radius*radius);
        System.out.println(S);
    }

}
