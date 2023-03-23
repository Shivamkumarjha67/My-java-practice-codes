public class Type_2 {
    public static void main(String[] args) {
        System.out.println("Main Begins");
        try{
            System.out.println("In try block");
            System.out.println(10/0);
        }
        finally {
            System.out.println("Finally Block");
        }
        System.out.println("Main ends");
    }
}

/*
 *      Finally block is executed, even though exception is not handeled in try block.
 *      There will be abnormal termination but after executing finally block.
 */