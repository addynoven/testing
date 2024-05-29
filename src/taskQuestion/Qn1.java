package taskQuestion;

import java.util.Scanner;

public class Qn1 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the student's score: ");
                int score = scanner.nextInt();
                scanner.close();

                char grade = calculateGrade(score);
                System.out.println("Grade: " + grade);
            }
            public static char calculateGrade(int score) {
                if (score >= 90 && score <= 100) {
                    return 'A';
                } else if (score >= 75 && score < 90) {
                    return 'B';
                } else if (score >= 60 && score < 75) {
                    return 'C';
                } else if (score >= 50 && score < 60) {
                    return 'D';
                } else if (score >= 35 && score < 50) {
                    return 'E';
                } else {
                    return 'F';
                }
            }
        }