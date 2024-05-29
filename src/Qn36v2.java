package SheiClassQuestion;

import java.util.Scanner;

public class Qn36v2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        var rev=0.0;
        var len_n=String.valueOf(n).length();
        var new_n=""+n;
        for (int i = 0; i<len_n; i++) {
            rev+= ((Math.pow(10,i))*Integer.parseInt(""+new_n.charAt(i)));
        }
         System.out.println((int)rev);
        }
}
