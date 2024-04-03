package SheiClassQuestion;

import java.util.Random;
import java.util.Scanner;

public class Qn44 {
    public static void main(String[] args) {
             Scanner kb = new Scanner(System.in);
             Random rn =new Random();
            int num= rn.nextInt(1,20);
            int guessNum=0;
            do {
                System.out.print("Enter ur guess number: ");
                guessNum= kb.nextInt();
                if (guessNum>num) System.out.println("Too high, try again.");
                else if (guessNum<num) System.out.println("Too low, try again.");
                else  System.out.println("u win!!");
            }while (guessNum!=num);
            }
    }
