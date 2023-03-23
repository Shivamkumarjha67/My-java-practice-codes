public class Type_3 {
    public static void main(String[] args) {
        try {
            System.out.println("In try block");
            // System.out.println(10/0); 
            System.exit(0);
        }
        finally {
            System.out.println("Finally Block will not be executed");
        }
        System.out.println("Main ends");
    }
}

/*
 *      If system exits then only finally block will not be executed.
 *      If exception occur before system exit then System does not exit.
 *      And finally block will esecuted.
 */
