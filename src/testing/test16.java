package testing;

import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        String s = "abc", t = "bac";
        int sum=0;
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch=s.charAt(i);
            sum+=Math.abs(s.indexOf(ch) - t.indexOf(ch));
        }
        System.out.println(sum);
    }
}
