public class Type_1 {
    public static void main(String[] args) {
        System.out.println("Main Begins");
        try {
            System.out.println("In try block");
            System.out.println(3/0);
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally{
            // Clean up codes.
            System.out.println("In finally block");
        }
        System.out.println("Main ends");
    }
}

/*
 *   Finally Block is executed always.
 */