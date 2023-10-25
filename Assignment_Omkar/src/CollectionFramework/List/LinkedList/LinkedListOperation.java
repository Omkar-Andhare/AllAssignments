package CollectionFramework.List.LinkedList;

import java.util.LinkedList;

public class LinkedListOperation {
    public static void main(String args[]) {

        LinkedList list = new LinkedList();


        list.add("O");
        list.add("m");
        list.add("k");
        list.add("a");
        list.add("r");

        System.out.println("The list is:" + list);
        list.add(" Java");
        list.add(" Developer");
        System.out.println("The new List is:" + list);
        list.pop();
        System.out.println("The list is:" + list);

    }
}
