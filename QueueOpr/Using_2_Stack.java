                                /* Making the use of two Stack */

import java.util.Stack;                                

public class Using_2_Stack {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    static void addElm(int data) {

        while(!s1.isEmpty()) {
            s2.add(s1.peek());
            s1.pop();
        }
        s2.add(data);

        while(!s2.isEmpty()) {
            s1.add(s2.pop());
        }
    }

    static void removeElm() {

        if(s1.isEmpty()) {
            System.out.println("Queue is already empty");
            return;
        }

        //System.out.println(s1.pop());
        s1.pop();
    }

    static boolean QisEmpty() {
        return s1.isEmpty();
    }

    static void ElmAtPeek() {
        System.out.println(s1.peek());
    }

    static int size() {
        return s1.size();
    }

    public static void main(String[] args) {

        addElm(2);
        addElm(6);
        addElm(8);
        addElm(55);
        
        System.out.println(size());

        while(!QisEmpty()) {
            ElmAtPeek();
            removeElm();
        }

        System.out.println(QisEmpty());
        removeElm();
    }
}
