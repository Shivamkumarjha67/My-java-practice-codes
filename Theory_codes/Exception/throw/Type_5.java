import java.io.IOException;

public class Type_5 {
    public static void main(String[] args) throws IOException {
        System.out.println("Main Begins");
        dostuff(); // declared to be thrown
        System.out.println("Main Ends");
    }

    public static void dostuff() throws IOException {
        // doMoreStuff();
        throw new ArithmeticException();
        // throw new IOException();
    }

    public static void doMoreStuff() {
        try{
            throw new IOException("Something went wrong");
        } catch(IOException e) {  // Exception handled
            System.out.println(e.getMessage());
        }
        
    }
}

/*
 *      1. Throwing checked exception gives compile time , if exception is not caught or declared to be thrown.
 *      2. Throwing unchecked exception gives run time exception , no compile time exception.
 */