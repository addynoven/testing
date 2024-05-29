package SheiClassQuestion;

public class Qn80v2 {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE,count=0;
        String[] s1={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] s2;
        for (String s : s1) {
            s2= s.split("\\s+");
            max=Integer.max(s2.length,max);
        }
         System.out.println(max==0?0:max+1);
    }
}