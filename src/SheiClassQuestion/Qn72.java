package SheiClassQuestion;

import java.util.Scanner;

public class Qn72 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s1= kb.nextLine();
        for (int i = s1.length()-1; i >=0 ; i--) {
             System.out.println(s1.charAt(i));
        }
    }
}
