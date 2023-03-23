public class Type_4 {
    public static void main(String[] args) {
        System.out.println("Main begins");
        // throw e;
        if(true) {
            IllegalArgumentException e = null;
            throw e;
        }
        System.out.println("Main ends"); // Compile time error -> Unrechable statement
    }
}

/*
 *   Statement after throw is allowed only when :-
 *   1. throw is conditional.
 *   2. throw is in try block;
 */
