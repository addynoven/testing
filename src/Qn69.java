package SheiClassQuestion;

import java.util.Arrays;

public class Qn69 {
    public static void main(String[] args) {
        int[] arrinp = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(sol(arrinp)));
    }

    static int[] sol(int[] arrinps) {
        int size = arrinps.length;
        int[] arrsol = new int[arrinps.length*2];
        for (int i = 0; i < size; i++) {
        arrsol[i]=arrinps[i];
        arrsol[i+size]=arrinps[i];
        }
        return arrsol;
    }
}
