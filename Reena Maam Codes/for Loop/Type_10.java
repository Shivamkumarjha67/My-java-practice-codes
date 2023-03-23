public class Type_10 {
    public static void main(String[] args) {
        // Infinite loop
        // No need of body ,Once we terminated the loop using semo colons.
        //for(System.out.println("Hii"); true; System.out.println("hlw"));

        // Illegal way -> Body is must 
        // for(System.out.println("Hii"); true; System.out.println("hlw")) 
        
        // Illegal way -> Body is must 
        // for(System.out.println("Hii"); true; System.out.println("hlw")) {}
        // In body statement is must -> Otherwise no sense of making body.
        // JVM is smart enough to find it as error.

        for(System.out.println("Hii"); false; );
        System.out.println("Shiv");
    }
}
