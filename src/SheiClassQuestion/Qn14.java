package SheiClassQuestion;

import java.util.Scanner;

public class Qn14 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char gen = kb.next().toLowerCase().charAt(0);
        if (gen == 'm') {
            System.out.println("Good Morning Sir");
        } else if (gen == 'f') {
            System.out.println("Good Morning ma'am");
        } else {
            System.out.println("gays and wrong input not allowed");
        }
    }
}
