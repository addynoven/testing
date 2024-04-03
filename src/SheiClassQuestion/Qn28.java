package SheiClassQuestion;

import java.util.Scanner;

public class Qn28 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        var n=kb.nextInt();
        var sol=1;
        for (int i = n; i >= 1; i--) {
            sol*=i;
        }
         System.out.println(sol);
    }
}
