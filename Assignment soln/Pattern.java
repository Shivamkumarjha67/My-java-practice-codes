import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for(int i=0; i<=size; i++) {
            for(int j=size-i; j<=size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*  output format :-

                                *
                                **
                                ***
                                ****
                                *****

*/
