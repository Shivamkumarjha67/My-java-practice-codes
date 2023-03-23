                                        /* Implementation Using Arrays */

public class Stack_Operations {

    public static void main(String[] args) {
        System.out.println("Stack Operations :- ");

        Stack obj = new Stack();

        System.out.println(obj.isEmpty());
        obj.push(2);
        obj.push(7);
        obj.push(8);
        obj.push(333);
        obj.push(23);
        obj.push(22222);
        obj.count();
        System.out.println(obj.isEmpty());
        obj.display();
        System.out.println(obj.isFull());

        obj.push(34);
        obj.display();
        obj.count();
        obj.pop();
        obj.display();
        obj.pop();
        obj.push(67);
        obj.display();
        obj.count();
        obj.peek();
    }
}

class Stack {

    final int  size = 5;
    int[] arr = new int[size];
    int top;
    int x =0;

    Stack() {
        top = -1;
    }

    public void push(int data) {

        if(top == size-1) {
            System.out.println("Stack Overflow");
            return;
        }

        x = top + 1;
        top = top + 1;
        System.out.println(data + " is pushed into the stack");
        arr[x] = data;
    }

    public void pop() {

        if(top < 0) {
            System.out.println("Stack Underflow");
            return;
        }

        int x = top;
        top = top-1;
        System.out.println(arr[x] + " is poped out of the stack");
        return;
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public boolean isFull() {
        return (top == size);
    }

    public int sizeOfStack() {
        return arr.length;
    }

    public void peek() {
        
        if(top < 0) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println(arr[top] + " is at the top");
        return;
    }

    public void count() {
        System.out.println(top + 1);
        return;
    }

    public void display() {

        x = top;
        while(x >= 0) {
            System.out.print(arr[x--] + " ");
        }
        System.out.println();

        return;
    }
}