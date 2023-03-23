public class Overloading {
    int data1;
    float data2;
    String name;
    int data3;
    int data4;

    Overloading() {}

    Overloading(int data) {
        this.data1 = data;
    }

    Overloading(float data) {
        this.data2 = data;
    }

    public void overloading_Method(String s, int data) {
        System.out.println("This is a Overloading_Method taking string as well as int type data");
        this.name = s;
        this.data3 = data;
    }

    public void overloading_Method(int data) {
        System.out.println("This is a overlading_Method taking only int type data");
        this.data4 = data;
    }

    public int show_data1() {
        return data1;
    }

    public float show_data2() {
        return data2;
    }

    public void display() {
        System.out.println("name : " + name);
        System.out.println("Data3 : " + data3);
        System.out.println("Data4 : " + data4);
    }

    public static void main(String[] args) {
        Overloading obj1 = new Overloading(50);
        Overloading obj2 = new Overloading(10.4f);

        System.out.println(obj1.show_data1());
        System.out.println(obj2.show_data2());

        Overloading o = new Overloading();
        
        o.overloading_Method(100);
        o.overloading_Method("Shivam" , 200);

        o.display();

    }
}
