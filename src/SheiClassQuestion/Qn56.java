package SheiClassQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qn56 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int max=Integer.MIN_VALUE,max2,idx=0,idx2=0;
        System.out.println("enter the number size of the array:-");
        int[] arrInp =new int[kb.nextInt()];
        for (int i = 0; i < arrInp.length; i++) {
            System.out.println("enter the value for the "+i+" index of the array");
            arrInp[i]=kb.nextInt();
        }
        max2=max;
        for (int i = 0; i < arrInp.length; i++) {
            if (arrInp[i]>max){
                max2=max;
                max=arrInp[i];
                idx2=idx;
                idx=i;
            } else if (arrInp[i]>max2) {
                max2=arrInp[i];
                idx2=i;
            }
        }
        System.out.println("the second Max element ="+max2+" found at "+idx2+" index\n");
    }
}
