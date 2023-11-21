package Java8Features.MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceExample {

    public static void main(String[] args) {
        // Static method reference
        Function<String, Integer> stringToIntReference = Integer::parseInt;
        System.out.println(stringToIntReference.apply("123"));

        // Instance method reference of a particular object
        Consumer<String> printUpperCaseReference = System.out::println;
        printUpperCaseReference.accept("hello");

        // Instance method reference of an arbitrary object of a particular type
        List<String> strings = Arrays.asList("apple", "banana", "orange");
        strings.forEach(String::toUpperCase);

        // Instance method reference of an existing object
        String prefix = "Hello, ";
        Function<String, String> addPrefixReference = prefix::concat;
        System.out.println(addPrefixReference.apply("world"));

        // Constructor reference
        Supplier<List<String>> listSupplierReference = ArrayList::new;
        List<String> newList = listSupplierReference.get();
    }
}
