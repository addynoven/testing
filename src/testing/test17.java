package testing;

public class test17 {
    public static void main(String[] args) {
        String[] oper = {"--X","X++","X++"};
        int x=0;
        for (String str: oper) {
            str=str.replace("X","");
//             System.out.println(str);
            if(str.equals("++")){
                x++;
            }else{
                x--;
            }
        }
         System.out.println(x);
    }
}
