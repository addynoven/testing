package testing;

public class test14 {
    public static void main(String[] args) {
        String s= "hello";
        int ans=0;
        for (int i = 0; i < s.length()-1; i++) {
            ans+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
         System.out.println(ans);
    }
}
