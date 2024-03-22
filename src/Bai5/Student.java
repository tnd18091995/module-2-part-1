package Bai5;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BDIT";
    Student(int r, String n){
        rollno = r;
        name = n;
    };
    static void change(){
        college = "Codegym";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
