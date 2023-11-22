package Java8Features.Streams.sortingByComparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingMultipleComparision {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Omkar", "Andhare", 23),
                new Person("Akshay", "Raul", 25),
                new Person("Shubham", "Andhare", 27),
                new Person("NIkhil", "Khot", 28),
                new Person("Dhanashree", "Mandalik", 32)
        );

        List<Person> sortedPersons = persons.stream().sorted(Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName).thenComparingInt(Person::getAge)).collect(Collectors.toList());

        sortedPersons.forEach(s -> System.out.println(s));
    }
}
