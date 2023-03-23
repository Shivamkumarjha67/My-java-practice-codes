// Iterative Method

import java.util.spi.CurrencyNameProvider;

public class Reverse_List {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void addElm(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            head.next = null;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        currNode.next.next = null;
    }

    public void print_List() {
        if(head == null) {
            System.out.println("Link List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next;
        }
        System.out.println(" NULL");
    }

    public void reverse_List() {
        if(head == null) {
            System.out.println("List is empty -> No reversing");
        }

        Node previousNode = null;
        Node currNode = head;
        Node nextNode = null;
        while(currNode != null) {
            nextNode = currNode.next;
            currNode.next = previousNode;
            previousNode = currNode;
            currNode = nextNode;
        }
        head = previousNode;
    }

    public static void main(String[] args) {
        Reverse_List list = new Reverse_List();
        list.addElm(1);
        list.addElm(2);
        list.addElm(3);
        list.print_List();
        list.reverse_List();
        list.print_List();
    }
}

