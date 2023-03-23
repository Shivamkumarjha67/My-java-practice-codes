                                /*   Doubly Circular Linked List */

public class Doubly_Cir_LL1 {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head = null;
    static Node tail = null;

    public static void addFrnt(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            head.prev = tail;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        tail.next = head;
        head.prev = tail;
        // head.prev = tail;
    }

    public static void prntElmfrnt() {
        Node currNode = head;

        if (currNode == null) {
            System.out.println("List is empty");
            return;
        }

        // int x = 1;

        do {
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next;
            // if(currNode == head && x>0) {
            // x--;
            // System.out.print(currNode.data + "-> ");
            // currNode = currNode.next;
            // }
        } while (currNode != head);
        System.out.println("again ");
    }

    public static void prntElmBck() {
        Node currNode = tail;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        do {
            System.out.print(currNode.data + "-> ");
            currNode = currNode.prev;
        } while (currNode != tail);
        System.out.println("again");
    }

    public static void main(String[] args) {

        addFrnt(6);
        addFrnt(4);
        addFrnt(9);
        prntElmfrnt();
        prntElmBck();
    }
}
