package SheiClassQuestion;

import java.util.Scanner;

public class Qn76 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
         System.out.println("enter the string:-");
        String s1= kb.nextLine();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.toLowerCase().charAt(i)==s1.charAt(i)){
                 System.out.print(s1.toUpperCase().charAt(i));
            } else if (s1.toUpperCase().charAt(i)==s1.charAt(i)) {
                System.out.print(s1.toLowerCase().charAt(i));
            }
        }
    }
}
