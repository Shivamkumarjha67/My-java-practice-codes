interface if1{
    public void speed(int a);
}

interface if2{
    public void milage(float c);
}

class cars implements if1,if2{
    public void speed(int a){
        System.out.println("This car is moving with the speed of "+ a);
    }
    public void milage(float l){
        System.out.println("And it has the milafe of "+l);
    }
}

class Main1{
    public static void main(String args[]){
        cars obj= new cars();
        obj.speed(78);
        obj.milage(56.9f);
    }
}