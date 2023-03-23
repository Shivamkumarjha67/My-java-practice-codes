public class Type_3 {
    public static void main(String[] args) {

        while(false)
        System.out.println("Hello"); // JVM is Smart -> Consider this loop as Unnessesary.(As "false" is passed as condition).
        System.out.println("byy");

        while(true)
        System.out.println("Shivam");
        // System.out.println("Hii"); // Unrechable Statement -> Error
    }
}
