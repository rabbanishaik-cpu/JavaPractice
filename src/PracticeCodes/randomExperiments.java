package PracticeCodes;
import java.util.Scanner;

public class randomExperiments{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the elements of the array: ");
            String input = sc.nextLine();
            String[] values = input.split(" ");
            int[] array = new int[values.length];
            for (int i = 0; i < values.length; i++) {
                array[i] = Integer.parseInt(values[i]);
            }
            System.out.println("The elements of the array are: ");
            for (int value : array) {
                System.out.print(value + " ");
            }
        }

}
