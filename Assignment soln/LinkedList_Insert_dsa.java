import java.util.*;

public class LinkedList_Insert_dsa {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static Node head;

    static void add(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    static void insert(int pos , int elm) {
        Node newNode = new Node(elm);

        Node curr = head;
        while(pos-- > 1) {
            curr = curr.next;
        }
        
        Node ahd = curr.next;

        curr.next = newNode;
        newNode.next = ahd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pls Enter the number of element in queue : ");
        int size = sc.nextInt();

        for(int i=0; i<size; i++)
        add(i+1);

        System.out.println("Enter the position u want to insert : ");
        int pos = sc.nextInt();

        int elm = sc.nextInt();
        insert(pos, elm);

        sc.close();
    }
}
