package SheiClassQuestion;

public class Qn63 {
    public static void main(String[] args) {
        int[] arrinp = { 1, 5, 8,  9, 10, 15,22 };
        int traget_number=8,left=0,right=arrinp.length-1,mid=(left+right)/2;
        boolean flag=false;
        for (; left < mid;) {
            if (arrinp[mid]==traget_number){
                System.out.println(mid);
                flag=!flag;
                 break;
            } else if (arrinp[mid]<traget_number) {
                left=mid;
            }else {
                right=mid;
            }
            mid=(left+right)/2;
        }
        if (!flag){
             System.out.println(-1);
        }
    }
}
