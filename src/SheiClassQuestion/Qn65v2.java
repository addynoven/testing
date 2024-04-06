package SheiClassQuestion;

import java.util.Arrays;

public class Qn65v2 {
    public static void main(String[] args) {
        int[] arrinp = { 43, -17, 85, 29, -56, 72, -10, 91, 38, -62};
        for (int left = 0,right=arrinp.length-1,temp=0;left<right;) {
            if (arrinp[left]>0 && arrinp[right]>0){
                right--;
            } else if (arrinp[left]<0 && arrinp[right]<0) {
                left++;
            }else if (arrinp[left]>0 && arrinp[right]<0){
                temp=arrinp[left];
                arrinp[left]=arrinp[right];
                arrinp[right]=temp;
            }else {
                left++;
            }
        }
         System.out.println(Arrays.toString(arrinp));
    }
}

//while (left<right){
//        if (arrinp[left]>0 && arrinp[right]>0){
//            right--;
//        } else if (arrinp[left]<0 && arrinp[right]<0) {
//            left++;
//        }else if (arrinp[left]>0 && arrinp[right]<0){
//            temp=arrinp[left];
//            arrinp[left]=arrinp[right];
//            arrinp[right]=temp;
//        }else {
//            left++;
//        }
//            }