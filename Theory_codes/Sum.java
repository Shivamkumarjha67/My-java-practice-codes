import java.util.Scanner;

class Sum {
    public static int mySum(int a, int b) {
        return (a + b);
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int a, b, c;
        a = obj.nextInt();
        b = obj.nextInt();
        c = mySum(a, b);
        System.out.print(c);
    }
}