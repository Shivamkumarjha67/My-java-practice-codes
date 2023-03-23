public class Single_Inheritance extends First {

    public void Another_method() {
        System.out.println("This is the method of this class only");
    }
    public static void main(String[] args) {
        System.out.println("Main method begins");
        Single_Inheritance obj = new Single_Inheritance();
        obj.Method();
        obj.Another_method();
        System.out.println("Main ends");
    }
}

class First {
    public void Method() {
        System.out.println("This is a method of first class");
    }
}
