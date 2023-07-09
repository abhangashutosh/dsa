package collections.comparator;

import java.util.Comparator;

public class RollCompare implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        if (o1.getRollNo() < o2.getRollNo())
            return -1;
        else if (o1.getRollNo() < o2.getRollNo()) {
            return 1;

        } else {
            return 0;
        }
    }
}
