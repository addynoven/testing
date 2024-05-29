package SheiClassQuestion;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Qn84 {
    public static void main(String[] args) {
        int[] inp={1,2,3,4,5,6,7,8,9,1,2,3,5,6,7,8,9,0};
        HashSet<Integer> myset=new HashSet<>();
        for (int x:
             inp) {
            myset.add(x);
        }
        for (int x:
             myset) {
             System.out.println(x);
        }
        }
    }
