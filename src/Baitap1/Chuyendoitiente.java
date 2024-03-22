package Baitap1;

import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
        int usd;
        int vnd;
        System.out.println("USD TO VND");
        System.out.println("Nhap USD: ");
        Scanner cs = new Scanner(System.in);
        usd = cs.nextInt();
        vnd = usd * 24000;
        System.out.println(usd+" "+"to"+" "+vnd + "vnd");
    }
}
