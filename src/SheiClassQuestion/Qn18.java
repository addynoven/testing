package SheiClassQuestion;

import java.util.Scanner;

public class Qn18 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1 = kb.nextInt(), num2 = kb.nextInt(), num3 = kb.nextInt();
        // if (num1 > num2) {
        // if (num1 > num3) {
        // System.out.println(num1 + "is greater in all of them");
        // } else {
        // System.out.println(num3 + "is greater in all of them");
        // }
        // } else {
        // if (num2 > num3) {
        // System.out.println(num2 + "is greater in all of them");
        // } else {
        // System.out.println(num3 + "is greater in all of them");
        // }
        // }
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greater in all of them");
        } else if (num2 > num3) {
            System.out.println(num2 + " is greater in all of them");
        } else {
            System.out.println(num3 + " is greater in all of them");
        }
    }
}
