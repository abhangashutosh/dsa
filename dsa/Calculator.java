package dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int option;
        Integer sum = null;
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            list.add(a);


        System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
        option = sc.nextInt();
        switch (option) {
            case 1:
                for (int i = 0; i < list.size(); i++) {
                    sum += list.get(i);
                }
                System.out.println("Addition of no is " + sum);
        }

    }

    }

}
