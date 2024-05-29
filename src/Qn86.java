package SheiClassQuestion;

import java.util.HashMap;
import java.util.HashSet;

public class Qn86 {
    public static void main(String[] args) {
        String s1= "jewels";
        String s2= "stone";
        int total=0;
        HashMap<Character,Integer> count_map=new HashMap<>();
        HashSet<Character> myset= new HashSet<>();
        for (char x:s1.toCharArray()) {
            myset.add(x);
        }
        for (char x: myset){
            count_map.put(x,0);
        }
        for (char x:s2.toCharArray()) {
            if (count_map.containsKey(x)){
                count_map.put(x,count_map.get(x)+1);
            }
        }
        for (int x:
             count_map.values()) {
            total+=x;
        }
         System.out.println(total);
        }
    }
