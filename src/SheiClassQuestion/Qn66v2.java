package SheiClassQuestion;

public class Qn66v2 {
    public static void main(String[] args) {
        int[] arrinp = {3, 2, 7, 5, 1,24,-12};
        int target=12;
        int start=0,end=0,sum=0;
        while(sum<target){
            sum+=arrinp[end++];
        }
        while (true){
            if (sum<target) {
                if (end<arrinp.length) {
                    sum += arrinp[end++];
                    continue;
                }else {
                    break;
                }
            }else if (sum==target){
                System.out.print("[");
                for (int j = start; j < end; j++) {
                    System.out.print(""+arrinp[j]+",");
                }
                System.out.print("]");
                System.out.println();
            }
            sum=sum-arrinp[start];
            start++;
        }
    }
}