package PracticeCodes;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.Scanner;

public class SumOfIndividualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfProjects = sc.nextInt();
        //int[] arr = {12, 56, 22, 55};
        int[] arr = new int[noOfProjects];
        for(int i=0; i<noOfProjects; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = new int[noOfProjects];
        //int number =77;
        int sum = 0,digit=0;
        for (int i = 0; i<arr.length; i++) {
            while (arr[i]>0){
//                number = number%10;
//                sum = sum+number;
//                number= number/10;

                //simple mistake here
                digit = arr[i]%10;
                sum =sum+digit;
                arr[i] = arr[i]/10;
            }
            //System.out.println(sum);
            result[i] = sum;
            sum=0;
        }
        for (int number:result){
            System.out.println(number);
        }
    }
}
