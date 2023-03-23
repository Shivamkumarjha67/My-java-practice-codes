class practice{
    
    
    public static void main(String[] args) {

        practice s = new practice();
        System.out.println(s.toString());       // toString() method return name of your class. Method of Object class.
        System.out.println(s);
        System.out.println("__________________");

        System.out.println(Math.sqrt(25));
        System.out.println("__________________");

        Shivam1 obj = new Shivam1();
        obj.method1();
        System.out.println(obj instanceof Shivam1);
        
        //Practice p = new practice();
        display();
    }

    public static void display() {
        Shivam1 s = new Shivam1();
        System.out.println("Value of a is : " + s.a);
    }
}
class Shivam1{
    void method1(){
        System.out.println("This is a method of Shivam1 class");
    }
    protected int a = 10;
}








// Java program to demonstrate an interface cannot
// have non-public member interface.
/* 
import java.util.*;
interface Test
{
	interface Yes
	{
		void show();
	}
}

class Testing implements Test.Yes
{
	public void show()
	{
		System.out.println("show method of interface");
	}
}

class Practice11
{
	public static void main(String[] args)
	{
		Test.Yes obj;
		Testing t = new Testing();
		obj = t;
		obj.show();
	}
}
*/
/* 
import java.util.*;

class Practice11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int[] arr = new int[a];
			int[] brr = new int[b];
			for(int i=0; i<a; i++) {
				arr[i] = sc.nextInt();
			}
			for(int i=0; i<b; i++) {
				brr[i] = sc.nextInt();
			}
			int q = sc.nextInt();
			int[][] crr = new int[q][3];
			for(int i=0; i<q; i++) {
				for(int j=0; j<3; j++) {
					crr[i][j] = sc.nextInt();
				}
			}
			int sum =0,x=0,y=0;
			for(int i=0; i<a; i++) {
				y= arr[i];
				for(int j=0; j<b; j++) {
					x= brr[j];
					sum+=y*x*(i+j+2);
				}
			}
			System.out.print(Math.abs(sum) + " ");
			for(int i=0; i<q; i++) {
				int su = 0;
				if(crr[i][0] == 1) {
					int temp = arr[crr[i][1]-1];
					arr[crr[i][1]-1] = brr[crr[i][2]-1];
					brr[crr[i][2]-1] = temp;
					for(int k=0; k<a; k++) {
						y= arr[k];
						for(int j=0; j<b; j++) {
							x= brr[j];
							su+= y*x*(k+j+2);
						}
					}
				} else if(crr[i][0]==2) {
					int temp = arr[crr[i][1]-1];
					arr[crr[i][1]-1] = brr[crr[i][2]-1];
					brr[crr[i][2]-1] = temp;
					for(int k=0; k<a; k++) {
						y= arr[k];
						for(int j=0; j<a; j++) {
							x= brr[j];
							su+= y*x*(k+j+2);
						}
					}
				} else {
					int temp = arr[crr[i][1]-1];
					arr[crr[i][1]-1] = brr[crr[i][2]-1];
					brr[crr[i][2]-1] = temp;
					for(int k=0; k<b; k++) {
						y= arr[k];
						for(int j=0; j<b; j++) {
							x= brr[j];
							su+= y*x*(k+j+2);
						}
					}
				}
				System.out.print(Math.abs(su) + " ");
			}
			System.out.println();
		} 
	}
}

*/