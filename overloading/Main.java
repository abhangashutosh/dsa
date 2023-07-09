package overloading;

public class Main {
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.sum(23, 65));
        System.out.println(s.sum(45, 45, 54));
        System.out.println(s.sum(54875, 8374));
    }
}
