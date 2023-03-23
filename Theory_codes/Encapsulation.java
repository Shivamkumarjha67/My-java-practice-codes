                                    /*    ***Encapsulation***    */
import java.util.Scanner;

class Encapsulation {
    /* 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Capsule obj = new Capsule();

        System.out.println("Pls enter your _Name_ , _Age_ , _Religion_ ");
        String name = sc.next();
        int age = sc.nextInt();
        String religion = sc.next();

        obj.setter(name,age,religion);
        System.out.println("Name is : " + obj.naMe());
        System.out.println("Age is : " + obj.aGe());
        System.out.println("Religion is : " + obj.reliGion());
    }*/

    public static void main(String[] args) {
        Capsule obj = new Capsule();

        System.out.println("Pls enter your _Name_ , _Age_ , _Religion_ ");
        obj.setter();
        System.out.println("Name is : " + obj.naMe());
        System.out.println("Age is : " + obj.aGe());
        System.out.println("Religion is : " + obj.reliGion());
    }
}

class Capsule {

    Scanner sc = new Scanner(System.in);

    // private members -> Data Hiding

    private String name;
    private int age;
    private String religion;

    // Getter & Setter Methods -> Provides restriced access to our private members

    /*public void setter(String name , int age, String religion) {
        this.name = name;
        this.age = age;
        this.religion = religion;
    }*/

    public void setter() {
        name = sc.nextLine();
        age = sc.nextInt();
        religion = sc.next();
    }

    public String naMe() {
        return name;
    }
    public int aGe() {
        return age;
    }
    public String reliGion() {
        return religion;
    }
}

/*                             Notes :-
       1. Encapsulation = Data Hiding + Abstraction
       2. Data Hiding -> By making members private.
       3. Abstraction -> Giving users end results without displaying user the process involved in it.

                            ADVANTAGES :-
        1. Makes secured
        2. Increases readability
        3. Maintainability

                            DISADVANTAGES :-
        1. Increases codes Length
        2. Makes Time Consuming/Taking
        3. Decreases performances
 */