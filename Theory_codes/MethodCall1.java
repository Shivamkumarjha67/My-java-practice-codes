// Method Calling

class MethodCall2{
    public int i=0;
    public int faltU(){
        i++;
        System.out.println("THIS IS FALTU METHOD");
        return i;
    } 
    public void msTT(){
        System.out.println("This is msTT Method");
    }
    public void gajaB(){
        System.out.println("This is gajaB Method");
        this.msTT();  // Method invoked in the same class
    }
}
class MethodCall1{
    public static void main(String[] args) {
        MethodCall2 obj = new MethodCall2();
        int i = obj.faltU(); // Number stored in variable.
        System.out.println("the value of i is : "+ i);
        obj.gajaB();
        //obj.faltU();
    }
}