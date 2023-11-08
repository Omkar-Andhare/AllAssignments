package CollectionFramework.Comparator.SortByMoreThanOneField;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        //setting student data
        Student s1 = new Student("B", 23);
        Student s2 = new Student("D", 21);
        Student s3 = new Student("A", 24);

        //adding student in list
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);

        //sorting
        Collections.sort(list,new CustomerSortingComparator());
        System.out.println(list);



    }
}
