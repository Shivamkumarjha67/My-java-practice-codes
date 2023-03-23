import java.util.ArrayList;
import java.util.Scanner;

public class Insertion_Array_dsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        
        System.out.print("Pls Enter the index : ");
        int index = sc.nextInt();
        System.out.println("Pls Enter the Elm you want to insert : ");
        int Elm = sc.nextInt();
        
        for(int i=al.size()-1; i>=0; i--) {
            if(i != index) {
                al.set(index , Elm);
                break;
            }
            else {
                al.set(i+1 , al.get(i));
            }
        }

        for(int i : al) 
        System.out.print(i);

        sc.close();
    }
}
