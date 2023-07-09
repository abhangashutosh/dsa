//1.Write a Java Program that reads a line of integers,and then displays each integer,and the .sum of all the integers

import java.util.Scanner;
import java.util.StringTokenizer;

public class Sum {
    public static void main(String[] args) {
        try {
            int n;
            int sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number :");
            String s = sc.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(s, " ");
            while (tokenizer.hasMoreTokens()) {
                String temp = tokenizer.nextToken();
                n = Integer.parseInt(temp);
                System.out.println(n);
                sum += n;
            }
            System.out.println("sum is :" + sum);

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
