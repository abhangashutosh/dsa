package collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> a1 = new ArrayList<>();
        a1.add(new Student(23, " Ram ", 99.8f));
        a1.add(new Student(64, " Ramesh ", 45.5f));
        a1.add(new Student(73, " Yogesh ", 87.2f));
        a1.add(new Student(89,  " Harish ", 54.5f));

        Collections.sort(a1);
        System.out.println("After Sorting");

        Iterator<Student> itr = a1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
