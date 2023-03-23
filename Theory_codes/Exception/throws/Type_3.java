                                /*  Default Exception Handler  */

public class Type_3 {
    public static void main(String[] args) {
        System.out.println("Main begins");
        // try {
        //     m1();
        // }
        // catch(ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // }
        m1();
    }

    public static void m1() {
        m2();
    }

    public static void m2() {
        // try {
        //     m3();
        // } catch (ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // }
        m3();
    }

    public static void m3() {
        System.out.println(4/0);
    }
}


/*                                       IMPORTANT POINTS :-

 *    * When there is no handling code to the caller method then the method gets terminated abnormally and 
 *      its memory from stack gets removed until it reaches the main method.
 *    * Even Main method gets terminated abnormally, for not having handling code and corresponding entry from 
 *      stack gets removed.
 *      
 *    * Then JVM handover the responsibility of exception handling to the Default Exception Handler.
 *    * Futher Default Exception Handler just prints the information of exception and stack-trace.
 */