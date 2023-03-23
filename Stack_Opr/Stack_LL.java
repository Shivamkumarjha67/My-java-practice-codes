                                        /*   Implementation using Linked List   */

public class Stack_LL {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    static Node head;

    public static void push(int data) {

        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            head.next = null;
            System.out.println(data + " is pushed into the Stack");
            return;
        }

        Node temp = head;
        head = newNode;
        head.next = temp;
        System.out.println(data + " is pushed into the Stack");
    }

    public static void pop() {
        if(head == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println(head.data + " is poped out of the stack");
        head = head.next;
    }

    public static boolean isEmpty() {
        return (head == null);
    }

    public static void peek() {
        if(head == null) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println(head.data);
    }

    public static void count() {
        if(head == null) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = head;
        int freq = 1;

        while(temp.next != null) {
            freq++;
            temp = temp.next;
        }
        System.out.println(freq);
    }

    public static void main(String[] args) {
        System.out.println(isEmpty());
        push(3);
        push(5);
        push(8);
        count();
        pop();
        peek();
    }
}