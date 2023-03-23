import java.io.IOException;

public class Type_4 {
    public static void main(String[] args) {
        System.out.println("Main begins");
        try {
            System.out.println("Try block begins");
            System.out.println(10/0);
        } 
        catch(ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally block begins");
            try{
                System.out.println("2nd try block");
                throw new IOException("IOException Occured");
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Main ends");
    }
}


/*
 *      There can be further multiple try / try-catch block in Finally block.
 */