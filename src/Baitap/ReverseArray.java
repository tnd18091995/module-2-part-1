package Baitap;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap kich thuoc mang: ");
            size = sc.nextInt();
            if(size > 20){
                System.out.println("Kich thuoc mang khong vuot qua 20!");
            }
        }
        while(size >20);
        array = new int[size];
        int i = 0;
        while ( i< array.length){
            System.out.println("Nhap phan tu thu "+(i+1)+": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("Mang: ");
        for( int j = 0; j<array.length;j++){
            System.out.print(array[j]+"\t");
        }
        int max = array[0];
        int index = 1;
        for(int k = 0; k <  array.length; k++){
            if( max < array[k]){
                max = array[k];
                index = k +1;
            }
        }
        System.out.println("So lon nhat trong mang là: " + max + " vi tri thu " + index);
    }
}
