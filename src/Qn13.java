package SheiClassQuestion;

import java.util.Scanner;

public class Qn13 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char gen = kb.next().toLowerCase().charAt(0);
        if (gen == 'm') {
            System.out.println("Good Morning Sir");
        } else {
            System.out.println("Good Morning ma'am");
        }
    }
}
