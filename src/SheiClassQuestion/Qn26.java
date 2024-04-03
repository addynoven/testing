package SheiClassQuestion;

import java.util.Scanner;

public class Qn26 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        for (int i = 1; i <= 10; i++) {
     System.out.println(""+n+" X "+i+" = "+n*i);
        }
    }
}
