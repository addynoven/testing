package SheiClassQuestion;

import java.util.Scanner;

public class Qn19 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the yr");
        int year = kb.nextInt();
        if (year < 0) {
            System.out.println("wrong input");
            return;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("not a leap yr");
            } else {
                System.out.println("leap yr");
            }
        } else {
            System.out.println("not a leap yr");

        }
    }
}
