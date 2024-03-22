package Baitap;

import java.util.Scanner;

public class AddElement {
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
        System.out.println();
        int[] newarray = new int[array.length];
        for (int k = 0; k < array.length; k++) {
            newarray[k] = array[k];
        }
        int indexreplace;
        do {
            System.out.println("Enter index item replace: ");
            indexreplace = input.nextInt();
            if (indexreplace >= 0 && indexreplace < newarray.length) {
                int update;
                System.out.println("Enter update: ");
                update = input.nextInt();
                newarray[indexreplace] = update;
                for (int j = 0; j < newarray.length; j++) {
                    System.out.print(newarray[j] + "\t");
                }
                break;
            }

        } while (true);


        }
}