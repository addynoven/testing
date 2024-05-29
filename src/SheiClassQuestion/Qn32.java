package SheiClassQuestion;

import java.util.Scanner;

public class Qn32 {
    public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            var n= kb.nextInt();
        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                System.out.println("not prime");System.exit(0);
            }
        }
         System.out.println("prime");
        }
}
