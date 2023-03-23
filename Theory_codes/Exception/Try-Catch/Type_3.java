public class Type_3 {
    public static void main(String[] args) {
        int arr[] = new int[4];
        System.out.println("Main Begins");
        try {
            int data = 10 / 0;
            System.out.println("Hello" + data);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            arr[4] = 5;  // Leads to abnormal termination.
            System.out.println(arr[4] + " is value of arr[4]");
        }
        catch (Exception e) {
            System.out.println("Hii");
        }
        System.out.println("Main ends");
    }
}

/*
 *      If there is any Exception in catch block then it always leads to abnormal termination.
 *      Catch will not throw Exception further to another Catch block, if present.
 * 
 *      Once any Exception found in try block then Statement after that exception hold any importance bcz 
 *      control flow goes to catch block(if present), otherwise it will lead to abnormal tetmination.
 */
