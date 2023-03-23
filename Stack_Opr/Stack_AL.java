
import java.util.ArrayList;

public class Stack_AL {

    static class Stack {
        ArrayList<Integer> a = new ArrayList<>();

        public void push(int value) {
            a.add(value);
            System.out.println(value + " is pushed into the stack");
        }

        public void pop() {
            if(a.size() == 0) {
                System.out.println("Stack is already empty");
                return;
            }
            System.out.println(a.get(a.size()-1) + " is poped out of stack");
            a.remove(a.size()-1);
        }

        public void peek() {
            if(a.size() == 0) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.println(a.get(a.size()-1) + " is at the peek of stack");
        }

        public void isEmpty() {
            System.out.println(a.size() == 0);
        }

    }
    public static void main(String[] args) {
        
        Stack s = new Stack();
        s.isEmpty();
        s.pop();
        s.push(4);
        s.push(3);
        s.peek();
        s.pop();
        s.peek();
        s.push(9);
        s.push(7);
        s.isEmpty();
        s.peek();
    }
}
