                            /* Implementation of Deque using Circular Array */

public class Deque_C_Array {

    static int[] arr;
    static int size;
    static int front = -1;
    static int rear = -1;

    Deque_C_Array(int size) {
        arr = new int[size];
        this.size = size;
    }

    // Empty
    static boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    // Full
    static boolean isFull() {
        return (rear + 1) % size == front;
    }

    // Adding at Front end
    static void addFront(int data) {
        if(isEmpty()) {
            front = rear = 0;
            arr[front] = data;
            return;
        }

        if(isFull()) {
            System.out.println("Deque is full");
            return;
        }

        front--;

        if(front < 0)
        front = size-1;

        arr[front] = data;
    }

    // Adding at rear end
    static void addRear(int data) {
        if(isEmpty()) {
            front = rear = 0;
            arr[front] = data;
            return;
        }

        if(isFull()) {
            System.out.println("Deque is full");
            return;
        }

        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    // Removing from Front end
    static void removeFront() {
        if(isEmpty()) {
            System.out.println("Deque is already empty");
            return;
        }

        if(front == rear) {
            rear = front = -1;
            return;
        }

        front = (front + 1) % size;
    }

    // Removing from Rear end
    static void removeRear() {
        if(rear == front) {
            rear = front = -1;
            return;
        }

        if(rear == 0) {
            rear = size - 1;
            return;
        }

        rear--;
    }

    // Show Front peek
    static void frontPeek() {
        System.out.println(arr[front]);
    }

    // Showing Rear peek
    void rearPeek() {
        System.out.println(arr[rear]);
    }

    public static void main(String[] args) {
        Deque_C_Array dq = new Deque_C_Array(5);

        addFront(1);
        addFront(4);
        addFront(3);
        addRear(5);
        addRear(8);
        removeFront();
        addFront(6); // 6 4 1 5 8

        // frontPeek();
        // dq.rearPeek();

        while(!isEmpty()) {
            dq.rearPeek();
            removeRear();
        }

        // dq.rearPeek();
        // frontPeek();
    }
}
