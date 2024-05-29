package SheiClassQuestion;

import java.util.Arrays;

public class Qn62 {
    public static void main(String[] args) {
        int[] arrinp = { 1, 5, 8,  9, 10, 15,22 };
        int traget_number=10;
        boolean flag=false;
        for (int i = 0; i < arrinp.length; i++) {
            if (traget_number==arrinp[i]){
                 System.out.println(i);
                 flag=!flag;
            }
        }
        if (!flag){
             System.out.println(-1);
        }
    }
}
