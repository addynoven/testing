package SheiClassQuestion;

import java.util.Scanner;

public class Qn39v3 {
    public static void main(String[] args) {
        int num=new Scanner(System.in).nextInt();
        int copy_num=num;
        int square=num*num;
        int i=(""+num).length();
        int j=(""+square).length();
        int check_num=Integer.parseInt((""+square).substring(j-i));
        if (copy_num==check_num){
             System.out.println("it is yes");
        }else  System.out.println("no it's not");
        }
}
