import java.io.IOException;
import java.util.*;

public class IO_Excp {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner("Hello World");
            //System.out.println(sc.ioException());

            String s = sc.nextLine();
            System.out.println(s);
            System.out.println(s);

            //System.out.println(sc.nextLine()); // java.util.NoSuchElementException: No line found
            //String c = sc.nextLine(); // java.util.NoSuchElementException: No line found

            // Another type :-
            //int i = sc.nextInt(); // java.util.InputMismatchException
            //System.out.println(i);

            System.out.println(sc.ioException());
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*                                NOTES :-
 *
 *  1. Only String can be passed in the constructor of String class.
 *  2. Once a String is passed then only once that string can be taken as input.
 *  3. Other wise NoSuchElementException occurs.
 *  4. If Another data type is used to take input then -> java.util.InputMismatchException occurs.
 */
