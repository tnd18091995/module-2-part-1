package TDDbaitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Ngay: ");
        int day = input.nextInt();
        System.out.println("Nhap Thang: ");
        int month = input.nextInt();
        System.out.println("Nhap nam: ");
        int year = input.nextInt();
        System.out.println(day + "-"+ month + "-"+ year);
    }
}
