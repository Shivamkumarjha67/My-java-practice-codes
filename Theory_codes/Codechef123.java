/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		    int n;
		    long m;
		    n = sc.nextInt();
		    m = sc.nextLong();
		    int[] arr;
		    arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    long max=0;
		    for(int i=0; i<n; i++){
		        long p,diff = 0;
		            p=m/2;
		            if(arr[i]>p){
		                diff = arr[i]-1;
		            }else{
		                diff = m-arr[i];
		            }
		        max+=diff;
		    }
		    System.out.println(max);
	}
}
