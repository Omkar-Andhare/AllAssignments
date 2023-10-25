package CollectionFramework.Stack;

import java.util.Stack;

public class StackPractice {
    static void stack_push(Stack<Integer> stack) {
        System.out.println("\nPushing elements in stack: ");
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    static void stack_pop(Stack<Integer> stack) {
        System.out.println("Pop Operation:");

        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.print(y + " ");
        }
    }

    static void stack_peek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    static void stack_search(Stack<Integer> stack, int element) {
        System.out.println("searching the element: "+element);
        int pos = stack.search(element);

        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack_push(stack);
        System.out.println(stack);
        stack_pop(stack);
        System.out.println("\nAfter popping elements: ");
        System.out.println(stack);

        stack_push(stack);
        System.out.println("Again pushing the elements");
        System.out.println(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);
    }
}
