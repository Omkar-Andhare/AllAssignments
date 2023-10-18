package DataStructureAssignment.StackQ2;

import java.util.Scanner;

public class Stack {
    public int maxSize;
    public int top;
    public int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[size];
        top = -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(0);

        System.out.println("Size of stack before entering elements: " + stack.maxSize);
        System.out.println("trying to peek : ");
        stack.peek();

        System.out.println("entering the values");
        stack.push(23);
        stack.push(21);
        stack.push(89);
        stack.push(90);
        stack.push(211);
        stack.push(634);
        stack.push(567);
        stack.push(78);
        stack.push(5678);
        stack.push(5238);
        stack.push(17);
        stack.push(18);


        System.out.println("stack after entering elements: ");
        stack.printStack();
        System.out.println("Size of an stack after entering elements: " + stack.maxSize);

    }

    public void pushExtra(int value) {
        if (top == maxSize - 1) {
            int newSize = maxSize + 1;
            int[] newArray = new int[newSize];
            for (int i = 0; i <= top; i++) {
                newArray[i] = stackArray[i];
            }
            stackArray = newArray;
            maxSize = newSize;
        }
        top++;
        stackArray[top] = value;
    }

    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            pushExtra(value);
        }
    }

    public int pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a sentinel value to indicate an empty stack
        }
    }

    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a sentinel value to indicate an empty stack
        }
    }
}

