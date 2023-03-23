class Arithmetic_Excp {
    public static void main(String[] args) {
        try {
            int a = 23;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }  
        catch(ArithmeticException e) {
            System.out.println("Number can not be divided by zero");
        }

        /*
        catch(Exception e) {
            System.out.println(e);     // Output -> java.lang.ArithmeticException: / by zero
        }

         */
    }
}