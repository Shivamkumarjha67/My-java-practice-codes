public class Circular_LL1 {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    static Node head = null;

    public static void addFrst(int data ) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        Node currNode = head;

        while(currNode.next != head)
        currNode = currNode.next;

        currNode.next = newNode;
        newNode.next = head;
    }

    public static void prntElm() {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node cNode = head;
        //int x =3;

        do {
            System.out.print(cNode.data + "-> ");
            cNode = cNode.next;
            // if(x>0) {
            //     if (cNode == head) {
            //         System.out.print(cNode.data + "-> ");
            //         cNode = cNode.next;
            //         x--;
            //     }
            // }
        } while(cNode != head);
        System.out.println("Repeat");
    }

    public static void main(String[] args) {
        addFrst(1);
        addFrst(3);
        addFrst(5);
        prntElm();
    }
}
