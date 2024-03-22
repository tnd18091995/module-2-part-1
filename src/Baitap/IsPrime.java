package Baitap;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so bat ky: ");
        int number = sc.nextInt();

        if (number < 2) {
            System.out.println(number + " khong phai la so nguyen to.");
            return;
        }
    }
}
