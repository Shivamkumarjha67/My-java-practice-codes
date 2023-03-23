public class Multiple_Inheritance implements First,Second{
    public void method1() {
        System.out.println("This is method1 of First Interface");
    }

    public void method2() {
        System.out.println("This is method2 of Second Interface");
    }

    public void method3() {
        System.out.println("This method is of Mutiple_Inheritace class");
    }
    public static void main(String[] args) {
        Multiple_Inheritance m = new Multiple_Inheritance();
        m.method1();
        m.method2();
        m.method3();
    }
}

interface First {
    public void method1();
}

interface Second {
    public void method2();
}