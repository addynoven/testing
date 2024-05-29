package SheiClassQuestion;

import java.util.Scanner;

public class Qn39v2 {
    public static void main(String[] args) {
        int num=new Scanner(System.in).nextInt();
        int copy_num=num;
        int square=num*num;
        int check_num=0;
        int i=0;
        for (i = 0; num>0; i++,num/=10);
        num=copy_num;
        for (int j = 0; j < i; j++) {
            int multi=(int)Math.pow(10,j);
            int sec_var=square%10;
            check_num+=multi*sec_var;
            square/=10;
        }
        if (copy_num==check_num){
             System.out.println("it is yes");
        }else  System.out.println("no it's not");
        }
}
