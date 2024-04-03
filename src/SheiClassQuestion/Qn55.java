package SheiClassQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qn55 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int max;
        Map<Integer, Integer> hashMap = new HashMap<>();
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
                hashMap.put(max,i);
            }
        }
         System.out.println("the Max element ="+max+" found at "+ hashMap.get(max)+" index\n");
    }
    }
