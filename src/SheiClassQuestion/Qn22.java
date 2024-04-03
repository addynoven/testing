package SheiClassQuestion;
//22- Accept an english alphabet from user and check if it is a consonent or a vowel;


import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Qn22 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char ch=kb.next().toLowerCase().charAt(0);
         if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')  System.out.println("vowel");
         else  System.out.println("consonent");
    }
}
