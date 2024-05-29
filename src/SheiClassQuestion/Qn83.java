package SheiClassQuestion;
import java.util.Arrays;
import java.util.Scanner;

public class Qn83 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the first word :-");
        String s1= kb.nextLine();
        String[] arrinp=s1.split(" ");
        Arrays.sort(arrinp);
         System.out.println(Arrays.toString(arrinp));
        }
    }
