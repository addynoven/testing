package SheiClassQuestion;

import java.util.Scanner;

public class Qn75 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
         System.out.println("enter the string:-");
        String s1= kb.nextLine();
        int v=0,c=0;
        for (int i = 0; i < s1.length(); i++) {
            char ch =s1.toLowerCase().charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                 v++;
            } else if (ch>='a'&&ch<='z') {
                c++;
            }
        }
         System.out.println(c+" "+v);
    }
}
