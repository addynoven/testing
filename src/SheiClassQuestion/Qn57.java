package SheiClassQuestion;

import java.util.Scanner;

public class Qn57 {
    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
        int[] arrInp={ 1, 8, 6, 9, 10, 15 } ;
        int lastone=arrInp[0];
        for (int i = 1; i < arrInp.length; i++) {
            if (arrInp[i]>lastone){
                lastone=arrInp[i];
            }else {
                 System.out.println("no");
                 System.exit(0);
            }
        }
        
        if (lastone==arrInp[arrInp.length-1]){
         System.out.println("yes");
        }
    }
}
