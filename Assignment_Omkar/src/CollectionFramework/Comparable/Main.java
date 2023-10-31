package CollectionFramework.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person person = new Person("Omkar", 23, 12345);
        Person person1 = new Person("Shubham", 27, 12345);
        Person person2 = new Person("Nikhil", 24, 12345);
        list.add(person);
        list.add(person1);
        list.add(person2);
        Collections.sort(list);

        System.out.println(list);

    }
}
