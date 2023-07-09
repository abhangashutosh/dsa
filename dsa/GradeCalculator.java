package dsa;

import java.util.Scanner;

public class GradeCalculator {

    public static final Integer TOTALMARKS = 500;
    public static final Integer COUNT = 0;

    static void grade(float marks, int count) {
        float percentage = (marks / (count * 100));

        if (percentage >= 0.9) {
            percentage = percentage * 100;
            System.out.println("Percentage " + percentage);
            System.out.println("Grade A");
        } else if (percentage >= 0.8) {
            percentage = percentage * 100;
            System.out.println("Percentage " + percentage);
            System.out.println("Grade B");
        } else if (percentage >= 0.7) {
            percentage = percentage * 100;
            System.out.println("Percentage " + percentage);
            System.out.println("Grade C");
        } else if (percentage >= 0.6) {
            percentage = percentage * 100;
            System.out.println("Percentage " + percentage);
            System.out.println("Grade D");
        } else if (percentage >= 0.4) {
            percentage = percentage * 100;
            System.out.println("Percentage " + percentage);
            System.out.println("Grade E");
        } else if (percentage < 0.4) {
            percentage = percentage * 100;
            System.out.println("Percentage " + percentage);
            System.out.println("Grade F");
        }
    }

    public static void main(String[] args) {
        int sub1, sub2, sub3, sub4, sub5;
        int count = 0, i;
        float totalMarks = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Subject");
        count = sc.nextInt();

        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += sc.nextInt();
        }

        grade(totalMarks, count);
    }
}
