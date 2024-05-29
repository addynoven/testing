package SheiClassQuestion;

import java.util.Scanner;

public class Qn4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter ur age:");
        int age = kb.nextInt();
        kb.nextLine();
        System.out.println("Enter your name:");
        String name = kb.nextLine();
        System.out.println(" Hello " + name + ", you are " + age + " years old.");
    }
}
