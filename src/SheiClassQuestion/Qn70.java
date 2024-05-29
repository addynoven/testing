package SheiClassQuestion;

import java.util.Arrays;

public class Qn70 {
    public static void main(String[] args) {
        int[] arrinp = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(sol(arrinp)));
    }

    static int[] sol(int[] arrinp) {
        int size = arrinp.length;
        int[] arrsol = new int[arrinp.length];
        for (int i = 0; i < size; i++) {
        arrsol[i]=arrinp[arrinp[i]];
        }
        return arrsol;
    }
}
