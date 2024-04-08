package SheiClassQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Qn77 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<String> strlist=new ArrayList<>();
        String s1="";
        int count=0;
        do {
            System.out.println("enter the string:- (if u wanna stop just press Enter)");
            s1=kb.nextLine();
            strlist.add(s1);
        }while (s1!="");
        System.out.println("enter the String Prefix:-");
        s1=kb.next();
        for (String x:
             strlist) {
            if (x.startsWith(s1)){
                count++;
            }
        }
         System.out.println(count);
    }
}
