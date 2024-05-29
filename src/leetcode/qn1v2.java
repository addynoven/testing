package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class qn1v2 {
    public static void main(String[] args) {
        int[] arr=new int[2],nums={2,7,11,15};
        int target=9,temp=0;
        HashMap<Integer,Integer> my_map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            temp=target-arr[i];
            if (my_map.containsKey(temp)){
                arr[0]=my_map.get(temp);
                arr[1]=i;
                return;
            }else{
                my_map.put(arr[i],i);
            }
        }
    }
}