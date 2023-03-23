public class Type_2 {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Main Begins");
        doStuff();
        System.out.println("Main ends");
    }

    public static void doStuff() throws InterruptedException {
        throw new InterruptedException("Exception Interrupted occured");
    }
}


/*
 *      Calling method need to caught or declare the exception.
 */