public class Variables {
    // Global Variable -> accessible in any method.
    static int data = 1;

    public static void method() {
        int data1 = 2; // Local variable -> scope limited upto this method only.
        System.out.println("data1 : " + data1);
        System.out.println("data : " + data);
    }

    public static void main(String[] args) {
        System.out.println(data); // data variable is accessible in main but data1 is not.
        // System.out.println(data1); // data1 not accessible here.
    }
}
