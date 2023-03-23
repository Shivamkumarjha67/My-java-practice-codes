// Single level Inheritance

class Bicycle{
    public String colour;
    public void colour(){
        System.out.println("Colour of Bicycle is : "+colour);
    }
    public void seatHeight(int x){
        System.out.println("Height of the seat (in cm) is : "+x);
    }
}

class Hero extends Bicycle{
    public void name(){
        System.out.println("Name of the bicycle is -> Hero");
    }
    public void type(){
        System.out.println("It is of Ranger type bicycle");
    }
    public void speed(int y){
        System.out.println("Maximum Speed (in km/hr) that bicycle can attend is "+y);
    }
}

class Inheritance1{
    public static void main(String[] args) {
        Hero h = new Hero();
        h.colour="Red";
        h.name();
        h.type();
        h.colour();
        h.speed(12);
        h.seatHeight(15);
        System.out.println(h instanceof Hero);  // instanceof
    }
}

// " instanceof " is used to check either the referance variable is containing a given type of object reference or not.