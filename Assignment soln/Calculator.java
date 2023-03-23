import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls Enter two operands a & b :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Pls Select the operator");
        System.out.println("For '+' -> 1 '\n' For '-' -> 2 '\n' For '*' -> 3 '\n' For '/' -> 4");

        int operator = sc.nextInt();

        switch(operator) {
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : System.out.println(a/b);
            break;
            default : System.out.println("Opted wrong choice");
        }
    }
}
