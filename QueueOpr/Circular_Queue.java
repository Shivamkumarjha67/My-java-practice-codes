                                    /* Array Implementation */

public class Circular_Queue {
    static int size;
    static int arr[];
    static int rear = -1;
    static int front = -1;

    Circular_Queue(int size) {
        arr = new int[size];
        this.size = size;
    }

    static boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    static boolean isFull() {
        return (rear + 1) % size == front;
    }

    static void add(int data) {
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if(front == -1)
        front = 0;

        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    static void remove() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        if(front == rear) {
            front = rear = -1;
            return;
        }

        //int data = arr[front];
        front = (front + 1) % size;

        //System.out.println(data + " is removed");
    } 

    int peek() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[front];
    }

    public static void main(String[] args) {
        Circular_Queue c = new Circular_Queue(5);
        add(3);
        add(5);
        // System.out.println(c.peek());
        add(4);
        add(9);
        add(8);
        // System.out.println(c.peek());
        // add(7);

        remove();
        remove();
        remove();
        add(22);
        add(55);
        add(11);
        // add(33);

        while(!isEmpty()) {
            System.out.println(c.peek());
            remove();
        }
        System.out.println(c.peek());
    }
}