package SheiClassQuestion;

import java.util.HashMap;
import java.util.HashSet;

public class Qn88 {
    public static void main(String[] args) {
        String s = "jewels";
        sol(s);
    }
    static char sol(String s){
        HashSet<Character> myset= new HashSet<>();
        HashMap<Character,Integer> count_map=new HashMap<>();
        for (char x:s.toCharArray()) {
            myset.add(x);
        }
        for (char x: myset){
            count_map.put(x,0);
        }
        for (char x:s.toCharArray()) {
            if (count_map.get(x)==1){
                return x;
            }else {
                count_map.put(x,count_map.get(x)+1);
            }
        }
        return '\0';
    }
}