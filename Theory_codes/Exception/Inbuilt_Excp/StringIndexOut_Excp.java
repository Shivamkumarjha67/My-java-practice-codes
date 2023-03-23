public class StringIndexOut_Excp {
    public static void main(String[] args) {
        try {
            String s = "Shivam";
            System.out.println(s.charAt(0));
            System.out.println(s.charAt(6));
            System.out.println(s.charAt(3));
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("Accessing Index is out of bound");
        }

        // catch(Exception e) {
        //     System.out.println(e); // Output -> java.lang.StringIndexOutOfBoundsException: Index 6 out of bounds for length 6
        // }
    }
}
