package dsa;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = scanner.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
}
