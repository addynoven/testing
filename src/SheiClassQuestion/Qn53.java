package SheiClassQuestion;

import java.util.Scanner;

public class Qn53 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i <5; i++) {
            for (int j = 0; j < 10; j++) {
                if (i==j){
                     System.out.print("*");
                } else if (i+j==4) {
                    System.out.print("*");
                } else  {
                    System.out.print(" ");
                }
            }
             System.out.println();
        }
    }
    }
