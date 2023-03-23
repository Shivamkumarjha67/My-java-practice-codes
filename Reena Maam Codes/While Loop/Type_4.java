public class Type_4 {
    public static void main(String[] args) {
        final int t = 18;
        int p = 23;
        while(t>p) 
        System.out.println("Shivam"); // For now Unrechable. But JVM Thinks variable can be manupulated -> So no Error.
        // If both variable is made final then it will be unrechable forever.
    }
}
