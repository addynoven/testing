package SheiClassQuestion;

import java.util.Scanner;

public class Qn54 {
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
     System.out.println("Enter the size of the array :-");
     int size =kb.nextInt(),sum=0;
     int[] arr=new int[size];
        for (int i = 0; i < arr.length; ) {
            System.out.println("Enter the value for index "+i+" of the array" );
            sum+=arr[i++]=kb.nextInt();
        }
         System.out.println("the total sum is "+sum);
         System.out.println("the Avg is "+(double)sum/ arr.length);
    }
    }
