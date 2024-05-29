package SheiClassQuestion;

import java.util.Scanner;

public class Qn31 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int sum=0;
        for (int i = 1; i < n; i++) {
            if (n%i==0) sum+=i;
        }
         System.out.println(sum);
    }
}
