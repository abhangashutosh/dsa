package dsa;

import java.util.Scanner;

public class SpecialCharCheck {

    static void check(char input_char) {
        if ((input_char >= 65 && input_char <= 90) || (input_char >= 97 && input_char <= 122)) {
            System.out.println(" Alphabet ");
        } else if (input_char >= 48 && input_char <= 57) {
            System.out.println(" Digit ");
        } else {
            System.out.println(" Special Character ");
        }
    }

    public static void main(String[] args) {
        char input_char = '$';
        System.out.println("Enter the Character ");
        Scanner sc = new Scanner(System.in);
        input_char = sc.next().charAt(0);
        check(input_char);
    }
}
