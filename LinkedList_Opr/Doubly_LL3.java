                                    /*    DOUBLY LINKED LIST  PROGRAM   */

import javax.xml.transform.Source;

public class Doubly_LL3 {
    static class Node {
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

        if(head == null) {
            head = newNode;
            tail = newNode;
            tail.next = null;
            head.prev = null;
            return;
        } 
        
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public static void addBck(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
            tail.next = null;
            head.prev = null;
            return;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public static void prntFrn() {
        Node currNode = head;

        if(head == null) {
            System.out.println("List is Empty ");
            return;
        }

        while(currNode.next != null) {
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next;
        }
        System.out.println(currNode.data + "-> null");
    }

    public static void prntBck() {
        Node cNode = tail;

        if(head == null) {
            System.out.println("List is Empty ");
            return;
        }

        while(cNode.prev != null) {
            System.out.print(cNode.data + "-> ");
            cNode = cNode.prev;
        }
        System.out.println(cNode.data + "-> null");
    }

    public static void main(String[] args) {
        addFrnt(1);
        addFrnt(2);
        addFrnt(3);
        addFrnt(4);
        addBck(0);
        prntFrn();
        prntBck();
    }
}
