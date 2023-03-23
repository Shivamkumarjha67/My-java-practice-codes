public class Type_5 {
    public static void main(String[] args) {
        System.out.println("Main begins");
        try {
            System.out.println(4/0);
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            int arr[] = new int[3];
            arr[4] = 4;
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            try {
                System.out.println(5/0);
            }
            catch(ArithmeticException e) {
                e.printStackTrace();
            }

            try {
                String data = null;
                System.out.println(data);
            }
            catch(NullPointerException e) {
                System.out.println(e.getMessage());
            }

            int b[] = new int[2];
            b[4] = 3;
            System.out.println(b[4]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Main Ends");
    }
}

/*
 *         We can have Multiple try-catch Block.
 *         Inside Try block also we can have multiple try-catch Block.
 * 
 *         Each try block must have either catch or finally block, otherwise it will give compile time error.
 *         If arrised Exception Type doesn't match with Exception of catch Block, then also it will 
 *         abnormally terminate our program.
 */
