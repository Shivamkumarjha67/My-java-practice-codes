import javax.xml.transform.Source;

public class Singly_LL1 {
    static class Node {
        int data;
        Node next;
    }
    //Node head;

    public static void main(String[] args) {
        //Singly_LL1 l = new Singly_LL1();
        Node first = null;
        Node Second = null;
        Node third = null;

        first = new Node();
        Second = new Node();
        third = new Node();

        first.data = 10;
        first.next = Second;

        Second.data = 20;
        Second.next = third;

        third.data = 30;

        Node currNode = first;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
}
