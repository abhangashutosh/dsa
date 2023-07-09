package dsa;

import java.util.Scanner;

public class SumOfDigit {
    static int getsSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("sum of digit of number " + n + " is " + getsSum(n)) ;
    }
}
