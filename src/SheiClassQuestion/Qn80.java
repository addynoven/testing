package SheiClassQuestion;

import java.util.Scanner;

public class Qn80 {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE,count=0;
        String[] s1= {"v"};
        String[] s2;
        for (String s : s1) {
            count=0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)==' '){
                    count++;
                }
            }
            if (max<count){
                max=count;
            }
        }
         System.out.println(max==0?0:max+1);
    }
}