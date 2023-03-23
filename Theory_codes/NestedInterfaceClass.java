// Nested Interface using class.

class Test {
    // No "private" --> access modifier for interface.
    protected interface First {
        // Abstract method
        void display();
        // Default method
        default void show() {
            System.out.println("This is a default method");
        }
        // Static method --> Throwing error.
    } 
    public void large() {
        System.out.println("This is a method of outer class");
    }
}

class Another implements Test.First {
    public void display() {
        System.out.println("This is an abstract method");
    }
}

class NestedInterfaceClass {
    public static void main(String[] args) {
        Test.First obj;
        Another s = new Another();
        obj = s;
        obj.display();
        obj.show();
        // Method of outer class can only be accessed by its own variable.
        Test c = new Test();
        c.large();
    }
}