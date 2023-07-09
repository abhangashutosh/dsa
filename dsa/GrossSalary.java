package dsa;

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        long salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Salary");
        long l = sc.nextLong();
        if (l <= 10000) {
            double HRA = (long) (l * 0.02);
            double DA = (l * 0.08);
            salary = (long) (HRA + DA + l);
            System.out.println("Gross salary is " + salary);
        } else if (l <= 20000) {
            double HRA = (long) (l * 0.25);
            double DA = (l * 0.9);
            salary = (long) (HRA + DA + l);
            System.out.println("Gross salary is " + salary);
        } else if (l > 20000) {
            double HRA = (long) (l * 0.3);
            double DA = (l * 0.95);
            salary = (long) (HRA + DA + l);
            System.out.println("Gross salary is " + salary);
        }

    }
}
