package SheiClassQuestion;

import java.util.Scanner;

public class Qn79 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String[] s1= kb.nextLine().split("\\s+");
        for (String s : s1) {
            String new_str = "" + s.toUpperCase().charAt(0);
            if (s.length()>2){
                new_str+=s.substring(1,s.length()- 1).toLowerCase();
            }if (s.length()!=1){
                new_str+=s.toUpperCase().charAt(s.length() - 1);
            }
            System.out.print(new_str + " ");
        }
    }
}