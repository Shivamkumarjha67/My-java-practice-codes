import java.util.*;

class Aarray{
    // Ways of defination
    // 1.
    /*public static void main(String args[]){
        // Array Defination
        int[] myArray= new int[5];
        // Array insialization
        myArray[0]=10;
        myArray[1]=20;
        myArray[2]=30;
        myArray[3]=40;
        myArray[4]=50;

        // Output

        // System.out.println(myArray[0]);
        // System.out.println(myArray[1]);
        // System.out.println(myArray[2]);
        // System.out.println(myArray[3]);
        // System.out.println(myArray[4]);

        for(int i=0;i<5;i++){
            System.out.println(myArray[i]);
        }
        
    }*/

    // 2.
    /*public static void main(String args[]){
        // Arrays defination and declared
        int myArray[]= {10,20,30,40,50};
        for(int i=0;i<5;i++){
            System.out.println(myArray[i]);
        }
    }*/

    // 3.
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Pls Enter the size of your myArray :");
        int size = obj.nextInt();
        int[] myArray=new int[size];
        System.out.println("Pls Input the Number : ");
        for(int i=0;i<size;i++){
            myArray[i] = obj.nextInt();
        }
        //Output
        System.out.println("Elements are : ");
        for(int i=0;i<size;i++){
            System.out.println(myArray[i]);
        }
    }
}