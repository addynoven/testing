package testing;

import java.util.HashMap;
import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        int k=0;
        for (int i = 1; i < 5; i++) {
            for (int j = 20; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                if (j==0||j==i-1||i==4){
                    System.out.print(" *");
                }else {
                     System.out.print("  ");
                }
            }
             System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                 System.out.print("  ");
            }
            for (int j = 10; j >= i; j--) {
                 if (i==1||j==10||i==4){
                     System.out.print(" *");
                 }
            else {
                      System.out.print("  ");
                 }
            }
            for (int j = 10; j >= i; j--) {
               if(i==1||i==4||j==i){
                   System.out.print(" *");
               }else{
                   System.out.print("  ");
               }
            }
             System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 50; j > i; j--) {
                if (i%2==0){
                     System.out.print("~- ");
                }else{
                    System.out.print(" _.====.._ ");
                }
            }
             System.out.println();
        }
    }

}
