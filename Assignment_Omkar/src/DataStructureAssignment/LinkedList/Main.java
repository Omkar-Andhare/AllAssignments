package DataStructureAssignment.LinkedList;

public class Main {

    public static void main(String[] args) {

//        Create instance of LinkedListOperation
        LinkedListOperation list = new LinkedListOperation();

//        Remove elements from empty LL
        System.out.println(list.removeElementAtPosition(1));

//        Add elements into LL
        list.addElementAtEnd("Mango");
        list.addElementAtEnd("Orange");
        list.addElementAtEnd("Banana");
        list.addElementAtEnd("Apple");

//        Print LL
        System.out.println("Initial Linked List:");
        list.printList();

//      Remove first element from LL
        System.out.println(list.removeElementAtPosition(0));
        list.printList();


//        Test invalid position case
        System.out.println(list.removeElementAtPosition(-1)); // Invalid position. Position should be non-negative.
        list.printList();

//        Remove intermediate element from  LL
        System.out.println(list.removeElementAtPosition(3));
        list.printList();

//        Remove last element from LL
        System.out.println(list.removeElementAtPosition(2));
        list.printList();


    }
}
