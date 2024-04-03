package questions;

import java.util.Scanner;

public class qn15 {
static public void sol(){
    int x1,y1,x2,y2;
    Scanner kb=new Scanner(System.in);
    System.out.println("Input x1: ");
    x1=kb.nextInt();
    System.out.println("Input y1: ");
    y1=kb.nextInt();
    System.out.println("Input x2: ");
    x2=kb.nextInt();
    System.out.println("Input y2: ");
    y2=kb.nextInt();
    System.out.println("Distance between the said points: "+(Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2))));
}
}
//
//
//