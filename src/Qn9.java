package SheiClassQuestion;

import java.util.Scanner;

public class Qn9 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the 3 side of the fucking triangle: ");
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        int num3 = kb.nextInt();
        double s = ((num1 + num2 + num3) / 2);
        System.out.println("the area of the triangle =" + Math.sqrt(s * ((s - num1) * (s - num2) * (s - num3))));
    }
}
