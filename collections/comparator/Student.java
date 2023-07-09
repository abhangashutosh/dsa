package collections.comparator;

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
        return rollNo + " " + name + " " + percent;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
