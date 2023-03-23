public class ClassNotFound_Excp {
    public static void main(String[] args) {
        try {
            Class.forName("Shivam_Jha");
        }
        catch (ClassNotFoundException e) {
            System.out.println(e);
            System.out.println("Class not Found");
        }
    }
}
