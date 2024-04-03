package SheiClassQuestion;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qn41 {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        do {
            String inp= kb.nextLine();
            double num2=0;
            double num1= Double.parseDouble(inp.split("[+\\-*/^√%±]|\\b1/x\\b")[0]);
            String operatorPattern = "[+\\-*/^√%±]|\\b1/x\\b";
            Matcher matcher = Pattern.compile(operatorPattern).matcher(inp);
             char ch='\0';
             if (matcher.find()){
                 ch=matcher.group().charAt(0);
             }
            switch (ch){
                case '+':
                    num2= Double.parseDouble(inp.split("[+\\-*/^√%±]|\\b1/x\\b")[1]);
                    System.out.println(num1+num2);
                    break;
                case '-':
                    num2= Double.parseDouble(inp.split("[+\\-*/^√%±]|\\b1/x\\b")[1]);
                    System.out.println(num1-num2);
                    break;
                case '*':
                    num2= Double.parseDouble(inp.split("[+\\-*/^√%±]|\\b1/x\\b")[1]);
                    System.out.println(num1*num2);
                    break;
                case '/':
                    num2= Double.parseDouble(inp.split("[+\\-*/^√%±]|\\b1/x\\b")[1]);
                    System.out.println(num1/num2);
                    break;
                case '%':
                    num2= Double.parseDouble(inp.split("[+\\-*/^√%±]|\\b1/x\\b")[1]);
                    System.out.println(num1%num2);
                    break;
                case'^':
                    num2= Double.parseDouble(inp.split("[+\\-*/^√%±]|\\b1/x\\b")[1]);
                    System.out.println(Math.pow(num1,num2));
                    break;
                case '√':
                    System.out.println(Math.sqrt(num1));
                    break;
                case '±':
                    System.out.println(num1*-1);
                    break;
            }
            break;
        }while (true);
        }
}
