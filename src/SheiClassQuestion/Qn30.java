package SheiClassQuestion;

import java.util.Scanner;

public class Qn30 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        for (int i = 1; i <= n; i++) {
                 System.out.print("Factors of " + i + ":");
            for (int j = 1; j < i; j++) {
             if (i%j==0) System.out.print(" "+j);
            }
             System.out.println();
        }
    }
}
