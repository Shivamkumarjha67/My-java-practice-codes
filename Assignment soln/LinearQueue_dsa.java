import java.util.Scanner;

public class LinearQueue_dsa {
    static int size;
    static int[] a = new int[size];
    static int front;
    static int rear;

    LinearQueue_dsa(int size) {

        front = rear = -1;
        this.size = size;
    }

    boolean isEmpty() {
        return (front == rear);
    }

    void add(int data) {
        if(front == -1) {
            front = rear = 0;
            a[rear] = data;
            return;
        }

        rear++;
        a[rear] = data;
    }

    public static void main(String[] args) {
        System.out.println("Main Begins");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        LinearQueue_dsa l = new LinearQueue_dsa(size);

        System.out.println("Pls Enter the elements of the queue ");

        for(int i=0; i<size; i++) {
            l.add(sc.nextInt());
        }

        sc.close();
    }
}
