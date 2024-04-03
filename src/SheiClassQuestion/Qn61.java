package SheiClassQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class Qn61 {
    public static void main(String[] args) {
        int[] arrinp= { 1, 5, 8,  9, 10, 15,22 };
        for (int i = 0; i < arrinp.length/2; i++) {
            arrinp[i]+=arrinp[(arrinp.length-1-i)];
            arrinp[(arrinp.length-1-i)]=arrinp[i]-arrinp[(arrinp.length-1-i)];
            arrinp[i]=arrinp[i]-arrinp[(arrinp.length-1-i)];
        }
         System.out.println(Arrays.toString(arrinp));
    }
}
