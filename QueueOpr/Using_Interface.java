                            /* Using Queue interface -> Implementing in class Linked List */ 

//import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Using_Interface {

    // If we declare outside main we need to make it static .

    // static Queue<Integer> q = new LinkedList<>(); // Linked List is implementing class of Queue interface.

    // static Queue<Integer> q = new Deque<E>() { // Here Deque is Implementing class of Queue interface.
    // };

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();  // Linked List
        q.add(1);
        q.add(4);
        q.add(8);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println(q.isEmpty());
    }
}
