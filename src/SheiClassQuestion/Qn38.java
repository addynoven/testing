package SheiClassQuestion;

import java.util.Scanner;

public class Qn38 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num=kb.nextInt();
        int copy_num=num;
        int final_num=0;
        for (int i = 0; num>0; i++) {
            int fact=1;
            int curr_num=num%10;
            num/=10;
            for (int j = curr_num; j >0; j--) {
                fact*=j;
            }
            final_num+=fact;
        }
         System.out.println(final_num==copy_num);
        }
}
