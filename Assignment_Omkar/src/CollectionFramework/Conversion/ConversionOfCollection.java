package CollectionFramework.Conversion;

import java.util.*;

public class ConversionOfCollection {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //conversion from list to set
        Set<Integer> set = new HashSet<>(list);
        System.out.println("set is " + set);
        System.out.println("-----------------------------------");
        //conversion from list to set
        List<Integer> list1 = new ArrayList<>(set);
        System.out.println("List is " + list1);
        System.out.println("-----------------------------------");

        String[] array = {"Omkar", "Shubham", "Nikhil"};
        System.out.println("Array is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //converting array to list
        List<String> list2 = Arrays.asList(array);
        System.out.println("After converting array to List is : ");
        System.out.println(list2);
        System.out.println("--------------------------------");

        //list to array
        String[] array1 = list2.toArray(new String[0]);
        System.out.println("List is converting into Array: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("----------------------------------");

        //set to array
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        System.out.println("set is " + set1);
        System.out.println("set converting into array: ");
        Integer[] array2 = set.toArray(new Integer[0]);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("---------------------------------");

        //ArrayList to map
        List<String> arrayList = new ArrayList<>();
        arrayList.add("OM");
        arrayList.add("SHUBH");
        arrayList.add("NIKHIL");
        System.out.println("arraylist is " + arrayList);
        Map<Integer, String> map1 = new HashMap<>();

        for (int i = 0; i < arrayList.size(); i++) {
            map1.put(i, arrayList.get(i));
        }
        System.out.println("ArrayList converting into Map");
        System.out.println(map1);
        System.out.println("--------------------------------");

        //map to arraylist
        List<String> convertedArrayList = new ArrayList<>(map1.values());
        System.out.println(map1);
        System.out.println("after Converting map to Arraylist is ");
        System.out.println(convertedArrayList);


    }
}
