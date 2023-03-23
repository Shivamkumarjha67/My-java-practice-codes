abstract class Glass {
    String colour;

    public Glass(String color) {
        System.out.println("Super class 'Glass' constructor is called ");
        this.colour = color;
    }

    public String displayC() {
        return colour;
    }

    public abstract String toString();
}

class RayBan extends Glass {
    String brandName;
    String shape;
    int size;

    RayBan(String s,String s1, int x, String s2) {
        super(s1);
        System.out.println("Sub Class 'RayBan' conastrucor is called ");
        this.brandName = s;
        this.size = x;
        this.shape = s2;
    }

    @Override public String toString() {
        return "The brand you have opted for is "+ brandName +"\nChoosen glass colour is : "+ displayC() +"\nAnd its size is " + size +"\nAnd its shape is " + shape;
    }
}

class Omega extends Glass {
    String brandName;
    String shapes;
    int size;

    Omega(String s, String s1, int z, String s2) {
        super(s1);
        System.out.println("Sub Class 'Omega' conastrucor is called ");
        this.brandName = s;
        this.size = z;
        this.shapes = s2;
    }

    @Override public String toString() {
        return "The brand you have opted for is "+ brandName + "\nChoosen glass colour is : "+ displayC() +"\nAnd its size is " + size +"\nAnd its shape is " + shapes;
    }
}

class DataAbstraction {
    public static void main(String[] args) {
        Omega o1 = new Omega("Omega","Red",5,"Circular");
        RayBan o2 = new RayBan("Rayban","White",4,"Rectangular");
        System.out.println(o1.toString());
        System.out.println(o2.toString());
    }
}