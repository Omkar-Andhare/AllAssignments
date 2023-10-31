package CollectionFramework.Comparator.SortingBasedOnCustom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student(23, "Omkar");
        Student s2 = new Student(27, "Shubham");
        Student s3 = new Student(22, "Nikhil");
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(list);
        Collections.sort(list, new NameComparator());
        System.out.println("-----------after sorting -------");
        System.out.println(list);
    }
}
