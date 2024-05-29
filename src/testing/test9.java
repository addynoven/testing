package testing;

public class test9 {
    public static void main(String[] args) {
        int i=0,j=0,k=0;
        boolean flag=false;
        for (i = 0; i < 7; i++) {
            if (i>=4){
                flag=true;
                j=0;
                k=i-4;
            }else {
                j=3;
            }
            while (true){
                if (flag && j<=k){
                         System.out.print(" ");
                         j++;
                }
                else if (j>i){
                     System.out.print(" ");
                     j--;
                }
                else {
                    break;
                }
            }
            if (i>=4){
                j=3;
                k=i-4;
            }else {
                j=0;
            }
            while(true){
                if (flag){
                    if (j>k){
                        System.out.print(" *");
                        --j;
                    }else {
                        break;
                    }
                }
                else if (j<=i){
                     System.out.print(" *");
                     j++;
                }else {
                    break;
                }
            }
            System.out.println();
        }
        }
}
