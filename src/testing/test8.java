package testing;

public class test8 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >0; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
        }
}
