package SheiClassQuestion;

import java.util.HashMap;

public class Qn89 {
    public static void main(String[] args) {

        int total=0;
        int[] arrinp ={1,2,3,2};
        HashMap<Integer,Integer> count_map=new HashMap<>();
        for (int x:arrinp) {
            if (count_map.containsKey(x)){
                count_map.put(x,count_map.get(x)+1);
            }else {
                count_map.put(x,1);
            }
        }
        for (int x:count_map.keySet()){
            if (count_map.get(x)==1){
                total+=x;
            }
        }
         System.out.println(total);
        }
    }
