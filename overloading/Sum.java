package overloading;

public class Sum {
    public int sum(int x, int y) {
        return (x + y);
    }

    public double sum(int x, int y, double z) {
        return (x + y + z);
    }

    public double sum(double x, double y) {
        return (x + y);
    }
}
