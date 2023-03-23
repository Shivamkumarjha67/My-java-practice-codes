                                       /*  Doubly Linked List */

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Doubly_ll2 {
    public static void main(String[] args) {
        Node first = null;
        Node second = null;
        Node third = null;

        first = new Node();
        second = new Node();
        third = new Node();

        first.data = 10;
        first.prev = null;
        first.next = second;

        second.data = 11;
        second.prev = first;
        second.next = third;

        third.data = 12;
        third.next = null;
        third.prev = second;

        printElm(first);
    }

    static class Node {
        int data;
        Node next;
        Node prev;
    }

    public static void printElm(Node currnode) {
        Node currNode2 = currnode;
        while(currNode2.next != null) {
            System.out.print(currNode2.data + "-> ");
            currNode2 = currNode2.next;
        }
        System.out.println(currNode2.data +"-> null");

        while(currNode2 != null) {
            System.out.print(currNode2.data + "-> ");
            currNode2 = currNode2.prev;
        }
        System.out.println("null");
    }
}
