package Java8Features.Streams.problemStatements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(32, 23, 32, 23, 45, 45, 66, 77, 66, 78, 98, 98);

        Set<Integer> set = new HashSet<>();
        numbers.stream().filter(s -> !set.add(s))
                .forEach(s -> System.out.println(s));

    }
}
