package dsa;

import java.util.Scanner;

public class LeapYear {
    static void check(int year) {
        if ((year % 4==0 && year % 100!=0) || year % 400==0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    public static void main(String[] args) {
        int year;
        System.out.println("Enter Year");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        check(year);
    }
}
