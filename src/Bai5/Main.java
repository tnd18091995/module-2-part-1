package Bai5;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student S1 = new Student(18, "Jin");
        Student S2 = new Student(19, "Ric");
        Student S3 = new Student(20, "Tom");
        S1.display();
        S2.display();
        S3.display();
    }
}
