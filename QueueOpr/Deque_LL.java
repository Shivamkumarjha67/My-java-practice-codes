public class Deque_LL {

    static class Node {
        int data;
        Node prev;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    static Node front;
    static Node rear;

    // Empty 
    static boolean isEmpty() {
        return front == null && rear == null;
    }

    // Adding at Front end
    static void addFront(int data) {
        Node newNode = new Node(data);

        if(isEmpty()) {
            front = rear = newNode;
            return;
        }

        newNode.next = front;
        front = newNode;
    }

    // Adding at Rear end
    static void addRear(int data) {
        Node newNode = new Node(data);

        if(isEmpty()) {
            rear = front = newNode;
            return;
        }

        newNode.prev = rear;
        rear.next = newNode;
        rear = newNode;
    }

    // Removing at Front end
    static void removeRear() {
        if(isEmpty()) {
            System.out.println("Deque is already empty");
            return;
        }

        rear = rear.prev;
    }

    // Removing at Front end
    static void removeFront() {
        if(isEmpty()) {
            System.out.println("Deque is already empty");
            return;
        }

        front = front.next;
    }

    // Showing Fornt Element
    static void ElmAtFront() {
        System.out.println(front.data);
    }

    // Showing Rear Element
    static void ElmAtRear() {
        System.out.println(rear.data);
    }

    public static void main(String[] args) {
        addFront(3);
        addFront(6);
        addRear(9);

        ElmAtFront();
        ElmAtRear();

        removeRear();
        ElmAtRear();
    }
}
