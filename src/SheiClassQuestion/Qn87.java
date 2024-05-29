package SheiClassQuestion;

import java.util.HashMap;
import java.util.HashSet;

public class Qn87 {
    public static void main(String[] args) {
        String s = "jewels";
        sol(s);
    }

    static boolean sol(String s) {
        HashSet<Character> myset = new HashSet<>();
        for (char x : s.toCharArray()) {
            myset.add(x);
        }
        if (myset.size() == 26) {
            return true;
        } else {
            return false;
        }
    }
}