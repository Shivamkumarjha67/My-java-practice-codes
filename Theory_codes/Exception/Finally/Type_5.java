public class Type_5 {
    public static void main(String[] args) {
        System.out.println("Main Begins");
        try {
            System.out.println("Try block executed");
            return;
        } catch(Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block is executed");
        }
        System.out.println("Main ends");
    }
}