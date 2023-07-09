package collections.comparable;

public class Student implements Comparable<Student> {

    private int rollNo;
    private String name;
    private float percent;

    public Student(int rollNo, String name, float percent) {
        this.rollNo = rollNo;
        this.name = name;
        this.percent = percent;
    }

    public String toString() {
        return rollNo + "" + name + "" + percent;
    }

    public int compareTo(Student o) {
        if (this.percent > o.percent)
            return -1;
        else if (this.percent < o.percent) {
            return +1;
        } else {
            return 0;
        }
    }
}
