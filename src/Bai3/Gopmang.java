package Bai3;

import java.util.Scanner;

public class Gopmang {
    public static void main(String[] args) {
        int size1; // Biến để lưu kích thước của mảng A
        int size2; // Biến để lưu kích thước của mảng B
        int[] arrayA; // Mảng A
        int[] arrayB; // Mảng B
        Scanner input = new Scanner(System.in); // Đối tượng Scanner để nhập từ bàn phím

        // Nhập và kiểm tra kích thước của mảng A
        do {
            System.out.println("Enter size of array A: ");
            size1 = input.nextInt();
            if (size1 > 30) {
                System.out.println(" Please enter size again: Size < 30");
            }
        } while (size1 > 30);

        arrayA = new int[size1]; // Khởi tạo mảng A có kích thước là size1

        // Nhập các phần tử của mảng A
        int i = 0;
        while (i < arrayA.length) {
            System.out.println("Element " + (i + 1) + " of array A: ");
            arrayA[i] = input.nextInt();
            i++;
        }

        // Hiển thị mảng A sau khi đã nhập
        System.out.println("Array A: ");
        for (int j = 0; j < arrayA.length; j++) {
            System.out.print(arrayA[j] + "\t");
        }

        // Nhập và kiểm tra kích thước của mảng B
        do {
            System.out.println("\nEnter size of array B: ");
            size2 = input.nextInt();
            if (size2 > 30) {
                System.out.println(" Please enter size again: Size < 30");
            }
        } while (size2 > 30);

        arrayB = new int[size2]; // Khởi tạo mảng B có kích thước là size2

        // Nhập các phần tử của mảng B
        int k = 0;
        while (k < arrayB.length) {
            System.out.println("Element " + (k + 1) + " of array B: ");
            arrayB[k] = input.nextInt();
            k++;
        }

        // Hiển thị mảng B sau khi đã nhập
        System.out.println("Array B: ");
        for (int j = 0; j < arrayB.length; j++) {
            System.out.print(arrayB[j] + "\t");
        }

        // Tạo mảng C có kích thước là tổng kích thước của mảng A và mảng B
        int size3 = size1 + size2;
        int[] arrayC = new int[size3];

        // Sao chép các phần tử của mảng A vào mảng C
        for (int l = 0; l < size1; l++) {
            arrayC[l] = arrayA[l];
        }

        // Sao chép các phần tử của mảng B vào mảng C
        for (int m = 0; m < size2; m++) {
            arrayC[size1 + m] = arrayB[m];
        }

        // Hiển thị mảng C sau khi đã gộp
        System.out.println("\nArray C (Concatenated array): ");
        for (int n = 0; n < arrayC.length; n++) {
            System.out.print(arrayC[n] + "\t");
        }
    }
}
