import javax.swing.GroupLayout.Alignment;

public class Doubly_ll1 {
    static class Node {
        int data;
        Node next;
        Node prev; 
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    public static void addElmfrnt(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            head.prev = null;
            head.next = null;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.prev = currNode;
        currNode = newNode;
    }

    public static void addElmBck(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            head.prev = null;
            head.next = null;
            return;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public static void printElmfrw() {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next;
        }
        System.out.println(currNode.data + "-> null");
    }

    public static void printElmbck() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }

        while(currNode.prev != null) {
            System.out.print(currNode.data + "-> ");
            currNode = currNode.prev;
        }
        System.out.println(currNode.data + "-> null ");
    }

    public static void main(String[] args) {
        
        addElmfrnt(11);
        addElmfrnt(13);
        addElmfrnt(15);
        addElmfrnt(23);
        addElmfrnt(22);
        addElmBck(4);
        printElmfrw();
        printElmbck();
    }
}
