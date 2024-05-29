package SheiClassQuestion;

import java.util.Arrays;

public class Qn65 {
    public static void main(String[] args) {
        int[] arrinp = { 43, -17, 85, 29, -56, 72, -10, 91, 38, -62},arrcp;
        int left=0,right=arrinp.length-1;
        arrcp=new int[right+1];
        for (int i = 0; i < arrinp.length; i++) {
            if (arrinp[i]>0){
                arrcp[right--]=arrinp[i];
            }else {
                arrcp[left++]=arrinp[i];
            }
        }
         System.out.println(Arrays.toString(arrcp));
    }
}
