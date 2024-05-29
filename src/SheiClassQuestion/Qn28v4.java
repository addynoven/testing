package SheiClassQuestion;

import java.util.Scanner;

public class Qn28v4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        var n=kb.nextInt();
        var sol=1;
        int i=1;
        do{
        sol*=i;
        i++;
        }while(i<=n);
        System.out.println(sol);
    }
}
