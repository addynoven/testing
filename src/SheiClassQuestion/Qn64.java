package SheiClassQuestion;

import java.util.Arrays;

public class Qn64 {
    public static void main(String[] args) {
        int[] arrinp = { 43, 17, 85, 29, 56, 72, 10, 91, 38, 62};
        for (int i = 0; i < arrinp.length-1; i++) {
            for (int j = 0; j < (arrinp.length-1)-i; j++) {
                if (arrinp[j]>arrinp[j+1]){
                    arrinp[j]+=arrinp[j+1];
                    arrinp[j+1]=arrinp[j]-arrinp[j+1];
                    arrinp[j]-=arrinp[j+1];
                }
            }
        }
         System.out.println(Arrays.toString(arrinp));
    }
}
