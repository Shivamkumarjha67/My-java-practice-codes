import java.util.Scanner;

class printMyName {
    public static void myName(String name) {
        System.out.println(name);
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        myName(name);
    }
}