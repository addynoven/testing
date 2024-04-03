package SheiClassQuestion;

import java.util.Scanner;

public class Qn43 {
    public static void main(String[] args) {
             System.out.println("Enter the letter");
             char ch= new Scanner(System.in).next().toLowerCase().charAt(0);
            switch (ch) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    System.out.println("vowel");
                    break;
                default:
                    System.out.println("consonent");
            }
        }
    }
