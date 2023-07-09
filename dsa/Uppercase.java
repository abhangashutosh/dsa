package dsa;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Uppercase {

    static void check(char letter) {
        if (letter >= 'A' && letter <= 'Z')
            out.println("\n" + letter + " is an UpperCase Character");
        else if (letter >= 'a' && letter <= 'z')
            out.println("\n" + letter + " is an LowerCase Character");
        else
            out.println("\n" + letter + " is not an Alphabetic Character");

    }

    public static void main(String[] args) {
        out.println("Type the Alphabet");
        Scanner sc = new Scanner(in);
        char letter = sc.next().charAt(0);
        check(letter);

    }
}
