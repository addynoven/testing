package SheiClassQuestion;
import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;

public class Qn85 {
    public static void main(String[] args) {
        int[] inp={1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0};
        HashMap<Integer,Integer> mymap=new HashMap<>();
        for (int x: inp) {
            if (mymap.containsKey(x)){
                mymap.put(x, mymap.get(x)+1);
            }else {
                mymap.put(x,1);
            }
        }
        mymap.forEach((Key, Value)->  System.out.println(Key+" : "+Value));
        }
    }
