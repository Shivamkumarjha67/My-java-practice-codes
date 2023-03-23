public class Type_4 {
    public static void main(String[] args) {
        System.out.println("main begins");
        try {
            System.out.println(5/0);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Main Ends");
    }
}


/*
 *      If Found Exception does not found in Catch statement then it will leads to abnormal termination.
 */