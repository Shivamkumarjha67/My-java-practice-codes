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
		int t =sc.nextInt();
		while(t>0){
    		int m,n;
    		m=sc.nextInt();
    		n=sc.nextInt();
    		
    		if(m==1 || m==2){
    		    System.out.println(2);
    		}
    		for(int i=m;i<=n;i++){
                int p=0;
                if(i==1 || i==2)
                p++;
    		    for(int j=2;j<i;j++){
    		        if(i%j==0){
    		            p++;
    		            break;
    		        }
    		    }
    		    if(p==0)
    		    System.out.println(i);
    		}
    		t--;
		}
	}
}
