package PracticeCodes;

import java.util.Scanner;

public class BubbleSort {
    static void bubbleSort(int[] numbers){
        int temp =0;
        int arrLen=numbers.length;
         for (int i=0;i<arrLen-1;i++){
             for (int j=0;j<arrLen-i-1;j++){
                 if (numbers[j]>numbers[j+1]) {
                     temp = numbers[j];
                     numbers[j] = numbers[j + 1];
                     numbers[j + 1] = temp;
                 }
             }
         }
         for(int num:numbers){
             System.out.println(num);
         }
    }

    public static void main(String[] args) {
        int[] elements ={8,7,6,55,41,0};
        bubbleSort(elements);
    }
}
