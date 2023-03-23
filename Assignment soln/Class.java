public class Class {
    public static void main(String[] args) {
        First obj = new First("Shivam" , 20);
        obj.display_details();
    }
}

// class declaration
class First {
    // Defination :- Its Methods and Variables.

    // Fields
    public int age;
    public String name;

    // Methods
    First(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display_details() {
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
    }

}