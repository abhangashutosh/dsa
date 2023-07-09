package dsa;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        int i, j, k;
        System.out.println("Enter 3 no");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        j = sc.nextInt();
        k = sc.nextInt();

        if (i > j && i > k) {
            System.out.println("greater value is " + i);
        } else if (j > i && j > k) {
            System.out.println("greater value is " + j);
        } else if (k > i && k > j) {
            System.out.println("greater value is " + k);
        }
    }
}
