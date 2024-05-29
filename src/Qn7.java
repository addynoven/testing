package SheiClassQuestion;

import java.util.Scanner;

public class Qn7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the length :");
        int length = kb.nextInt();
        System.out.println("Enter the width:");
        int width = kb.nextInt();
        System.out.println(
                "the area of the rectangle is " + (length * width) + " and the perimeter is " + (2 * (length + width)));
    }
}
