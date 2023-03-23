package myfirst;

// Use package keyword with the suitable name of your package .
// And inclusion of classes ,interfaces ,annotation types and etc are required .

public class Welcome{
    public void Display(){
        System.out.println("Hii Everyone this is a Display Method of Welcome class of myfirst package");
    }
    public void Show(){
        System.out.println("Hello Everyone this is a Show Method of Welcome class of myfirst package");
    }
    /*public static void main(String[] args) {
        System.out.println("This is my first self created package :) ");
    }*/
}

/*
 * In order to get output from the your package , Follow the process : 
 * 
 * 1. command : javac Welcome.java // This will Give us Welcome.class File 
 * 
 * 2. command : javac -d . Welcome.java // This will create new folder called " myfirst".
 * 
 * 3. command : java myfirst.Welcome // This will give us the final output :) .
 * 
 */

 /*
  * Two types of package are there :- 1. User Defined packages or 2. In-Build packages .
  */