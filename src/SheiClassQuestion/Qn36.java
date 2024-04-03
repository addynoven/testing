package SheiClassQuestion;

import java.util.Scanner;

public class Qn36 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int rev=0;
        for (int i = 0; n>0; i++) {
            rev=rev*10+n%10;
            n/=10;
        }
         System.out.println(rev);
        }
}
