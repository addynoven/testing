package questions;

public class qn3 {
static public void sol(){

    for (int i = 0; i < 7; i++) {
        if(i==0||i==3){
            System.out.println("######");
        }
        else {
            System.out.println("#");
        }
    }

    for (int i = 0; i < 9; i++) {
        if(i==0||i==8){
            System.out.println("    ######");
        } else if (i==1||i==7) {
            System.out.println("  ##      ##");
        } else {
            System.out.println("#");
        }
    }
}
}
//
//
//