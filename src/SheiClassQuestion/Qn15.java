package SheiClassQuestion;

import java.util.Scanner;

public class Qn15 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
