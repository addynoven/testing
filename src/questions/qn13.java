package questions;

import java.util.Scanner;

public class qn13 {
static public void sol(){
    Scanner kb=new Scanner(System.in);
    int a,b,c;
    System.out.println("Input the first integer: ");
    a=kb.nextInt();
    System.out.println("Input the second integer: ");
     b=kb.nextInt();
    System.out.println("Input the third integer: ");
     c=kb.nextInt();
    if(a<b && b>c){
        System.out.println(b);
    } else if(a>b && a>c){
        System.out.println(a);
    }
    else {
        System.out.println(c);
    }
}
}
//
//
//