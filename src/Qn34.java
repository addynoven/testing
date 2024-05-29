package SheiClassQuestion;

import java.util.Scanner;

public class Qn34 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        for (int i = 0; i < n; ) {
            System.out.println(n%10);
            n/=10;
        }
        }
}
