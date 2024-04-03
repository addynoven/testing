package questions;

import java.util.Scanner;

public class qn14 {
static public void sol(){
    int km,liter;
    Scanner kb=new Scanner(System.in);
    System.out.println("Input total distance in km: ");
    km=kb.nextInt();
    System.out.println("Input total fuel spent in liters: ");
    liter=kb.nextInt();
    System.out.println("Average consumption (km/lt): "+(km*1.0/liter));
}
}
//
//
//