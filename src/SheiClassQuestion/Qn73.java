package SheiClassQuestion;

import java.util.Scanner;

public class Qn73 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
         System.out.println("enter first string:-");
        String s1= kb.nextLine();
        String s2= new String(new StringBuilder(s1).reverse());
        if (s1.compareTo(s2)==0){
             System.out.println("yes Pallindromic");
        }else {
             System.out.println("no Pallindromic");
        }
    }
}
