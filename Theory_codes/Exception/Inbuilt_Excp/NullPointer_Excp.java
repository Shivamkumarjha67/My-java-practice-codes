public class NullPointer_Excp {
    public static void main(String[] args) {
        try {
            String p = null;
            System.out.println(p.charAt(0));
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException Occured");
        }

        // catch(Exception e) {
        //     System.out.println(e); // Output -> java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "<local1>" is null
        // }
    }
}
