// Functional Interface -> Only one abstract method are allowed.

// Static and Default method can be defined in number.

// Anotation @FunctionalInterface used for defining the type of interface made here.
@FunctionalInterface
interface First {
    // abstract Method
    //void display(String d);
    int show(int x);
    // Default Method
    default void show1() {
        System.out.println("This is a default method ");
    }
    // Static Method
    static void show2() {
        System.out.println("This is a static method ");
    }
}

// Usual way of implementing interface

 /*
class Functional_Interface implements First {
    public static void main(String[] args) {
        Functional_Interface obj = new Functional_Interface();
        obj.display("Functional Interface abstract Method");
    }

    public void display(String x) {
        System.out.println("This is : " + x);
    }
}
*/

// Using Lambda Expression

class Functional_Interface {
    public static void main(String[] args) {
        // Lambda Expression for defining show method.
        First obj = (x)-> (10*x);
        System.out.println(obj.show(4));
        obj.show1();
        //show2();
    }
}