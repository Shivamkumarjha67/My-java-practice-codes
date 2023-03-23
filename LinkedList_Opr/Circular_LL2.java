public class Circular_LL2 {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    static Node head = null;
    static Node tail = null;

    public static void addfrnt(int data) {
        Node newNode = new Node(data);
         
        if(head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    public static void addBck(int data) {
        Node newNode = new Node(data);
         
        if(head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        head = newNode;
    }

    public static void prntElm() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        do {
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next;
        } while(currNode != head);
        System.out.println("Repeat");
    }

    public static void main(String[] args) {
        addfrnt(2);
        addfrnt(6);
        addfrnt(4);
        addfrnt(9);
        prntElm();
        addBck(11);
        prntElm();
    }
}
