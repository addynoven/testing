package testing;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
         System.out.println("Enter the number = ");
         int num=kb.nextInt();
//         int num=100;
         String s1="";
        while (num>0){
            s1+=num%2;
            num/=2;
        }
        System.out.println(new StringBuilder(s1).reverse());
    }
}
