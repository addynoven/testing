package testing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test12 {
    public static void main(String[] args) {
        int target = 9;
        int[] inp_arr={2,7,11,15};
         System.out.println(Arrays.toString(sol(inp_arr,target)));
    }
    public static int[] sol(int[] inp_arr,int target){
        int[] arr={11,23};
        int curr_temp=0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < inp_arr.length; i++) {
            curr_temp=target-inp_arr[i];
            if (!map.containsKey(curr_temp)){
                map.put(inp_arr[i],i);
            }else {
                arr[0]=map.get(curr_temp);
                arr[1]=i;
                return arr;
            }
        }
        return arr;
    }
}
