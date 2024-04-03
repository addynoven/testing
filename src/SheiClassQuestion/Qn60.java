package SheiClassQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class Qn60 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter the value of the K:-");
        int[] arrinp= { 1, 5, 8,  9, 10, 15 };
        int size=kb.nextInt();
        int[] arr_temp= new int[size];
        for (int i = 0; i < size; i++) {
            arr_temp[i]=arrinp[i];
        }
        for (int i = 0; i < arrinp.length-size; i++) {
            arrinp[i]=arrinp[size+i];
        }
        for (int i = 0; i < size; i++) {
            arrinp[arrinp.length-size+i]=arr_temp[i];
        }
         System.out.println(Arrays.toString(arrinp));
    }
}
