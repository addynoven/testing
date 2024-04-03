package SheiClassQuestion;

import java.util.Scanner;

public class Qn12 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        if (num1 > num2) {
            System.out.println("the number " + num1 + " greatest between them");
        } else {
            System.out.println("the number " + num2 + " greatest between them");
        }
    }
}
