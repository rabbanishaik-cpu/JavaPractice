package PracticeCodes;

import java.nio.charset.CharsetEncoder;

public class experiments {
    public static void main(String[] args) {
        String str ="reaper";
        char[] charArr=str.toCharArray();
        //capitalize first letter
        charArr[0]= Character.toUpperCase(charArr[0]);
        for (char i:charArr){
            System.out.println(i);
        }

        //slipt in spaces
        String str2="New York Nagaram";
        String[] strArr=str2.split("\\s");
        for (String j:strArr){
            System.out.println(j);
        }

        char[] arr = str2.toCharArray();
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }

    }
}
