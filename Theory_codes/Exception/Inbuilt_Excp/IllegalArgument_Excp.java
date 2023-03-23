import java.util.Scanner;

public class IllegalArgument_Excp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num > 23)
        System.out.println("Elegible for marriage");
        else
        throw new IllegalArgumentException("Not elligible for marriage");
    }
}