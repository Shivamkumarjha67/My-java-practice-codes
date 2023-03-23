import java.util.Scanner;

public class Fibonacci_Series {
    int upto_no;

    Fibonacci_Series(int data) {
        this.upto_no = data;
    }

    static void generate_Series(int data) {
        System.out.print(0 + " " + 1 + " ");
        int no1 = 0, no2 = 1,sum = 0;
        while(sum < data) {
            sum = no1 + no2;
            System.out.print(sum + " ");
            no1 = no2;
            no2 = sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto where u want to generate fibonacci series");
        int data = sc.nextInt();
        Fibonacci_Series f = new Fibonacci_Series(data);

        generate_Series(f.upto_no);
    }
}