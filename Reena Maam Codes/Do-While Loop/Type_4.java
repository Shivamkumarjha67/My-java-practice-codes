public class Type_4 {
    public static void main(String[] args) {
        int t = 10;
        final int s = 20;
        do {
            System.out.println("Hii");
            //t++;
        } while(t<s); 
        System.out.println("hlw"); // Second statement is allowed until both of them is not final.
        // Even though there is an infinite loop , a/c to JVM -> changes in variables can stop it from making infinite loop.
    }
}
