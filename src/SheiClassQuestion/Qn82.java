package SheiClassQuestion;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Qn82 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the first word :-");
        String s1= kb.nextLine();
        System.out.println("Enter the second word :-");
        String s2= kb.nextLine();
        if (s1.length()!=s2.length()){
             System.out.println("no 1");
        }else {
            char [] ch1=s1.toCharArray(),ch2=s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if (Arrays.equals(ch1, ch2)){
                 System.out.println("yes");
            }else {
                 System.out.println("no 2");
            }
        }
    }
}