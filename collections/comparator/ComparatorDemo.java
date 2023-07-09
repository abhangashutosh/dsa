package collections.comparator;

import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> a1 = new ArrayList<>();
        a1.add(new Student(23, " Ram ", 99.8f));
        a1.add(new Student(64, " Ramesh ", 45.5f));
        a1.add(new Student(73, " Yogesh ", 87.2f));
        a1.add(new Student(89, " Harish ", 54.5f));

        Collections.sort(a1);
        System.out.println("After Sorting by name");

        Iterator<Student> itr = a1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("After Sorting by percentage");

        Collections.sort(a1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getPercent() > o2.getPercent())
                    return -1;
                else if (o1.getPercent() < o2.getPercent()) {
                    return 1;
                }
                return 0;
            }
        });


        System.out.println(a1);

        System.out.println("Sorting By roll no");

        Collections.sort(a1, new RollCompare());
        System.out.println(a1);

    }
}
