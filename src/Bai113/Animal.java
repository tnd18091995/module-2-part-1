package Bai113;

public class Animal {
    public void eat(){
        System.out.println("dong vat dang an");
    }
    private String name;
    public Animal(){
        name = "Dong Vat";
        System.out.println("day là lop cha");
    }
    public Animal(String name){
        this.name = name;
    }
    public void move(){
        System.out.println("dong vat dang di");
    }
}
