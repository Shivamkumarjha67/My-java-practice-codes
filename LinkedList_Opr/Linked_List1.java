// Linked List code
/*
 *   Insertion time complexity = O(1).
 *   Deletion time Complexity = O(n).
 *   
 *   Operation Performed here are:-
 *     1. Adding -> First Element , Last Element
 *     2. Removing -> First & Last Element
 *     3. Finding size of linked List.
 *     4. Printing linked list.
 */

import java.sql.PseudoColumnUsage;

class Linked_List1 {
    private int size = 0;
    Linked_List1() {
        this.size =0;
    }

    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    Node head;

    // Adding -> First Element
    public void addFirst(String data) {
        // checking corner cases
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    // Add --> Last Data
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            newNode = head;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Print Element Method
    public void print() {

        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Remove -> First Element
    public void removeFirst() {
        if(head == null) {
            System.out.println("List is already Empty");
            return;
        }

        size--;
        head = head.next;
    }

    // remove -> Last Element
    public void removeLast() {
        if(head == null) {
            System.out.println("This list is empty");
            return;
        }

       //My Logic -> Problem in single node removal
       /* 
        Node currNode = head;
        Node traverseNode = head;
        while(traverseNode.next != null) {
            traverseNode = traverseNode.next;
        }
        while(currNode.next != traverseNode) {
            currNode = currNode.next;
        }
        currNode.next = null;
        
        */

        size--;
        
        if(head.next == null) {
            head = null;
            return;
        }

        Node SecondLast = head;
        Node Last = head.next;
        while(Last.next != null) {
            Last = Last.next;
            SecondLast = SecondLast.next;
        }
        SecondLast.next = null;
        
    }

    public void getSize() {
        System.out.println(size);
    }

    public static void main(String[] args) {
        Linked_List1 ll = new Linked_List1();
        ll.print();
        ll.removeFirst();
        ll.removeLast();
        ll.addFirst("is");
        ll.removeLast();
        ll.addFirst("name");
        ll.addFirst("my");
        ll.print();
        ll.addLast("Shivam");
        ll.addLast("kumar");
        ll.print();
        ll.removeFirst();
        ll.removeLast();
        ll.print();
        ll.getSize();
    }
}