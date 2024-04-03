package SheiClassQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qn55v2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int max,index=0;
        System.out.println("enter the number size of the array:-");
        int arrinp[]=new int[kb.nextInt()];
        for (int i = 0; i < arrinp.length; i++) {
            System.out.println("enter the value for the "+i+" index of the array");
            arrinp[i]=kb.nextInt();
        }
        max=arrinp[0];
        for (int i = 0; i < arrinp.length; i++) {
            if (max<Math.max(max,arrinp[i])){
                max=arrinp[i];
                index=i;
            }
        }
         System.out.println("the Max element ="+max+" found at "+ index+" index\n");
    }
    }
