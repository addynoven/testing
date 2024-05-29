package testing;

public class test13 {
    public static void main(String[] args) {
        int target = 9;
        int[] inp_arr={2,7,11,15};
        for (int i = 0; i < inp_arr.length; i++) {
            for (int j = 0; j < inp_arr.length; j++) {
                if (inp_arr[i]+inp_arr[j]==target && i!=j){
                     System.out.println(""+i+j);
                     System.exit(0);
                }
            }
        }
    }
}
