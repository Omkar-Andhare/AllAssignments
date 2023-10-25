package CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListOperations {

    public static void main(String[] args) {

        List<Integer> arrlist = new ArrayList<Integer>(5);
        List<Integer> arrlist1 = new ArrayList<Integer>(5);


        arrlist.add(23);
        arrlist.add(45);
        arrlist.add(12);
        arrlist.add(134);
        arrlist.add(54);
        arrlist.add(1, 11);

        arrlist1.add(11);
        arrlist1.add(22);
        arrlist1.add(11);
        arrlist1.add(44);


        for (Integer number : arrlist) {
            System.out.println("Number of first list is = " + number);
        }
        System.out.println("-----------------------------------------");
        for (Integer number : arrlist1) {
            System.out.println("Number of first list is = " + number);
        }
        System.out.println("-----------------------------------------");

        arrlist.addAll(arrlist1);
        System.out.println("after adding second list to first list");
        for (Integer number : arrlist) {
            System.out.println("Number of first list is = " + number);
        }
        System.out.println("-----------------------------------------");
//        arrlist.clear();
//        System.out.println("After deleting list: " + arrlist);

        System.out.println(arrlist.contains(11));//returns true

        System.out.println(arrlist.get(6));//return elements of 6th index

        System.out.println(arrlist.indexOf(44));//return the index of element

        System.out.println(arrlist.isEmpty());//checking list is empty or not
        System.out.println(arrlist.lastIndexOf(11));//11 is repetive element and it returns the last index of occurrence
        System.out.println(arrlist.remove(2));//remove element of index 2

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("iteration using Iterator interface>>>>>>");

        Iterator<Integer> itr = arrlist.iterator();//printing arraylist using iterator interface
        while (itr.hasNext()) {
            Integer integer = itr.next();
            System.out.print(integer+" ");
        }
    }
}
