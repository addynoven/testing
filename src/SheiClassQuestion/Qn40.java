package SheiClassQuestion;

import java.util.Scanner;

public class Qn40 {
    public static void main(String[] args) {
         System.out.println("Enter oh baby yes for hello!!!");
         Scanner kb = new Scanner(System.in);
         boolean flag=true;
         String ans;
         do {
             ans=kb.nextLine();
             if (ans.compareToIgnoreCase("oh baby yes")==0)  System.out.println("hello");
             else flag=false;
         }while (flag==true);
        }
}
