package SheiClassQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class Qn58 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter the number size of the array:-");
        int size=kb.nextInt();
        int[] arrInp =new int[size];
        for (int i = 0; i < arrInp.length; i++) {
            System.out.println("enter the value for the "+i+" index of the array");
            arrInp[i]=kb.nextInt();
        }
        int[] arrcp=new int[size];
        for (int i = 0; i < size; i++) {
            arrcp[i]=arrInp[(size-1)-i];
        }
        System.out.println("org array :-");
        System.out.println(Arrays.toString(arrInp));
         System.out.println("copy array :-");
         System.out.println(Arrays.toString(arrcp));
    }
}
