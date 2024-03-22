package Baitap1;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}