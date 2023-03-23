public class Type_1 {
    public static void main(String[] args) {
        System.out.println("Main begins");
        try {
            doStuff();
        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Main ends");
    }

    public static void doStuff() throws IllegalArgumentException {
        System.out.println("In doStuff method");
        throw new IllegalArgumentException("IllegalArgumentException Occured");
    }
}

/*
 *      1. Throws - keyword is used to declare the occuring exception in any method or block.
 */