package SheiClassQuestion;

import java.util.Scanner;

public class Qn50 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j>i; j--) {
                 System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                 System.out.print("* ");
            }
             System.out.println();
        }
    }
    }
