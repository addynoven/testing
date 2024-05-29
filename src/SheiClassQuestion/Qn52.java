package SheiClassQuestion;

import java.util.Scanner;

public class Qn52 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num= kb.nextInt();
        for (int i = 0; i <=num; i++) {
            for (int j = 0; j <= num*2; j++) {
                if (i==j){
                     System.out.print("*");
                } else if (num*2-i==j&&i!=num) {
                    System.out.print("*");
                } else {
                System.out.print(" ");
                }
            }
             System.out.println();
        }
    }
    }
