package testing;

import java.util.Scanner;

public class test10v2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
         System.out.println("Enter the number = ");
         int num=kb.nextInt();
        System.out.println(sol(num));
    }
    public static String sol(int num){
        if (num<=0) {
            return "";
        }
        else{
            return  sol(num/2)+num%2;
        }
    }
}
