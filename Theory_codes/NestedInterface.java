import javax.annotation.processing.SupportedOptions;

// Nested Interface in interface.

interface First{ 

    void displayF();
    default void DefaultM() {
        System.out.println("This is a Default Method of Outer interface ");
    }
    static void StaticM() {
        System.out.println("This is a Static Method");
    }

    //Nested Interface --> Only public access modifier. (No private, proteted)
    interface Second{
        // Abstract Method
        void displayS();
        // Default method implementation
        default void show() {
            System.out.println("This is a default method");
        }
        // Static method implementation
        static void glance() {
            System.out.println("This is a static method");
        }
    }
}

class A implements First.Second, First {
    public void derivedMem(){
        System.out.println("This is a member of implementing class");
    }
     
    // Implementation of interface methods.

    public void displayF() {
        System.out.println("This is a member of outer interface");
    }
    public void displayS(){
        System.out.println("Method of inner interface");
    }
}


class NestedInterface{
    public static void main(String[] args) {

        First.Second t;
        // Here 't' is of Second interface type ---> Methods of first interface cannot be accessed.

        // Derived Class object created.
        A obj = new A();
        obj.displayF();
        // Equating objects
        t = obj;
        obj.derivedMem();
        t.displayS();
        t.show();

        First.StaticM();

        // For Default Method calling we have to provide implementation of outer interface to derived class.
        obj.DefaultM();

        // Stativ=c Method accessed using interface name. (interface_name.method_name();)
        First.Second.glance();
    }
}