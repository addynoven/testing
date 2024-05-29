package SheiClassQuestion;

import java.util.Scanner;

public class Qn33 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a=kb.nextInt();
        int b=kb.nextInt();
        double ans=1;
        for (int i = 1; i <=b; i++) {
            ans*=a;
        }
         System.out.println("the ans = "+ans);
        }
}
