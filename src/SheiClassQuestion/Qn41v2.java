package SheiClassQuestion;

import java.io.IOException;
import java.util.Scanner;

public class Qn41v2 {
    public static void main(String[] args) throws IOException {
        boolean your_choice=true;
        Scanner kb = new Scanner(System.in);
        double[] arrNum={0,0};
        int i=0;
        char op='\0';
        do {
            String inp = kb.nextLine();
            String[] arr=inp.split("[+\\-*/^√%±]|\\b1/x\\b");
            String opStr= inp.replaceAll("\\d+", "");
            char[] arrop=opStr.toCharArray();
            for (String x: arr) {
                if (x.compareToIgnoreCase("")!=0){
                    arrNum[i++]=Double.parseDouble(x);
                }
            }
            i=0;
            switch (arrop.length){
                case 1:
                    op=arrop[0];
                    break;
                case 3:
                    i=0;
                    arrNum[i++]*=-1;
                    arrNum[i]*=-1;
                    op=arrop[1];
                    break;
                case 2:
                    i=0;
                    if (arrop[0]=='-'){
                        arrNum[0]*=-1;
                        op=arrop[1];
                    }
                    else{
                        arrNum[1]*=-1;
                        op=arrop[0];
                    }
                    break;
                default:
                    System.out.println("wrong input try again");
            }
            System.out.println(sol(arrNum,op));
             System.out.println("-----\ndo u wanna continue");
            if (kb.nextLine().toLowerCase().charAt(0)!='y') your_choice=false;
            else  System.out.println("----------");
        }while (your_choice);
        }
        static double sol(double[] inp,char op){
        double ans=0;
            switch (op) {
                case '+':
                    ans=inp[0]+inp[1];
                    break;
                case '-':
                    ans=inp[0]-inp[1];
                    break;
                case '*':
                    ans=inp[0]*inp[1];
                    break;
                case '/':
                    ans=inp[0]/inp[1];
                    break;
                case '^':
                    ans=Math.pow(inp[0],inp[1]);
                    break;
                case '√':
                    ans=Math.sqrt(inp[0]);
                    break;
                case '%':
                    ans=inp[0]%inp[1];
                    break;
                case '±':
                    ans=inp[0]*-1;
                    break;
                default:
                    System.out.println("Unknown operator");
            }
            return ans;
        }
}
