package Baitap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
       int size;
       int [] array;
       Scanner input = new Scanner(System.in);
       do{
           System.out.println("Enter element: ");
           size = input.nextInt();
           if( size > 30){
               System.out.println("Please enter element again: Element < 30!");
           }

       }while(size >20);
       array = new int [size];
       int i = 0;
       while (i < array.length){
           System.out.println("Elenent "+ (i+1));
           array[i]=input.nextInt();
           i++;
       }
        System.out.print("Array: ");
       for( int j =0; j< array.length;j++){
           System.out.print(array[j] +"\t");
       }
       int indexremove;
        System.out.println("Enter index item remove: ");
        indexremove = input.nextInt();
        int [] newarray = new int[array.length -1];
        int x = 0;
        for( int k =0; k < array.length; k++){
            if(k != indexremove) {
                newarray[x] = array[k];
                x++;
            }
        }
        for( int j =0; j< newarray.length;j++){
            System.out.print(newarray[j] +"\t");
        }
    }
}
