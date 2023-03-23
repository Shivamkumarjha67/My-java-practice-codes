                                /* Linked list Implementation */
public class Queue_LL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    static Node front;
    static Node rear;

    static boolean isEmpty() {
        return front == null;
    }

    static void add(int data) {
        Node newNode = new Node(data);

        if(isEmpty()) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = rear.next;
    }

    static void remove() {
        if(isEmpty()) {
            System.out.println("Queue is already Empty");
            return;
        }

        if(front == rear) 
        rear = null;

        front = front.next;
    }

    static int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return front.data;
    }

    public static void main(String[] args) {
        add(3);
        add(5);
        add(33);
        // System.out.println(peek());

        while(!isEmpty()) {
            System.out.println(peek());
            remove();
        }
        System.out.println(isEmpty());
    }
}
