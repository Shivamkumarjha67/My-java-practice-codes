// Super Keyword can with (1). Variables (2). Methods (3). Constructors

// superclass Person
class Person {
	Person()
	{
		System.out.println("Person class Constructor");
	}
    int age = 23;
    public void name(String s) {
        System.out.println("Name of the person is "+ s);
    }
}

// subclass Student extending the Person class
class Student extends Person {
	Student()
	{
		// invoke or call parent class constructor
		super();                                               // as a constuctor

		System.out.println("Student class Constructor");
	}
    int age = 19;
    public void stuAge(){
        System.out.println("Age of the person is "+ super.age); // as a variable
    }
    public void name(String m){
        System.out.println("Name of the student is " + m);
    }
    public void display(String s){
        stuAge();
        super.name(s);                                        // as a Methods
    }
}

// Driver Program
class SuperKeyword {
	public static void main(String[] args)
	{
		Student s = new Student();
        s.display("Shivam kumar jha");
    }
}
