package Java8Features.Streams.operationPerfomed;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DiffOperations {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Omkar", "Shubham", "Nikhil",
                "Dhanashree", "Shivani", "Rutika", "Shreyas", "Satish", "Omkar", "Shivani");

        Stream<String> listStream = myList.stream();
// sorting list
//        listStream.sorted().forEach(l -> System.out.println("SOrted list is : " + l));

        //getting distinct element in list
//        List<String> distinctList = listStream.distinct().collect(Collectors.toList());
//        System.out.println(distinctList);

        List<String> modifyEle = listStream.map(i -> i.concat(" Hello")).collect(Collectors.toList());
        System.out.println(modifyEle);

    }
}
