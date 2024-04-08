package SheiClassQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Qn78 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String[] s1= kb.nextLine().split("\\s+");
        for (int i = 0; i < s1.length; i++) {
            String x=""+s1[i].toUpperCase().charAt(0)+s1[i].substring(1).toLowerCase();
             System.out.println(x);
        }
    }
}
