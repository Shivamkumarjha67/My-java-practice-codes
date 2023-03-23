import java.util.Scanner;

public class Insertion_Stack_dsa {

    static int[] arr = new int[5];
    static int top;

    Insertion_Stack_dsa() {
        top = -1;
    }

    void add(int data) {
        top ++;

        if(top >= arr.length) {
            System.out.println("Stack is overflown ");
            return;
        }

        arr[top] = data;
    }

    int pop() {
        if(top == -1) {
            System.out.println("Stack is in condition of under flow");
            return -1;
        }

        int data = arr[top];
        top--;

        return data;
    }

    boolean isEmpty() {
        return (top == -1);
    }
    public static void main(String[] args) {
        Insertion_Stack_dsa obj = new Insertion_Stack_dsa();
        Scanner sc = new Scanner(System.in);

        System.out.println("Main Begins : ");
        for(int i=0; i<arr.length; i++) {
            obj.add(sc.nextInt());
        }

        while(!obj.isEmpty()) {
            System.out.print(obj.pop() + " ");
        }

        sc.close();
    }
}
