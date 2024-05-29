package SheiClassQuestion;

import java.util.Scanner;

public class Qn8 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the principal amount (the initial amount of money).");
        int P = kb.nextInt();
        System.out.println("Enter the annual interest rate (in decimal).");
        double R = kb.nextDouble() / 100.0;
        System.out.println(" Enter the time the money is invested for, in years.");
        int T = kb.nextInt();
        System.out.println("the money with interest = " + (P * Math.pow((1 + R), T)));
    }
}
