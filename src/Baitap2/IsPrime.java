package Baitap2;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        int number;
        System.out.println("Nhap so can kiem tra: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        if(number <2){
            System.out.println(number +" day khong phai SNT");
        }
        else{
            int i = 2;
            boolean check = true;
            while( i <= Math.sqrt(number)){
                if(number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.println(number + " day la SNT");
            }
            else{
                System.out.println(number + " day khong la SNT");
            }
        }
    };
}
