package SheiClassQuestion;

import java.util.Scanner;

public class Qn28v3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        var n=kb.nextInt();
        var sol=1;
        while (n>0){
            sol*=n;
            n--;
        }
        System.out.println(sol);
    }
}
