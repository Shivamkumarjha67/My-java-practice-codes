// Using Recursion -> Explicit Stack

import java.util.Stack;

public class Reverse_Stack {

    // Pushing Element At Bottom Mthod
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    // Reversing Method
    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty())
        return;

        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(5);
        s.push(8);
        s.push(7);
         
        // Pushing an element at the bottom of Stack.
        // Using recursion.

        //pushAtBottom(4, s);
        reverse(s);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
