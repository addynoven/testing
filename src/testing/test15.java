package testing;

import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("enter 1st number: ");
            int a = s.nextInt();
            System.out.print("enter 2nd number: ");
            int b = s.nextInt();

            while (a!=b){
                if (a>b) a= a-b;
                else b=b-a;
            }
            if (a==b) {
                System.out.println(a);
            }
    }
}
