import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Pls Enter any two number for multiplication");
        int no_1 = obj.nextInt();
        int no_2 = obj.nextInt();
        System.out.println("Multiplication of both the number is : " + (no_1*no_2));
    }
}
