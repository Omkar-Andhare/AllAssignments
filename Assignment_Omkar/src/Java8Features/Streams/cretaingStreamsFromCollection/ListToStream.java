package Java8Features.Streams.cretaingStreamsFromCollection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListToStream {
    public static void main(String[] args) {


        List<String> myList = Arrays.asList("Omkar", "Shubham", "Nikhil",
                "Dhanashree", "Shivani", "Rutika", "Shreyas", "Satish");


        //creating stream of List and performing filter operation

        myList.stream()
                .filter(f -> f.startsWith("S"))
                .sorted()
                .forEach(e -> System.out.println(e));


        //creating set and add element from above list and making converting into stream
        Set<String> set = new HashSet<>();
        set.addAll(myList);

        Set<String> newSet =  set.stream()
                .filter(s -> s == "Omkar")
                .collect(Collectors.toSet());
        System.out.println(newSet);

        //map to stream
        Map<String, Integer> map = new HashMap<>();
        map.put("RedMI", 2);
        map.put("RealMe", 1);
        map.put("Lenovo", 3);

        // Creating stream from map
        Stream<Map.Entry<String, Integer>> streamFromMap = map.entrySet().stream();

        // getting entries which is value is greater tha 1
        streamFromMap.filter(entry -> entry.getValue() > 1).forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        //ArrayToStream

        Integer[] arr = {123, 654, 12, 543, 1234, 43, 78};

        Stream<Integer> arrStream = Stream.of(arr);
        arrStream.filter(i -> i % 2 == 0).forEach(System.out::println);

    }
}
