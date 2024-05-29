package SheiClassQuestion;

import java.util.Scanner;

public class Qn27 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        var n=kb.nextInt();
        var sum=0;
        for (int i = 0; i <=n; i++) {
            sum+=i;
        }
         System.out.println(sum);
    }
}
