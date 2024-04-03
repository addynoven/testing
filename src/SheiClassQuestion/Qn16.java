package SheiClassQuestion;

import java.util.Scanner;

public class Qn16 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String name = kb.nextLine();
        int age = kb.nextInt();
        if (age >= 18) {
            System.out.println("Hello " + name + ", You are a valid voter.");
        } else {
            System.out.println(" Sorry  " + name + " you can't cast the vote.");
            System.out.println("you will be eligible to vote after " + (18 - age) + "wait until then");
        }
    }
}
