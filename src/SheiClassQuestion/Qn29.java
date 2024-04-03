package SheiClassQuestion;

import java.util.Scanner;

public class Qn29 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        var n= kb.nextInt();
        int even=0;
        int odd=0;
        for (int i = 0; i <=n; i++) {
            if (i%2==0) even+=i;
            else odd+=i;
        }
         System.out.println("even "+even);
         System.out.println("odd "+odd);
    }
}
