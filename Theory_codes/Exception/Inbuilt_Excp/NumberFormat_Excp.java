public class NumberFormat_Excp {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt("shivam");
            System.out.println(a);
        }
        catch(NumberFormatException e) {
            System.out.println("Number Format Exception"); 
        }

        // catch(Exception e) {
        //     System.out.println(e); // Output -> java.lang.NumberFormatException: For input string: "shivam"
        // }
    }
}
