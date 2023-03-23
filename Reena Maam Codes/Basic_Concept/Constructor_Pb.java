package Basic_Concept;

class NewClass1 {
    String s;
    NewClass1(String s) {
        this.s = s;
    }
}

public class Constructor_Pb extends NewClass1{
    int age;
    // Constructor_Pb(int a) {
    //     // line 1
    //     this.age = a;
    // }

    Constructor_Pb(String p) {
        super(p);
        //this.age = a;
    }

    public void display() {
        System.out.println("Name is : " + s);
        //System.out.println("Age is : " + age);
    }

    public static void main(String[] args) {
        Constructor_Pb sc = new Constructor_Pb("Shivam");
        sc.display();
    }
}


/*                                          NOTES :-
 *   1. Every time default construcor of extended class is called "super()", as soon as we call any constuctor of sub class.
 *   2. Both "this" and "super()" can not be passed at once in any constructor -> Compile time error.
 *   3. 
 */
