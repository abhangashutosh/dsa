package exception;

import java.util.Scanner;

public class JavaException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A :");
        int a = sc.nextInt();
        System.out.println("Enter value of B :");
        int b = sc.nextInt();
        try {
            int d = a / b;
            System.out.println(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
