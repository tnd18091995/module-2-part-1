package Bai3;

import java.util.Scanner;

public class MinInArr {
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
            System.out.println("Element " + (i + 1));
            array[i] = input.nextInt();
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int min = array[0];
        for( int k = 1; k < array.length-1;k++){
            if(min > array[k]){
                min = array[k];
            }
        }
        System.out.println("Gia tri nho nhat la: "+ min);
    }
}
