package SheiClassQuestion;

import java.util.Scanner;

public class Qn48 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                 System.out.print( (char)('A'+j)+" ");
            }
             System.out.println();
        }
    }
    }
