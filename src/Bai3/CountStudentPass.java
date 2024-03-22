package Bai3;

import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter element: ");
            size = input.nextInt();
            if (size > 30) {
                System.out.println(" Please enter element again: Element < 30");
            }
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Diem hoc sinh " + (i + 1));
            array[i] = input.nextInt();
            i++;
        }
        int countSP = 0;
        for (int j = 0; j < array.length; j++) {
            if(array[j]>= 5){
                countSP++;
            }
            System.out.print(array[j] + "\t");
        }
        System.out.println("Số học sinh qua môn là: "+ countSP);
    }
}

