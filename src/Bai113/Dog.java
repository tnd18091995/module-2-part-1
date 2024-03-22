package Bai113;

public class Dog extends Animal{
    public Dog(){
        super("Con Cho");
        System.out.println("day la lop con");
    }
    @Override
    public void eat(){
        System.out.println("Con cho dang gam xuong");
    }
    public void move(){
        System.out.println("Con cho dang di");
    }
    public String toString(){
        return "Cho la de thit";
    }
}
