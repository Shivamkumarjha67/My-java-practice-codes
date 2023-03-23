import java.util.Scanner;

class Factorial {
    public static int myFactorial(int a) {
        if(a>0)
        return a * myFactorial(a - 1);
        else
        return 1;
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int a, b;
        a = obj.nextInt();
        b = myFactorial(a);
        System.out.print(b);
    }
}