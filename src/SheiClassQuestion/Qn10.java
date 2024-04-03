package SheiClassQuestion;

import java.util.Scanner;

public class Qn10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        System.out.println("the surface area of the sphere =" + (4 * Math.PI * num1 * num1));
    }
}
