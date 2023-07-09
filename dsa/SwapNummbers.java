package dsa;

public class SwapNummbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping, a=" + a + " and b =" + b);

        a = a + b; //(5+10)
        b = a - b; //(15-10)
        a = a - b; //(15-5)

        System.out.println("After swapping, a=" + a + " and b =" + b);
    }
}
