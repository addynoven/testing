package SheiClassQuestion;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class Qn81 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s1= kb.nextLine();
        HashMap<Character,Integer> count_map=new HashMap<>();
        HashSet<Character> myset= new HashSet<>();
        for (char x:s1.toCharArray()) {
            myset.add(x);
        }
        for (char x: myset){
            count_map.put(x,0);
        }
        for (char x:s1.toCharArray()) {
                count_map.put(x,count_map.get(x)+1);
        }
        count_map.forEach((key, value) -> System.out.println(key +" : "+ value));
    }
}