class Mmethods {
    // Creating Static Method
    public static void myStatic() {
        System.out.println("This is a Static method");
    }

    // Creating non Static Method
    public void myNonStatic() {
        System.out.println("This is a non Static method");
    }

    // Our Main method
    public static void main(String args[]){
        System.out.println("Checking Static and Non Static Method");
        //Calling Static Method
        myStatic();
        // Creating Object for Non Satic Method
        Mmethods obj=new Mmethods();
        // Calling Non Static method
        obj.myNonStatic();
    }
}