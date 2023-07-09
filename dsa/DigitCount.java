package dsa;

import java.util.Scanner;

public class DigitCount {
    static int countDigit(long n) {
        if (n / 10 == 0)
            return 1;
        return 1 + countDigit(n / 10);
    }

    public static void main(String[] args) {
        long n;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        System.out.println("Number of digit in " + n + " is " + countDigit(n));
    }
}
