import java.util.Scanner;

class Multiply {
    public static int myMultiply(int a, int b) {
        return (a * b);
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int a, b, c;
        a = obj.nextInt();
        b = obj.nextInt();
        c = myMultiply(a, b);
        System.out.println(c);
    }
}