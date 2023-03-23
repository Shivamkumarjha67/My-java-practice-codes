public class Type_4 {
    public static void main(String[] args) {
        // for(int i=1; String s = "aaa"; i<10; i++) {}
        // Again Multiple Declaration will give error.
        String s = "aaa";
        for(int i=1; i<10; i++) {
            System.out.println(i);
            System.out.println(s);
        }
    }
}
