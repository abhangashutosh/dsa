package dsa;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter no. between 1 and 7");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        /*if (i!=0 && i <= 7) {
            if (i==1) {
                System.out.println("Monday");
            } else if (i==2) {
                System.out.println("Tuesday");
            } else if (i==3) {
                System.out.println("Wednesday");
            } else if (i==4) {
                System.out.println("Thursday");
            } else if (i==5) {
                System.out.println("Friday");
            } else if (i==6) {
                System.out.println("Saturday");
            } else if (i==7) {
                System.out.println("Sunday");
            }
        } else {
            System.out.println("Please enter value between 1 and 7");
        }*/

        switch (i) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
