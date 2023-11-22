package Java8Features.Streams.sortingByComparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingInStream {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Omkar", "Shubham", "Nikhil",
                "Dhanashree", "Shivani", "Rutika", "Shreyas", "Satish");

            //asceding order
//        List<String> newList1 = myList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
//        System.out.println(newList1);

//        List<String> newList2 = myList.stream().sorted((ele1,ele2)->ele1.compareTo(ele2)).collect(Collectors.toList());
//        System.out.println(newList2);

//        List<String> newList3 = myList.stream().sorted().collect(Collectors.toList());
//        System.out.println(newList3);

        //descending order
//        List<String> newList4 = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(newList4);

        List<String> newList5 = myList.stream().sorted((ele1,ele2)->ele2.compareTo(ele1)).collect(Collectors.toList());
        System.out.println(newList5);

    }
}
