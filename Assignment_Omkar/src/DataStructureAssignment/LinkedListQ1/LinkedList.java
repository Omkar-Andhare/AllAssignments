package DataStructureAssignment.LinkedListQ1;

public class LinkedList {
    private Node head;
//    public LinkedList() {
//        head = null;
//    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);
        list.addAtEnd(50);
        list.addAtEnd(60);
        list.addAtEnd(70);
        list.addAtEnd(80);

        System.out.println("Original List:");
        list.printList();

//        list.addAtEnd(4);
//        System.out.println("list after adding element: ");
//        list.printList();

        list.removeAtPosition(5);
        System.out.println("List after removing element at position 0:");
        list.printList();
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void removeAtPosition(int position) {
        if (position < 0) {
            System.out.println("Invalid position. Position should be non-negative.");
            return;
        }

        if (position == 0) {
            if (head != null) {
                head = head.next;
            } else {
                System.out.println("List is empty. Cannot remove from an empty list.");
            }
            return;
        }
        Node current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
//            System.out.println("hi");

            index++;
        }

        if (current == null || current.next == null) {
            System.out.println("Position out of bounds. Cannot remove.");
            System.out.println("hi");
            return;
        }
        current.next = current.next.next;
    }
}



