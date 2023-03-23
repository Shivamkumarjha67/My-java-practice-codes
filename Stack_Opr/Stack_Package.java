import java.util.Stack;

public class Stack_Package {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(12);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        st.push(9);
        System.out.println(st.push(5));
        System.out.println(st.search(9)); // finds the level of object from the top.
        st.add(19);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
