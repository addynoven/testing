package SheiClassQuestion;

import java.util.Scanner;

public class Qn41v2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        boolean yourChoice;

        do {
            double[] arrNum = {0, 0};
            char op = '\0';
            int i = 0;

            System.out.print("Enter expression: ");
            String inp = kb.nextLine();
            String[] arr = inp.split("(?<=[-+*/^√%±])|(?=[-+*/^√%±])");

            for (String x : arr) {
                if (!x.isEmpty()) {
                    if (x.matches("[+-]?\\d+(\\.\\d+)?")) {
                        arrNum[i++] = Double.parseDouble(x);
                    } else {
                        op = x.charAt(0);
                    }
                }
            }

            System.out.println("Result: " + sol(arrNum, op));
            System.out.print("Do you want to continue? ([Y]es/[N]o): ");
            yourChoice = kb.nextLine().toLowerCase().charAt(0)=='y';
        } while (yourChoice);
        kb.close();
    }

    static double sol(double[] inp, char op) {
        double ans = 0;
        switch (op) {
            case '+':
                ans = inp[0] + inp[1];
                break;
            case '-':
                ans = inp[0] - inp[1];
                break;
            case '*':
                ans = inp[0] * inp[1];
                break;
            case '/':
                ans = inp[0] / inp[1];
                break;
            case '^':
                ans = Math.pow(inp[0], inp[1]);
                break;
            case '√':
                ans = Math.sqrt(inp[0]);
                break;
            case '%':
                ans = inp[0] % inp[1];
                break;
            case '±':
                ans = inp[0] * -1;
                break;
            default:
                System.out.println("Unknown operator");
        }
        return ans;
    }
}
