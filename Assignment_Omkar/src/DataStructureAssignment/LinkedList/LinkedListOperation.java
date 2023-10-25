package DataStructureAssignment.LinkedList;

public class LinkedListOperation {

    Node head;

    public void addElementAtEnd(String data) {
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

//    public void removeElementAtPosition(int position) {
//        // invalid position
//        if (position < 0) {
//            System.out.println("invalid position");
//            return;
//        }
//        if (position == 0) {
//            if (head != null) {
//                head = head.next;
//            } else {
//                System.out.println("list is empty cannot remove from empty list");
//            }
//            return;
//        }
//            Node current = head;
//            int count = 0;
//            while (current != null && count < position - 1) {
//                current = current.next;
//                count++;
//            }
//            if (current == null || current.next == null) {
//                System.out.println("Position not found. Cannot remove.");
//                return;
//            }
//            current.next = current.next.next;
//            System.out.println("Linked List after removing element at position :");
//            printList();
//        }


    public String removeElementAtPosition(int position) {
        String result = " ";
        if (position < 0) {
            result = "Invalid position. Position should be non-negative.";
        } else if (head == null) {
            result = "List is empty. Cannot remove elements from an empty list.";
        } else if (position == 0) {
            result = " " + head.data + " Element is removed.";

            head = head.next;
        } else {
            Node current = head;

            int count = 0;

            while (current != null && count < position - 1) {
                current = current.next;
                count++;
            }

            if (current == null || current.next == null) {
                result = "Position not found, cannot remove.";
            } else {
                Node removedEle = current.next;
                result = " " + removedEle.data + " Element is removed.";

                current.next = current.next.next;
            }
        }
        return result;
    }


    public void printList() {
        Node current = head;
        if (current == null) {
            System.out.println("your list is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
