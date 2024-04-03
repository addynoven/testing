package SheiClassQuestion;

import java.util.Scanner;

public class Qn39 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num=kb.nextInt();
        int copy_num=num;
        int square=num*num;
        int check_num=0;
        int i=0;
        for (i = 0; num>0; i++,num/=10);
        num=copy_num;
        for (int j = 0; j < i; j++) {
//            double multi=Math.pow(10,j);
            int multi=check_num*10;
            int sec_var=square%10;
//             System.out.println("multi ="+multi+" and sec var ="+sec_var);
            check_num=multi+sec_var;
//              System.out.println(check_num);
            square/=10;
        }
        int temp=0;
        for (; check_num>0;) {
            temp=(temp*10)+check_num%10;
            check_num/=10;
        }
        if (copy_num==temp){
             System.out.println("it is yes");
        }else  System.out.println("no it's not");
        }
}
