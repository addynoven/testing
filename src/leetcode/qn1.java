package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class qn1 {
    public static void main(String[] args) {
        int[] arr=new int[2],nums={2,7,11,15};
        int x,y,t=9;
        for (int i = 0; i < nums.length; i++) {
            x = nums[i];
            for (int j = 0; j < nums.length; j++) {
                y = nums[j];
                if (t == x + y && i!=j) {
                    arr[0]=i;
                    arr[1]=j;
                     System.out.println(Arrays.toString(arr));
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}