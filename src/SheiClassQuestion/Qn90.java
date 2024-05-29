package SheiClassQuestion;

import java.util.Arrays;
import java.util.HashMap;

public class Qn90 {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[]heights = {180,165,170};
        String[] sol=new String[heights.length];
        int idx=names.length-1;
        HashMap<Integer,String> mymap= new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            mymap.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for (int x: heights) {
            sol[idx--]=mymap.get(x);
        }
         System.out.println(Arrays.toString(sol));
    }
}