package SheiClassQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class Qn59 {
    public static void main(String[] args) {
        System.out.println("enter the number size of the array:-");
        int [] arrinp= { 1, 5, 8,  9, 10, 15 };
        int temp= arrinp[0];
        for (int i = 0; i < arrinp.length-1; i++) {
            arrinp[i]=arrinp[i+1];
        }
        arrinp[arrinp.length-1]=temp;
         System.out.println(Arrays.toString(arrinp));
    }
}
